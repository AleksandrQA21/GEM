package steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;

public class CookieCleanupHooks {
    @After(order = 10)
    public void cleanupBrowserData() {
        try {
            if (WebDriverRunner.hasWebDriverStarted()) {
                Selenide.clearBrowserCookies();
                Selenide.clearBrowserLocalStorage();
            }
        } catch (Exception e) {
            System.out.println("Error during cleaning browser data: " + e.getMessage());
        }
    }
}
