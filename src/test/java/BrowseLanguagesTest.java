import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
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

    @Test
    public void checkLink_0_9_ByUrl() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/abc.html";
        String expectedResult = "https://www.99-bottles-of-beer.net/0.html";

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement link = driver.findElement(By.xpath("//a[@href='0.html']"));
        link.click();

        String actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void checkLink_0_9_BySearchText() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/abc.html";

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement link = driver.findElement(By.xpath("//a[@href='0.html']"));
        link.click();

        List<WebElement> resultList = driver.findElements(By.xpath("//td/a"));
        for (int i = 0; i < resultList.size(); i++) {
            Assert.assertTrue(Character.isDigit(resultList.get(i).getText().toLowerCase().charAt(0)));
        }
    }

    @Test
    public void checkSearchByLetter_A() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/abc.html";
        char expectedResult = 'a';

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement link = driver.findElement(By.xpath("//a[@href='a.html']"));
        link.click();

        List<WebElement> resultList = driver.findElements(By.xpath("//td/a"));
        for (int i = 0; i < resultList.size(); i++) {
            char actualResult = resultList.get(i).getText().toLowerCase().charAt(0);
             Assert.assertEquals(actualResult, expectedResult);
        }
    }

    @Test
    public void checkSearchByLetter_B() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/abc.html";
        char expectedResult = 'b';

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement link = driver.findElement(By.xpath("//a[@href='b.html']"));
        link.click();

        List<WebElement> resultList = driver.findElements(By.xpath("//td/a"));
        for (int i = 0; i < resultList.size(); i++) {
            char actualResult = resultList.get(i).getText().toLowerCase().charAt(0);
            Assert.assertEquals(actualResult, expectedResult);
        }
    }

    @Test
    public void checkSearchByLetter_C() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/abc.html";
        char expectedResult = 'c';

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement link = driver.findElement(By.xpath("//a[@href='c.html']"));
        link.click();

        List<WebElement> resultList = driver.findElements(By.xpath("//td/a"));
        for (int i = 0; i < resultList.size(); i++) {
            char actualResult = resultList.get(i).getText().toLowerCase().charAt(0);
            Assert.assertEquals(actualResult, expectedResult);
        }
    }

}
