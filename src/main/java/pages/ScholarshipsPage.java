package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ScholarshipsPage extends BasePage{
    public static final String SCHOLARSHIPS_URL = "http://34.233.163.207/scholarships";
    public static SelenideElement h1Title = $(By.xpath("//h1[contains(text(),'LEVELING THE PLAYING FIELD')]"));
    public static SelenideElement h2Title = $(By.xpath("//h2[contains(text(),'SCHOLARSHIP OPPORTUNITIES')]"));
    public static SelenideElement learnMoreSection = $(By.xpath("//h2[contains(text(),'LEARN MORE')]"));
    public static SelenideElement learnMoreSectionForm = $(By.xpath("//h2[contains(text(),'If you feel like')]"));
    public static SelenideElement firstNameInput = $("input[name='first_name']");
    public static SelenideElement lastNameInput = $("input[name='last_name']");
    public static SelenideElement emailInput = $("input[name='email']");
    public static SelenideElement sendFormButton = $(By.cssSelector("button.sec-btn"));
    public static SelenideElement recruitingInfoButton = $(By.cssSelector("a.sec-btn"));

}
