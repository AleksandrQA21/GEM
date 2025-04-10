package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AboutUsPage extends BasePage{
    public static final String WHAT_WE_DO_URL = "http://34.233.163.207/about-us#what-we-do";
    public static final String BACKGROUND_URL = "http://34.233.163.207/about-us#background";
    public static final String TESTIMONIALS_URL = "http://34.233.163.207/about-us#testimonials";
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

}
