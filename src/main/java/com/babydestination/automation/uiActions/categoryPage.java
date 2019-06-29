package com.babydestination.automation.uiActions;

import org.apache.log4j.Logger;
import org.apache.xpath.operations.Bool;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.babydestination.automation.testBase.TestBase;
import org.testng.Assert;

public class categoryPage extends TestBase {
    public static final Logger log = Logger.getLogger(categoryPage.class.getName());

    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/div[3]/div/div[1]/div/div[1]/div/div/a")
    WebElement homePageSeeAll;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-category2/div/div/div/div[1]/div/h1")
    WebElement categoryName;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-category2/div/div/div/div[1]/div/div")
    WebElement breadcrumbNavbar;
    @FindBy(xpath = "/html/body/app-root/app-header/div/div/nav")
    WebElement topHeaderCatPage;
    @FindBy(xpath = "/html/body/app-root/app-header/div/div/div[1]/ul")
    WebElement menuHeaderCatPage;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-category2/div/div/div/div[2]/div[2]/div/div[1]")
    WebElement whatsappWidgetCatPage;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-category2/div/div/div/div[2]/div[2]/div/div[2]")
    WebElement askMomWidgetCatPage;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-category2/div/div/div/div[2]/div[1]/div[1]/div/div[1]")
    WebElement recentSectionCatPage;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-category2/div/div/div/div[2]/div[1]/div[2]/div[1]/div")
    WebElement popularSectionCatPage;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-category2/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div[1]/a/div/div[1]/div")
    WebElement viewsPopularSection;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-category2/div/div/div/div[1]/div/ul/li[4]/a")
    WebElement moreButtonCatPage;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-category2/div/div/div/div[1]/div/ul/li[5]")
    WebElement planningPreparingSubCatLink;  //Planning And Preparing
    @FindBy(xpath = "/html/body/app-root/div[1]/app-category2/div/div/div/div[1]/div/h1")
    WebElement subCatName;  //Planning and Preparing for Baby
    @FindBy(xpath = "/html/body/app-root/div[1]/app-category2/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div[1]")
    WebElement firstBlogPopularSection;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home2/div/footer/div[2]/div/div/app-footer/footer/div")
    WebElement footerSectionCatPage;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-content/div/div[3]/div[1]/div/div[2]/button")
    WebElement continueButton;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-category2/div/div/div/div[1]/div/div/app-breadcrumb/ul/li[3]")
    WebElement subCatBreadcrumb;

    @FindBy(xpath = "//*[@id=\"mat-input-1\"]")
    WebElement expEmail;
    @FindBy(xpath = "/html/body/app-root/div[1]/app-home/div[2]/app-unlock/div/app-personal-info/div/div[2]/form/div[3]/button/span")
    WebElement expSubmit;


