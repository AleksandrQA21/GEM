package pages;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;


/**
 * Base page class that all page objects will inherit from
 */
public abstract class BasePage {

    public static final String BASE_URL = "http://34.233.163.207";


    /**
     * Constructor for Base Page class
     */
    public BasePage() {
    }

    /**
     * Method to get the current URL
     * @return Current URL as String
     */
    public String getCurrentUrl() {
        return webdriver().driver().url();
    }
    // Метод для открытия страницы, который должны вызывать дочерние классы
    protected void openBasePage(String url) {
        open(url);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    /**
     * Method to navigate to a specified URL
     * @param url URL to navigate to
     */
    public void navigateTo(String url) {
        Selenide.open(url);
    }

    /**
     * Method to check if element is displayed using Selenide's exists and is
     * @param selector Locator to find element
     * @return True if element is displayed, otherwise false
     */
    public boolean isElementDisplayed(By selector) {
        return $(selector).exists() && $(selector).is(Condition.visible);
    }

    /**
     * Method to wait for page to load completely
     */
    public void waitForPageToLoad() {
        Selenide.Wait().until(driver ->
                Selenide.executeJavaScript("return document.readyState").equals("complete"));
    }

    /**
     * Method to refresh the current page
     */
    public void refreshPage() {
        Selenide.refresh();
    }

    /**
     * Method to get page title
     * @return Page title
     */
    public String getPageTitle() {
        return Selenide.title();
    }
}
