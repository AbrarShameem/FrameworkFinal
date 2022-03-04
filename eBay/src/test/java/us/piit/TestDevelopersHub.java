package us.piit;
import base.CommonAPI;
import org.apache.commons.math3.analysis.function.Add;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDevelopersHub extends CommonAPI {

    @Test
    public void devHub1(){
        HomePage homePage = new HomePage(driver);
        BusinessAndIndustrialPage businessAndIndustrialPage = new BusinessAndIndustrialPage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        DevelopersPage developersPage = new DevelopersPage(driver);
        homePage.clickDevelopersLink();
        Assert.assertEquals(getTitle(), "eBay Developers Program");
        developersPage.clickDevSignInLink();
        developersPage.clickregisterLink();
        Assert.assertEquals(getTitle(), "eBay Developers Program Registration | eBay");
        developersPage.clickregisterLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://developer.ebay.com/signin?tab=register");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickDevelopersLink();
        Assert.assertEquals(getTitle(), "eBay Developers Program");
        developersPage.clickDevSignInLink();
        developersPage.clickregisterLink();
        Assert.assertEquals(getTitle(), "eBay Developers Program Registration | eBay");
        developersPage.clickregisterLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://developer.ebay.com/signin?tab=register");
    }
    @Test
    public void devHub2(){
        HomePage homePage = new HomePage(driver);
        BusinessAndIndustrialPage businessAndIndustrialPage = new BusinessAndIndustrialPage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        DevelopersPage developersPage = new DevelopersPage(driver);
        homePage.clickDevelopersLink();
        Assert.assertEquals(getTitle(), "eBay Developers Program");
        developersPage.clickforumsLink();
        developersPage.clickdocsAndKBsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://developer.ebay.com/");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickDevelopersLink();
        System.out.println("buttons working");
        Assert.assertEquals(getTitle(), "eBay Developers Program");
        developersPage.clickDevSignInLink();
        developersPage.clicksupportLink();
        Assert.assertEquals(getTitle(), "eBay Developers Program");
        developersPage.clickregisterLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://developer.ebay.com/signin?tab=register");
    }
    @Test
    public void devHub3(){
        HomePage homePage = new HomePage(driver);
        BusinessAndIndustrialPage businessAndIndustrialPage = new BusinessAndIndustrialPage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        DevelopersPage developersPage = new DevelopersPage(driver);
        homePage.clickDevelopersLink();
        Assert.assertEquals(getTitle(), "eBay Developers Program");
        developersPage.clicktoolsAndSamplesLink();
        developersPage.clickgrowthLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://developer.ebay.com/");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickDevelopersLink();
        System.out.println("buttons working");
        Assert.assertEquals(getTitle(), "eBay Developers Program");
        developersPage.clickDevSignInLink();
        developersPage.clicksupportLink();
        Assert.assertEquals(getTitle(), "eBay Developers Program");
        developersPage.clickregisterLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://developer.ebay.com/signin?tab=register");
        System.out.println("scenario 3 successful");
    }
    @Test
    public void devHub4(){
        HomePage homePage = new HomePage(driver);
        BusinessAndIndustrialPage businessAndIndustrialPage = new BusinessAndIndustrialPage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        DevelopersPage developersPage = new DevelopersPage(driver);
        homePage.clickDevelopersLink();
        Assert.assertEquals(getTitle(), "eBay Developers Program");
        developersPage.clickbuyAPIsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://developer.ebay.com/products/buy");goBack();
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickDevelopersLink();
        System.out.println("buttons working");
        Assert.assertEquals(getTitle(), "eBay Developers Program");
        developersPage.clicksellAPIsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://developer.ebay.com/products/sell");goBack();
        developersPage.clickcommerceAPIsLink();
        Assert.assertEquals(getTitle(), "Commerce APIs for Shared Capabilities");
        System.out.println("scenario 4 successful");
    }
    @Test
    public void devHub5(){
        HomePage homePage = new HomePage(driver);
        BusinessAndIndustrialPage businessAndIndustrialPage = new BusinessAndIndustrialPage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        DevelopersPage developersPage = new DevelopersPage(driver);
        homePage.clickDevelopersLink();
        Assert.assertEquals(getTitle(), "eBay Developers Program");
        developersPage.clickbuyAPIsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://developer.ebay.com/products/buy");goBack();
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickDevelopersLink();
        System.out.println("buttons working");
        Assert.assertEquals(getTitle(), "eBay Developers Program");
        developersPage.clickdevelopersAPIsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://developer.ebay.com/products/developer");goBack();
        developersPage.clickcommerceAPIsLink();
        Assert.assertEquals(getTitle(), "Commerce APIs for Shared Capabilities");
        System.out.println("scenario 4 successful");
        goBack();
        developersPage.clickdeveloperHelpCenterLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://developer.ebay.com/tools");goBack();
        developersPage.clickdeveloperSandboxLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://developer.ebay.com/tools/sandbox");goBack();
    }
}
