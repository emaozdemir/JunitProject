package codeChallenge.day02;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.assertEquals;

public class CH06 {
    /*
 **** React Uygulama,değişken XPath
 Given
  Go to https://react-shopping-cart-67954.firebaseapp.com
 When
  Click random 3 Add To Cart Button
 Then
  Verify that there are 3 items in the cart
 And
  Click Checkout Button
 Then
  Verify Subtotal

  *https://www.guru99.com/using-contains-sbiling-ancestor-to-find-element-in-selenium.html
 */
    static WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//her Web elementin yüklenip bulunması için 15 saniyeye kadar bekler.
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test01() {

        //     Go to https://react-shopping-cart-67954.firebaseapp.com/
        driver.get("https://react-shopping-cart-67954.firebaseapp.com/");

        //     Click random 3 Add To Cart Button
        List<WebElement> adToCartList = driver.findElements(By.xpath("//button[@tabindex=\"-1\"]"));
        Random rdm = new Random();
        for (int i = 0; i < 3; i++) {
            int sayi = rdm.nextInt(16);
            adToCartList.get(sayi).click();
        }

        //     Verify that there are 3 items in the cart
        String actual = driver.findElement(By.xpath("//span[.='Cart']/parent::div/div/div")).getText();

        Assert.assertEquals("3", actual);

        //     Click Checkout Button
        String expectedTotal = driver.findElement(By.xpath("//p[.='SUBTOTAL']/following-sibling::div/p")).getText();

        driver.findElement(By.xpath("//*[.='Checkout']")).click();


        //     Verify Subtotal
        String actualTotal = driver.switchTo().alert().getText();
        Assert.assertTrue(actualTotal.contains(expectedTotal));

        driver.switchTo().alert().accept();

    }
}
