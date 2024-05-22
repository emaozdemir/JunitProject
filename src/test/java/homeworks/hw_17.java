package homeworks;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class hw_17 {
    /*
    Create a reusable method to get an Excel column data as a list.

    */
    @Test
    public void test01() throws IOException {

    // Create a reusable method to get an Excel column data as a list.
    //  Bir Excel sütun verisini liste halinde almak için yeniden kullanılabilir bir yöntem oluşturun.

        String filePath = System.getProperty("user.dir") + "\\resources\\Capitals.xlsx";
        FileInputStream fileInputStream = new FileInputStream(filePath);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheet("Sheet1");
        int ilkSutun = 0; // columnIndex

        // Excel sütun verilerini listele
        List<String> columnData = new ArrayList<>();
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            columnData.add(sheet.getRow(i).getCell(ilkSutun).toString());
        }

        // Beklenen veriler
        List<String> expectedData = new ArrayList<>();
        expectedData.add("USA");
        expectedData.add("France");
        expectedData.add("England");
        expectedData.add("Turkey");
        expectedData.add("Greece");
        expectedData.add("Italy");
        expectedData.add("Canada");
        expectedData.add("Germany");
        expectedData.add("Japan");
        expectedData.add("Norway");

        // eşit mi
        assertEquals(expectedData, columnData);
    }


}