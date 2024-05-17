package homeworks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Random;

public class hw_06 extends TestBase {
    /*
        Go to http://test.rubywatir.com/ifelse.php
        Click the correct submit button declared in the yellow line
        Finish the test after 50 correct click
    */
    @Test
    public void test01() throws InterruptedException {
        driver.get("http://test.rubywatir.com/ifelse.php");

        int click = 0;
        while (click < 50) {
            WebElement sariBolge = driver.findElement(By.cssSelector("div[id='buttonNumber']"));
            String buttonText = sariBolge.getText();
            System.out.println("sariButton.getText() = " + buttonText);
            switch (buttonText) {
                case "1":
                    driver.findElement(By.xpath("//input[@name='1st']")).click();
                    break;
                case "2":
                    driver.findElement(By.xpath("//input[@name='2nd']")).click();
                    break;
                case "3":
                    driver.findElement(By.xpath("//input[@name='3rd']")).click();
                    break;
                case "4":
                    driver.findElement(By.xpath("//input[@name='4th']")).click();
                    break;
                case "5":
                    driver.findElement(By.xpath("//input[@name='5th']")).click();
                    break;
                default:
                    System.out.println("Unexpected value: " + buttonText);
                    break;
            }
            click++;
            // Adding a short sleep to avoid being blocked by the server for too many requests in a short time
            Thread.sleep(100);


        }
    }
}