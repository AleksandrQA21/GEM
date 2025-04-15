package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AboutUsPage extends BasePage{
    public static final String WHAT_WE_DO_URL = "http://34.233.163.207/about-us#what-we-do";
    public static final String ABOUT_US_URL = "http://34.233.163.207/about-us";
    public static final String BACKGROUND_URL = "http://34.233.163.207/about-us#background";
    public static final String TESTIMONIALS_URL = "http://34.233.163.207/about-us#testimonials";
    public static final String FAC_URL = "http://34.233.163.207/about-us#faq";
    public static final String CONTACT_US_URL = "http://34.233.163.207/about-us#contact-us";
    public static final String OUR_TEAM_URL = "http://34.233.163.207/our-team";
    public static SelenideElement whatWeDoTitle = $(By.xpath("//h2[contains(text(),'WHAT WE DO')]"));
    public static SelenideElement supportStudentsTitle = $(By.xpath("//h3[contains(text(),'We Support Student Athletes')]"));
    public static SelenideElement text1WhatWeDo = $(By.xpath("//p[contains(text(),'The reason G.E.M. Class was founded was to')]"));
    public static SelenideElement supportCollegeTitle = $(By.xpath("//h3[contains(text(),'We Support College Coaches')]"));
    public static SelenideElement text2WhatWeDo = $(By.xpath("//p[contains(text(),'In a time where college coaches')]"));
    public static SelenideElement backgroundTitle = $(By.xpath("//h2[contains(text(),'BACKGROUND')]"));
    public static SelenideElement backgroundSlider = $(By.cssSelector("div#carouselExampleDark"));
    public static SelenideElement testimonialsTitle = $(By.xpath("//h2[contains(text(),'TESTIMONIALS')]"));
    public static SelenideElement textTestimonials = $(By.xpath("//p[contains(text(),'WHAT OUR ATHLET')]"));
    public static SelenideElement testimonialsSlider = $(By.cssSelector("div.slick-list"));
    public static SelenideElement facTitle = $(By.xpath("//h2[contains(text(),'FREQUENTLY ASKED QUESTIONS')]"));
    public static SelenideElement facAccordion = $(By.cssSelector("div.accordion"));
    public static SelenideElement contactUsTitle = $(By.xpath("//h2[contains(text(),'CONTACT US')]"));
    public static SelenideElement contactUsForm = $(By.id("formWrapper"));
    public static SelenideElement contactUsFormTitle = $(By.xpath("//h2[contains(text(),'Have a question?')]"));
    public static SelenideElement contactUsSubmitButton = $(By.cssSelector("button.sec-btn"));
    public static SelenideElement contactUsFirstNameInput = $(By.cssSelector("input[name=\"first_name\"]"));
    public static SelenideElement contactUsLastNameInput = $(By.cssSelector("input[name=\"last_name\"]"));
    public static SelenideElement contactUsEmailInput = $(By.cssSelector("input[name=\"email\"]"));
    public static SelenideElement contactUsPhoneInput = $(By.cssSelector("input[name=\"phone\"]"));
    public static SelenideElement contactUsTextInput = $(By.cssSelector("textarea[name=\"message\"]"));
    public static SelenideElement meetOurTeamTitle = $(By.xpath("//h1[contains(text(),'MEET OUR TEAM')]"));
    public static SelenideElement mainTeamSection = $(By.cssSelector("section.main-team-in"));
    public static SelenideElement moreAboutUsButton = $(By.cssSelector("div.subtitle-button"));

}
