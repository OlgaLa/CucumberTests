package base;

import org.openqa.selenium.WebDriver;
import pages.part.Header;

public class TestBase {

    public static WebDriver driver;
    private final Header HEADER;

    public TestBase(WebDriver driver) {
        this.driver = driver;
        HEADER = new Header(driver);
    }

    public Header getHeader() {
        return HEADER;
    }

}
