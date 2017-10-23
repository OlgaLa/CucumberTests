package base;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.part.Header;


public class TestBase {

    protected WebDriver driver;
    //protected HomePage homePage;
    private final Header HEADER;


    public TestBase(WebDriver driver) {
        this.driver = driver;
        HEADER = new Header(driver);
    }

    public Header getHeader() {
        return HEADER;
    }

//    @BeforeMethod
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "D:/Tools/drivers/chromedriver_win32/chromedriver.exe");
//        String browser = System.getProperty("browser") !=null ? System.getProperty("browser").toLowerCase() : "chrome";
//
//        switch (browser) {
//            case "firefox":
//                driver = new FirefoxDriver();
//                break;
//            default:
//                driver = new ChromeDriver();
//                break;
//        }
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get(Constant.HOME_PAGE_URL);
//        homePage = new HomePage(driver);
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        driver.close();
//    }

}
