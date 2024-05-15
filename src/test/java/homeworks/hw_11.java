package homeworks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class hw_11 extends TestBase {
/*
  Given
      Go to http://webdriveruniversity.com/To-Do-List/index.html
  When
      Add todos: (Prepare breakfast, Wash the dishes, Take care of baby, Help your kid's homework, Study Selenium, Sleep)
  And
      Strikethrough all todos.(Üzerlerini çiziniz)
  And
      Delete all todos.
  Then
      Assert that all todos deleted.
*/

    @Test
    public void toDoList() throws InterruptedException {
//        Given
//        Go to http://webdriveruniversity.com/To-Do-List/index.html
        driver.get("http://webdriveruniversity.com/To-Do-List/index.html");
//        When
//        Add todos: (Prepare breakfast, Wash the dishes, Take care of baby, Help your kid's homework, Study Selenium, Sleep)
        WebElement newTodo = driver.findElement(By.xpath("//input[@type='text']"));
        newTodo.click();
        Thread.sleep(2000);
        newTodo.sendKeys("Prepare breakfast"+ Keys.ENTER);
        Thread.sleep(2000);
        newTodo.sendKeys("Wash the dishes"+ Keys.ENTER);
        Thread.sleep(2000);

//        And
//        Strikethrough all todos.(Üzerlerini çiziniz)
        WebElement oneClick= driver.findElement(By.linkText(" Go to potion class"));
        oneClick.click();
//        And
//        Delete all todos.
//                Then
//        Assert that all todos deleted.
    }

}
