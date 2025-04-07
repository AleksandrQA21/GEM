package steps;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.webdriver;
import static org.testng.Assert.assertTrue;
import static pages.LoginPage.errorMessage;

/**
 * Step definitions for login feature
 */
public class LoginSteps {
    public LoginPage loginPage;
    public HomePage homePage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage = new LoginPage();
        loginPage.openLoginPage();
    }

    @When("I enter valid email {string}")
    public void iEnterValidEmail(String email) throws InterruptedException {
        loginPage.enterEmail(email);
    }

    @When("I enter email {string}")
    public void iEnterEmail(String email) throws InterruptedException {
        loginPage.enterEmail(email);
    }

    @And("I enter valid password {string}")
    public void iEnterValidPassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("I click on the login button")
    public void iClickOnTheLoginButton() throws InterruptedException {
        loginPage.clickLoginButton();
    }

    @Then("I should be redirected to the homepage")
    public void iShouldBeRedirectedToTheHomepage() throws InterruptedException {
        String currentUrl = webdriver().driver().url();
        Assert.assertEquals(currentUrl, "http://34.233.163.207/",
                "Not redirected to the homepage after login");
    }

    @And("I should see user is logged in")
    public void iShouldSeeUserIsLoggedIn() {
        homePage = new HomePage();
        homePage.verifyUserIsLoggedIn();
    }

    @Then("I should see an error message")
    public void iShouldSeeAnErrorMessage() throws InterruptedException {
        loginPage = new LoginPage();
        errorMessage.shouldBe(visible);

    }

    @Then("I should remain on the login page")
    public void iShouldRemainOnTheLoginPage() {
        assertTrue(loginPage.isOnLoginPage(),
                "User was not kept on login page after failed login attempt");
    }

    @And("I should see error message containing {string}")
    public void iShouldSeeErrorMessageContaining(String errorText) {
        String actualError = loginPage.getErrorMessageText();
        assertTrue(actualError.contains(errorText),
                String.format("Error message '%s' does not contain expected text '%s'",
                        actualError, errorText));
    }
}
