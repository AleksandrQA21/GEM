package steps;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import pages.ForgotPasswordPage;
import pages.GetVerifiedPage;
import pages.HomePage;
import pages.LoginPage;

import static com.codeborne.selenide.Condition.visible;

/**
 * Step definitions for Menu button
 */
public class MenuSteps {
    public HomePage homePage;

    @Before
    public void setUp() {
        homePage = new HomePage();
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
}
