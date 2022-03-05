package us.piit;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestClassicsCarModels extends CommonAPI {

    @Test
    public void classics1(){
        HomePage homePage = new HomePage(driver);
        ClassicsPage classicsPage = new ClassicsPage(driver);
        SellerCenterPage sellerCenterPage = new SellerCenterPage(driver);
        SellPage sellPage = new SellPage(driver);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Classics/bn_7005623268");
        System.out.println("pages functional");
        classicsPage.clickAmcLink();
        Assert.assertEquals(getTitle(), "AMC Cars and Trucks for sale | eBay");
        goBack();driver.navigate().to("https://www.ebay.com/");driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
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
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Classics/bn_7005623268");
        System.out.println("pages functional");
        homePage.clickDailyDealsLink();goBack();
        classicsPage.clickAmcLink();
        Assert.assertEquals(getTitle(), "AMC Cars and Trucks for sale | eBay");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
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
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        System.out.println("clicks functional");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Classics/bn_7005623268");
        System.out.println("pages functional");
        homePage.clickBrandOutletLink();goBack();
        classicsPage.clickAmcLink();
        Assert.assertEquals(getTitle(), "AMC Cars and Trucks for sale | eBay");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
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
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        System.out.println("so far so good");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Classics/bn_7005623268");
        System.out.println("minor tweaks in page");
        homePage.clickHelpContactLink();goBack();
        classicsPage.clickAmcLink();
        Assert.assertEquals(getTitle(), "AMC Cars and Trucks for sale | eBay");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        classicsPage.clickAmcLink();
        classicsPage.clickauctionLink();goBack();
        classicsPage.clickbuyNowLink();goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/AMC-Cars-and-Trucks/6001/bn_24016985");
        System.out.println("buttons working");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
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
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        System.out.println("so far so good");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Classics/bn_7005623268");
        System.out.println("minor tweaks in page");
        homePage.clickHelpContactLink();goBack();
        classicsPage.clickAmcLink();
        Assert.assertEquals(getTitle(), "AMC Cars and Trucks for sale | eBay");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        classicsPage.clickAmcLink();
        classicsPage.clickauctionLink();goBack();
        classicsPage.clickbuyNowLink();goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/AMC-Cars-and-Trucks/6001/bn_24016985");
        System.out.println("buttons working");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        classicsPage.clickAmcLink();
        classicsPage.clickauctionLink();goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/AMC-Cars-and-Trucks/6001/bn_24016985");
        System.out.println("success");
    }
    @Test
    public void classics6(){
        HomePage homePage = new HomePage(driver);
        ClassicsPage classicsPage = new ClassicsPage(driver);
        CollectiblesAndArtPage collectiblesAndArtPage = new CollectiblesAndArtPage(driver);
        BrandOutletPage brandOutletPage = new BrandOutletPage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        System.out.println("so far so good");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Classics/bn_7005623268");
        System.out.println("minor tweaks in page");
        homePage.clickHelpContactLink();goBack();
        classicsPage.clickCordLink();
        Assert.assertEquals(getTitle(), "Cord Cars & Trucks for sale | eBay");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        classicsPage.clickEdselLink();
        classicsPage.clickbuyNowLink();goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Classics/bn_7005623268");
        System.out.println("buttons working");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        classicsPage.clickHudsonLink();
        classicsPage.clickbuyNowLink();goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Hudson-Cars-Trucks/6001/bn_39440003");
        System.out.println("success");
    }
    @Test
    public void classics7(){
        HomePage homePage = new HomePage(driver);
        ClassicsPage classicsPage = new ClassicsPage(driver);
        CollectiblesAndArtPage collectiblesAndArtPage = new CollectiblesAndArtPage(driver);
        BrandOutletPage brandOutletPage = new BrandOutletPage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        System.out.println("so far so good");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Classics/bn_7005623268");
        System.out.println("minor tweaks in page");
        homePage.clickHelpContactLink();goBack();
        classicsPage.clickMercuryLink();
        Assert.assertEquals(getTitle(), "Mercury Cars and Trucks for sale | eBay");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        classicsPage.clickMgLink();
        classicsPage.clickbuyNowLink();goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/MG-Cars-and-Trucks/6001/bn_24017609");
        System.out.println("buttons working");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        classicsPage.clickNashLink();
        classicsPage.clickbuyNowLink();goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Nash-Cars-and-Trucks/6001/bn_24014070");
        System.out.println("success");
    }
    @Test
    public void classics8(){
        HomePage homePage = new HomePage(driver);
        ClassicsPage classicsPage = new ClassicsPage(driver);
        CollectiblesAndArtPage collectiblesAndArtPage = new CollectiblesAndArtPage(driver);
        BrandOutletPage brandOutletPage = new BrandOutletPage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        System.out.println("so far so good");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Classics/bn_7005623268");
        System.out.println("minor tweaks in page");
        homePage.clickHelpContactLink();goBack();
        classicsPage.clickOldsmobileLink();
        Assert.assertEquals(getTitle(), "Oldsmobile Cars and Trucks for sale | eBay");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        classicsPage.clickPackardLink();
        classicsPage.clickbuyNowLink();goBack();goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Classics/bn_7005623268");
        System.out.println("buttons working");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        classicsPage.clickPlymouthLink();
        classicsPage.clickbuyNowLink();goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Plymouth-Cars-and-Trucks/6001/bn_24013099");
        System.out.println("success");
    }
    @Test
    public void classics9(){
        HomePage homePage = new HomePage(driver);
        ClassicsPage classicsPage = new ClassicsPage(driver);
        CollectiblesAndArtPage collectiblesAndArtPage = new CollectiblesAndArtPage(driver);
        BrandOutletPage brandOutletPage = new BrandOutletPage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        System.out.println("so far so good");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Classics/bn_7005623268");
        System.out.println("minor tweaks in page");
        homePage.clickHelpContactLink();goBack();
        classicsPage.clickPontiacLink();
        Assert.assertEquals(getTitle(), "Pontiac Cars and Trucks for sale | eBay");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        classicsPage.clickPackardLink();
        classicsPage.clickbuyNowLink();goBack();goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Classics/bn_7005623268");
        System.out.println("buttons working");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        classicsPage.clickPlymouthLink();
        classicsPage.clickbuyNowLink();goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Plymouth-Cars-and-Trucks/6001/bn_24013099");
        System.out.println("success");
    }
    @Test
    public void classics10(){
        HomePage homePage = new HomePage(driver);
        ClassicsPage classicsPage = new ClassicsPage(driver);
        CollectiblesAndArtPage collectiblesAndArtPage = new CollectiblesAndArtPage(driver);
        BrandOutletPage brandOutletPage = new BrandOutletPage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        System.out.println("so far so good");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Classics/bn_7005623268");
        System.out.println("minor tweaks in page");
        homePage.clickHelpContactLink();goBack();
        classicsPage.clickOldsmobileLink();
        Assert.assertEquals(getTitle(), "Oldsmobile Cars and Trucks for sale | eBay");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        classicsPage.clickPackardLink();
        classicsPage.clickbuyNowLink();goBack();goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Classics/bn_7005623268");
        System.out.println("buttons working");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.hoverMotorsLink();driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.clickClassicsLink();
        classicsPage.clickWillysLink();
        classicsPage.clickbuyNowLink();goBack();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Willys-Cars-and-Trucks/6001/bn_24010869");
        System.out.println("success");
    }
}
