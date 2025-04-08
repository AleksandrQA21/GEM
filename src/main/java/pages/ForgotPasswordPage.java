package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Condition.text;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ForgotPasswordPage {
    public static final String FORGOT_PASSWORD_URL = "http://34.233.163.207/forgot-password";
    public static SelenideElement emailInputRecoverPassword = $(By.cssSelector("input.form-input"));
    public static SelenideElement backToSignIn = $(By.xpath("//a[contains(text(),'Back to Sign In?')]"));
    public static SelenideElement titleRecoverPassword = $(By.xpath("//h2[contains(text(),'Recover Password')]"));
    public static SelenideElement passwordSentText = $(By.xpath("//p[contains(text(),'Reset Password link sent')]"));
    public static SelenideElement resetButton = $("button.sec-btn");

    public void enterEmailRecoverPassword(String email) {
        emailInputRecoverPassword.shouldBe(visible).setValue(email);

    }

    public boolean verifyOnForgotPasswordPage() {
        return titleRecoverPassword.shouldBe(visible).isDisplayed();
    }

    public boolean isOnForgotPasswordPasswordPage() {
        return WebDriverRunner.driver().url().equals(FORGOT_PASSWORD_URL);
    }

    public boolean isPasswordSentTextDisplayed(){
        return passwordSentText.should(visible).isDisplayed();
    }
}
