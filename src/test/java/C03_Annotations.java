import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class C03_Annotations {
    /*
    *** ANNOTATIONS ***
    6 Temel Junit notasyonu vardır.
    @Test: Bir metodun TEST CASE olarak işaretlenmesini sağlar.
    @Before: Her @Test anotasyonundan önce çalışır.
    @After: Her @Test anotasyonundan sonra çalışır.
    @BeforeClass: Bir sınıfın her çalıştırılmasından önce yalnızca bir kez çalışır.
    @AfterClass: Bir sınıfın her çalıştırılmasından sonra yalnızca bir kez çalışır.
    @Ignore: Bir test case'in atlanmasını sağlar.
    */
    @Before
    public void beforeMeth(){//her @Test anatasyonundan once calısır
        System.out.println("Before Methodu");
    }

    @After
    public void afterMeth(){//her @Test anatasyonundan sonra calısır
        System.out.println("After Methodu");
    }

    @BeforeClass
    public static void beforeClassMethod(){
        System.out.println("before class methodu");
    }
    @AfterClass
    public static void afterClassMethod(){
        System.out.println("after class methodu");
    }

    @Test
    public void test01(){
        System.out.println("test 01");
    }

    @Test
    public void test02(){
        System.out.println("test 02");
    }
    @Test
    public void test03(){
        System.out.println("test 03");
    }
    @Test@Ignore//Bir test case in atlanmasini saglar
    public void test04(){
        System.out.println("test 04");
    }
    @Test
    public void test05(){
        System.out.println("test 05");
    }


}
