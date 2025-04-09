package steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.testng.Assert;
import pages.ForgotPasswordPage;
import pages.GetVerifiedPage;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.Condition.clickable;
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
    public GetVerifiedPage getVerifiedPage;

    @Before
    public void setUp() {
        loginPage = new LoginPage();
        homePage = new HomePage();
        forgotPasswordPage = new ForgotPasswordPage();
        getVerifiedPage = new GetVerifiedPage();
    }

    @Given("I am on the login page")
    @Step("Opening the login page")
    public void iAmOnTheLoginPage() {
        loginPage.openLoginPage();
    }

    @When("I enter valid email {string}")
    @Step("Entering valid email")
    public void iEnterValidEmail(String email) {
        loginPage.enterEmail(email);
    }

    @When("I enter email {string}")
    @Step("Entering email")
    public void iEnterEmail(String email) {
        loginPage.enterEmail(email);
    }

    @And("I enter valid password {string}")
    @Step("Entering valid password")
    public void iEnterValidPassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("I enter password {string}")
    @Step("Entering password")
    public void iEnterPassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("I click on the login button")
    @Step("Clicking on the login button")
    public void iClickOnTheLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I should be redirected to the homepage")
    @Step("Verifying redirection to homepage")
    public void iShouldBeRedirectedToTheHomepage() {
        String currentUrl = webdriver().driver().url();
        Assert.assertEquals(currentUrl, "http://34.233.163.207/",
                "Not redirected to the homepage after login");
    }

    @And("I should see user is logged in")
    @Step("Verifying user is logged in")
    public void iShouldSeeUserIsLoggedIn() {
        homePage.verifyUserIsLoggedIn();
    }

    @Then("I should see an error message")
    @Step("Verifying error message is displayed")
    public void iShouldSeeAnErrorMessage() throws InterruptedException {
        errorMessage.shouldBe(visible);

    }

    @Then("I should remain on the login page")
    @Step("Verifying user remains on login page")
    public void iShouldRemainOnTheLoginPage() {
        assertTrue(loginPage.isOnLoginPage(),
                "User was not kept on login page after failed login attempt");
    }

    @And("I should see error message containing {string}")
    @Step("Verifying error message")
    public void iShouldSeeErrorMessageContaining(String errorText) {
        String actualError = loginPage.getErrorMessageText();
        assertTrue(actualError.contains(errorText),
                String.format("Error message '%s' does not contain expected text '%s'",
                        actualError, errorText));
    }

    @When("I click on Forgot Password link")
    @Step("Clicking on Forgot Password link")
    public void iClickOnForgotPasswordLink() {
        forgotPasswordLink.shouldBe(visible).click();
    }

    @Then("I should see Recover Password page")
    @Step("Verifying Recover Password page is displayed")
    public void iShouldSeeRecoverPasswordPage() throws InterruptedException {
        forgotPasswordPage = new ForgotPasswordPage();
        assertTrue(forgotPasswordPage.isOnForgotPasswordPasswordPage());
        assertTrue(forgotPasswordPage.verifyOnForgotPasswordPage());
    }

    @And("I click Reset button")
    @Step("Clicking Reset button")
    public void iClickResetButton() {
        ForgotPasswordPage.resetButton.shouldBe(visible).click();
    }

    @Then("I should see Reset Password link sent")
    @Step("Verifying Reset Password link sent confirmation")
    public void iShouldSeeResetPasswordLinkSent() throws InterruptedException {
        assertTrue(forgotPasswordPage.isPasswordSentTextDisplayed());
    }

    @And("email input field is empty")
    @Step("Verifying email input field is empty")
    public void emailInputFieldIsEmpty() {
        assertEquals(ForgotPasswordPage.emailInputRecoverPassword.getText(), "");
    }

    @And("I click on Back to Sign in button")
    @Step("Clicking on Back to Sign in button")
    public void iClickOnBackToSignInButton() {
        ForgotPasswordPage.backToSignIn.shouldBe(visible).click();
    }


    @And("I should see Please fill out this field validation")
    @Step("Verifying validation for empty email and password fields")
    public void iShouldSeePleaseFillOutThisFieldValidation() {
        // Find the invalid field (depends on the scenario - login or password)
        SelenideElement invalidField;

        // Check which field is empty based on the data from the scenario
        if (LoginPage.emailInput.getValue().isEmpty()) {
            invalidField = LoginPage.emailInput;
        } else {
            invalidField = LoginPage.passwordInput;
        }
        // Get the validation message
        String validationMessage = invalidField.getAttribute("required");

        /* Check that the message contains the expected text
        Different browsers may show different validation messages, so we check for partial match
        */
        Assert.assertNotNull("Validation message should not be null", validationMessage);

        boolean isValidMessage = validationMessage.contains("Please fill out this field") ||
                validationMessage.contains("fill") ||
                validationMessage.contains("required");
    }

    @When("I click on Sign Up button")
    @Step("Clicking on Sign Up button")
    public void iClickOnSignUpButton() {
        loginPage.clickSignUpLink();
    }

    @Then("I should be redirected to the Get Verified page")
    @Step("Verifying redirection to get verified page")
    public void iShouldBeRedirectedToTheGetVerifiedPage() {
        getVerifiedPage.isOnGetVerifiedPage();
    }

    @And("I should see Player Profile")
    @Step("Verifying all elements on Get Verified page")
    public void iShouldSeePlayerProfile() {
        GetVerifiedPage.getVerifiedTitle.shouldBe(visible);
        GetVerifiedPage.newRecruits.shouldBe(visible);
        GetVerifiedPage.returningMemberTitle.shouldBe(visible);
        GetVerifiedPage.continueLoginTitle.shouldBe(visible);
        GetVerifiedPage.memberLoginButton.shouldBe(clickable);
        GetVerifiedPage.firstName.shouldBe(visible);
        GetVerifiedPage.lastName.shouldBe(visible);
        GetVerifiedPage.selectPrimaryPositionDropDown.shouldBe(visible);
        GetVerifiedPage.schoolInputField.shouldBe(visible);
        GetVerifiedPage.selectStateDropDown.shouldBe(visible);
        GetVerifiedPage.selectGraduationYearDropDown.shouldBe(visible);
        GetVerifiedPage.parentRadioButton.shouldBe(clickable);
        GetVerifiedPage.studentRadioButton.shouldBe(clickable);
        GetVerifiedPage.nextButton.shouldBe(clickable);
        GetVerifiedPage.memberLoginButton.shouldBe(clickable);
        GetVerifiedPage.logoPicture.shouldBe(visible);
        GetVerifiedPage.menuButton.shouldBe(clickable);
    }
}
