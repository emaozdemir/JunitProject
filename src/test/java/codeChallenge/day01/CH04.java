package codeChallenge.day01;

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

public class CH04 {
    // Navigate to  https://testpages.herokuapp.com/styled/index.html
    // Click on  Calculate under Micro Apps
    // Type any number in the first input
    // Type any number in the second input
    // Click on Calculate
    // Get the result
    // Print the result
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
        // Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        // Click on  Calculate under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
        // Type any number in the first input
        WebElement no1 = driver.findElement(By.id("number1"));
        no1.click();
        no1.sendKeys("7");
        // Type any number in the second input
        WebElement no2 = driver.findElement(By.id("number2"));
        no2.click();
        no2.sendKeys("7");
        // Click on Calculate
        driver.findElement(By.id("calculate")).click();
        // Get the result
        WebElement cvp = driver.findElement(By.id("answer"));
        String sonuc = cvp.getText();

        // Print the result
        System.out.println("sonuc = " + sonuc);

    }
}
