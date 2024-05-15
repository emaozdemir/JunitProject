package codeChallenge.day01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class CH01 {
    /*
       driver.get() Methodlari
        -  driver.get(String Url);     String olarak girilen Url’e gider
        -  driver.getTitle();          Icinde olunan sayfanin basligini String olarak getirir
        -  driver.getCurrentUrl();     Icinde olunan sayfanin Url’ini String olarak getirir
        -  driver.getPageSource();     Icinde olunan sayfanin kaynak kodlarini String olarak getirir
    /*
     /*
    //1) Open the browser
    //2) Enter the URL https://www.ikea.com/
    //3) set expected title "Welcome"
    //4) using getTitle() to retrieve actual title.
    //5) verify title: contains "Welcome"
    //6) get currentUrl text
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
    public void test01() throws InterruptedException {
        //1) Open the browser
        //2) Enter the URL https://www.ikea.com/
        driver.get("https://www.google.com");
        //3) set expected title "Welcome"
        Thread.sleep(1000);
        String expectedTitle="Welcome";
        //4) using getTitle() to retrieve actual title.
        Thread.sleep(1000);
        String actualTitle=driver.getTitle();
        //5) verify title: contains "Welcome"
        Thread.sleep(1000);
        assertEquals(expectedTitle,actualTitle);
        //6) get currentUrl text
        Thread.sleep(1000);
        String urli=driver.getCurrentUrl();
        System.out.println("urli = " + urli);
    }
}
