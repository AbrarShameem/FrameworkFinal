package us.piit;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDailyDeals extends CommonAPI {

    @Test
    public void dailyDeals1(){
        HomePage homePage = new HomePage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        SellerCenterPage sellerCenterPage = new SellerCenterPage(driver);
        homePage.clickDailyDealsLink();
        Assert.assertEquals(getTitle(), "Daily Deals on eBay | Best deals and Free Shipping");
        dailyDealsPage.clickAutomotiveDropdown();
        Assert.assertEquals(getTitle(), "Automotive Deals on eBay | Best deals and Free shipping");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickDailyDealsLink();
        dailyDealsPage.clickFashionDropdown();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/deals/fashion");
        click(homePage.logoLink);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.clickDailyDealsLink();
        Assert.assertEquals(getTitle(), "Daily Deals on eBay | Best deals and Free Shipping");
        dailyDealsPage.clickAutomotiveDropdown();
        Assert.assertEquals(getTitle(), "Automotive Deals on eBay | Best deals and Free shipping");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickDailyDealsLink();
        dailyDealsPage.clickFashionDropdown();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/deals/fashion");
    }
    @Test
    public void dailyDeals2(){
        HomePage homePage = new HomePage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        SellerCenterPage sellerCenterPage = new SellerCenterPage(driver);
        homePage.clickDailyDealsLink();
        Assert.assertEquals(getTitle(), "Daily Deals on eBay | Best deals and Free Shipping");
        dailyDealsPage.clickFeaturedDropdown();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/deals");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickDailyDealsLink();
        dailyDealsPage.clickTechDropdown();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/deals/tech");
        click(homePage.logoLink);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.clickDailyDealsLink();
        Assert.assertEquals(getTitle(), "Daily Deals on eBay | Best deals and Free Shipping");
        dailyDealsPage.clickFeaturedDropdown();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/deals");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickDailyDealsLink();
        dailyDealsPage.clickTechDropdown();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/deals/tech");
        System.out.println("round 2 success!");
    }
    @Test
    public void dailyDeals3(){
        HomePage homePage = new HomePage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        SellerCenterPage sellerCenterPage = new SellerCenterPage(driver);
        homePage.clickDailyDealsLink();
        Assert.assertEquals(getTitle(), "Daily Deals on eBay | Best deals and Free Shipping");
        dailyDealsPage.clickHomeGardenDropdown();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/deals/home-garden");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickDailyDealsLink();
        dailyDealsPage.clickSportingGoodsDropdown();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/deals/sporting-goods");
        click(homePage.logoLink);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.clickDailyDealsLink();
        System.out.println(getTitle());
        Assert.assertEquals(getTitle(), "Daily Deals on eBay | Best deals and Free Shipping");
        System.out.println("round 3 success!");
    }
    @Test
    public void dailyDeals4(){
        HomePage homePage = new HomePage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        SellerCenterPage sellerCenterPage = new SellerCenterPage(driver);
        homePage.clickDailyDealsLink();
        Assert.assertEquals(getTitle(), "Daily Deals on eBay | Best deals and Free Shipping");
        dailyDealsPage.clickOtherDealsDropdown();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/deals/other-deals");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickDailyDealsLink();
        dailyDealsPage.clickSalesEventsDropdown();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Sales-Events/bn_7115049177");
        click(homePage.logoLink);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.clickDailyDealsLink();
        System.out.println(getTitle());
        Assert.assertEquals(getTitle(), "Daily Deals on eBay | Best deals and Free Shipping");
        System.out.println("round 3 success!");
    }
    @Test
    public void dailyDeals5(){
        HomePage homePage = new HomePage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        SellerCenterPage sellerCenterPage = new SellerCenterPage(driver);
        homePage.clickDailyDealsLink();
        Assert.assertEquals(getTitle(), "Daily Deals on eBay | Best deals and Free Shipping");
        dailyDealsPage.clickFeaturedDropdown();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/deals");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickDailyDealsLink();
        dailyDealsPage.clickTechDropdown();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/deals/tech");
        click(homePage.logoLink);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.clickDailyDealsLink();
        Assert.assertEquals(getTitle(), "Daily Deals on eBay | Best deals and Free Shipping");
        dailyDealsPage.clickFeaturedDropdown();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/deals");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickDailyDealsLink();
        dailyDealsPage.clickTechDropdown();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/deals/tech");
        System.out.println("round 2 success!");
    }
}
