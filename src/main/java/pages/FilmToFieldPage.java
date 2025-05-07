package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.clickable;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class FilmToFieldPage {
    public static final String FILM_TO_FIELD_URL = "http://34.233.163.207/filmtofield";
    public static final String FILM_TO_FIELD_COM_URL = "https://www.filmtofield.com/";
    public static SelenideElement filmToFieldTitle = $(By.xpath("//h1[contains(text(),'FILM TO FIELD')]"));
    public static SelenideElement filmToFieldSectionText = $(By.className("film-box"));
    public static SelenideElement filmToFieldClickBelowTitle = $(By.xpath("//h2[contains(text(),'Click below to learn more')]"));
    public static SelenideElement getStartedFilmToFieldButton = $(By.className("subtitle-button"));

    public void clickGetStartedFilmToFieldButton (){
        getStartedFilmToFieldButton.shouldBe(visible).shouldBe(clickable).click();
    }
}
