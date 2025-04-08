package steps;

import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ForgotPasswordPage;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.webdriver;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static pages.LoginPage.errorMessage;
import static pages.LoginPage.forgotPasswordLink;

/**
 * Step definitions for login feature
 */
public class LoginSteps {
    public LoginPage loginPage;
    public HomePage homePage;
    public ForgotPasswordPage forgotPasswordPage;

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        loginPage = new LoginPage();
        loginPage.openLoginPage();
    }

    @When("I enter valid email {string}")
    public void iEnterValidEmail(String email) {
        loginPage.enterEmail(email);
    }

    @When("I enter email {string}")
    public void iEnterEmail(String email){
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
    public void iClickOnTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should be redirected to the homepage")
    public void iShouldBeRedirectedToTheHomepage(){
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

    @When("I click on Forgot Password link")
    public void iClickOnForgotPasswordLink() {
        forgotPasswordLink.shouldBe(visible).click();
    }

    @Then("I should see Recover Password page")
    public void iShouldSeeRecoverPasswordPage() throws InterruptedException {
        forgotPasswordPage = new ForgotPasswordPage();
        assertTrue(forgotPasswordPage.isOnForgotPasswordPasswordPage());
        assertTrue(forgotPasswordPage.verifyOnForgotPasswordPage());
    }

//    @And("I enter valid email {string}")
//    public void iEnterValidEmailString(String email) {
//        forgotPasswordPage.enterEmailRecoverPassword(email);
//    }

    @And("I click Reset button")
    public void iClickResetButton() {
        ForgotPasswordPage.resetButton.shouldBe(visible).click();
    }

    @Then("I should see Reset Password link sent")
    public void iShouldSeeResetPasswordLinkSent() throws InterruptedException {
        assertTrue(forgotPasswordPage.isPasswordSentTextDisplayed());
    }

    @And("email input field is empty")
    public void emailInputFieldIsEmpty() {
        assertEquals(ForgotPasswordPage.emailInputRecoverPassword.getText(),"");
    }

    @And("I click on Back to Sign in button")
    public void iClickOnBackToSignInButton() {
        ForgotPasswordPage.backToSignIn.shouldBe(visible).click();
    }
}
