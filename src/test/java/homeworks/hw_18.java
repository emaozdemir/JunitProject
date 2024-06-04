package homeworks;

import com.github.javafaker.Faker;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class hw_18 extends TestBase {
    /*
    Create a reusable method to assert a String exists in an Excel column.
    Bir Excel sütununda bir Dizenin mevcut olduğunu iddia etmek için yeniden kullanılabilir bir yöntem oluşturun.
    */
    public boolean isStringInColumn(String excelPath, String sheetName, String str, int column) throws IOException {
        // Load the Excel workbook
        FileInputStream fileInputStream = new FileInputStream(excelPath);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheet(sheetName);

        // Iterate through each row in the specified column
        for (Row row : sheet) {
            Cell cell = row.getCell(column);
            if (cell != null && cell.getCellType() == CellType.STRING) {
                if (cell.getStringCellValue().equals(str)) {
                    workbook.close();
                    return true;
                }
            }
        }
        workbook.close();
        return false;
    }

    @Test
    public void test01() throws IOException {
        // Define the path to the Excel file
        String excelPath = System.getProperty("user.dir") + "\\resources\\Capitals.xlsx";

        // Call the reusable method and assert the result
        boolean result = isStringInColumn(excelPath, "Sheet1", "Paris", 1);
        Assert.assertTrue("The string 'Paris' was not found in the specified column", result);
    }
}