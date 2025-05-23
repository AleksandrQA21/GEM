package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class NeedToKnowPage extends BasePage{
    public static final String NEED_TO_KNOW_URL = "http://34.233.163.207/need-to-know";
    public static final String GRADES_URL = "http://34.233.163.207/need-to-know#grades";
    public static final String GAMEPLAN_URL = "http://34.233.163.207/need-to-know#gameplan";
    public static final String GUIDELINES_URL = "http://34.233.163.207/need-to-know#guidelines";
    public static final String CALENDAR_URL = "http://34.233.163.207/need-to-know#calendar";

    // Grades section elements
    public static SelenideElement h1TitleGradesSection = $(By.xpath("//h2[contains(text(),'HIT. THE. BOOKS.')]"));
    public static SelenideElement h2TitleGradesSection = $(By.xpath("//h2[contains(text(),'NEED HELP WITH NCAA OR NAIA ELIGIBILITY?')]"));
    public static SelenideElement createPlayerProfileButtonGradeSection = $(By.cssSelector(".testimonial-title.blur-container-1 .subtitle-button a.sec-btn"));
    public static SelenideElement gradesLink = $(By.xpath("//span[contains(text(),'Grades')]"));
    public static SelenideElement gamePlanLink = $(By.xpath("//span[contains(text(),'Gameplan')]"));
    public static SelenideElement guidLinesLink = $(By.xpath("//span[contains(text(),'Guidelines')]"));
    public static SelenideElement recruitingCalendarsLink = $(By.xpath("//span[contains(text(),'Recruiting calendars')]"));
    
    // Gameplan section elements
    public static SelenideElement gameplanTitle = $(By.xpath("//h2[contains(text(),'CREATE')]"));
    public static ElementsCollection gameplanContentItems = $$(By.cssSelector("#gameplan .class-trainer-review"));
    
    // Guidelines section elements
    public static SelenideElement guidelinesTitle = $(By.xpath("//h2[contains(text(),'GUIDELINES')]"));
    public static SelenideElement guidelinesContent = $(By.xpath("//p[contains(text(), 'It is EXTREMELY')]"));
    public static ElementsCollection guidelinesLinks = $$(By.cssSelector("div.subtitle-button > a"));

    // Calendar section elements
    public static SelenideElement calendarTitle = $(By.xpath("//h2[contains(text(),'RECRUITING CALENDARS')]"));
    public static SelenideElement calendarContent = $(By.xpath("//p[contains(text(), 'Nothing raises more')]"));
    public static ElementsCollection calendarLinks = $$(By.cssSelector("div.subtitle-button > a"));
}

