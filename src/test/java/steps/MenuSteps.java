package steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import components.HamburgerMenu;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.testng.Assert;
import pages.*;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;

/**
 * Step definitions for Menu button
 */
public class MenuSteps {
    public HomePage homePage;
    public AboutUsPage aboutUsPage;
    public HamburgerMenu hamburgerMenu;

    @Before
    public void setUp() {
        homePage = new HomePage();
        aboutUsPage = new AboutUsPage();
        hamburgerMenu = new HamburgerMenu();

    }

    @Given("I open G.E.M. Class Recruiting website as a guest")
    @Step("opening G.E.M. website on Home Page as a guest")
    public void openWebSiteAsGuest() {
        homePage.openHomePage();
    }

    @When("I click on Menu button")
    @Step("Clicking on Menu button")
    public void iClickOnMenuButton() {
        hamburgerMenu.clickMenuButton();
    }

    @Then("I should see all menu's options")
    @Step("Verifying all options in the Menu bSideBar should be visible and clickable")
    public void iShouldSeeAllMenuSOptions() {
        HamburgerMenu.menuButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuHomeButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuAboutButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuOurTeamButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuScholarshipsButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuRecruitingButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuStoreButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuCoachesButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuAthletesButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuLoginButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuGetVerifiedButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuAboutButton.click();
        HamburgerMenu.menuWhatWeDoButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuBackgroundButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuTestimonialsButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuFacButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuContactUsButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuRecruitingButton.click();
        HamburgerMenu.menuGradesButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuGamePlanButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuGuidelinesButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuCalendarButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuCoachesButton.click();
        HamburgerMenu.menuPlayerDirectoryButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuAthletesButton.click();
        HamburgerMenu.menuMyProfileButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuCoachDirectoryButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuStudyGuideButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuClassRoomButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuFilmToFieldButton.shouldBe(visible).shouldBe(clickable);
        HamburgerMenu.menuSettingsButton.shouldBe(visible).shouldBe(clickable);
    }

    @And("Click on Home button")
    @Step("Clicking on Home button")
    public void clickOnHomeButton() {
        hamburgerMenu.clickHome();
    }

    @And("I click on What We Do button")
    @Step("Clicking on What We Do button")
    public void iClickOnWhatWeDoButton() {
        hamburgerMenu.clickWhatWeDo();
    }

    @Then("I should see What We do section on About Us page")
    @Step("Verifying What We Do section on About Us page")
    public void iShouldSeeWhatWeDoSectionOnAboutUsPage() {
        String currentUrl = webdriver().driver().url();
        Assert.assertEquals(currentUrl, AboutUsPage.WHAT_WE_DO_URL,
                "Not redirected to the What We Do section");
        AboutUsPage.whatWeDoTitle.shouldBe(visible);
        AboutUsPage.supportCollegeTitle.shouldBe(visible);
        AboutUsPage.supportStudentsTitle.shouldBe(visible);
        AboutUsPage.text1WhatWeDo.shouldBe(visible);
        AboutUsPage.text2WhatWeDo.shouldBe(visible);
    }

    @And("I click on About button")
    @Step("Clicking in About button")
    public void iClickOnAboutButton() {
        hamburgerMenu.clickAbout();
    }

    @And("I click on Background button")
    @Step("Clicking on Background button")
    public void iClickOnBackgroundButton() {
        hamburgerMenu.clickBackground();
    }

    @Then("I should see Background section on About Us page")
    @Step("Verifying 'Background' section on About Us page")
    public void iShouldSeeBackgroundSectionOnAboutUsPage() {
        String currentUrl = webdriver().driver().url();
        Assert.assertEquals(currentUrl, AboutUsPage.BACKGROUND_URL,
                "Not redirected to the What We Do section");
        AboutUsPage.backgroundTitle.shouldBe(visible);
        AboutUsPage.backgroundSlider.shouldBe(visible);
    }

    @And("I click on Testimonials button")
    @Step("Clicking on Testimonials button")
    public void iClickOnTestimonialsButton() {
        hamburgerMenu.clickTestimonials();
    }

    @Then("I should see Testimonials section on About Us page")
    @Step("Verifying 'Testimonials' section on About Us page")
    public void iShouldSeeTestimonialsSectionOnAboutUsPage() {
        String currentUrl = webdriver().driver().url();
        Assert.assertEquals(currentUrl, AboutUsPage.TESTIMONIALS_URL,
                "Not redirected to the What We Do section");
        AboutUsPage.testimonialsTitle.shouldBe(visible);
        AboutUsPage.textTestimonials.shouldBe(visible);
        AboutUsPage.testimonialsSlider.shouldBe(visible);
    }

