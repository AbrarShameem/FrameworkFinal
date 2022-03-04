package us.piit;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHelpContactOptions extends CommonAPI {

    @Test
    public void helpContact1(){
        HomePage homePage = new HomePage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        homePage.clickHelpContactLink();
        Assert.assertEquals(getTitle(), "eBay Customer Service");
        helpAndContactPage.searchThis();
        goBack();
        homePage.clickHelpContactLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/help/home");
        helpAndContactPage.clickBuyingAsGuestLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/help/buying/paying-items/buying-guest?id=4035&st=7");
        System.out.println("attempt passed");driver.navigate().to("https://www.ebay.com/");
        homePage.clickHelpContactLink();
        Assert.assertEquals(getTitle(), "eBay Customer Service");
        helpAndContactPage.searchThis();
        goBack();
        homePage.clickHelpContactLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/help/home");
        helpAndContactPage.clickBuyingAsGuestLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/help/buying/paying-items/buying-guest?id=4035&st=7");
    }
    @Test
    public void helpContact2(){
        HomePage homePage = new HomePage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        homePage.clickHelpContactLink();
        Assert.assertEquals(getTitle(), "eBay Customer Service");
        helpAndContactPage.searchThis();
        goBack();
        homePage.clickHelpContactLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/help/home");
        helpAndContactPage.clickItemHasNotArrivedLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/help/buying/returns-refunds/get-help-item-hasnt-arrived?id=4042&st=7");
        System.out.println("attempt passed");driver.navigate().to("https://www.ebay.com/");
        homePage.clickHelpContactLink();
        Assert.assertEquals(getTitle(), "eBay Customer Service");
        helpAndContactPage.clickHackedAccountHelp();
        goBack();
        helpAndContactPage.clickBuyingAsGuestHelp();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/help/buying/returns-refunds/returning-item/returning-items-bought-guest?id=4065&st=7");
        goBack();helpAndContactPage.clickBuyingAsGuestLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/help/buying/paying-items/buying-guest?id=4035&st=7");
    }
    @Test
    public void helpContact3(){
        HomePage homePage = new HomePage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        homePage.clickDailyDealsLink();goBack();
        homePage.clickHelpContactLink();
        Assert.assertEquals(getTitle(), "eBay Customer Service");
        helpAndContactPage.searchThis();
        goBack();
        homePage.clickHelpContactLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/help/home");
        helpAndContactPage.clickItemHasNotArrivedLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/help/buying/returns-refunds/get-help-item-hasnt-arrived?id=4042&st=7");
        System.out.println("attempt passed");driver.navigate().to("https://www.ebay.com/");
        homePage.clickHelpContactLink();
        Assert.assertEquals(getTitle(), "eBay Customer Service");
        helpAndContactPage.clickResetPassword();
        goBack();
        helpAndContactPage.clickSignUpForEbayLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/help/account/signing-ebay-account/signing-ebay-account?id=4191&st=7");
        goBack();helpAndContactPage.clickBuyingAsGuestLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/help/buying/paying-items/buying-guest?id=4035&st=7");
    }
}
