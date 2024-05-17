package homeworks;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;


public class hw_03 {
    /*
    Go to Clarusway homepage
    Do the following tasks by creating 3 different test methods.
    Check if the URL contains clarusway.
    Check if the title does not contain Python.
    Check if the title equals to "Online IT Bootcamp; Learn Coding, Data Science, AWS, DevOps, Cyber Security & Salesforce"
     */
    static WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
      driver.get("https://clarusway.com");
    }
    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test01() {

        assertTrue("URL not contains 'clarusway'", driver.getCurrentUrl().contains("clarusway"));
    }

    @Test
    public void test02() {
        assertFalse("Title not contains 'Python'", driver.getTitle().contains("Python"));
    }

//Check if the title equals to "Online IT Bootcamp; Learn Coding, Data Science, AWS, DevOps, Cyber Security & Salesforce"

    @Test
    public void test03() {
        String expectedTitle = "Online IT Bootcamp; Learn Coding, Data Science, AWS, DevOps, Cyber Security & Salesforce";
       // driver.getTitle();
        assertEquals("Title is not correct", expectedTitle, driver.getTitle());
    }
}
