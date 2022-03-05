package us.piit;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSellerCenterInformationals extends CommonAPI {

    @Test
    public void getStarted(){
        HomePage homePage = new HomePage(driver);
        SellerCenterPage sellerCenterPage = new SellerCenterPage(driver);
        homePage.clickSellerCenterLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://pages.ebay.com/seller-center/index.html?utm_source=gf&utm_medium=onsite");
        sellerCenterPage.clickgetStartedLink();
        sellerCenterPage.clickgetStartedLink();
        System.out.println("Hello sellers!");
        Assert.assertEquals(driver.getCurrentUrl(), "https://pages.ebay.com/seller-center/index.html?utm_source=gf&utm_medium=onsite");
        sellerCenterPage.clicklistingAndMarketingLink();
        sellerCenterPage.clicklistingAndMarketingLink();
        System.out.println("Don't forget these discounts!");
        Assert.assertEquals(driver.getCurrentUrl(), "https://pages.ebay.com/seller-center/index.html?utm_source=gf&utm_medium=onsite");
        sellerCenterPage.clickshippingLink();
        sellerCenterPage.clickserviceAndPaymentsLink();
        sellerCenterPage.clickstartSellingLink();
        Assert.assertEquals(getTitle(), "Selling on eBay | Electronics, Fashion, Home & Garden | eBay");
    }
    @Test
    public void trendingTopics(){
        HomePage homePage = new HomePage(driver);
        SellerCenterPage sellerCenterPage = new SellerCenterPage(driver);
        homePage.clickSellerCenterLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://pages.ebay.com/seller-center/index.html?utm_source=gf&utm_medium=onsite");
        sellerCenterPage.clickgetStartedLink();
        sellerCenterPage.clickgetStartedLink();
        System.out.println("Hello sellers!");
        Assert.assertEquals(driver.getCurrentUrl(), "https://pages.ebay.com/seller-center/index.html?utm_source=gf&utm_medium=onsite");
        sellerCenterPage.clicklistingAndMarketingLink();
        sellerCenterPage.clicklistingAndMarketingLink();
        System.out.println("Don't forget these discounts!");
        Assert.assertEquals(driver.getCurrentUrl(), "https://pages.ebay.com/seller-center/index.html?utm_source=gf&utm_medium=onsite");
        sellerCenterPage.clickshippingLink();
        sellerCenterPage.clickserviceAndPaymentsLink();
        sellerCenterPage.clickstartSellingLink();
        Assert.assertEquals(getTitle(), "Selling on eBay | Electronics, Fashion, Home & Garden | eBay");
        sellerCenterPage.clickgettingStartedLink();
        sellerCenterPage.clickfeesAndFeaturesLink();
        sellerCenterPage.clickshipTheWayYouWantLink();
        sellerCenterPage.clickwhatToSellLink();
        sellerCenterPage.clicksimpleToGetPaidLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://pages.ebay.com/seller-center/index.html?utm_source=gf&utm_medium=onsite");
        sellerCenterPage.clickexpandAllLink();
        sellerCenterPage.clickcollapseAllLink();
    }
    @Test
    public void sellTest1(){
        HomePage homePage = new HomePage(driver);
        SellPage sellPage = new SellPage(driver);
        homePage.clickSellLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/sl/sell");
        sellPage.clicktheBasicsLink();
        sellPage.clickbusinessSellingLink();
        System.out.println("Don't forget these discounts!");
        sellPage.clickfaqLink();
        sellPage.clicktipsForListingLink();
        sellPage.clickmyEbayLink();
        goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/sl/sell");
        Assert.assertEquals(getTitle(), "Selling on eBay | Electronics, Fashion, Home & Garden | eBay");
        driver.navigate().to("https://www.ebay.com/");
        homePage.clickSellLink();
        System.out.println("Welcome");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/sl/sell");
        sellPage.clicktheBasicsLink();
        sellPage.clickbusinessSellingLink();
        sellPage.clickfaqLink();
        sellPage.clicktipsForListingLink();
        sellPage.clickmyEbayLink();
        goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/sl/sell");
        Assert.assertEquals(getTitle(), "Selling on eBay | Electronics, Fashion, Home & Garden | eBay");
    }
}
