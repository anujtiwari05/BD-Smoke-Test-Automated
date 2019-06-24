package com.babydestination.automation.homePage;

import com.babydestination.automation.testBase.TestBase;
import com.babydestination.automation.uiActions.HomePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class homePageTestCases extends TestBase {
    HomePage homePage;


    @BeforeSuite(alwaysRun = true)
    public void setUp()throws InterruptedException, IOException {
        init();
    }

    @Test(groups = {"Regression","Smoke"},priority = 1)
    public void TC1_TopHeader_Present() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.TC1_TopHeader_Present();
    }
    @Test(groups = {"Regression"},priority = 2)
    public void TC2_menuHeader_Present() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.TC2_menuHeader_Present();
    }
    @Test(groups = {"Regression"},priority = 3)
    public void TC3_footer_Present() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.TC3_footer_Present();
    }
    @Test(groups = {"Regression","Smoke"},priority = 4)
    public void TC4_widgets_ask_WA_Present() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.TC4_widgets_ask_WA_Present();
    }
    @Test(groups = {"Regression","Smoke"},priority = 5)
    public void TC5_all_categories_postcard_present()throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.TC5_all_categories_postcard_present();
    }
    @Test(groups = {"Regression","Smoke"},priority = 6)
    public void TC6_click_blog() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.TC6_click_blog(OR);
    }
    @Test(groups = {"Regression","Smoke"},priority = 7)
    public void TC7_click_seeAll() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.TC7_click_seeAll(OR);
    }
    @Test(groups = {"Regression","Smoke"},priority = 8)
    public void TC8_expert_popup_submit() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.TC8_expert_popup_submit(OR);
    }
    @Test(groups = {"Regression","Smoke"},priority = 9)
    public void TC9_whatsapp_directory_page() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.TC9_whatsapp_directory_page(OR);
    }
    @Test(groups = {"Regression","Smoke"},priority = 10)
    public void TC10_video_blog_open() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.TC10_video_blog_open(OR);
    }
    @Test(groups = {"Regression","Smoke"},priority = 11)
    public void TC11_card_blog_open() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.TC11_card_blog_open(OR);
    }
    @Test(groups = {"Regression","Smoke"},priority = 12)
    public void TC12_all_sections_present() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.TC12_all_sections_present();
    }
    @Test(groups = {"Regression","Smoke"},priority = 13)
    public void TC13_partner_us_page() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.TC13_partner_us_page(OR);

    }
    @Test(groups = {"Regression","Smoke"},priority = 14)
    public void TC14_language_dropdown() throws InterruptedException,IOException {
        homePage = new HomePage(driver);
        homePage.TC14_language_dropdown(OR);
    }
    @Test(groups = {"Regression"},priority = 15)
    public void TC15_Footer_social_links_redirection() throws InterruptedException,IOException {
        homePage = new HomePage(driver);

        homePage.TC15_Footer_social_links_redirection(OR);
    }
    @Test(groups = {"Regression"},priority = 16)
    public void TC16_Footer_pages_links_redirection() throws InterruptedException,IOException {

        homePage = new HomePage(driver);
        homePage.TC16_Footer_pages_links_redirection(OR);
    }
    @Test(groups = {"Regression"},priority = 17)
    public void TC17_search_page() throws InterruptedException,IOException {

        homePage = new HomePage(driver);
        homePage.TC17_search_page(OR);
    }

}
