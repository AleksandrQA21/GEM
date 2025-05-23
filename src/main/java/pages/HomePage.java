package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.*;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

/**
 * Page Object for Home Page
 */
public class HomePage extends BasePage{
    public static final String HOME_URL = "http://34.233.163.207/";
    public static SelenideElement logoutForm = $("#logoutForm");
    public static SelenideElement siteLogo = $(".site-branding img");
    public static SelenideElement myProfile = $(By.cssSelector("a.sec-btn.wow.fadeInUp.my-4"));
    public static SelenideElement logoutLink = $x("//a[contains(text(),'Logout')]");
    public static SelenideElement userButton = $(By.cssSelector("#userButton"));
    public static SelenideElement getVerifiedButton = $(By.cssSelector("div.col-lg-6>div.text-center>a"));
    public static SelenideElement menuButton = $(By.id("openMenuBtn"));
    public static SelenideElement menuHomeButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(1) > a"));
    public static SelenideElement menuAboutButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(2) > a"));
    public static SelenideElement menuOurTeamButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(3) > a"));
    public static SelenideElement menuScholarshipsButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(4) > a"));
    public static SelenideElement menuRecruitingButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(5) > a"));
       public static SelenideElement menuWhatWeDoButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(2) > ul.sub-menu > li:nth-child(1) > a"));
    public static SelenideElement menuBackgroundButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(2) > ul.sub-menu > li:nth-child(2) > a"));
    public static SelenideElement menuTestimonialsButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(2) > ul.sub-menu > li:nth-child(3) > a"));
    public static SelenideElement menuFacButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(2) > ul.sub-menu > li:nth-child(4) > a"));
    public static SelenideElement menuContactUsButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(2) > ul.sub-menu > li:nth-child(5) > a"));
    public static SelenideElement menuGradesButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(5) > ul.sub-menu > li:nth-child(1) > a"));
    public static SelenideElement menuGamePlanButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(5) > ul.sub-menu > li:nth-child(2) > a"));
    public static SelenideElement menuGuidelinesButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(5) > ul.sub-menu > li:nth-child(3) > a"));



    public void openHomePage() {
        openBasePage(HOME_URL);
        getVerifiedButton.shouldBe(visible);
    }
    public void verifyUserIsLoggedIn() {
        userButton.shouldBe(visible).shouldBe(clickable);
        myProfile.shouldBe(visible).shouldBe(clickable);
    }

    //Verify we are on the home page
    public boolean isOnHomePage() {
        return webdriver().driver().url().equals(HOME_URL);
    }
    public void verifyOnHomePage() {
        siteLogo.shouldBe(visible);
    }
    public void navigateToMyAccount() {
        myProfile.shouldBe(visible).click();
    }


    //Logout from the website
         public void logout() {
        if (logoutLink.exists()) {
            logoutLink.shouldBe(visible).click();
        } else if (logoutForm.exists()) {
            logoutForm.submit();
        } else {
            System.out.println("No logout option found - user may not be logged in");
        }
    }
}
