package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.*;
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
    public static SelenideElement menuStoreButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(6) > a"));
    public static SelenideElement menuCoachesButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(7) > a"));
    public static SelenideElement menuAthletesButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(8) > a"));
    public static SelenideElement menuLoginButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(9) > a"));
    public static SelenideElement menuGetVerifiedButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(10) > a"));
    public static SelenideElement menuWhatWeDoButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(2) > ul.sub-menu > li:nth-child(1) > a"));
    public static SelenideElement menuBackgroundButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(2) > ul.sub-menu > li:nth-child(2) > a"));
    public static SelenideElement menuTestimonialsButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(2) > ul.sub-menu > li:nth-child(3) > a"));
    public static SelenideElement menuFacButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(2) > ul.sub-menu > li:nth-child(4) > a"));
    public static SelenideElement menuContactUsButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(2) > ul.sub-menu > li:nth-child(5) > a"));
    public static SelenideElement menuGradesButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(5) > ul.sub-menu > li:nth-child(1) > a"));
    public static SelenideElement menuGamePlanButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(5) > ul.sub-menu > li:nth-child(2) > a"));
    public static SelenideElement menuGuidelinesButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(5) > ul.sub-menu > li:nth-child(3) > a"));
    public static SelenideElement menuCalendarButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(5) > ul.sub-menu > li:nth-child(4) > a"));
    public static SelenideElement menuPlayerDirectoryButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(7) > ul.sub-menu > li:nth-child(1) > a"));
    public static SelenideElement menuMyProfileButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(8) > ul.sub-menu > li:nth-child(1) > a"));
    public static SelenideElement menuCoachDirectoryButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(8) > ul.sub-menu > li:nth-child(2) > a"));
    public static SelenideElement menuStudyGuideButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(8) > ul.sub-menu > li:nth-child(3) > a"));
    public static SelenideElement menuClassRoomButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(8) > ul.sub-menu > li:nth-child(4) > a"));
    public static SelenideElement menuFilmToFieldButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(8) > ul.sub-menu > li:nth-child(5) > a"));
    public static SelenideElement menuSettingsButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(8) > ul.sub-menu > li:nth-child(6) > a"));



    public void openHomePage() {
        open(HOME_URL);
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

    public void verifyMenuOptions(){
        menuButton.shouldBe(visible).shouldBe(clickable);
        menuHomeButton.shouldBe(visible).shouldBe(clickable);
        menuAboutButton.shouldBe(visible).shouldBe(clickable);
        menuOurTeamButton.shouldBe(visible).shouldBe(clickable);
        menuScholarshipsButton.shouldBe(visible).shouldBe(clickable);
        menuRecruitingButton.shouldBe(visible).shouldBe(clickable);
        menuStoreButton.shouldBe(visible).shouldBe(clickable);
        menuCoachesButton.shouldBe(visible).shouldBe(clickable);
        menuAthletesButton.shouldBe(visible).shouldBe(clickable);
        menuLoginButton.shouldBe(visible).shouldBe(clickable);
        menuGetVerifiedButton.shouldBe(visible).shouldBe(clickable);
        menuAboutButton.click();
        menuWhatWeDoButton.shouldBe(visible).shouldBe(clickable);
        menuBackgroundButton.shouldBe(visible).shouldBe(clickable);
        menuTestimonialsButton.shouldBe(visible).shouldBe(clickable);
        menuFacButton.shouldBe(visible).shouldBe(clickable);
        menuContactUsButton.shouldBe(visible).shouldBe(clickable);
        menuRecruitingButton.click();
        menuGradesButton.shouldBe(visible).shouldBe(clickable);
        menuGamePlanButton.shouldBe(visible).shouldBe(clickable);
        menuGuidelinesButton.shouldBe(visible).shouldBe(clickable);
        menuCalendarButton.shouldBe(visible).shouldBe(clickable);
        menuCoachesButton.click();
        menuPlayerDirectoryButton.shouldBe(visible).shouldBe(clickable);
        menuAthletesButton.click();
        menuMyProfileButton.shouldBe(visible).shouldBe(clickable);
        menuCoachDirectoryButton.shouldBe(visible).shouldBe(clickable);
        menuStudyGuideButton.shouldBe(visible).shouldBe(clickable);
        menuClassRoomButton.shouldBe(visible).shouldBe(clickable);
        menuFilmToFieldButton.shouldBe(visible).shouldBe(clickable);
        menuSettingsButton.shouldBe(visible).shouldBe(clickable);
    }
}
