package homeworks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class hw_10 extends TestBase {
    /*
        Go to https://webdriveruniversity.com/Popup-Alerts/index.html
        Click on JavaScript Alert
        Print alert message
        Accept alert
        Click on JavaScript Confirm Box
        Print alert message
        Cancel alert
        Click on Modal Popup Box
        Print alert message
        Close alert
    */
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
        //        Click on JavaScript Alert
        driver.findElement(By.id("button1")).click();
        //        Print alert message
        String mesaj1 = driver.switchTo().alert().getText();
        System.out.println("mesaj1 = " + mesaj1);
        //        Accept alert
        driver.switchTo().alert().accept();
        //        Click on JavaScript Confirm Box
        driver.findElement(By.id("button4")).click();
        //        Print alert message
        String mesaj2 = driver.switchTo().alert().getText();
        System.out.println("mesaj2 = " + mesaj2);
        //        Cancel alert
        driver.switchTo().alert().dismiss();
        WebElement cikanMesaj = driver.findElement(By.id("confirm-alert-text"));
        assertEquals("You pressed Cancel!", cikanMesaj.getText());


        //        Click on Modal Popup Box
        driver.findElement(By.id("button2")).click();
        // Modal pencereler JavaScript alertlerinden farklıdır ve driver.switchTo().alert() metodu
        // ile işlenemez. Bu durumda modal  penceredeki elementlerle doğrudan çalışmanız gerekmektedir.

        //böyle olmaz yani
        //        String mesaj3=  driver.switchTo().alert().getText();
        //        System.out.println("mesaj3 = " + mesaj3);
        //        Print alert message
        // Wait for the modal to be displayed
        Thread.sleep(3000);
        WebElement modal = driver.findElement(By.id("myModal"));
        Thread.sleep(3000);
        WebElement modalBody = modal.findElement(By.cssSelector(".modal-body p"));

        // Print modal message
        String modalMessage = modalBody.getText();
        System.out.println("modalMessage = " + modalMessage);

        // Close modal using CSS selector
        driver.findElement(By.cssSelector(".modal-footer .btn")).click();

        // Alternative close modal using XPath
        // driver.findElement(By.xpath("//div[@class='modal-footer']//button")).click();
    }

}