    @And("I click on FAC button")
    @Step("Clicking on FAC button")
    public void iClickOnFACButton() {
        HomePage.menuFacButton.shouldBe(visible).click();
    }

    @Then("I should see FAC section on About Us page")
    @Step("Verifying F.A.C. section on About Us page")
    public void iShouldSeeFACSectionOnAboutUsPage() {
        String currentUrl = webdriver().driver().url();
        Assert.assertEquals(currentUrl, AboutUsPage.FAC_URL,
                "Not redirected to the What We Do section");
        AboutUsPage.facTitle.shouldBe(visible);
        AboutUsPage.facAccordion.shouldBe(visible);
    }

    @Then("I should see Contact Us section on About Us page")
    @Step("Verifying Contact Us section on About Us page")
    public void iShouldSeeContactUsSectionOnAboutUsPage() {
        String currentUrl = webdriver().driver().url();
        Assert.assertEquals(currentUrl, AboutUsPage.CONTACT_US_URL,
                "Not redirected to the What We Do section");
        AboutUsPage.contactUsTitle.shouldBe(visible);
        AboutUsPage.contactUsForm.shouldBe(visible);
        AboutUsPage.contactUsFormTitle.shouldBe(visible);
        AboutUsPage.contactUsFirstNameInput.shouldBe(visible).shouldHave(attribute("placeholder", "First Name"));
        AboutUsPage.contactUsLastNameInput.shouldBe(visible).shouldHave(attribute("placeholder", "Last Name"));
        AboutUsPage.contactUsEmailInput.shouldBe(visible).shouldHave(attribute("placeholder", "Email Address"));
        AboutUsPage.contactUsTextInput.shouldBe(visible).shouldHave(attribute("placeholder", "Message..."));
        AboutUsPage.contactUsPhoneInput.shouldBe(visible).shouldHave(attribute("placeholder", "Phone No."));
        AboutUsPage.contactUsSubmitButton.shouldBe(visible);
    }

    @And("I click on Contact Us button")
    @Step("Clicking on Contact Us button")
    public void iClickOnContactUsButton() {
        HomePage.menuContactUsButton.shouldBe(visible).click();
    }

    @And("I click on Our Team button")
    @Step("Clicking on Our Team button")
    public void iClickOnOurTeamButton() {
        HomePage.menuOurTeamButton.shouldBe(visible).click();
    }

    @Then("I should see Our Team section")
    @Step("Verifying Our Team section")
    public void iShouldSeeOurTeamSection() {
        String currentUrl = webdriver().driver().url();
        Assert.assertEquals(currentUrl, AboutUsPage.OUR_TEAM_URL,
                "Not redirected to Our Team section");
        AboutUsPage.meetOurTeamTitle.shouldBe(visible);
        AboutUsPage.mainTeamSection.shouldBe(visible);
        AboutUsPage.moreAboutUsButton.shouldBe(visible).shouldBe(clickable);

    }

    @And("I click on More About Us At GEM Class button")
    @Step("Clicking on More About Us button")
    public void iClickOnMoreAboutUsAtGEMClassButton() throws InterruptedException {
        AboutUsPage.moreAboutUsButton.scrollTo();
        Thread.sleep(2000);
        AboutUsPage.moreAboutUsButton.shouldBe(visible).shouldBe(clickable);
        AboutUsPage.moreAboutUsButton.click();
    }

    @Then("I should see About Us section")
    @Step("Verifying About Us page")
    public void iShouldSeeAboutUsSection() {
        String currentUrl = webdriver().driver().url();
        Assert.assertEquals(currentUrl, AboutUsPage.ABOUT_US_URL,
                "Not redirected to the What We Do section");
        AboutUsPage.whatWeDoTitle.shouldBe(visible);
        AboutUsPage.supportCollegeTitle.shouldBe(visible);
        AboutUsPage.supportStudentsTitle.shouldBe(visible);
        AboutUsPage.text1WhatWeDo.shouldBe(visible);
        AboutUsPage.text2WhatWeDo.shouldBe(visible);
    }

    @And("I click on Scholarships button")
    @Step("Clicking on Scholarships button")
    public void iClickOnScholarshipsButton() {
        HomePage.menuScholarshipsButton.shouldBe(visible).click();
    }

