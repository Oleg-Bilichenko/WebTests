import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BrowseLanguagesTest {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void setEnd() {
        driver.quit();
    }

    @Test
    public void verifyIsBrowseLanguagesPage() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/abc.html";

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement actualResult = driver.findElement(By.xpath("//div[@id=\"main\"]/h2"));

        Assert.assertTrue(actualResult.getText().contains("Category"));
    }

}
