package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

/**
 * Page Object for Home Page
 */
public class HomePage extends BasePage{
    private static final String HOME_URL = "http://34.233.163.207/";
    public static SelenideElement logoutForm = $("#logoutForm");
    public static SelenideElement siteLogo = $(".site-branding img");
    public static SelenideElement myAccountLink = $x("//a[contains(text(),'My Profile')]");
    public static SelenideElement logoutLink = $x("//a[contains(text(),'Logout')]");
    public static SelenideElement logoutLink2 = $x("//a[contains(text(),'Logout')]");


    /**
     * Check if user is logged in using Selenide conditions
     * @return True if user is logged in
     */
    public boolean isUserLoggedIn() {
        return logoutForm.exists() || myAccountLink.exists();
    }

    /**
     * Verify user is logged in (throws exception if not)
     */
    public void verifyUserIsLoggedIn() {
        if (logoutForm.exists()) {
            logoutForm.shouldBe(Condition.exist);
        } else {
            myAccountLink.shouldBe(Condition.exist);
        }
    }

    /**
     * Verify we are on the home page
     */
    public boolean isOnHomePage() {
        return webdriver().driver().url().equals(HOME_URL);
    }

    /**
     * Verify on home page (throws exception if not)
     */
    public void verifyOnHomePage() {
        siteLogo.shouldBe(Condition.visible);
    }

    /**
     * Navigate to My Account page
     */
    public void navigateToMyAccount() {
        myAccountLink.shouldBe(Condition.visible).click();
    }

    /**
     * Logout from the website
     */
    public void logout() {
        if (logoutLink.exists()) {
            logoutLink.shouldBe(Condition.visible).click();
        } else if (logoutForm.exists()) {
            logoutForm.submit();
        } else {
            log.warn("No logout option found - user may not be logged in");
        }
    }
}
