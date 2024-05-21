package homeworks;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class hw_17 extends TestBase {
    /*
    Create a reusable method to get an Excel column data as a list.
    Bir Excel sütun verisini liste halinde almak için yeniden kullanılabilir bir yöntem oluşturun.
    */
    @Test
    public void test01() throws IOException {

    // Create a reusable method to get an Excel column data as a list.
    //  Bir Excel sütun verisini liste halinde almak için yeniden kullanılabilir bir yöntem oluşturun.
    FileInputStream fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\resources\\Capitals.xlsx");

    //Open the workbook using file input stream.
    Workbook workbook = WorkbookFactory.create(fileInputStream);


    }
}
