package components;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

/**
 * Компонент главного меню, который может использоваться на разных страницах
 */
public class HamburgerMenu {
    // Menu elements
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

    // Submenu About
    public static SelenideElement menuWhatWeDoButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(2) > ul.sub-menu > li:nth-child(1) > a"));
    public static SelenideElement menuBackgroundButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(2) > ul.sub-menu > li:nth-child(2) > a"));
    public static SelenideElement menuTestimonialsButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(2) > ul.sub-menu > li:nth-child(3) > a"));
    public static SelenideElement menuFacButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(2) > ul.sub-menu > li:nth-child(4) > a"));
    public static SelenideElement menuContactUsButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(2) > ul.sub-menu > li:nth-child(5) > a"));

    // Submenu Recruiting
    public static SelenideElement menuGradesButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(5) > ul.sub-menu > li:nth-child(1) > a"));
    public static SelenideElement menuGamePlanButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(5) > ul.sub-menu > li:nth-child(2) > a"));
    public static SelenideElement menuGuidelinesButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(5) > ul.sub-menu > li:nth-child(3) > a"));
    public static SelenideElement menuCalendarButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(5) > ul.sub-menu > li:nth-child(4) > a"));

    // Submenu Coaches
    public static SelenideElement menuPlayerDirectoryButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(7) > ul.sub-menu > li:nth-child(1) > a"));

    // Submenu Athletes
    public static SelenideElement menuMyProfileButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(8) > ul.sub-menu > li:nth-child(1) > a"));
    public static SelenideElement menuCoachDirectoryButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(8) > ul.sub-menu > li:nth-child(2) > a"));
    public static SelenideElement menuStudyGuideButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(8) > ul.sub-menu > li:nth-child(3) > a"));
    public static SelenideElement menuClassRoomButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(8) > ul.sub-menu > li:nth-child(4) > a"));
    public static SelenideElement menuFilmToFieldButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(8) > ul.sub-menu > li:nth-child(5) > a"));
    public static SelenideElement menuSettingsButton = $(By.cssSelector(".mobile-menu-box ul.menu > li:nth-child(8) > ul.sub-menu > li:nth-child(6) > a"));

    /**
     * Методы для работы с меню, сохраненные для улучшенной читаемости и повторного использования
     */
    public void clickMenuButton() {
        menuButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickHome() {
        menuHomeButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickAbout() {
        menuAboutButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickOurTeam() {
        menuOurTeamButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickScholarships() {
        menuScholarshipsButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickRecruiting() {
        menuRecruitingButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickStore() {
        menuStoreButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickCoaches() {
        menuCoachesButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickAthletes() {
        menuAthletesButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickLogin() {
        menuLoginButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickGetVerified() {
        menuGetVerifiedButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickWhatWeDo() {
        menuWhatWeDoButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickBackground() {
        menuBackgroundButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickTestimonials() {
        menuTestimonialsButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickFac() {
        menuFacButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickContactUs() {
        menuContactUsButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickGrades() {
        menuGradesButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickGamePlan() {
        menuGamePlanButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickGuidelines() {
        menuGuidelinesButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickCalendar() {
        menuCalendarButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickPlayerDirectory() {
        menuPlayerDirectoryButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickMyProfile() {
        menuMyProfileButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickCoachDirectory() {
        menuCoachDirectoryButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickStudyGuide() {
        menuStudyGuideButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickClassRoom() {
        menuClassRoomButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickFilmToField() {
        menuFilmToFieldButton.shouldBe(visible).shouldBe(clickable).click();
    }

    public void clickSettings() {
        menuSettingsButton.shouldBe(visible).shouldBe(clickable).click();
    }
}
