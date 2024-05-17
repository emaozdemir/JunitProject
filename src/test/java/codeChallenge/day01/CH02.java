package codeChallenge.day01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class CH02 {
    /*
    driver.navigate() Methodlari
    -  driver.navigate( ).to(String Url);  String olarak girilen Url’e gider
    -  driver.navigate( ).back ();     Icinde olunan sayfadan, geldigi onceki sayfaya dondurur
    -  driver.navigate( ).forward ();   Back ile donulen bir sayfadan tekrar ileri gider
    -  driver.navigate( ).refresh ();    Icinde olunan sayfayi yeniler.
    */
    /*
    //1-Navigate to page: https://www.ikea.com/
    //    And verify title: contains Welcome
    //2-Navigate to page:https://www.ikea.com/global/en/newsroom/
    //    And verify title: contains "Newsroom"
    //3-Navigate back:https://www.ikea.com/
    //    verify title:contains Welcome
    //4-Navigate forward:https://www.ikea.com/global/en/newsroom/
    //    verify title: contains "Newsroom"
    //5-Refresh page:
    //    verify title: contains "Newsroom"
   */
    static WebDriver driver;
    @Before
    public void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//her Web elementin yüklenip bulunması için 15 saniyeye kadar bekler.
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void test01(){
        //1-Navigate to page: https://www.ikea.com/
        driver.get("https://www.ikea.com/");
        //    And verify title: contains Welcome
        assertTrue(driver.getTitle().contains("Welcome"));
        //2-Navigate to page:https://www.ikea.com/global/en/newsroom/
        driver.navigate().to("https://www.ikea.com/global/en/newsroom/");
        //    And verify title: contains "Newsroom"
        assertTrue(driver.getTitle().contains("Newsroom"));
        //3-Navigate back:https://www.ikea.com/
        driver.navigate().back();
        //    verify title:contains Welcome
        assertTrue(driver.getTitle().contains("Welcome"));
        //4-Navigate forward:https://www.ikea.com/global/en/newsroom/
        driver.navigate().forward();
        //    verify title: contains "Newsroom"
        assertTrue(driver.getTitle().contains("Newsroom"));
        //5-Refresh page:
        driver.navigate().refresh();
        //    verify title: contains "Newsroom"
        assertTrue(driver.getTitle().contains("Newsroom"));
    }
}
