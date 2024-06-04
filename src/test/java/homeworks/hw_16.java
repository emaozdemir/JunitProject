package homeworks;

import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class hw_16 extends TestBase {
    /*
    Go to https://testfile.org/
    Download a PDF file
    Verify it is downloaded
    */
    @Test
    public void test01() throws InterruptedException {

        //    Go to https://testfile.org/
        driver.get("https://testfile.org/");

        //    Download a PDF file
        driver.findElement(By.xpath("(//ul[@id='menu-1-c99e9f4']//a[contains(text(),'PDF')])[1]")).click();
        driver.findElement(By.xpath("//a[@href='https://link.testfile.org/PDF10MB']")).click();
        Thread.sleep(10000);
        //    Verify it is downloaded
        System.out.println(driver.getTitle());
//        boolean isFlowerExist = Files.exists(Path.of("https://files.testfile.org/PDF/10MB-TESTFILE.ORG.pdf"));//kodun dinamik olabilmesi için, dosya yolunun dinamik yazılması gerekir.
//        assertTrue(isFlowerExist);

//Bu ifade, sayfadaki tüm a elementlerini kontrol eder ve metninde "PDF" geçen elementleri seçer.

//Özetle, contains(text(),'PDF'), belirli bir metni içeren elementleri bulmak için kullanılır ve XPath ifadelerinde oldukça kullanışlıdır.

    }
}
