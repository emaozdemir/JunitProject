package homeworks;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class hw_04 {
    /*
     Create chrome driver object by using @Before annotation
     Navigate to  https://testpages.herokuapp.com/styled/index.html
     Click on  Calculator under Micro Apps
     Type any number in the first input
     Type any number in the second input
     Click on Calculate
     Get the result
     Verify the result
     Print the result
     Close the browser by using @After annotation
*/
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterClass
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
         driver.quit();
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Thread.sleep(3000);
        // Click on  Calculator under Micro Apps
        driver.findElement(By.id("calculatetest")).click();
//        Type any number in the first input
        WebElement number1 = driver.findElement(By.id("number1"));
        number1.click();
        number1.sendKeys("10");
//        Type any number in the second input
        WebElement number2 = driver.findElement(By.id("number2"));
        number2.sendKeys("2");
//        Click on Calculate
        driver.findElement(By.id("calculate")).click();
//        Get the result
        WebElement sonucElement = driver.findElement(By.id("answer"));
        String sonuc = sonucElement.getText();

//        Verify the result
        assertEquals("Result is not as expected", "12", sonuc);
//        Print the result
        System.out.println("sonuc = " + sonuc);
//        Close the browser by using @After annotation
    }

}
