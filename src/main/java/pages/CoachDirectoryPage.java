package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CoachDirectoryPage {
    public static final String COACH_DIRECTORY_URL = "http://34.233.163.207/coachdirectory";
    public static SelenideElement coachDirectoryTitle = $(By.xpath("//h2[contains(text(),'COACH DIRECTORY')]"));
    public static SelenideElement divisionLevelDropDown = $(By.id("division"));
    public static SelenideElement stateDropDown = $(By.id("state"));
    public static SelenideElement collegeNameDropDown = $(By.id("school"));
    public static SelenideElement resetButton = $(By.xpath("//a[text()=\"RESET\"]"));
    public static SelenideElement previousButton = $(By.xpath("//span[contains(text(), 'Previous')]"));
    public static SelenideElement nextButton = $(By.xpath("//a[contains(text(), 'Next')]"));
    public static SelenideElement coachGridCards = $(By.className("my-4"));

    public void clickDivisionLevelDropDown(){
        divisionLevelDropDown.shouldBe(visible).click();
    }
    public void clickStateDropDown(){
        stateDropDown.shouldBe(visible).click();
    }
    public void clickCollegeNameDropDown(){
        collegeNameDropDown.shouldBe(visible).click();
    }
    public void clickResetButton(){
        resetButton.shouldBe(visible).click();
    }
    public void clickPreviousButton(){
        previousButton.shouldBe(visible).click();
    }
    public void clickNextButton(){
        nextButton.shouldBe(visible).click();
    }
}
