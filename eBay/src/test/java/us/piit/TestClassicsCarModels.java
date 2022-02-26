package us.piit;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClassicsCarModels extends CommonAPI {

    @Test
    public void classics1(){
        HomePage homePage = new HomePage(driver);
        ClassicsPage classicsPage = new ClassicsPage(driver);
        SellerCenterPage sellerCenterPage = new SellerCenterPage(driver);
        SellPage sellPage = new SellPage(driver);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.hoverMotorsLink();
        homePage.clickClassicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Classics/bn_7005623268");
        System.out.println("pages functional");
        classicsPage.clickAmcLink();
        Assert.assertEquals(getTitle(), "AMC Cars and Trucks for sale | eBay");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();
        homePage.clickClassicsLink();
        classicsPage.clickAmcLink();
        classicsPage.clickauctionLink();goBack();
        classicsPage.clickbuyNowLink();goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/AMC-Cars-and-Trucks/6001/bn_24016985");
        System.out.println("buttons working");
    }
    @Test
    public void classics2(){
        HomePage homePage = new HomePage(driver);
        ClassicsPage classicsPage = new ClassicsPage(driver);
        SellerCenterPage sellerCenterPage = new SellerCenterPage(driver);
        SellPage sellPage = new SellPage(driver);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.hoverMotorsLink();
        homePage.clickClassicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Classics/bn_7005623268");
        System.out.println("pages functional");
        homePage.clickDailyDealsLink();goBack();
        classicsPage.clickAmcLink();
        Assert.assertEquals(getTitle(), "AMC Cars and Trucks for sale | eBay");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();
        homePage.clickClassicsLink();
        classicsPage.clickAmcLink();
        classicsPage.clickauctionLink();goBack();
        classicsPage.clickbuyNowLink();goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/AMC-Cars-and-Trucks/6001/bn_24016985");
        System.out.println("buttons working");
    }
    @Test
    public void classics3(){
        HomePage homePage = new HomePage(driver);
        ClassicsPage classicsPage = new ClassicsPage(driver);
        SellerCenterPage sellerCenterPage = new SellerCenterPage(driver);
        SellPage sellPage = new SellPage(driver);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.hoverMotorsLink();
        homePage.clickClassicsLink();
        System.out.println("clicks functional");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Classics/bn_7005623268");
        System.out.println("pages functional");
        homePage.clickBrandOutletLink();goBack();
        classicsPage.clickAmcLink();
        Assert.assertEquals(getTitle(), "AMC Cars and Trucks for sale | eBay");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();
        homePage.clickClassicsLink();
        classicsPage.clickAmcLink();
        classicsPage.clickauctionLink();goBack();
        classicsPage.clickbuyNowLink();goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/AMC-Cars-and-Trucks/6001/bn_24016985");
        System.out.println("buttons working");
    }
    @Test
    public void classics4(){
        HomePage homePage = new HomePage(driver);
        ClassicsPage classicsPage = new ClassicsPage(driver);
        SellerCenterPage sellerCenterPage = new SellerCenterPage(driver);
        SellPage sellPage = new SellPage(driver);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.hoverMotorsLink();
        homePage.clickClassicsLink();
        System.out.println("so far so good");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Classics/bn_7005623268");
        System.out.println("minor tweaks in page");
        homePage.clickHelpContactLink();goBack();
        classicsPage.clickAmcLink();
        Assert.assertEquals(getTitle(), "AMC Cars and Trucks for sale | eBay");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();
        homePage.clickClassicsLink();
        classicsPage.clickAmcLink();
        classicsPage.clickauctionLink();goBack();
        classicsPage.clickbuyNowLink();goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/AMC-Cars-and-Trucks/6001/bn_24016985");
        System.out.println("buttons working");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();
        homePage.clickClassicsLink();
        classicsPage.clickAmcLink();
        classicsPage.clickauctionLink();goBack();
        classicsPage.clickbuyNowLink();goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/AMC-Cars-and-Trucks/6001/bn_24016985");
        System.out.println("success");
    }
    @Test
    public void classics5(){
        HomePage homePage = new HomePage(driver);
        ClassicsPage classicsPage = new ClassicsPage(driver);
        CollectiblesAndArtPage collectiblesAndArtPage = new CollectiblesAndArtPage(driver);
        BrandOutletPage brandOutletPage = new BrandOutletPage(driver);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.hoverMotorsLink();
        homePage.clickClassicsLink();
        System.out.println("so far so good");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Classics/bn_7005623268");
        System.out.println("minor tweaks in page");
        homePage.clickHelpContactLink();goBack();
        classicsPage.clickAmcLink();
        Assert.assertEquals(getTitle(), "AMC Cars and Trucks for sale | eBay");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();
        homePage.clickClassicsLink();
        classicsPage.clickAmcLink();
        classicsPage.clickauctionLink();goBack();
        classicsPage.clickbuyNowLink();goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/AMC-Cars-and-Trucks/6001/bn_24016985");
        System.out.println("buttons working");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();
        homePage.clickClassicsLink();
        classicsPage.clickAmcLink();
        classicsPage.clickauctionLink();goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/AMC-Cars-and-Trucks/6001/bn_24016985");
        System.out.println("success");
    }
}
