package topics;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C49_ExcelReadApachePoi {
//Workbook → Excel dosyası.
//Sheet → Excel çalışma sayfası (Sheet1, Sheet2, vb.).
//Row (Satır) → Java, yalnızca içinde veri bulunan satırları sayar.
//Cell (Hücre) → Java her satıra bakar ve yalnızca hücrede veri bulunuyorsa hücre sayısını sayar.

//Workbook (excel)> Worksheet (sheet)> Row (satır)> Cell (hücre) -> hiyerarşi

/*
     Add the excel file on the resources folder.
     Open the file.
     Open the workbook using file input stream.
     Open the first worksheet.
     Go to first row.
     Go to first cell on that first row and print.
     Go to second cell on that first row and print.
     Go to 2nd row first cell and assert if the data equal to the USA.
     Go to 3rd row and print 2nd cell
     Find the number of used row.
     Print country, capital value pairs as map object.
     Verify that you have Canada on the list
*/

    @Test
    public void excelReadTest() throws IOException {
        System.out.println(System.getProperty("user.dir"));
        // Corrected file path
        FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\resources\\Capitals.xlsx");


        // Open the workbook using file input stream.
        Workbook workbook = WorkbookFactory.create(file);

        // Open the first worksheet.
        Sheet sheet = workbook.getSheetAt(0);

        // Go to the first row.
        Row firstRow = sheet.getRow(0);


    }
}