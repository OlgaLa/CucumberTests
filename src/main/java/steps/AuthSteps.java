package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import helpers.TestUtils;
import pages.AuthPage;
import pages.HomePage;
import pages.RegistrationPage;

public class AuthSteps {

    protected HomePage homePage;
    protected AuthPage authPage;
    protected RegistrationPage registrationPage;


    @When("^I click on \"Sign In\" button$")
    public void click_on_sing_in_button() {
        try {
            authPage = homePage.getHeader().clickSignInButton();
        } catch (Exception e) {
            System.out.print(e);
        }
    }

    @And("^I enter new valid email$")
    public void enter_email() {
        authPage.enterEmail(new TestUtils().generateRandomEmail());
    }

    @And("^I click on \"Create an account\" button$")
    public void click_on_Create_account_button() {
        registrationPage = authPage.clickCreateAccountButton();
    }

    @Then("^Registration page should be opened$")
    public void registration_page_is_opened() {
        System.out.print("123");
    }


}
