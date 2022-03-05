package us.piit;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRefurbishedItems extends CommonAPI {

    @Test
    public void refurbishedCategories1(){
        HomePage homePage = new HomePage(driver);
        EbayRefurbishedPage ebayRefurbishedPage = new EbayRefurbishedPage(driver);
        homePage.clickEbayRefurbishedLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/eBay-Refurbished/bn_7040708936");
        System.out.println("https://www.ebay.com/b/eBay-Refurbished/bn_7040708936");
        ebayRefurbishedPage.clickcertifiedRefurbishedLink();
        Assert.assertEquals(getTitle(), "Up to 60% off like-new items | eBay. Get them with a two-year warranty.");
        System.out.println("Up to 60% off like-new items | eBay. Get them with a two-year warranty.");
        goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/eBay-Refurbished/bn_7040708936");
        ebayRefurbishedPage.clickexcellentRefurbishedLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/e/_electronics/shop-all-excellent-refurbished");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickEbayRefurbishedLink();
        System.out.println("https://www.ebay.com/e/_electronics/shop-all-excellent-refurbished");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/eBay-Refurbished/bn_7040708936");
        ebayRefurbishedPage.clickcertifiedRefurbishedLink();
        Assert.assertEquals(getTitle(), "Up to 60% off like-new items | eBay. Get them with a two-year warranty.");
        System.out.println("Success!");goBack();
        ebayRefurbishedPage.clickveryGoodRefurbishedLink();goBack();
        ebayRefurbishedPage.clickgoodRefurbishedLink();
    }
    @Test
    public void refurbishedCategories2(){
        HomePage homePage = new HomePage(driver);
        EbayRefurbishedPage ebayRefurbishedPage = new EbayRefurbishedPage(driver);
        homePage.clickEbayRefurbishedLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/eBay-Refurbished/bn_7040708936");
        System.out.println("https://www.ebay.com/b/eBay-Refurbished/bn_7040708936");
        ebayRefurbishedPage.clicklaptopsLink();
        Assert.assertEquals(getTitle(), "Laptops & Netbooks for Sale - Shop New & Used Laptop Computers - eBay");
        System.out.println("Laptops & Netbooks for Sale - Shop New & Used Laptop Computers - eBay");
        goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/eBay-Refurbished/bn_7040708936");
        ebayRefurbishedPage.clickcellphonesSmartWatchesAccessoriesLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/eBay-Refurbished/bn_7040708936");
        driver.navigate().to("https://www.ebay.com/");
        homePage.clickEbayRefurbishedLink();
        System.out.println("https://www.ebay.com/e/_electronics/shop-all-excellent-refurbished");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/eBay-Refurbished/bn_7040708936");
        ebayRefurbishedPage.clickdesktopComputersLink();
        Assert.assertEquals(getTitle(), "PC Desktops & All-In-One Computers for sale | eBay");
        System.out.println("Success!");goBack();
        ebayRefurbishedPage.clickcamerasCameraDronesLink();
        ebayRefurbishedPage.clickgoodRefurbishedLink();
    }
    @Test
    public void refurbishedCategories3(){
        HomePage homePage = new HomePage(driver);
        EbayRefurbishedPage ebayRefurbishedPage = new EbayRefurbishedPage(driver);
        homePage.clickEbayRefurbishedLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/eBay-Refurbished/bn_7040708936");
        System.out.println("https://www.ebay.com/b/eBay-Refurbished/bn_7040708936");
        ebayRefurbishedPage.clickmonitorsLink();
        Assert.assertEquals(getTitle(), "Computer Monitors for Sale - eBay");
        System.out.println("Computer Monitors for Sale - eBay");
        goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/eBay-Refurbished/bn_7040708936");
        ebayRefurbishedPage.clickpcGamingLink();ebayRefurbishedPage.clickpcGamingLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/eBay-Refurbished/bn_7040708936");
        driver.navigate().to("https://www.ebay.com/");
        homePage.clickEbayRefurbishedLink();
        System.out.println("https://www.ebay.com/e/_electronics/shop-all-excellent-refurbished");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/eBay-Refurbished/bn_7040708936");
        ebayRefurbishedPage.clickportableAudioAndHeadphonesLink();
        Assert.assertEquals(getTitle(), "Portable Audio for Sale - eBay");
        System.out.println("Success!");goBack();
        ebayRefurbishedPage.clicktabletsLink();
        Assert.assertEquals(getTitle(), "Tablets for sale | eBay");
        System.out.println("Success!");goBack();
        ebayRefurbishedPage.clickcamerasCameraDronesLink();
    }
}
