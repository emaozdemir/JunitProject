package codeChallenge.day01;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class CH05 {
    /*
       go to https://eviltester.github.io/simpletodolist/todolists.html
       then
       verify display eviltester on todo_list
       and
       delete eviltester
       Then
       Enter new todo_list as "Clarusway"
       And
       Verify new todo_list is created
       Then
       add new Todo_ as "merhaba admin" on the new todo_list
       And
       Verify new Todo_ is added
       Then
       Login as Admin
       And
       Verify
        {"active":1,"completed":0,"total":1}
        Then
       Delete the new Todo_ and the new todo_list
       And
       Verify is deleted

       */
    static WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//her Web elementin yüklenip bulunması için 15 saniyeye kadar bekler.
    }

    @After
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test01() {

//    go to https://eviltester.github.io/simpletodolist/todolists.html
        driver.get("https://eviltester.github.io/simpletodolist/todolists.html");
//    verify display eviltester on todo_list
        WebElement testerText = driver.findElement(By.xpath("//label"));
        assertTrue(testerText.isDisplayed());

//    delete eviltester
//    Then
//    Enter new todo_list as "Clarusway"
//    And
//    Verify new todo_list is created
//    Then
//    add new Todo_ as "merhaba admin" on the new todo_list
//    And
//    Verify new Todo_ is added
//    Then
//    Login as Admin
//    And
//    Verify
//     {"active":1,"completed":0,"total":1}
//     Then
//    Delete the new Todo_ and the new todo_list
//    And
//    Verify is deleted


    }
}
