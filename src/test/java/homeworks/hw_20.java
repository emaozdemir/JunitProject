package homeworks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

        List<WebElement> columnList = webTable.findElements(By.xpath(".//td[2]"));// Başa nokta eklenerek sadece locate edilen web element içinde arama yapılır.
        double total = 0;
        for (int i = 0; i < columnList.size(); i++) {
            total += Double.parseDouble(columnList.get(i).getText());
        }
        System.out.println("total = " + total);
        //Assert the amount is 110.3
        //assert total == 110.3;

      //  assertTrue(total == 110.3);
        assertEquals(110.3, total,0.01);
    }

    @Test
    public void test02() {
        driver.get("https://testpages.herokuapp.com/styled/tag/table.html");
        List<WebElement> amountList = driver.findElements(By.xpath("//table//tr//td[2]"));
        double toplam=0;
        for (int i = 0; i < amountList.size(); i++) {
            toplam+=Double.parseDouble(amountList.get(i).getText());
        }
        System.out.println("toplam = " + toplam);
        Assert.assertEquals(110.3,0.0);

    }

}
