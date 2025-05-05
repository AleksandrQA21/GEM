package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StudyGuidePage {
    public static final String STUDY_GUIDE_URL = "http://34.233.163.207/study-guide";
    public static SelenideElement studyGuideTitle = $(By.xpath("//h1[contains(text(),'G.E.M. CLASS STUDY GUIDE')]"));
    public static SelenideElement studyGuideText = $(By.xpath("//p[contains(text(), 'feel free to contact us')]"));
    public static SelenideElement itemCardsGrid = $(By.xpath("//section[@class='main-banner']//div[@class='row']"));

}
