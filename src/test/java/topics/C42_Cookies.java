package topics;

import org.junit.Test;
import utilities.TestBase;

import static org.openqa.selenium.devtools.v85.page.Page.getCookies;

public class C42_Cookies extends TestBase {
    /*
        Go to URL: https://kitchen.applitools.com/ingredients/cookie
        Get Cookie.
        Find the total number of cookies.
        Print all the cookies.
        Add Cookie.
        Edit Cookie.
        Delete Cookie.
        Delete All Cookies.
     */
    @Test
    public void cookiesTest() {

//        Go to URL: https://kitchen.applitools.com/ingredients/cookie
        driver.get("https://kitchen.applitools.com/ingredients/cookie");

//        Get Cookie.
        getCookies();
//        Find the total number of cookies.


//        Print all the cookies.

//        Add Cookie.

//        Edit Cookie.

//        Delete Cookie.

//        Delete All Cookies.


    }
}
