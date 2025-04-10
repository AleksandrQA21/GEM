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

import static com.codeborne.selenide.Condition.visible;
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
}
