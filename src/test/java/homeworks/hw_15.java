package homeworks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class hw_15 extends TestBase {
    /*
      Go to http://szimek.github.io/signature_pad/
      Draw the line or shape you want on the screen
      Press the clear button after drawing
    */
    @Test
    public void test01() throws InterruptedException {

//    Go to http://szimek.github.io/signature_pad/
        driver.get("http://szimek.github.io/signature_pad/");

//    Draw the line or shape you want on the screen

        WebElement canvas = driver.findElement(By.id("canvas-wrapper"));
        Actions actions = new Actions(driver);

        actions
                .moveToElement(canvas)//locate edilen alana fareyi getirmek
                .clickAndHold()//fareyi basılı tutmak
                .pause(1000)
                .moveByOffset(50, 0)
                .pause(1000)
                .moveByOffset(0, 50)
                .pause(1000)
                .moveByOffset(-50, 0)
                .pause(1000)
                .moveByOffset(0, -50)
                .pause(1000)
                .moveByOffset(50, -100)
                .release()
                .perform();

//    Press the clear button after drawing

        // driver.findElement(By.xpath("//button[contains(text(), 'Clear')]")).click();
        driver.findElement(By.xpath("//button[@data-action='clear']")).click();

    }
}
