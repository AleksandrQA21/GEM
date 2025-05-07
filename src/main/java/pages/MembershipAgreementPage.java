package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class MembershipAgreementPage {
    public static final String MEMBERSHIP_AGREEMENT_URL = "http://34.233.163.207/membership-agreement";
    public static SelenideElement membershipAgreementTitle = $(By.xpath("//h1[contains(text(),'MEMBERSHIP AGREEMENT')]"));
    public static ElementsCollection whiteParagraphs = $$("p.white-text");

    // Model for storing paragraph data
    public static class ParagraphInfo {
        public String title;
        public String keyPhrase;

        ParagraphInfo(String title, String keyPhrase) {
            this.title = title;
            this.keyPhrase = keyPhrase;
        }
    }

    // List of expected paragraphs with their titles and key phrases
    public static List<ParagraphInfo> expectedParagraphs = Arrays.asList(
            new ParagraphInfo("Introduction", "G.E.M. Class Recruiting (a Virginia company)"),
            new ParagraphInfo("Service", "G.E.M. Class Recruiting"),
            new ParagraphInfo("Membership Levels", "Level of G.E.M. Class Recruiting Membership Selected"),
            new ParagraphInfo("Regulations", "G.E.M. Class Recruiting is in accordance with NCAA"),
            new ParagraphInfo("Customer Obligations", "Customer"),
            new ParagraphInfo("Athlete Selection", "Process of Selecting Athletes"),
            new ParagraphInfo("Consent", "Notice and Consent"),
            new ParagraphInfo("Default", "Default and Remedies"),
            new ParagraphInfo("Jurisdiction", "Consent to Jurisdiction"),
            new ParagraphInfo("Disclaimer", "Disclaimer"),
            new ParagraphInfo("Waiver", "Waiver"),
            new ParagraphInfo("Cancel Rights", "Customer")
    );

}
