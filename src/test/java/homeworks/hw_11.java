package homeworks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class hw_11 extends TestBase {
   /*

      Go to http://webdriveruniversity.com/To-Do-List/index.html

      Add todos: (Prepare breakfast, Wash the dishes, Take care of baby, Help your kid's homework, Study Selenium, Sleep)

      Strikethrough all todos.(Üzerlerini çiziniz)

      Delete all todos.

      Assert that all todos deleted.
*/

    @Test
    public void hw11() throws InterruptedException {

//      Go to http://webdriveruniversity.com/To-Do-List/index.html
        driver.get("http://webdriveruniversity.com/To-Do-List/index.html");

//      Add todos: (Prepare breakfast, Wash the dishes, Take care of baby, Help your kid's homework, Study Selenium, Sleep)

        WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
        input.sendKeys("Prepare breakfast" + Keys.ENTER);
        input.sendKeys("Wash the dishes" + Keys.ENTER);
        input.sendKeys("Take care of baby" + Keys.ENTER);
        input.sendKeys("Help your kid's homework" + Keys.ENTER);
        input.sendKeys("Study Selenium" + Keys.ENTER);
        input.sendKeys("Sleep" + Keys.ENTER);

//      Strikethrough all todos.(Üzerlerini çiziniz)

        List<WebElement> todos = driver.findElements(By.tagName("li"));

        for (WebElement w : todos) {
            w.click();
        }

//      Delete all todos.

        List<WebElement> hepsi = driver.findElements(By.xpath("//i[@class='fa fa-trash']"));

        for (WebElement w : hepsi) {

            w.click();
        }

//      Assert that all todos deleted.
        Thread.sleep(1000);
        Assert.assertTrue(driver.findElements(By.tagName("li")).isEmpty());

    }
}
