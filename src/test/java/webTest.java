import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class webTest {

    WebDriver driver = new ChromeDriver();

    @AfterTest
    public void setEnd() {
        driver.quit();
    }

    @Test
    public void testFirst() throws InterruptedException {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/";
        String expectedResult = "https://www.99-bottles-of-beer.net/";

        System.setProperty(chromeDriver, driverPath);

        driver.get(url);
        Thread.sleep(3000);

        String actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void verifyHeader() {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/";
        String expectedResult = "Welcome to 99 Bottles of Beer";

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement actualResult = driver.findElement(By.xpath("//div[@id=\"main\"]/h2"));

        Assert.assertEquals(actualResult.getText(), expectedResult);
    }

    @Test
    public void checkLinkTeam() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/";
        String expectedResult = "https://www.99-bottles-of-beer.net/team.html";

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement linkTeam = driver.findElement(By.xpath("//a[@href=\"team.html\"]"));
        linkTeam.click();

        String actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void checkLinkSongLyrics() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/";
        String expectedResult = "https://www.99-bottles-of-beer.net/lyrics.html";

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement linkTeam = driver.findElement(By.xpath("//a[@href=\"lyrics.html\"]"));
        linkTeam.click();

        String actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void checkLinkHistory() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/";
        String expectedResult = "https://www.99-bottles-of-beer.net/info.html";

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement linkTeam = driver.findElement(By.xpath("//a[@href=\"info.html\"]"));
        linkTeam.click();

        String actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void checkLinkPrivacy() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/";
        String expectedResult = "https://www.99-bottles-of-beer.net/impressum.html";

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement linkTeam = driver.findElement(By.xpath("//a[@href=\"impressum.html\"]"));
        linkTeam.click();

        String actualResult = driver.getCurrentUrl();

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void checkTabBrowseLanguages() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/";
        String expectedResult = "https://www.99-bottles-of-beer.net/abc.html";

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement linkTeam = driver.findElement(By.xpath("//ul[@id=\"menu\"]//a[@href=\"/abc.html\"]"));
        linkTeam.click();

        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void checkTabSearchLanguages() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/";
        String expectedResult = "https://www.99-bottles-of-beer.net/search.html";

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement linkTeam = driver.findElement(By.xpath("//ul[@id=\"menu\"]//a[@href=\"/search.html\"]"));
        linkTeam.click();

        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void checkTabTopLists() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/";
        String expectedResult = "https://www.99-bottles-of-beer.net/toplist.html";

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement linkTeam = driver.findElement(By.xpath("//ul[@id=\"menu\"]//a[@href=\"/toplist.html\"]"));
        linkTeam.click();

        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, expectedResult);
    }

}
