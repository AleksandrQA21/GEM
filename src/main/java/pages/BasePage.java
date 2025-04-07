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

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.webdriver;


/**
 * Base page class that all page objects will inherit from
 */
public abstract class BasePage {
    protected final Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * Constructor for Base Page class
     */
    public BasePage() {
        log.info("Initializing BasePage");
    }

    /**
     * Method to get the current URL
     * @return Current URL as String
     */
    public String getCurrentUrl() {
        return webdriver().driver().url();
    }

    /**
     * Method to navigate to a specified URL
     * @param url URL to navigate to
     */
    public void navigateTo(String url) {
        log.info("Navigating to: {}", url);
        Selenide.open(url);
    }

    /**
     * Method to check if element is displayed using Selenide's exists and is
     * @param selector Locator to find element
     * @return True if element is displayed, otherwise false
     */
    public boolean isElementDisplayed(By selector) {
        log.debug("Checking if element is displayed: {}", selector);
        return $(selector).exists() && $(selector).is(Condition.visible);
    }

    /**
     * Method to wait for page to load completely
     */
    public void waitForPageToLoad() {
        log.debug("Waiting for page to load completely");
        Selenide.Wait().until(driver ->
                Selenide.executeJavaScript("return document.readyState").equals("complete"));
    }

    /**
     * Method to refresh the current page
     */
    public void refreshPage() {
        log.info("Refreshing page");
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
