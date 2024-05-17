package topics;

import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

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
//        Print all the cookies.
        Set<Cookie> cookies = driver.manage().getCookies();
        // cookies.forEach(t-> System.out.println(t));
        cookies.forEach(System.out::println);//lambda tercih edilir
//        Get Cookie.
        Cookie cookie = driver.manage().getCookieNamed("vegetable");
        System.out.println("cookie = " + cookie);
//        Find the total number of cookies.
        System.out.println("cookies.size() = " + cookies.size());

//        Add Cookie.
        Cookie karbonhidrat = new Cookie("karbonhidrat", "makarna");
        driver.manage().addCookie(karbonhidrat);
        System.out.println("after add->> cookies.size() = " + driver.manage().getCookies().size());
        cookies.forEach(System.out::println);//lambda tercih edilir sor burayı !!!!

//        Delete Cookie.
        //  driver.manage().deleteCookie(karbonhidrat);
        //driver.manage().deleteCookieNamed("karbonhidrat");
        driver.manage().deleteCookieNamed("protein");
        System.out.println("after delete->> cookies.size() = " + driver.manage().getCookies().size());
        cookies.forEach(System.out::println);//lambda tercih edilir sor burayı !!!!
//        Delete All Cookies.
        driver.manage().deleteAllCookies();

    }
}
