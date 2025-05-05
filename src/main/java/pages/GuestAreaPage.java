package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class GuestAreaPage extends BasePage{
    public static final String GUEST_AREA_URL = "http://34.233.163.207/guest-area";
    public static SelenideElement h2TitleGuestAreaPage = $(By.xpath("//h2[contains(text(),'Guest Area')]"));
    public static SelenideElement enterPasswordTextGuestAreaPage = $(By.xpath("//p[contains(text(),'Please enter the password below.')]"));
    public static SelenideElement goButtonTextGuestAreaPage = $(By.xpath("//span[contains(text(),'Go')]"));
    public static SelenideElement inputPasswordGuestAreaPage = $(By.id("password"));

}
