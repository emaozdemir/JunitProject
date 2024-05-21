package homeworks;

import com.github.javafaker.Faker;
import org.apache.poi.ss.usermodel.*;
import org.junit.Test;
import utilities.TestBase;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class hw_19 extends TestBase {
    //  Capitals excel dosyasındaki Firstname Lastname sayfasına Adres sütunu ekleyip her kişiye adres giriniz.

    @Test
    public void test01() throws IOException {

        // Path to the Excel file
        String filePath = System.getProperty("user.dir") + "\\resources\\Capitals.xlsx";

        // Load the Excel workbook
        FileInputStream fileInputStream = new FileInputStream(filePath);
        Workbook workbook = WorkbookFactory.create(fileInputStream);

        // Load the specific sheet
        Sheet sheet = workbook.getSheet("FirstnameLastname");
        if (sheet == null) {
            sheet = workbook.createSheet("FirstnameLastname");
        }

        // Add "Address" header in the first row
        Row headerRow = sheet.getRow(0);
        if (headerRow == null) {
            headerRow = sheet.createRow(0);
        }
        headerRow.createCell(2).setCellValue("Address");

        // Create a Faker instance
        Faker faker = new Faker();

        // Fill in the Address column with random addresses
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
            Row row = sheet.getRow(i);
            if (row == null) {
                row = sheet.createRow(i);
            }
            row.createCell(2).setCellValue(faker.address().fullAddress());
        }

        // Write changes back to the file
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        workbook.write(fileOutputStream);

        // Close resources
        fileOutputStream.close();
        workbook.close();
        fileInputStream.close();
    }
}