    @Then("I should see Scholarships page")
    @Step("Verifying Scholarships page")
    public void iShouldSeeScholarshipsSection() {
        String currentUrl = webdriver().driver().url();
        Assert.assertEquals(currentUrl, ScholarshipsPage.SCHOLARSHIPS_URL,
                "Not redirected to Scholarships page");
        ScholarshipsPage.h1Title.shouldBe(visible);
        ScholarshipsPage.h2Title.shouldBe(visible);
        ScholarshipsPage.learnMoreSection.scrollTo().shouldBe(visible);
        ScholarshipsPage.learnMoreSectionForm.scrollTo().shouldBe(visible);
        ScholarshipsPage.firstNameInput.scrollTo().shouldBe(visible);
        ScholarshipsPage.lastNameInput.scrollTo().shouldBe(visible);
        ScholarshipsPage.emailInput.scrollTo().shouldBe(visible);
        ScholarshipsPage.sendFormButton.scrollTo().shouldBe(visible).shouldBe(clickable);
        ScholarshipsPage.recruitingInfoButton.shouldBe(visible).shouldBe(clickable);
    }

    @And("I click on Recruiting Info button")
    @Step("Clicking on Recruiting Info button")
    public void iClickOnRecruitingInfoButton() {
        ScholarshipsPage.recruitingInfoButton.shouldBe(visible).click();
    }

    @Then("I should redirect to Need To Know page")
    @Step("Check redirect to Need To Know page")
    public void iShouldRedirectToNeedToKnowPage() {
        String currentUrl = webdriver().driver().url();
        Assert.assertEquals(currentUrl, NeedToKnowPage.NEED_TO_KNOW_URL,
                "Not redirected to Scholarships page");
    }

    @When("I click on Recruiting button")
    @Step("Clicking on Recruiting button")
    public void iClickOnRecruitingButton() {
        hamburgerMenu.clickRecruiting();
    }

    @And("I click on Grades button")
    @Step("Clicking on Grades button")
    public void iClickOnGradesButton() {
        hamburgerMenu.clickGrades();
    }

    @Then("I should see Grades section on Need To Know page")
    @Step("Verifying Grades section")
    public void iShouldSeeGradesSectionOnNeedToKnowPage() {
        String currentUrl = webdriver().driver().url();
        Assert.assertEquals(currentUrl, NeedToKnowPage.GRADES_URL,
                "Not redirected to Scholarships page");
        NeedToKnowPage.h1TitleGradesSection.shouldBe(visible);
        NeedToKnowPage.h2TitleGradesSection.shouldBe(visible);
        NeedToKnowPage.createPlayerProfileButtonGradeSection.shouldBe(visible).shouldBe(clickable);
        NeedToKnowPage.gradesLink.shouldBe(visible).shouldBe(clickable);
        NeedToKnowPage.gamePlanLink.shouldBe(visible).shouldBe(clickable);
        NeedToKnowPage.guidLinesLink.shouldBe(visible).shouldBe(clickable);
        NeedToKnowPage.recruitingCalendarsLink.shouldBe(visible).shouldBe(clickable);
    }

    @And("I click on Gameplan button")
    @Step("Clicking on Gameplan button")
    public void iClickOnGameplanButton() {
        hamburgerMenu.clickGamePlan();
    }

    @Then("I should see Gameplan page")
    @Step("Verifying Gameplan page")
    public void iShouldSeeGameplanPage() {
        String currentUrl = webdriver().driver().url();
        Assert.assertEquals(currentUrl, NeedToKnowPage.GAMEPLAN_URL,
                "Not redirected to Gameplan page");
        NeedToKnowPage.gameplanTitle.scrollTo().shouldBe(visible);
        // Проверка, что список элементов содержимого существует и не пуст
        NeedToKnowPage.gameplanContentItems.shouldHave(sizeGreaterThan(0));
        // Проверка видимости каждого элемента с JavaScript прокруткой
        for (int i = 0; i < 5; i++) {
            NeedToKnowPage.gameplanContentItems.get(i).shouldBe(visible);
        }
    }

    @And("I click on Guidelines button")
    @Step("Clicking on Guidelines button")
    public void iClickOnGuidelinesButton() {
        hamburgerMenu.clickGuidelines();
    }

    @Then("I should see Guidelines page")
    @Step("Verifying Guidelines page")
    public void iShouldSeeGuidelinesPage() {
        String currentUrl = webdriver().driver().url();
        Assert.assertEquals(currentUrl, NeedToKnowPage.GUIDELINES_URL,
                "Not redirected to Guidelines page");
        NeedToKnowPage.guidelinesTitle.scrollTo().shouldBe(visible);
        NeedToKnowPage.guidelinesContent.shouldBe(visible);
        // Проверка, что все ссылки в разделе существуют и отображаются
        NeedToKnowPage.guidelinesLinks.shouldHave(sizeGreaterThan(0));
        // Проверка видимости всех ссылок
        for (int i = 0; i < NeedToKnowPage.guidelinesLinks.size(); i++) {
            NeedToKnowPage.guidelinesLinks.get(i).scrollTo().shouldBe(visible).shouldBe(clickable);
        }
    }

