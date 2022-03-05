package us.piit;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSportingGoodsWear extends CommonAPI {

    @Test
    public void sportingGoods1(){
        HomePage homePage = new HomePage(driver);
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(driver);
        homePage.clickSportingGoodsLink();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.ebay.com/b/Sporting-Goods/888/bn_1865031");
        sportingGoodsPage.clickgolfClubsLink();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.ebay.com/b/Golf-Clubs/115280/bn_7244234");
        goBack();sportingGoodsPage.clickelectricBikesLink();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.ebay.com/b/Electric-Bikes/74469/bn_1968968");
        goBack();
        sportingGoodsPage.clickcampingAndHikingLink();
        driver.navigate().to("https://www.ebay.com/");
        homePage.clickSportingGoodsLink();
        sportingGoodsPage.clickhuntingEquipmentLink();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.ebay.com/b/Hunting-Equipment/7301/bn_1865054");goBack();
        homePage.clickLogoLink();
        homePage.clickSportingGoodsLink();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.ebay.com/b/Sporting-Goods/888/bn_1865031");
        sportingGoodsPage.clickgolfClubsLink();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.ebay.com/b/Golf-Clubs/115280/bn_7244234");
        goBack();sportingGoodsPage.clickelectricBikesLink();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.ebay.com/b/Electric-Bikes/74469/bn_1968968");
        goBack();sportingGoodsPage.clickcampingAndHikingLink();goBack();
    }
    @Test
    public void sportingGoods2() {
        HomePage homePage = new HomePage(driver);
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(driver);
        homePage.clickSportingGoodsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Sporting-Goods/888/bn_1865031");
        sportingGoodsPage.clickcampingHikingEquipmentLink();
        goBack();
        sportingGoodsPage.clickcampingAndHikingLink();
        sportingGoodsPage.clickcampingAndHikingLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Sporting-Goods/888/bn_1865031");
        sportingGoodsPage.clickboxingMartialArtsMMALink();
        sportingGoodsPage.clickboxingMartialArtsMMALink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Sporting-Goods/888/bn_1865031");
        System.out.println("Here for your sporting goods needs");
        System.out.println("https://www.ebay.com/b/Sporting-Goods/888/bn_1865031");
        sportingGoodsPage.clickcyclingLink();
        sportingGoodsPage.clickfishingLink();
        Assert.assertEquals(getTitle(), "Sporting Goods for sale | eBay");
    }
    @Test
    public void sportingGoods3() {
        HomePage homePage = new HomePage(driver);
        SportingGoodsPage sportingGoodsPage = new SportingGoodsPage(driver);
        homePage.clickSportingGoodsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Sporting-Goods/888/bn_1865031");
        sportingGoodsPage.clickcampingHikingEquipmentLink();
        goBack();
        sportingGoodsPage.clickcampingAndHikingLink();
        sportingGoodsPage.clickcampingAndHikingLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Sporting-Goods/888/bn_1865031");
        sportingGoodsPage.clickboxingMartialArtsMMALink();
        sportingGoodsPage.clickboxingMartialArtsMMALink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Sporting-Goods/888/bn_1865031");
        System.out.println("Here for your sporting goods needs");
        System.out.println("https://www.ebay.com/b/Sporting-Goods/888/bn_1865031");
        sportingGoodsPage.clickcyclingLink();
        sportingGoodsPage.clickfishingLink();
        Assert.assertEquals(getTitle(), "Sporting Goods for sale | eBay");
        sportingGoodsPage.clickfitnessRunningYogaLink();
        sportingGoodsPage.clickgolfLink();
        sportingGoodsPage.clickhuntingLink();
        sportingGoodsPage.clickindoorGamesLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Sporting-Goods/888/bn_1865031");

    }
}
