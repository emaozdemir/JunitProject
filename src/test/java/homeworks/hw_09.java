package homeworks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class hw_09 {
    /*
         Go to https://testpages.eviltester.com/styled/calculator
         Do all math operations with different @Test methods
         Get the result
         Verify the result
         Print the result
    */
    static WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testpages.eviltester.com/styled/calculator");
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void plusTest() {
        performCalculation("5", "5", "plus", "10");
    }

    @Test
    public void minusTest() {
        performCalculation("5", "5", "minus", "0");
    }

    @Test
    public void timesTest() {
        performCalculation("5", "5", "times", "25");
    }

    @Test
    public void divideTest() {
        performCalculation("5", "5", "divide", "1");
    }

    private void performCalculation(String number1, String number2, String operation, String expectedResult) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebDriverWait Kullanımı: Bu, belirli bir koşulun gerçekleşmesini beklemek için kullanılan bir Selenium bileşenidir.
        // Belirli bir elementin görünür olmasını veya tıklanabilir olmasını bekler.

        // İlk sayıyı gir
        WebElement firstNumber = wait.until(ExpectedConditions.elementToBeClickable(By.id("number1")));
        firstNumber.sendKeys(number1);

        // İkinci sayıyı gir
        //secondNumber Elementini Bulma ve Bekleme: number2 ID'sine sahip elementi bulur ve bu elementin tıklanabilir olmasını bekler.
        WebElement secondNumber = wait.until(ExpectedConditions.elementToBeClickable(By.id("number2")));
        secondNumber.sendKeys(number2);

        // İşlem türünü seç
        //operationElement Elementini Bulma ve Bekleme: XPath kullanarak işlem türüne göre ilgili option
        // elementini bulur ve bu elementin tıklanabilir olmasını bekler.
        WebElement operationElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[@value='" + operation + "']")));
        operationElement.click();

        // 'Calculate' butonuna tıkla
        WebElement calculateButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("calculate")));
        calculateButton.click();

        // Sonucu al
        //answer Elementini Bulma ve Bekleme: answer ID'sine sahip elementin görünür olmasını bekler.
        WebElement answer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("answer")));
        String result = answer.getText();

        // Sonucu doğrula
        assertEquals(expectedResult, result);

        // Sonucu yazdır
        System.out.println("Sonuç: " + result);
    }
}