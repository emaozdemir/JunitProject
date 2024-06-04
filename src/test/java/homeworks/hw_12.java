package homeworks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class hw_12 extends TestBase {
    /*
        Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        Click all the buttons and verify they are all clicked


        onblur Olayı: Bir öğe odaklandığında ve ardından odağını kaybettiğinde tetiklenir.
        onclick Olayı: Bir öğeye tıklanıldığında tetiklenir.
        oncontextmenu Olayı: Bir öğeye sağ tıklanıldığında tetiklenir.
        ondblclick Olayı: Bir öğeye çift tıklanıldığında tetiklenir.
        onfocus Olayı: Bir öğe odaklandığında tetiklenir.
        onkeydown Olayı: Bir tuşa basıldığında tetiklenir.
        onkeypress Olayı: Bir tuşa basıldığında ve bırakılmadan önce tetiklenir.
        onkeyup Olayı: Bir tuş bırakıldığında tetiklenir.
        onmouseover Olayı: Fare bir öğenin üzerine geldiğinde tetiklenir.
        onmouseleave Olayı: Fare bir öğenin üzerinden ayrıldığında tetiklenir.
        onmousemove Olayı: Fare bir öğenin üzerinde hareket ettiğinde tetiklenir.
        onmousedown Olayı: Fare tıklaması başladığında tetiklenir.
    */
    @Test
    public void test() throws InterruptedException {
        driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

        Actions a = new Actions(driver);

        // onblur
        clickElement(By.id("onblur"));
        a.click().perform(); // Trigger blur by clicking elsewhere
        AssertText(By.id("onblurstatus"));

        // onclick
        clickElement(By.id("onclick"));
        AssertText(By.id("onclickstatus"));

        // oncontextmenu (right-click)
        a.contextClick(driver.findElement(By.id("oncontextmenu"))).perform();
        AssertText(By.id("oncontextmenustatus"));

        // ondblclick (double-click)
        a.doubleClick(driver.findElement(By.id("ondoubleclick"))).perform();
        AssertText(By.id("ondoubleclickstatus"));

        // onfocus
        clickElement(By.id("onfocus"));
        AssertText(By.id("onfocusstatus"));

        // onkeydown (key down)
        WebElement onKeyDown = driver.findElement(By.id("onkeydown"));
        a.sendKeys(onKeyDown, "A").perform(); // Press any key
        AssertText(By.id("onkeydownstatus"));

        // onkeypress (key press)
        WebElement onKeyPress = driver.findElement(By.id("onkeypress"));
        a.sendKeys(onKeyPress, "A").perform(); // Press any key
        AssertText(By.id("onkeypressstatus"));

        // onkeyup (key up)
        WebElement onKeyUp = driver.findElement(By.id("onkeyup"));
        a.sendKeys(onKeyUp, "A").perform(); // Press any key
        AssertText(By.id("onkeyupstatus"));

        // onmouseover (mouse over)
        a.moveToElement(driver.findElement(By.id("onmouseover"))).perform();
        AssertText(By.id("onmouseoverstatus"));

        // onmouseleave (mouse leave)
        WebElement onMouseLeave = driver.findElement(By.id("onmouseleave"));
        a.moveToElement(onMouseLeave).perform(); // Move to element to trigger mouseover
        a.moveByOffset(10, 10).perform(); // Move away to trigger mouseleave
        AssertText(By.id("onmouseleavestatus"));

//        // onmousemove (mouse move)
//        WebElement onMouseMove = driver.findElement(By.id("onmousemove"));
//        a.moveToElement(onMouseMove).perform();
//        AssertText(By.id("onmousemovestatus"));

        // onmousedown (mouse down)
        WebElement onMouseDown = driver.findElement(By.id("onmousedown"));
        a.clickAndHold(onMouseDown).perform();
        AssertText(By.id("onmousedownstatus"));
    }

    public void clickElement(By element) {
        driver.findElement(element).click();
    }

    public void AssertText(By element){
        Assert.assertTrue(driver.findElement(element).getText().equals("Event Triggered"));
//        public void AssertText(By element) {
//            Assert.assertEquals("Event Triggered", driver.findElement(element).getText());
    }
}