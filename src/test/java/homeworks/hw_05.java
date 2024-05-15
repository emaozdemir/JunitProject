package homeworks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class hw_05 extends TestBase {
    /*
       Go to https://thinking-tester-contact-list.herokuapp.com/
       Create a user
       Sing in Application
       Add 5 contacts
    */
    @Test
    public void test01() {
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        driver.findElement(By.id("signup")).click();
        WebElement nam = driver.findElement(By.id("firstName"));
        nam.sendKeys("sema");
        WebElement sur = driver.findElement(By.id("lastName"));
        sur.click();
        sur.sendKeys("oz");
        WebElement imail = driver.findElement(By.id("email"));
        imail.click();
        imail.sendKeys("ozs@gmail.com");
        WebElement pass = driver.findElement(By.id("password"));
        pass.click();
        pass.sendKeys("semasema");

        WebElement subm = driver.findElement(By.id("submit"));
        subm.click();
        // Add 5 contacts
        WebElement addContact = driver.findElement(By.xpath("//*[@id=\"add-contact\"]"));
        addContact.click();
        driver.findElement(By.id("firstName")).sendKeys("Muh");
        driver.findElement(By.id("lastName")).sendKeys("as");
        driver.findElement(By.id("birthdate")).sendKeys("1993/08/08");
        driver.findElement(By.id("email")).sendKeys("muhas@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("1111111111");
        driver.findElement(By.id("street1")).sendKeys("casines");
        driver.findElement(By.id("city")).sendKeys("cadiz");
        driver.findElement(By.id("country")).sendKeys("spain");

        driver.findElement(By.id("submit")).click();


    }

}


