package homeworks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class hw_20 extends TestBase {
    /*
    Given
        Go to https://testpages.herokuapp.com/styled/tag/table.html
    When
        Calculate the total amount on the table
    Then
        Assert the amount is 110.3
*/
    @Test
    public void test01() {
        driver.get("https://testpages.herokuapp.com/styled/tag/table.html");

        WebElement webTable = driver.findElement(By.id("mytable"));

        List<WebElement> rowList = webTable.findElements(By.xpath(".//td"));// Başa nokta eklenerek sadece locate edilen web element içinde arama yapılır.
        int total = 0;
        for (int i = 0; i < rowList.size(); i++) {
            System.out.println(rowList.get(i).getText());

        }


    }

}
