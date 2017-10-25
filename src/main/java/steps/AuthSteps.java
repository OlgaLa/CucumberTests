package steps;

import base.TestBase;
import constants.ExpectedValues;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.TestUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import pages.AuthPage;
import pages.HomePage;
import pages.RegistrationPage;

public class AuthSteps {

    private static final Log LOG = LogFactory.getLog(AuthSteps.class);

    protected HomePage homePage;
    protected AuthPage authPage;
    protected RegistrationPage registrationPage;

    @Given("^User opens Home page$")
    public void open_home_page() {
        homePage = new HomePage(TestBase.createWebDriver());
    }

    @When("^User clicks on \"Sign In\" button$")
    public void click_on_sing_in_button() {
        try {
            LOG.info("Try to click Button");
            authPage = homePage.getHeader().clickSignInButton();

        } catch (Exception e) {
            System.out.print(e);
        }
    }

    @And("^User enters new valid email$")
    public void enter_email() {
        authPage.enterEmail(new TestUtils().generateRandomEmail());
    }

    @And("^User clicks on \"Create an account\" button$")
    public void click_on_Create_account_button() {
        registrationPage = authPage.clickCreateAccountButton();
    }

    @Then("^Registration page should be opened$")
    public void registration_page_is_opened() {
        Assert.assertEquals("Page title is incorrect.", registrationPage.getTitle(), ExpectedValues.REGISTRATION_PAGE_TITLE);
    }

}
