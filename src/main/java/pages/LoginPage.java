package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class LoginPage extends BasePage {

    public static final String LOGIN_URL = "/login";
    public static SelenideElement emailInput = $("input[name='email']");
    public static SelenideElement passwordInput = $("input[name='password']");
    public static SelenideElement loginButton = $("button.sec-btn");
    public static SelenideElement loginHeading = $x("//h2[contains(text(),'Log In')]");
    public static SelenideElement signUpLink = $x("//a[contains(text(),'Sign Up')]");
    public static SelenideElement forgotPasswordLink = $x("//a[contains(text(),'Forgot Password?')]");
    public static SelenideElement errorMessage = $("p.text-danger");


    public void openLoginPage() {
        openBasePage(BASE_URL + LOGIN_URL);
        loginHeading.shouldBe(Condition.visible);
    }

    public void enterEmail(String email) {
        emailInput.shouldBe(Condition.visible).setValue(email);
    }

    public void enterPassword(String password) {
        passwordInput.shouldBe(Condition.visible).setValue(password);
    }

    public void clickLoginButton() {
        loginButton.shouldBe(Condition.visible, Condition.enabled).click();
    }

    /*
     Wait for error message to be displayed and return its text
     @return Error message text
     */
    public String getErrorMessageText() {
        return errorMessage.shouldBe(Condition.visible).getText();
    }

    public void clickForgotPasswordLink() {
        forgotPasswordLink.shouldBe(Condition.visible).click();
    }

    public void clickSignUpLink() {
        signUpLink.shouldBe(Condition.visible).click();
    }

    /*
     Check if on login page by verifying URL
     @return true if on login page
     */
    public boolean isOnLoginPage() {
        String currentUrl = webdriver().driver().url();
        return currentUrl.contains("/login");
    }

}
