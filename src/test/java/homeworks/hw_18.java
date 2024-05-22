package homeworks;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
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
    @Test
    public void test01() throws IOException {

//Add the excel file on the resources folder.
//Open the file.
        FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\resources\\Capitals.xlsx");

//Open the workbook using file input stream.
        Workbook workbook = WorkbookFactory.create(fileInputStream);

//Open the first worksheet.
        Sheet sheet1 = workbook.getSheet("Sheet1");
//1.yol
//Go to 2nd row first cell and assert if the data equal to the USA.
        Cell r2c1 = sheet1.getRow(1).getCell(0);
        System.out.println("r2c1 = " + r2c1);
        assertEquals("USA", r2c1.toString());

    }
}
