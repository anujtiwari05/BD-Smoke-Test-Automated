package com.babydestination.automation.forumPage;

import com.babydestination.automation.testBase.TestBase;
import com.babydestination.automation.uiActions.forumPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class forumPageTestCases extends TestBase {
    forumPage forumPage;


    @BeforeSuite
    public void setUp() throws InterruptedException, IOException {
        init();
    }

    @Test(groups = {"Regression","Smoke"},priority = 1)
    public void TC_38_Forum_Homepage() throws InterruptedException {
        forumPage = new forumPage(driver);
        forumPage.forumsHomepage();

    }



    @Test(groups = {"Regression","smoke"},enabled = true,priority = 2)
    public void TC_39_Forum_Post_Question() throws InterruptedException {
        forumPage = new forumPage(driver);
        forumPage.postQuestion(OR);

    }

    @Test(groups = {"Regression","Smoke"},priority = 3)
    public void TC_40_Forum_Post_Answer() throws InterruptedException {
        forumPage = new forumPage(driver);
        forumPage.postAnswer(OR);

    }
    @Test(groups = {"Regression","Smoke"},priority = 4)
    public void TC_41_View_Question() throws InterruptedException {
        forumPage = new forumPage(driver);
        forumPage.viewQuestion();

    }
    @Test(groups = {"Regression","Smoke"},priority = 5)
    public void TC_42_Red_Ans_Button() throws InterruptedException {
        forumPage = new forumPage(driver);
        forumPage.redAnsButton();

    }

    @Test(groups = {"Regression","Smoke"},priority = 6)
    public void TC_43_yellow_LS_Tag() throws InterruptedException {
        forumPage = new forumPage(driver);
        forumPage.yellowLSTagClick();

    }
    @Test(groups = {"Regression","Smoke"},priority = 7)
    public void TC_44_Cancel_Button_Text() throws InterruptedException {
        forumPage = new forumPage(driver);
        forumPage.cancelButtonTest();


    }
    @Test(groups = {"Regression","Smoke"},priority = 8)
    public void TC_45_Infinite_scroll_forumHomepage() throws InterruptedException {
        forumPage = new forumPage(driver);
        forumPage.infiniteScroll();
        pause3();

    }

}



