package runner;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import constants.Constant;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.After;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Hooks{

    public static WebDriver driver;

    @Before
    /**
     * Delete all cookies at the start of each scenario to avoid
     * shared state between tests
     */
    public void openBrowser() throws MalformedURLException {

        System.setProperty("webdriver.chrome.driver", "D:/Tools/drivers/chromedriver_win32/chromedriver.exe");
        String browser = System.getProperty("browser") !=null ? System.getProperty("browser").toLowerCase() : "chrome";

        switch (browser)
        {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "ie":
                driver = new InternetExplorerDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Opening Browser...."+browser);
        driver.manage().deleteAllCookies();
        driver.get(Constant.HOME_PAGE_URL);
    }


    @After
    /**
     * Embed a screenshot in test report if test is marked as failed
     */
//    public void embedScreenshot(Scenario scenario) {
//
//        if(scenario.isFailed()) {
//            try {
//                scenario.write("Current Page URL is " + driver.getCurrentUrl());
////            byte[] screenshot = getScreenshotAs(OutputType.BYTES);
//                byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//                scenario.embed(screenshot, "image/png");
//            } catch (WebDriverException somePlatformsDontSupportScreenshots) {
//                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
//            }
//
//        }
//        driver.quit();
//
//    }
    public static void tearDown() {
        driver.close();
    }

}