package homeworks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import static org.junit.Assert.assertTrue;

public class hw_08 extends TestBase {
    /*
    Go to URL: https://app.endtest.io/guides/docs/how-to-test-checkboxes/
    Select all checkboxes
    Assert that they are all selected
    */
    @Test
    public void test1() {
        driver.get("https://app.endtest.io/guides/docs/how-to-test-checkboxes/");

        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        WebElement checkBox3 = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));

        //  Select all checkboxes
        if (!checkBox1.isSelected()) {//checkBox1 seçili değilse
            checkBox1.click();
        }
        if (!checkBox2.isSelected()) {//checkBox2 seçili değilse
            checkBox2.click();
        }
        if (!checkBox3.isSelected()) {//checkBox3 seçili değilse
            checkBox3.click();
        }

//        Assert that they are all selected

        assertTrue(checkBox1.isSelected() && checkBox2.isSelected() && checkBox3.isSelected());
    }

}
