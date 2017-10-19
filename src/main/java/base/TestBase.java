package base;

import constants.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    protected HomePage homePage;

    public TestBase(WebDriver driver) {
        this.driver = driver;
    }

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:/Tools/drivers/chromedriver_win32/chromedriver.exe");
        String browser = System.getProperty("browser") !=null ? System.getProperty("browser").toLowerCase() : "chrome";

        switch (browser) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(Constant.HOME_PAGE_URL);
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

}
