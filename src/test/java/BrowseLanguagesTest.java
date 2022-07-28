import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
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

    @Test
    public void checkSearchByLetter_D() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/abc.html";
        char expectedResult = 'd';

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement link = driver.findElement(By.xpath("//a[@href='d.html']"));
        link.click();

        List<WebElement> resultList = driver.findElements(By.xpath("//td/a"));
        for (int i = 0; i < resultList.size(); i++) {
            char actualResult = resultList.get(i).getText().toLowerCase().charAt(0);
            Assert.assertEquals(actualResult, expectedResult);
        }
    }

    @Test
    public void checkSearchByLetter_E() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/abc.html";
        char expectedResult = 'e';

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement link = driver.findElement(By.xpath("//a[@href='e.html']"));
        link.click();

        List<WebElement> resultList = driver.findElements(By.xpath("//td/a"));
        for (int i = 0; i < resultList.size(); i++) {
            char actualResult = resultList.get(i).getText().toLowerCase().charAt(0);
            Assert.assertEquals(actualResult, expectedResult);
        }
    }

    @Test
    public void checkSearchByLetter_F() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/abc.html";
        char expectedResult = 'f';

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement link = driver.findElement(By.xpath("//a[@href='f.html']"));
        link.click();

        List<WebElement> resultList = driver.findElements(By.xpath("//td/a"));
        for (int i = 0; i < resultList.size(); i++) {
            char actualResult = resultList.get(i).getText().toLowerCase().charAt(0);
            Assert.assertEquals(actualResult, expectedResult);
        }
    }

    @Test
    public void checkSearchByLetter_G() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/abc.html";
        char expectedResult = 'g';

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement link = driver.findElement(By.xpath("//a[@href='g.html']"));
        link.click();

        List<WebElement> resultList = driver.findElements(By.xpath("//td/a"));
        for (int i = 0; i < resultList.size(); i++) {
            char actualResult = resultList.get(i).getText().toLowerCase().charAt(0);
            Assert.assertEquals(actualResult, expectedResult);
        }
    }

    @Test
    public void checkSearchByLetter_H() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/abc.html";
        char expectedResult = 'h';

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement link = driver.findElement(By.xpath("//a[@href='h.html']"));
        link.click();

        List<WebElement> resultList = driver.findElements(By.xpath("//td/a"));
        for (int i = 0; i < resultList.size(); i++) {
            char actualResult = resultList.get(i).getText().toLowerCase().charAt(0);
            Assert.assertEquals(actualResult, expectedResult);
        }
    }

    @Test
    public void checkSearchByLetter_I() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/abc.html";
        char expectedResult = 'i';

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement link = driver.findElement(By.xpath("//a[@href='i.html']"));
        link.click();

        List<WebElement> resultList = driver.findElements(By.xpath("//td/a"));
        for (int i = 0; i < resultList.size(); i++) {
            char actualResult = resultList.get(i).getText().toLowerCase().charAt(0);
            Assert.assertEquals(actualResult, expectedResult);
        }
    }

    @DataProvider(name = "LetterDataProvider")
    public Object[][] getData() {
        Object[][] data = {{'j'}, {'k'}, {'l'}, {'k'}, {'l'}, {'m'}, {'n'}, {'p'}, {'q'}, {'r'}, {'s'}, {'t'}, {'v'},
                {'w'}, {'x'}, {'y'}, {'z'}};
        return data;
    }

    @Test(dataProvider = "LetterDataProvider")
    public void checkSearchByLetter_JKL(char letter) {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/abc.html";
        char expectedResult = letter;

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement link = driver.findElement(By.xpath("//a[@href='" + letter + ".html']"));
        link.click();

        List<WebElement> resultList = driver.findElements(By.xpath("//td/a"));
        for (int i = 0; i < resultList.size(); i++) {
            char actualResult = resultList.get(i).getText().toLowerCase().charAt(0);
            Assert.assertEquals(actualResult, expectedResult);
        }
    }

    @Test
    public void checkByLanguageCategory_A() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/abc.html";

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        List<WebElement> resultListWorldsDs = driver.findElements(By.xpath("//table//a[@href]"));

        String[] array = new String[resultListWorldsDs.size()];

        for (int i = 0; i < resultListWorldsDs.size(); i++) {
            String res = resultListWorldsDs.get(i).getText();
            array[i] = res;
        }

        for (int i = 0; i < array.length; i++) {
            driver.findElement(By.xpath("//td/a[text()='" + array[i] + "']")).click();
            String expectedResult = "Language " + array[i];
            String actualResult = driver.findElement(By.xpath("//div[@id='main']/h2")).getText();
            Assert.assertEquals(actualResult, expectedResult);
            driver.navigate().back();
        }
    }

    @Test
    public void checkByLanguageCategory_B() {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/b.html";

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        List<WebElement> resultListWorldsDs = driver.findElements(By.xpath("//table//a[@href]"));

        String[] array = new String[resultListWorldsDs.size()];

        for (int i = 0; i < resultListWorldsDs.size(); i++) {
            String res = resultListWorldsDs.get(i).getText();
                array[i] = res;
        }

        for (int i = 0; i < array.length; i++) {
            driver.findElement(By.xpath("//td/a[text()=\"" + array[i] + "\"]")).click();
            String expectedResult = "Language " + array[i];
            String actualResult = driver.findElement(By.xpath("//div[@id='main']/h2")).getText();
            Assert.assertEquals(actualResult, expectedResult);
            driver.navigate().back();
        }

    }

    @DataProvider(name = "ListWorldsDataProvider")
    public Object[][] getDataList() {
        Object[][] data = {{'a'}, {'b'}, {'c'}, {'d'}, {'e'}, {'f'}, {'g'}, {'h'}, {'i'}, {'j'}, {'k'}, {'l'}, {'k'},
                 {'l'}, {'m'}, {'n'}, {'p'}, {'q'}, {'r'}, {'s'}, {'t'}, {'v'}, {'w'}, {'x'}, {'y'}, {'z'}};

        return data;
    }

    @Test(dataProvider = "ListWorldsDataProvider")
    public void checkSearchByLetter_XYZ(char letter) {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/abc.html";
        char expectedResult = letter;

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        WebElement link = driver.findElement(By.xpath("//a[@href='" + letter + ".html']"));
        link.click();

        List<WebElement> resultList = driver.findElements(By.xpath("//td/a"));
        for (int i = 0; i < resultList.size(); i++) {
            char actualResult = resultList.get(i).getText().toLowerCase().charAt(0);
            Assert.assertEquals(actualResult, expectedResult);
        }

        List<WebElement> resultListWorldsDs = driver.findElements(By.xpath("//table//a[@href]"));

        String[] array = new String[resultListWorldsDs.size()];

        for (int i = 0; i < resultListWorldsDs.size(); i++) {
            String res = resultListWorldsDs.get(i).getText();
            array[i] = res;
        }

        for (int i = 0; i < array.length; i++) {
            driver.findElement(By.xpath("//td/a[text()=\"" + array[i] + "\"]")).click();
            String expRes = "Language " + array[i];
            String actRes = driver.findElement(By.xpath("//div[@id='main']/h2")).getText();
            Assert.assertEquals(actRes, expRes);
            driver.navigate().back();
        }
    }

    @DataProvider(name = "Search LanguagesDataProvider")
    public Object[][] checkSearchLanguages() {
        Object[][] data = {{"ABC"}, {"BAK"}, {"Calc"}, {"Dark"}, {"Excel"}, {"False"}, {"GAP"}, {"Hope"}, {"IBM"}, {"Java"}};

        return data;
    }

    @Test(dataProvider = "Search LanguagesDataProvider")
    public void checkSearchLanguages(String word) {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Users/olegbill/Disk_D/Testing/QAForEveryone/QAForEveryone_03/#qa_java_beginners/MVN_Progekts_IrinaZ/WebTests/chromedriver";
        String url = "https://www.99-bottles-of-beer.net/search.html";

        System.setProperty(chromeDriver, driverPath);
        driver.get(url);

        driver.findElement(By.xpath("//form[@id='searchlanguages']//input[@name='search']")).sendKeys(word);
        driver.findElement(By.xpath("//form[@id='searchlanguages']//input[@name='submitsearch']")).click();

        List<WebElement> resultList = driver.findElements(By.xpath("//td/a"));
        for (int i = 0; i < resultList.size(); i++) {
            String actualResult = resultList.get(i).getText();
            Assert.assertTrue(actualResult.contains(word));
        }
    }


}




