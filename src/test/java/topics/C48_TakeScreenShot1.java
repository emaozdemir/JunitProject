package topics;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class C48_TakeScreenShot1 extends TestBase {
/*
    Go to Clarusway
    Take full page screenshot
    Take a specific element's screenshot
*/

    @Test
    public void fullPageScreenShot() throws IOException {
//        Go to Clarusway
        driver.get("https://linkedin.com");

//        Take full page screenshot
        TakesScreenshot screenshot = (TakesScreenshot)driver;
        File ss = screenshot.getScreenshotAs(OutputType.FILE);

        String time = new SimpleDateFormat("yyMMddhhmmss").format(new Date())+System.nanoTime();

        FileUtils.copyFile(ss, new File("test-output/screenshots/" +time+".png") );


//        Take a specific element's screenshot


    }




}
