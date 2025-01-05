package TestStudyNotes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestStudyNotes {
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
