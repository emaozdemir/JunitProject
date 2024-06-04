package codeChallenge.day02;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CH07 {

    /*
    1) Open the browser
    2) Enter the URL “https://bonigarcia.dev/selenium-webdriver-java/slow-calculator.html”
    3) 1 + 3
    4) ... should be 4, wait for it
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
//  2) Enter the URL “https://bonigarcia.dev/selenium-webdriver-java/slow-calculator.html”
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/slow-calculator.html");


        //    3) 1 + 3

        islem("9");
        islem("-");
        islem("5");
        islem("=");

        //    4) ... should be 4, wait for it

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBe(By.xpath("//div[@class=\"screen\"]"), "4"));

        String actual = driver.findElement(By.xpath("//div[@class=\"screen\"]")).getText();
        Assert.assertEquals("4", actual);



    }

    public void islem(String input) {

        driver.findElement(By.xpath("//span[.='" + input + "']")).click(); // //span[.='5']

    }
}
