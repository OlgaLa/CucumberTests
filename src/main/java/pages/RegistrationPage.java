package pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helpers.Locators.get;

public class RegistrationPage extends TestBase {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    private static final By TITLE = get("RegistrationPage.Title");

    public String getTitle() {
        return driver.findElement(TITLE).getText();
    }

}
