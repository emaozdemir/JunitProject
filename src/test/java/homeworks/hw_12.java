package homeworks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
    public void clicksTest() throws InterruptedException {

//        Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

//        Click all the buttons and verify they are all clicked
        WebElement onblur = driver.findElement(By.id("onblur"));
        WebElement onclick = driver.findElement(By.id("onclick"));
        WebElement oncontextmenu = driver.findElement(By.id("oncontextmenu"));
        WebElement ondoubleclick = driver.findElement(By.id("ondoubleclick"));
        WebElement onfocus = driver.findElement(By.id("onfocus"));
        WebElement onkeydown = driver.findElement(By.id("onkeydown"));
        WebElement onkeyup = driver.findElement(By.id("onkeyup"));
        WebElement onkeypress = driver.findElement(By.id("onkeypress"));
        WebElement onmouseover = driver.findElement(By.id("onmouseover"));
        WebElement onmouseleave = driver.findElement(By.id("onmouseleave"));
        WebElement onmousedown = driver.findElement(By.id("onmousedown"));

        new Actions(driver)
                .click(onblur)
                .click(onclick)//Bu click onblur'u tetikler
                .click(onclick)//Bu click onclick'i tetikler
                .contextClick(oncontextmenu)
                .doubleClick(ondoubleclick)
                .click(onfocus)
                .click(onkeydown)
                .sendKeys(Keys.SPACE)//onkeydown elementinin tetiklenmesi için bir tuşa basıyoruz.
                .click(onkeyup)
                .sendKeys(Keys.ENTER)//onkeyup elementinin tetiklenmesi için bir tuşa basıyoruz. Tuştan çekilme olunca tetikleniyor.
                .click(onkeypress)
                .sendKeys(Keys.ENTER)
                .moveToElement(onmouseover)//Mouse'un element üzerine gelmesi tetikleme için yeterlidir.
                .moveToElement(onmouseleave)
                .moveToElement(onmouseover)//Mouse başka bir yere getirilince onmouseleave tetiklenir.
                .click(onmousedown)
                .perform();
        Thread.sleep(200);
        assert driver.findElement(By.xpath("//button[.='Reset Challenge']")).isDisplayed();

    }
}