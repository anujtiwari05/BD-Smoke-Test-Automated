package com.babydestination.automation.categoryPage;

import com.babydestination.automation.testBase.TestBase;
import com.babydestination.automation.uiActions.categoryPage;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class categoryPageTestCases extends TestBase {
    categoryPage categoryPage=new categoryPage(driver);

    @BeforeSuite
    public void setUp()throws InterruptedException, IOException {
        init();
    }

    @Test(groups = {"Regression","Smoke"})
    public void TC_46_seeAllButtonRedirection() throws InterruptedException
    {
        categoryPage=new categoryPage(driver);
        categoryPage.seeAllButtonRedirection();

    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_47_categoryPageElementsTest() throws InterruptedException
    {
        categoryPage=new categoryPage(driver);
        categoryPage.categoryPageElementsTest();

    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_48_moreButtonClick() throws InterruptedException
    {
        categoryPage=new categoryPage(driver);
        categoryPage.moreButtonClick();

    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_49_subCategoryPageRedirection() throws InterruptedException
    {
        categoryPage=new categoryPage(driver);
        categoryPage.subCategoryPageRedirection();

    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_50_subCategoryPageElementsTest() throws InterruptedException
    {
        categoryPage=new categoryPage(driver);
        categoryPage.subCategoryPageElementsTest();

    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_51_blogClickFromSubCatPage() throws InterruptedException
    {
        categoryPage=new categoryPage(driver);
        categoryPage.blogClickFromSubCatPage();

    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_52_navigateBackOnSubCatPage() throws InterruptedException
    {
        categoryPage=new categoryPage(driver);
        categoryPage.navigateBackOnSubCatPage();

    }
    @Test(groups = {"Regression","Smoke"})
    public void TC_53_clickOnSubCatBreadcrumbTest() throws InterruptedException
    {
        categoryPage=new categoryPage(driver);
        categoryPage.clickOnSubCatBreadcrumbTest();

    }

}
