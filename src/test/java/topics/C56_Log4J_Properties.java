package topics;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

public class C56_Log4J_Properties {

    @Test
    public void log4jPropertiesTest(){

        PropertyConfigurator.configure("log4j.properties");//Ayarların bulunduğu dosya belirtilir.

        Logger logger = LogManager.getLogger(C56_Log4J_Properties.class);//Logger objesi oluşturulur.

        //Log yapılır.
        logger.fatal("Fatal Message");//Defalut olarak ayarlama yapmadan yazdırılabilir.
        logger.error("Error Message");//Defalut olarak ayarlama yapmadan yazdırılabilir.
        logger.warn("Warn Message");//Ayarlama yapmadan yazdırılamazlar.
        logger.info("Info Message");//Ayarlama yapmadan yazdırılamazlar.
        logger.debug("Debug Message");//Ayarlama yapmadan yazdırılamazlar.
        logger.trace("Trace Message");//Ayarlama yapmadan yazdırılamazlar.
        //bu clası calıstırınca .log klasörü olustu ve oraya yazdırıldı.ve istersek htmlde browserda açma imkanimiz var daha iyi incelemek için.
        //log4j yi sadece konsola yazdırma ve onları klasörleyip bir yerde tutmak icin kullanıyoruz.raporlama ıcın baska toollar var onları kullanılır genelde.


    }

}
