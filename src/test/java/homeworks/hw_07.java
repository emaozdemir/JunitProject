package homeworks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class hw_07 extends TestBase {
/*
  Go to https://testpages.eviltester.com/styled/find-by-playground-test.html
  Assert that there are 42 web elements with 'p' tag on the page
*/
    @Test
    public void test01(){
        driver.get("https://testpages.eviltester.com/styled/find-by-playground-test.html");

        List < WebElement> p42=driver.findElements(By.tagName("p"));
        assertEquals(42,p42.size());
    }

}
