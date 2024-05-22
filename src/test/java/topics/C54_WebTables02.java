package topics;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C54_WebTables02 extends TestBase {
/*
    Go to URL: https://the-internet.herokuapp.com/tables
    Print the entire table
    Print All Rows
    Print Last row data only
    Print column 5 data in the table body
    Write a method that accepts 2 parameters
    parameter 1 = row number
    parameter 2 = column number
*/
    @Test
    public void webTableTest() {

//        Go to URL: https://the-internet.herokuapp.com/tables
        driver.get("https://the-internet.herokuapp.com/tables");

//        Print the entire table
        WebElement table1 = driver.findElement(By.id("table1"));
        System.out.println(table1.getText());

//        Print All Rows
        List<WebElement> rows = table1.findElements(By.xpath(".//tbody/tr"));

        int rowNumber = 0;
        for (WebElement w : rows) {
            rowNumber++;
            System.out.println("Row " + rowNumber + ": " + w.getText());
        }

//        Print Last row data only
        WebElement lastRow = rows.getLast();
        System.out.println("lastRow = " + lastRow.getText());

//        Print column 5 data in the table body
        List<WebElement> column5list = table1.findElements(By.xpath(".//td[5]"));
        System.out.println("Column 5 elements:");
        column5list.forEach(t -> System.out.print(t.getText() + " "));

//        Write a method that accepts 2 parameters
//        parameter 1 = row number
//        parameter 2 = column number
        String cellValue = getTableCell(table1, 3, 4);
        System.out.println("\ncellValue = " + cellValue);


    }

}
