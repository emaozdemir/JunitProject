package topics;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C57_ExtentReport extends TestBase {

    @Test
    public void test1(){
        //Go to Clarusway
        extentTest = extentReportsSetUp().createTest("Clarusway Anasayfa", "Anasayfa gezinme testi");

        extentTest.info("Anasayfaya gidiliyor");

        driver.get("https://clarusway.com");

        extentTest.pass("Anasayfaya gidildi.");

        driver.findElement(By.xpath("//div[@data-id='4862572d']")).click();

        extentTest.pass("SDET tıklandı");

        driver.navigate().back();

        extentTest.pass("Anasayfaya dönüldü.");

        extentReports.flush();


    }


    /*
    Go to https://thinking-tester-contact-list.herokuapp.com/
    Enter email and password
    Click submit
    Add pass message in report for each step
    Take screenshot of last page
     */

    @Test
    public void test2() throws InterruptedException {
        extentTest = extentReportsSetUp().createTest("Contact List Sign In", "Contact List Sign In and take screenshot");

//        Go to https://thinking-tester-contact-list.herokuapp.com/
        driver.get("https://thinking-tester-contact-list.herokuapp.com");
        extentTest.pass("User is on the homepage");

//        Enter email and password
        driver.findElement(By.id("email")).sendKeys("clarusway@hotmail.com");
        driver.findElement(By.id("password")).sendKeys("Clarusway.123");

        extentTest.pass("User entered username and password");
//        Click submit
        driver.findElement(By.id("submit")).click();

        extentTest.pass("User clicked on submit button");

//        Take screenshot of last page

        Thread.sleep(1000);
        getFullPageScreenShot();

        extentReports.flush();


    }
}