package com.babydestination.automation.blogDetailPage;

import com.babydestination.automation.testBase.TestBase;
import com.babydestination.automation.uiActions.blogDetailPage;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class blogPageTestCases extends TestBase {
    blogDetailPage blogDetailPage=new blogDetailPage(driver);

    @BeforeSuite
    public void setUp()throws InterruptedException, IOException {
        init();
    }

    @Test(groups = {"Regression","Smoke"})
    public void TC_27_1_Random_Blog_Text() throws InterruptedException
    {
        blogDetailPage=new blogDetailPage(driver);
        blogDetailPage.TC27();

    }

    @Test(groups = {"Regression"})
    public void  TC_28_Continue_Button_Text() throws InterruptedException
    {
        blogDetailPage.TC28();
    }
    @Test(groups = {"Regression"})
    public void  TC_29_Related_1_2() throws InterruptedException
    {
       blogDetailPage.TC29();
    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_30_continue_reading_present() throws InterruptedException
    {
        blogDetailPage.TC30();
    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_31_subCategory_Breadcrumb_Click() throws InterruptedException
    {
        blogDetailPage.TC31();
    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_32_Category_Breadcrumb_Click() throws InterruptedException
    {
        blogDetailPage.TC32();
    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_33_Home_Breadcrumb_Click() throws InterruptedException
    {
        blogDetailPage.TC33();
    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_34_AskMoms_Widget_Click() throws InterruptedException
    {

        blogDetailPage.TC34();

    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_35_Whatsapp_Widget_Click() throws InterruptedException
    {
        blogDetailPage.TC35();
    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_36_Whatsapp_Widget_Text() throws InterruptedException
    {
        blogDetailPage.TC36(OR);
    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_37_AskMom_Widget_Text() throws InterruptedException
    {
        blogDetailPage.TC37(OR);
    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_38_Breadcrumb_appeared_Test() throws InterruptedException
    {
        blogDetailPage.TC38();
    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_39_menu_header_present_Test() throws InterruptedException
    {
        blogDetailPage.TC39();
    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_40_Footer_Present_Test() throws InterruptedException
    {
        blogDetailPage.TC40();
    }
    @Test(groups = {"Regression","Smoke"},enabled = false)
    public void  TC_41_google_Form_Link_Present() throws InterruptedException
    {
        blogDetailPage.TC41();
    }
    @Test(groups = {"Regression","Smoke"})
    public void  TC_42_Top_Header_Present_Test() throws InterruptedException
    {
        blogDetailPage.TC42();
    }
    @Test(groups = {"Regression","Smoke"},enabled = false)
    public void  TC_43_Random_Exit_Link_Click() throws InterruptedException
    {
        blogDetailPage.TC43();
        Quit();
    }
//    @Test(priority = 1)
//    public void TC_33_DOB_Popup_Submit() throws InterruptedException
//    {
//      blogDetailPage=new blogDetailPage(driver);
//
//        blogDetailPage.TC33();
//
//    }
//    @Test(priority = 2)
//    public void TC_34_DOB_Popup_Submit() throws InterruptedException
//    {
//
//        blogDetailPage.TC34();
//
//    }
//    @Test(priority = 3)
//    public void TC_35_DOB_Popup_Submit() throws InterruptedException
//    {
//
//        blogDetailPage.TC35();
//
//
//    }

}
