package topics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C58_NoSuchElementException extends TestBase {

    @Test
    public void test1() {
        driver.get("http://google.com");
        driver.findElement(By.id("olmayanİd")).click();//NoSuchElementException

    }

    @Test
    public void test2() {
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.id("draggable")).getText());

    }
    @Test
    public void test3(){

        driver.get("https://testpages.eviltester.com/styled/windows-test.html");

        //Click on Basic Ajax in new page
        driver.findElement(By.id("gobasicajax")).click();

        driver.findElement(By.name("submitbutton")).click();

    }

}
