package TestStudyNotes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//@Ignore: Şimdilik o testi görmezden gel demek için kullanılır
//@Before: her testten önce içindeki ayarları çalıştırır bir kere ve sonra teste geçer
//@After: her testten sonra içindeki ayarları çalıştırır mesela tarayıcı her testten sonra kapatmak gibi
//@BeforeClass: statictir test ilk açıldığında bir kere olmak üzere ilk ayarları çalıştırır tüm testleri bir daha çalıştırmaya gerek olmadan testler çalışır
//@AfterClass: bu da sonda bir kere çalışır
public class TestStudyNotes {
    //web sriverı setup içinde yaparsak diğer metotlarda çalışmayacaktır.
    static WebDriver driver;
    @BeforeClass
    public static void setupABefore(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass
    public static void teardown(){
        driver.close();
    }

    @Test
    public void test() {
        //amazon sayfasına git
        driver.get("https://www.amazon.com.tr");
    }
    @Test
    public void test2() {
        driver.get("https://www.facebook.com/");
    }
    @Test
    public void test3() {
        driver.get("https://www.linkedin.com/");
    }

}
