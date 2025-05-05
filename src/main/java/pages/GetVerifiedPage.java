package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class GetVerifiedPage {
    public static final String GET_VERIFIED_PAGE_URL = "http://34.233.163.207/get-verified";
    public static SelenideElement getVerifiedTitle = $(By.xpath("//h1[contains(text(),'G.E.M. CLASS PLAYER PROFILE')]"));
    public static SelenideElement newRecruits = $(By.xpath("//h2[contains(text(),'New recruits')]"));
    public static SelenideElement returningMemberTitle = $(By.xpath("//h2[contains(text(),'Returning member')]"));
    public static SelenideElement continueLoginTitle = $(By.xpath("//h2[contains(text(),'Continue to member login')]"));
    public static SelenideElement firstName = $("input[name='first_name']");
    public static SelenideElement lastName = $("input[name='last_name']");
    public static SelenideElement selectPrimaryPositionDropDown = $("select[name='primary_position_id']");
    public static SelenideElement schoolInputField = $("input[name='school']");
    public static SelenideElement selectStateDropDown = $("select[name='state_id']");
    public static SelenideElement selectGraduationYearDropDown = $("select[name='graduation_year']");
    public static SelenideElement parentRadioButton = $(By.id("parent"));
    public static SelenideElement studentRadioButton = $(By.id("student"));
    public static SelenideElement nextButton = $(By.cssSelector("button.sec-btn"));
    public static SelenideElement memberLoginButton = $(By.cssSelector("a.sec-btn"));
    public static SelenideElement logoPicture = $(By.cssSelector("img.sticky-logo"));
    public static SelenideElement menuButton = $(By.id("openMenuBtn"));

    public void openGetVerifiedPage() {
        open(GET_VERIFIED_PAGE_URL);
        getVerifiedTitle.shouldBe(Condition.visible);
    }

    public boolean isOnGetVerifiedPage() {
        String currentUrl = webdriver().driver().url();
        return currentUrl.contains("/get-verified");
    }
}
