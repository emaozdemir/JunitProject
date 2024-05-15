package topics;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_Junit {
/*
• Açık kaynaklıdır.
• JUnit, en temel framework’tür.
• Software Tester’lar, otomasyon framework’ü oluşturmak için JUnit'i kullanabilir.
• Developerlar, unit framework oluşturmak için JUnit'i kullanabilir.
• Main ve class object oluşturmak zorunda değilsiniz.
• Test suite çalıştırabilir.
 */

    @Test//Test methodunun başında @Test anatasyonu bulunur
    public void test01() {//Test methodları public ve void'dir

        System.out.println("Test 01");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.quit();

    }

    @Test//junit'te bir class içindeki methodlar alfabetik sira ile calısır
    public void test02() {

        System.out.println("Test 02");
        WebDriver driver = new ChromeDriver();
        driver.get("https://linkedin.com");
        driver.quit();

    }

    @Test
    public void test03() {

        System.out.println("Test 03");
        WebDriver driver = new ChromeDriver();
        driver.get("https://instagram.com");
        driver.quit();

    }


}
