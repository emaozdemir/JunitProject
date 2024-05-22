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

public class hw_19 {
    //  Capitals excel dosyasındaki Firstname Lastname sayfasına Adres sütunu ekleyip her kişiye adres giriniz.

    @Test
    public void test01() throws IOException {

        // Path to the Excel file
        String filePath = System.getProperty("user.dir") + "\\resources\\Capitals.xlsx";

        // Load the Excel workbook
        FileInputStream fileInputStream = new FileInputStream(filePath);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        //Create a new sheet
        // Sheet newSheet=workbook.createSheet("FirstnameLastname")  ;
        // Load the specific sheet
        Sheet sheet = workbook.getSheet("FirstnameLastname");
        if (sheet == null) {
            sheet = workbook.createSheet("FirstnameLastname");
        }

        // Add "Address" header in the first row
        Row baslik = sheet.createRow(0);
        baslik.createCell(2).setCellValue("Address");

        // Create a Faker clss
        Faker faker = new Faker();

        // Fill in the Address column
        for (int i = 1; i <= sheet.getLastRowNum(); i++) {
           // Row row = sheet.getRow(i);
           sheet.createRow(i).createCell(2).setCellValue(faker.address().fullAddress());
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