package topics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class C60_StaleElementReferenceException extends TestBase {

    @Test
    public void test1() {

        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        WebElement signup = driver.findElement(By.id("signup"));
        signup.click();
        driver.get("https://google.com");
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        // signup.click();
        //StaleElementReferenceException gidip gelindi tekrar webelement lokate edilimeli yoksa bu hata verir.
        //çözüm tekrar lokate etmektir.aynı yer olsa bile ustteki çalısmaz.sadece gidip gelmişlikte değil reflesh yapıncada aynısını yapmalıyız

        //İlk sayfada locate edilen elementin referansı eskidi.
        //Tekrar locate edilmeden aynı web element kullanılırsa StaleElementReferenceException atar.
        //Çözüm : Tekrar locate et:
        // signup = driver.findElement(By.id("signup"));


        WebElement signup2 = driver.findElement(By.id("signup"));
        signup2.click();

    }

    @Test
    public void test2() {
//        driver.get("https://google.com");
//        WebElement searcBox = driver.findElement(By.name("q"));
//        searcBox.sendKeys("Clarusway"+Keys.ENTER);
        driver.get("https://google.com");
        WebElement searcBox = driver.findElement(By.name("q"));
        driver.navigate().refresh();//Refresh yapılınca önceki locate edilen web elementlerin referansları eskir.

        //Çözüm: Relocate --> searchBox = driver.findElement(By.name("q"));
        searcBox.sendKeys("Clarusway" + Keys.ENTER);//StaleElementReferenceException

        //çözümü
        WebElement searcBox2 = driver.findElement(By.name("q"));
        searcBox2.sendKeys("Clarusway" + Keys.ENTER);


    }

}