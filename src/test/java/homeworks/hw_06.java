package homeworks;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class hw_06 extends TestBase {
    /*
        Go to http://test.rubywatir.com/ifelse.php
        Click the correct submit button declared in the yellow line
        Finish the test after 50 correct click
    */
    @Test
    public void test01(){
        driver.get("http://test.rubywatir.com/ifelse.php");
        for (int i = 0; i <50 ; i++) {

            String index= GetText(By.id("buttonNumber"));
            driver.findElement(By.xpath("(//div[@id='formbuttons']//td//input)["+index+"]")).click();
            String correctButton=driver.findElement(By.id("passed")).getText();
            Assert.assertEquals("You clicked the correct button", correctButton);
            System.out.println(i);
        }


    }

    public String GetText(By element){
        return driver.findElement(element).getText();
    }
}