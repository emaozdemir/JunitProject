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
    /*
 TESTLİO (https://testlio.com/) LİVE INTERVİEW QUESTION
 //1) Open the browser
 //2) Enter the URL "http://practice.automationtesting.in/"
 //3) Test whether the Home page has Three Sliders only
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
    //  TESTLİO (https://testlio.com/) LİVE INTERVİEW QUESTION

    //1) Open the browser
    // before da yapıyor otomatik
    //2) Enter the URL "http://practice.automationtesting.in/"
    driver.get("http://practice.automationtesting.in/");
    //3) Test whether the Home page has Three Sliders only
        List<WebElement> slidersList=driver.findElements(By.xpath("//div[@data-slide-duration='0']"));
        // List<WebElement> slidersList=driver.findElements(By.id("n2-ss-6"));
        Assert.assertEquals(3,slidersList.size());
    }
}
