package topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebDriver {
    /*
• Maven, Java Tabanlı Projeler oluşturmak ve yönetmek için kullanılan bir araçtır.
• Temel olarak basit kelimelerle ifade etmek, Java Tabanlı Projeye bağımlılığı yönetmenin bir yoludur.
• Maven, büyük projeler üzerinde çalışırken POM (Project Object Model) ile proje oluştururken kullanılabilir.
• Birden çok IDE (IntelliJ, Eclipse, vs.) ile çalışır.• Maven bir Java derleme ve yönetim aracıdır.
• Maven ile tüm otomasyon süreci sürecini yönetmek için maven projesioluşturabilirsiniz.
• Maven, pom.xml dosyası ile dependency’leriyönetmemize yardımcı oluyor.
• Maven, Java uygulamalarını derlememize, çalıştırmamızave dağıtmamızayardımcı oluyor.
• Ant ve Gradlegibi başka araçlar da var ancakMaven en popülerolanıdır.
     */

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();//Selenium 4.6 öncesi driver direkt oluşturulamıyordu. WebDriverManager yardımı ile direkt oluşturulabilirdi.
        driver.manage().window().maximize();

        driver.get("https://clarusway.com");

        if (driver.getTitle().contains("Bootcamp")) {//Bu yöntem ile test işlemi yapılmaz. Bit test framework'ü yükleyeceğiz.
            System.out.println("Test PASSED");
        } else {
            System.out.println("Test FAILED");
        }

        driver.quit();

    }

}