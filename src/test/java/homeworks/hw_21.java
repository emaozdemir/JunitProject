package homeworks;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;

public class hw_21 extends TestBase {
    //Bir web table body'si içerisindeki istediğiniz sütunu list olarak dönen bir metod yazınız.

    @Test
    public void test01() {

        driver.get("https://testpages.herokuapp.com/styled/tag/table.html");
        String tableXpath="//table[@id='mytable']";
        int indexSutun=1;//isteğe bağlı değiştirebilirsin.
        List<String>mylist=getColumnData(tableXpath,indexSutun);
        for (int i = 0; i < mylist.size() ; i++) {
            System.out.println(mylist.get(i));
        }

    }

    private List<String> getColumnData(String Xpath, int index) {
        List<String> columnData = new ArrayList<>();
        List<WebElement> cells=driver.findElements(By.xpath(Xpath+"//tr//td["+(index+1)+"]"));
        for (WebElement cell : cells) {
            columnData.add(cell.getText());
        }
        return columnData;
    }

}

