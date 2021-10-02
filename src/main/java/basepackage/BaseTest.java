package basepackage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {

    protected WebDriver driver;
    public static String baseUrl = "https://www.lcwaikiki.com/tr-TR/TR";

    @Before
    public void setUp() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions co = new ChromeOptions();
        capabilities.setCapability(ChromeOptions.CAPABILITY, co);
        String chromeDriverPath = "src/test/resources/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver(co);
        driver.get(baseUrl);
        driver.manage().window().maximize();
    }

    @After
    public void tearDown()  {
        driver.quit();
    }
}