    public categoryPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void seeAllButtonRedirection() throws InterruptedException {
        waitForElement(driver,homePageSeeAll,60);
        pause1();
        homePageSeeAll.click();
        pause2();
        Boolean isCatNamePresent=categoryName.isDisplayed();
        Assert.assertEquals(isCatNamePresent.toString(),"true");
        pause1();

    }
    public void categoryPageElementsTest() throws InterruptedException {
        Boolean isCatNamePresent=categoryName.isDisplayed();
        Assert.assertEquals(isCatNamePresent.toString(),"true");
        Boolean isBreadcrumb=breadcrumbNavbar.isDisplayed();
        Assert.assertEquals(isBreadcrumb.toString(),"true");
        Boolean isTopHeader=topHeaderCatPage.isDisplayed();
        Assert.assertEquals(isTopHeader.toString(),"true");
        Boolean isMenuHeader=menuHeaderCatPage.isDisplayed();
        Assert.assertEquals(isMenuHeader.toString(),"true");
        Boolean isWhatsappWidget=whatsappWidgetCatPage.isDisplayed();
        Assert.assertEquals(isWhatsappWidget.toString(),"true");
        Boolean isAskMomWidget=askMomWidgetCatPage.isDisplayed();
        Assert.assertEquals(isAskMomWidget.toString(),"true");
        Boolean isRecentSection=recentSectionCatPage.isDisplayed();
        Assert.assertEquals(isRecentSection.toString(),"true");
        Boolean isPopularSection=popularSectionCatPage.isDisplayed();
        Assert.assertEquals(isPopularSection.toString(),"true");
        Boolean isviewsPopularSection=viewsPopularSection.isDisplayed();
        Assert.assertEquals(isviewsPopularSection.toString(),"true");
        Boolean isMoreLink=moreButtonCatPage.isDisplayed();
        Assert.assertEquals(isMoreLink.toString(),"true");

        pause1();

    }
    public void moreButtonClick() throws InterruptedException {
        waitForElement(driver,moreButtonCatPage,60);
        pause1();
        moreButtonCatPage.click();
        pause2();
        Boolean isPlanningSubCatButton=planningPreparingSubCatLink.isDisplayed();
        Assert.assertEquals(isPlanningSubCatButton.toString(),"true");
        pause1();

    }
    public void subCategoryPageRedirection() throws InterruptedException {
        waitForElement(driver,planningPreparingSubCatLink,60);
        pause1();
        planningPreparingSubCatLink.click();
        pause3();
        String subCategoryName= subCatName.getText();
        Assert.assertEquals(subCategoryName,"Planning and Preparing for Baby");
        pause1();

    }
    public void subCategoryPageElementsTest() throws InterruptedException {
        Boolean isCatNamePresent=categoryName.isDisplayed();
        Assert.assertEquals(isCatNamePresent.toString(),"true");
        Boolean isBreadcrumb=breadcrumbNavbar.isDisplayed();
        Assert.assertEquals(isBreadcrumb.toString(),"true");
        Boolean isTopHeader=topHeaderCatPage.isDisplayed();
        Assert.assertEquals(isTopHeader.toString(),"true");
        Boolean isMenuHeader=menuHeaderCatPage.isDisplayed();
        Assert.assertEquals(isMenuHeader.toString(),"true");
        Boolean isWhatsappWidget=whatsappWidgetCatPage.isDisplayed();
        Assert.assertEquals(isWhatsappWidget.toString(),"true");
        Boolean isAskMomWidget=askMomWidgetCatPage.isDisplayed();
        Assert.assertEquals(isAskMomWidget.toString(),"true");
        Boolean isRecentSection=recentSectionCatPage.isDisplayed();
        Assert.assertEquals(isRecentSection.toString(),"true");
        Boolean isPopularSection=popularSectionCatPage.isDisplayed();
        Assert.assertEquals(isPopularSection.toString(),"true");
        Boolean isviewsPopularSection=viewsPopularSection.isDisplayed();
        Assert.assertEquals(isviewsPopularSection.toString(),"true");

        pause1();

    }
    public void blogClickFromSubCatPage() throws InterruptedException {
        waitForElement(driver,firstBlogPopularSection,60);
        pause1();
        firstBlogPopularSection.click();
        pause3();
        Boolean isContinue=continueButton.isDisplayed();
        Assert.assertEquals(isContinue.toString(),"true");
        pause1();

    }
    public void navigateBackOnSubCatPage() throws InterruptedException {
        back();
        pause3();
        String subCategoryName= subCatName.getText();
        Assert.assertEquals(subCategoryName,"Planning and Preparing for Baby");
        pause1();

    }
    public void clickOnSubCatBreadcrumbTest() throws InterruptedException {
      subCatBreadcrumb.click();
      pause3();
      String subCategoryName= subCatName.getText();
      Assert.assertEquals(subCatName.getText(),"Planning and Preparing for Baby");
        Boolean isCatNamePresent=categoryName.isDisplayed();
        Assert.assertEquals(isCatNamePresent.toString(),"true");
        Boolean isBreadcrumb=breadcrumbNavbar.isDisplayed();
        Assert.assertEquals(isBreadcrumb.toString(),"true");
        Boolean isTopHeader=topHeaderCatPage.isDisplayed();
        Assert.assertEquals(isTopHeader.toString(),"true");
        Boolean isMenuHeader=menuHeaderCatPage.isDisplayed();
        Assert.assertEquals(isMenuHeader.toString(),"true");
        Boolean isWhatsappWidget=whatsappWidgetCatPage.isDisplayed();
        Assert.assertEquals(isWhatsappWidget.toString(),"true");
        Boolean isAskMomWidget=askMomWidgetCatPage.isDisplayed();
        Assert.assertEquals(isAskMomWidget.toString(),"true");
        Boolean isRecentSection=recentSectionCatPage.isDisplayed();
        Assert.assertEquals(isRecentSection.toString(),"true");
        Boolean isPopularSection=popularSectionCatPage.isDisplayed();
        Assert.assertEquals(isPopularSection.toString(),"true");
        Boolean isviewsPopularSection=viewsPopularSection.isDisplayed();
        Assert.assertEquals(isviewsPopularSection.toString(),"true");

        pause1();

    }
}