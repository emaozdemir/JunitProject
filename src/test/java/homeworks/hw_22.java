package homeworks;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static utilities.JavascriptUtils.clickElementByJS;
import static utilities.JavascriptUtils.flash;

public class hw_22 extends TestBase {
    /*
    Go to https://form.jotform.com/73302671092956
    Click on start
    Enter firstname and lastname
    Click on next
    Enter email
    Click on next
    Enter message
    Click on next
    Handle captcha
    Click on submit
    Assert that submission is received
    Flash web elements before use(JavaScriptUtils)
 */
    @Test
    public void hw_22() throws InterruptedException {
//        Go to https://form.jotform.com/73302671092956
        driver.get("https://form.jotform.com/73302671092956");
//        Click on start

        driver.findElement(By.id("jfCard-welcome-start")).click();
        Thread.sleep(1000);
//        Enter firstname and lastname
        driver.findElement(By.id("first_1")).sendKeys("sema");
        Thread.sleep(1000);
        driver.findElement(By.id("last_1")).sendKeys("oz");
        Thread.sleep(1000);
//        Click on next

        // List<WebElement> slidersList=driver.findElements(By.xpath("(//div[@class='jfProgress-itemCell'])[1]);
        //  clickElementByJS (driver.findElement(By.xpath("(//div[@class='jfProgress-itemCell'])[1]")));
        driver.findElement(By.xpath("//button[@data-testid='nextButton_0']")).click();
        Thread.sleep(1000);

//        Enter email
        driver.findElement(By.name("q2_email")).sendKeys("sema@gmail.com");
        Thread.sleep(1000);
//        Click on next
        driver.findElement(By.xpath("//button[@data-testid='nextButton_1']")).click();
        Thread.sleep(1000);
//        Enter message
        driver.findElement(By.id("input_3")).sendKeys("Clarusway bshdhsjkdhsf");
        Thread.sleep(1000);
//        Click on next

        driver.findElement(By.xpath("//button[@data-testid='nextButton_2']")).click();
        Thread.sleep(1000);
//        Handle captcha

        driver.switchTo().frame(0);
        String number = driver.findElement(By.xpath("//span[@id='number']")).getText();
        Thread.sleep(1000);

        String function = driver.findElement(By.xpath("//span[@id='function']")).getText();

        String number2 = driver.findElement(By.xpath("//span[@id='number2']")).getText();
        int num = Integer.parseInt(number);
        int num2 = Integer.parseInt(number2);
        Thread.sleep(2000);
        int result = 0;
        switch (function) {
            case "-":
                result = num - num2;
                break;
            case "+":
                result = num + num2;
                break;
            case "x":
                result = num * num2;
                break;
            case "/":
                result = num / num2;
                break;
            default:
                System.out.println("ht");
                break;
        }
        String sss = String.valueOf(result);

        Thread.sleep(3000);

        driver.findElement(By.id("result")).sendKeys(sss);
        Thread.sleep(2000);
        driver.switchTo().parentFrame();
        clickElementByJS(driver.findElement(By.xpath("(//button[@data-testid='submitButton'])[4]")));
        Thread.sleep(1000);
//        Assert that submission is received
        assert driver.findElement(By.xpath("//body[@class='thankyouMode']")).isDisplayed();
//        Flash web elements before use(JavaScriptUtils)
    }
}

/*
   @Test
    public void captchaTest() throws InterruptedException {
//        Go to https://form.jotform.com/73302671092956
        driver.get("https://form.jotform.com/73302671092956");

//        Click on start
        Thread.sleep(500);
        WebElement start = driver.findElement(By.id("jfCard-welcome-start"));
        flash(start, "red");
        start.click();

//        Enter firstname and lastname
        driver.findElement(By.id("first_1")).sendKeys(Faker.instance().name().firstName());
        Thread.sleep(200);
        driver.findElement(By.id("last_1")).sendKeys(Faker.instance().name().lastName());

//        Click on next
        Thread.sleep(500);
        driver.findElement(By.xpath("//button[@data-testid='nextButton_0']")).click();

//        Enter email
        driver.findElement(By.name("q2_email")).sendKeys(Faker.instance().internet().emailAddress());

//        Click on next
        Thread.sleep(500);
        driver.findElement(By.xpath("//button[@data-testid='nextButton_1']")).click();

//        Enter message
        WebElement message = driver.findElement(By.id("input_3"));
        flash(message, "yellow");
        message.sendKeys(Faker.instance().lorem().paragraph());

//        Click on next
        Thread.sleep(500);
        driver.findElement(By.xpath("//button[@data-testid='nextButton_2']")).click();

//        Handle captcha
        driver.switchTo().frame(0);

        int num1 = Integer.parseInt(driver.findElement(By.id("number")).getText());
        int num2 = Integer.parseInt(driver.findElement(By.id("number2")).getText());
        String function = driver.findElement(By.id("function")).getText();

        int result;

        if (function.equals("+")) {
            result = num1 + num2;
        } else if (function.equals("-")) {
            result = num1 - num2;
        } else {
            result = num1 * num2;
        }

        driver.findElement(By.xpath("//input[@name='equal']")).sendKeys(result + "");

//        Click on submit
        driver.switchTo().parentFrame();
        driver.findElement(By.xpath("(//button[@aria-label='Submit'])[4]")).click();

//        Assert that submission is received
        Thread.sleep(500);
        WebElement thankYou = driver.findElement(By.tagName("h1"));
        flash(thankYou, "blue");
        assertEquals("Thank You!", thankYou.getText());

//        Flash web elements before use(JavaScriptUtils)



    }

}
 */
