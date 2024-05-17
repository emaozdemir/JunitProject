package topics;

import org.junit.Test;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class C44_FileExist extends TestBase {
    /*

    Bilgisayarımızdaki bir dosyanın varlığını test etmek için önce o dosyaya erişmemiz gerekmektedir.
    Java'da dosyaya erişmek için dosya yoluna -pathine ihtiyacımız vardır.
    Her bilgisayarın kullanıcı adı farklı olduğundan masaüstü dosya yolu da birbirinden farklı olacaktır.
    Testlerimizin tüm bilgisayarda çalışması için dosya yolunu DİNAMİK hale getirmek zorundayız.

    Files.exists(Paths.get (filePath)); Bilgisayarınızda dosyanın olup olmadığını kontrol eder.
    */

    @Test
    public void fileExistTest() {
        //masaustundeki Flower.bmp dosyasinin varlığını test edelim.
//      boolean isFileExist= Files.exists(Path.of("C:\\Users\\semao\\OneDrive\\Masaüstü\\Flower.bmp"));
//       assertTrue(isFileExist);
        String userHome = System.getProperty("user.home");//Kullanıcı adına kadar(dahil) olan yolu verir.
        System.out.println("userHome = " + userHome);
        boolean isFileExist = Files.exists(Path.of(userHome + "/OneDrive/Masaüstü/Flower.bmp"));//kodun dinamik olabilmesi için, dosya yolunun dinamik yazılması gerekir.
        assertTrue(isFileExist);

        //Masaüstündeki Bird.bmp dosyasnın olmadığını test edelim.
        boolean isBirdExist = Files.exists(Path.of(userHome+"/Desktop/Bird.bmp"));
        assertFalse(isBirdExist);

        String userDir = System.getProperty("user.dir");
        System.out.println("userDir = " + userDir);
        boolean isAddressesExist = Files.exists(Path.of(userDir + "/Addresses.txt"));
        assertTrue(isAddressesExist);
    }
}
