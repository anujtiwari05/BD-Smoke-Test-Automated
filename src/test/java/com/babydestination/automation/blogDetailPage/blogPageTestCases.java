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

    @Test(groups = {"Regression","Smoke"},priority = 1)
    public void TC_18_Random_Blog_Text() throws InterruptedException
    {
        blogDetailPage=new blogDetailPage(driver);
        blogDetailPage.TC27();

    }

    @Test(groups = {"Regression"},priority = 2)
    public void  TC_19_Continue_Button_Text() throws InterruptedException
    {
        blogDetailPage=new blogDetailPage(driver);
        blogDetailPage.TC28();
    }
    @Test(groups = {"Regression"},priority = 3)
    public void  TC_20_Related_1_2() throws InterruptedException
    {
       blogDetailPage=new blogDetailPage(driver);
       blogDetailPage.TC29();
    }
    @Test(groups = {"Regression","Smoke"},priority = 4)
    public void  TC_21_continue_reading_present() throws InterruptedException
    {
        blogDetailPage=new blogDetailPage(driver);
        blogDetailPage.TC30();
    }
    @Test(groups = {"Regression","Smoke"},priority = 5)
    public void  TC_22_subCategory_Breadcrumb_Click() throws InterruptedException
    {
        blogDetailPage=new blogDetailPage(driver);
        blogDetailPage.TC31();
    }
    @Test(groups = {"Regression","Smoke"},priority = 6)
    public void  TC_23_Category_Breadcrumb_Click() throws InterruptedException
    {
        blogDetailPage=new blogDetailPage(driver);
        blogDetailPage.TC32();
    }
    @Test(groups = {"Regression","Smoke"},priority = 7)
    public void  TC_24_Home_Breadcrumb_Click() throws InterruptedException
    {
        blogDetailPage=new blogDetailPage(driver);
        blogDetailPage.TC33();
    }
    @Test(groups = {"Regression","Smoke"},priority = 8)
    public void TC_25_AskMoms_Widget_Click() throws InterruptedException
    {

        blogDetailPage=new blogDetailPage(driver);
        blogDetailPage.TC34();

    }
    @Test(groups = {"Regression","Smoke"},priority = 9)
    public void  TC_26_Whatsapp_Widget_Click() throws InterruptedException
    {
        blogDetailPage=new blogDetailPage(driver);
        blogDetailPage.TC35();
    }
    @Test(groups = {"Regression","Smoke"},priority = 10)
    public void  TC_27_Whatsapp_Widget_Text() throws InterruptedException
    {
        blogDetailPage=new blogDetailPage(driver);
        blogDetailPage.TC36(OR);
    }
    @Test(groups = {"Regression","Smoke"},priority = 11)
    public void  TC_28_AskMom_Widget_Text() throws InterruptedException
    {
        blogDetailPage=new blogDetailPage(driver);
        blogDetailPage.TC37(OR);
    }
    @Test(groups = {"Regression","Smoke"},priority = 12)
    public void  TC_29_Breadcrumb_appeared_Test() throws InterruptedException
    {
        blogDetailPage=new blogDetailPage(driver);
        blogDetailPage.TC38();
    }
    @Test(groups = {"Regression","Smoke"},priority = 13)
    public void  TC_30_menu_header_present_Test() throws InterruptedException
    {
        blogDetailPage=new blogDetailPage(driver);
        blogDetailPage.TC39();
    }
    @Test(groups = {"Regression","Smoke"},priority = 14)
    public void  TC_31_Footer_Present_Test() throws InterruptedException
    {
        blogDetailPage=new blogDetailPage(driver);
        blogDetailPage.TC40();
    }
    @Test(groups = {"Regression","Smoke"},enabled = false,priority = 15)
    public void  TC_32_google_Form_Link_Present() throws InterruptedException
    {
        blogDetailPage=new blogDetailPage(driver);
        blogDetailPage.TC41();
    }
    @Test(groups = {"Regression","Smoke"},priority = 16)
    public void  TC_33_Top_Header_Present_Test() throws InterruptedException
    {
        blogDetailPage=new blogDetailPage(driver);
        blogDetailPage.TC42();
    }
    @Test(groups = {"Regression","Smoke"},enabled = false,priority = 17)
    public void  TC_34_Random_Exit_Link_Click() throws InterruptedException
    {
        blogDetailPage=new blogDetailPage(driver);
        blogDetailPage.TC43();

    }


}
