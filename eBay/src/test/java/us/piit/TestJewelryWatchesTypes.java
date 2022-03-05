package us.piit;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestJewelryWatchesTypes extends CommonAPI {

    @Test
    public void jewelry1(){
        HomePage homePage = new HomePage(driver);
        JewelryAndWatchesPage jewelryAndWatchesPage = new JewelryAndWatchesPage(driver);
        homePage.clickJewelryAndWatcheslink();
        Assert.assertEquals(getTitle(), "Jewelry & Watches for sale | eBay");
        jewelryAndWatchesPage.clickshopAllJewelryLink();goBack();
        jewelryAndWatchesPage.clickfineJewelryLink();
        System.out.println("fine jewelry executing");
        jewelryAndWatchesPage.clickfineJewelryLink();
        Assert.assertEquals(getTitle(), "Jewelry & Watches for sale | eBay");
        jewelryAndWatchesPage.clickfashionJewelryLink();
        System.out.println("fashion jewelry active");
        jewelryAndWatchesPage.clickfashionJewelryLink();
        jewelryAndWatchesPage.clickshopAllJewelryLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Jewelry/bn_7000259126");goBack();
        jewelryAndWatchesPage.clickvintageAntiqueJewelryLink();goBack();
        jewelryAndWatchesPage.clickengagementWeddingJewelryLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Engagement-Wedding-Jewelry/91427/bn_1309172");goBack();
        jewelryAndWatchesPage.clickethnicRegionalTribalJewelryLink();goBack();
        jewelryAndWatchesPage.clickmensJewelryLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Mens-Jewelry/10290/bn_1639112");goBack();
    }
    @Test
    public void jewelry2(){
        HomePage homePage = new HomePage(driver);
        JewelryAndWatchesPage jewelryAndWatchesPage = new JewelryAndWatchesPage(driver);
        homePage.clickJewelryAndWatcheslink();
        Assert.assertEquals(getTitle(), "Jewelry & Watches for sale | eBay");
        jewelryAndWatchesPage.clickshopAllJewelryLink();goBack();
        jewelryAndWatchesPage.clickfineJewelryLink();
        System.out.println("fine jewelry executing");
        jewelryAndWatchesPage.clickfineJewelryLink();
        Assert.assertEquals(getTitle(), "Jewelry & Watches for sale | eBay");
        jewelryAndWatchesPage.clickfashionJewelryLink();
        System.out.println("fashion jewelry active");
        jewelryAndWatchesPage.clickfashionJewelryLink();
        jewelryAndWatchesPage.clickshopAllJewelryLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Jewelry/bn_7000259126");goBack();
        jewelryAndWatchesPage.clickvintageAntiqueJewelryLink();goBack();
        jewelryAndWatchesPage.clickengagementWeddingJewelryLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Engagement-Wedding-Jewelry/91427/bn_1309172");goBack();
        jewelryAndWatchesPage.clickethnicRegionalTribalJewelryLink();goBack();
        jewelryAndWatchesPage.clickmensJewelryLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Mens-Jewelry/10290/bn_1639112");goBack();
        jewelryAndWatchesPage.clickhandcraftedArtisanJewelryLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Handcrafted-Artisan-Jewelry/110633/bn_7208227");goBack();
        jewelryAndWatchesPage.clickchildrensJewelryLink();
        goBack();
        jewelryAndWatchesPage.clickbodyJewelryLink();goBack();
        jewelryAndWatchesPage.clicklooseBeadsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Loose-Beads/261997/bn_55103247");goBack();
        jewelryAndWatchesPage.clicklooseDiamondsGemstonesLink();goBack();
        jewelryAndWatchesPage.clickjewelryCareDesignRepairLink();
    }
}