    @And("I click on Calendar button")
    @Step("Clicking on Calendar button")
    public void iClickOnCalendarButton() {
        hamburgerMenu.clickCalendar();
    }

    @Then("I should see Calendar page")
    @Step("Verifying Calendar page")
    public void iShouldSeeCalendarPage() {
        String currentUrl = webdriver().driver().url();
        Assert.assertEquals(currentUrl, NeedToKnowPage.CALENDAR_URL,
                "Not redirected to Calendar page");
        NeedToKnowPage.calendarTitle.scrollTo().shouldBe(visible);
        NeedToKnowPage.calendarContent.shouldBe(visible);
        // Проверка, что все ссылки в разделе существуют и отображаются
        NeedToKnowPage.calendarLinks.shouldHave(sizeGreaterThan(0));
        // Проверка видимости всех ссылок
        for (int i = 0; i < NeedToKnowPage.calendarLinks.size(); i++) {
            NeedToKnowPage.calendarLinks.get(i).scrollTo().shouldBe(visible).shouldBe(clickable);
        }
    }

    @And("I click on Coaches button")
    @Step("Clicking on Coaches button")
    public void iClickOnCoachesButton() {
        hamburgerMenu.clickCoaches();
    }

    @And("I click on PlayerDirectory button")
    @Step("Clicking on Player Directory button")
    public void iClickOnPlayerDirectoryButton() {
        hamburgerMenu.clickPlayerDirectory();
    }

    @Then("I should see Guest area page")
    @Step("Verifying Guest area page")
    public void iShouldSeeGuestAreaPage() {
        String currentUrl = webdriver().driver().url();
        Assert.assertEquals(currentUrl, GuestAreaPage.GUEST_AREA_URL,
                "Not redirected to Guest Area page");
        GuestAreaPage.enterPasswordTextGuestAreaPage.shouldBe(visible);
        GuestAreaPage.h2TitleGuestAreaPage.shouldBe(visible);
        GuestAreaPage.inputPasswordGuestAreaPage.shouldBe(visible).shouldBe(clickable);
        GuestAreaPage.goButtonTextGuestAreaPage.shouldBe(visible).shouldBe(clickable);
    }

    @And("I click on Athletes button")
    @Step("Clicking on Athletes button ")
    public void iClickOnAthletesButton() {
        hamburgerMenu.clickAthletes();
    }

    @And("I click on My Profile button")
    @Step("Clicking on My Profile button")
    public void iClickOnMyProfileButton() {
        hamburgerMenu.clickMyProfile();
    }

    @Then("I should see Get Verified page")
    @Step("Verifying Get Verified page")
    public void iShouldSeeGetVerifiedPage() {
        String currentUrl = webdriver().driver().url();
        Assert.assertEquals(currentUrl, GetVerifiedPage.GET_VERIFIED_PAGE_URL,
                "Not redirected to Guest Area page");
        GetVerifiedPage.getVerifiedTitle.shouldBe(visible);
        GetVerifiedPage.firstName.shouldBe(visible).shouldBe(clickable);
        GetVerifiedPage.selectPrimaryPositionDropDown.shouldBe(visible).shouldBe(clickable);
        GetVerifiedPage.schoolInputField.shouldBe(visible);
        GetVerifiedPage.selectStateDropDown.shouldBe(visible).shouldBe(clickable);
        GetVerifiedPage.selectGraduationYearDropDown.shouldBe(visible).shouldBe(clickable);
        GetVerifiedPage.parentRadioButton.shouldBe(visible).shouldBe(clickable);
        GetVerifiedPage.studentRadioButton.shouldBe(visible).shouldBe(clickable);
        GetVerifiedPage.nextButton.shouldBe(visible).shouldBe(clickable);
        GetVerifiedPage.memberLoginButton.shouldBe(visible).shouldBe(clickable);
        GetVerifiedPage.returningMemberTitle.shouldBe(visible);
        GetVerifiedPage.newRecruits.shouldBe(visible);
        GetVerifiedPage.continueLoginTitle.shouldBe(visible);
        GetVerifiedPage.logoPicture.shouldBe(visible);
        GetVerifiedPage.menuButton.shouldBe(visible).shouldBe(clickable);

    }
}
