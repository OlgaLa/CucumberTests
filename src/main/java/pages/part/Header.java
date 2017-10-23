package pages.part;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.AuthPage;

import static helpers.Locators.get;

public class Header {

    private static final Log LOG = LogFactory.getLog(Header.class);

    private WebDriver driver;

    public Header(WebDriver driver) { this.driver = driver; }

    private static final By SIGN_IN_BUTTON = get("Header.SignInButton");

    public AuthPage clickSignInButton() {
        driver.findElement(SIGN_IN_BUTTON).click();
        LOG.info("Click Sign In Button");
        return new AuthPage(driver);
    }



}
