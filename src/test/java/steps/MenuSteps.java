package steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
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

/**
 * Step definitions for Menu button
 */
public class MenuSteps {
    public HomePage homePage;
    public AboutUsPage aboutUsPage;

    @Before
    public void setUp() {
        homePage = new HomePage();
        aboutUsPage = new AboutUsPage();
    }

    @Given("I open G.E.M. Class Recruiting website as a guest")
    @Step("opening G.E.M. website on Home Page as a guest")
    public void openWebSiteAsGuest(){
        homePage.openHomePage();
    }

    @When("I click on Menu button")
    @Step("Clicking on Menu button")
    public void iClickOnMenuButton() {
        HomePage.menuButton.shouldBe(visible).click();
    }

    @Then("I should see all menu's options")
    @Step("Verifying all options in the Menu bSideBar should be visible and clickable")
    public void iShouldSeeAllMenuSOptions() {
        homePage.verifyMenuOptions();
    }

    @And("Click on Home button")
    @Step("Clicking on Home button")
    public void clickOnHomeButton() {
        HomePage.menuHomeButton.shouldBe(visible).click();
    }

    @And("I click on What We Do button")
    @Step("Clicking on What We Do button")
    public void iClickOnWhatWeDoButton() {
        HomePage.menuWhatWeDoButton.shouldBe(visible).click();
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
        HomePage.menuAboutButton.shouldBe(visible).click();
    }

    @And("I click on Background button")
    @Step("Clicking on Background button")
    public void iClickOnBackgroundButton() {
        HomePage.menuBackgroundButton.shouldBe(visible).click();
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
        HomePage.menuTestimonialsButton.shouldBe(visible).click();
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
        AboutUsPage.contactUsFirstNameInput.shouldBe(visible).shouldHave(attribute("placeholder","First Name"));
        AboutUsPage.contactUsLastNameInput.shouldBe(visible).shouldHave(attribute("placeholder","Last Name"));
        AboutUsPage.contactUsEmailInput.shouldBe(visible).shouldHave(attribute("placeholder","Email Address"));
        AboutUsPage.contactUsTextInput.shouldBe(visible).shouldHave(attribute("placeholder","Message..."));
        AboutUsPage.contactUsPhoneInput.shouldBe(visible).shouldHave(attribute("placeholder","Phone No."));
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
    public void iClickOnMoreAboutUsAtGEMClassButton() {
        AboutUsPage.moreAboutUsButton.shouldBe(visible).click();
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
}
