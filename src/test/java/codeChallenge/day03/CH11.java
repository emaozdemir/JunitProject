package codeChallenge.day03;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class CH11 extends TestBase {

    /*
     https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html adresine gidin
     Launch alert buttonuna tıklayın
     Alert pop-up textin <Hello world!> olduğunu doğrulayın
    */

    @Test
    public void testAlert() {
        // switchTo ile

        //     https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html adresine gidin
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/dialog-boxes.html");

        //     Launch alert buttonuna tıklayın
        driver.findElement(By.xpath("//button[@id='my-alert']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));//Bu satır, WebDriverWait nesnesi oluşturur ve
        // 10 saniyelik bir zaman aşımı süresi belirler. Bu süre boyunca belirli bir koşulun gerçekleşmesi beklenir.
        wait.until(ExpectedConditions.alertIsPresent());//Bu satır, bir alert (uyarı) diyalog kutusunun görünmesini bekler. Eğer
        // alert diyalog kutusu 10 saniye içinde açılırsa, kod devam eder. Eğer 10 saniye içinde açılmazsa, bir TimeoutException fırlatılır.

        //  Alert pop-up textin <Hello world!> olduğunu doğrulayın
        //// Alert kutusu açıldıktan sonra, alert'e geçiş yapabilirsiniz
        //Alert alert = driver.switchTo().alert();
        String alertMesaj = driver.switchTo().alert().getText();
        assertEquals("Hello world!", alertMesaj);
        // driver.switchTo().alert().accept();
    }
}