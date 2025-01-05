package AcertionClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AcertionClass {
    static WebDriver driver;

    @BeforeClass
    public static void setUpBeforeClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterClass
    public static void tearDownAfterClass() {
        driver.close();
    }

    //biz normalde expected ve actual kelimelerini if else ile döndürdüğümüzde sonucu fail
    // olarak konsolda dönse bile test başarılı olarak görünüyor bunun önüne geçmek
    // içinde AcertionClass diye bir yapı bize yardımcı oluyor.
    @Test
    public void AcertionClass(){
        driver.get("http://amazon.com.tr/");
        //Arama çubuğuna "Nutella" yazdırın
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Nutella", Keys.ENTER);
        //Nutella yazdıktan sonra Entera basarak arama işlemini yapın

        //Bulunan sonuç sayısını yazdırın
        WebElement resultText = driver.findElement(By.xpath("(//h2//span)[1]"));
        WebElement result = driver.findElement(By.xpath("(//h2//span)[3]"));

        //Arama sonucunun içinde "Nutella" kelimesi var mı
        String actualText = result.getText();
        String expectedText = "Nutella";
        Assert.assertTrue(actualText.contains(expectedText));

        //Assert.asserdTrue(Koşul): Doğru olmasını istediğimiz koşullarda bunu kullanıyoruz.
        //Assert.asserdFalse(Koşul): Yanlış olmasını istediğimiz koşullarda bunu kullanıyoruz.
        //Assert.asserdEqual(expected,actual): Eşit olmasını istediğimiz iki değerde bunu kullanıyoruz.


    }
}
