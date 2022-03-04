package us.piit;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCollectiblesAndArtOffers extends CommonAPI {

    @Test
    public void collectibles1(){
        HomePage homePage = new HomePage(driver);
        CollectiblesAndArtPage collectiblesAndArtPage = new CollectiblesAndArtPage(driver);
        homePage.clickCollectiblesAndArtLink();
        Assert.assertEquals(getTitle(), "Collectibles & Art products for sale | eBay");
        collectiblesAndArtPage.clickvintageAntiqueJewelryLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Vintage-Antique-Jewelry/262024/bn_16565712");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickCollectiblesAndArtLink();
        Assert.assertEquals(getTitle(), "Collectibles & Art products for sale | eBay");
        collectiblesAndArtPage.clicksportsMemorabiliaLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Sports-Memorabilia-Fan-Shop-Sports-Cards/64482/bn_1857919");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickCollectiblesAndArtLink();
        collectiblesAndArtPage.clickstampsLink();
        Assert.assertEquals(getTitle(), "Stamps for sale | eBay");
    }
    @Test
    public void collectibles2(){
        HomePage homePage = new HomePage(driver);
        CollectiblesAndArtPage collectiblesAndArtPage = new CollectiblesAndArtPage(driver);
        homePage.clickCollectiblesAndArtLink();
        Assert.assertEquals(getTitle(), "Collectibles & Art products for sale | eBay");
        collectiblesAndArtPage.clickdollsTeddyBearsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Dolls-Teddy-Bears/237/bn_1865477");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickCollectiblesAndArtLink();
        Assert.assertEquals(getTitle(), "Collectibles & Art products for sale | eBay");
        collectiblesAndArtPage.clickartLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Art/550/bn_1853728");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickCollectiblesAndArtLink();
        collectiblesAndArtPage.clickantiquesLink();
        Assert.assertEquals(getTitle(), "Antiques for sale | eBay");
    }
    @Test
    public void collectibles3(){
        HomePage homePage = new HomePage(driver);
        CollectiblesAndArtPage collectiblesAndArtPage = new CollectiblesAndArtPage(driver);
        homePage.clickCollectiblesAndArtLink();
        System.out.println("First attempt");
        Assert.assertEquals(getTitle(), "Collectibles & Art products for sale | eBay");
        collectiblesAndArtPage.clickartsCraftsSuppliesLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Art-Craft-Supplies/14339/bn_1851051");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickCollectiblesAndArtLink();
        Assert.assertEquals(getTitle(), "Collectibles & Art products for sale | eBay");
        collectiblesAndArtPage.clickcoinsAndPaperMoneyLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Coins-Paper-Money/11116/bn_1857806");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickCollectiblesAndArtLink();
        collectiblesAndArtPage.clickcollectiblesLink();
        Assert.assertEquals(getTitle(), "Collectibles for sale | eBay");
    }
    @Test
    public void collectibles4(){
        HomePage homePage = new HomePage(driver);
        CollectiblesAndArtPage collectiblesAndArtPage = new CollectiblesAndArtPage(driver);
        homePage.clickCollectiblesAndArtLink();
        System.out.println("First attempt");
        Assert.assertEquals(getTitle(), "Collectibles & Art products for sale | eBay");
        collectiblesAndArtPage.clickentertainmentMemorabiliaLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Entertainment-Memorabilia/45100/bn_1859756");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickCollectiblesAndArtLink();
        Assert.assertEquals(getTitle(), "Collectibles & Art products for sale | eBay");
        collectiblesAndArtPage.clickpotteryAndGlassLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Pottery-Glass/870/bn_1851615");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickCollectiblesAndArtLink();
        collectiblesAndArtPage.clickbullionLink();
        Assert.assertEquals(getTitle(), "Bullion for Sale - eBay");
    }
    @Test
    public void collectibles5(){
        HomePage homePage = new HomePage(driver);
        CollectiblesAndArtPage collectiblesAndArtPage = new CollectiblesAndArtPage(driver);
        homePage.clickCollectiblesAndArtLink();
        Assert.assertEquals(getTitle(), "Collectibles & Art products for sale | eBay");
        collectiblesAndArtPage.clickdollsTeddyBearsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Dolls-Teddy-Bears/237/bn_1865477");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickCollectiblesAndArtLink();
        Assert.assertEquals(getTitle(), "Collectibles & Art products for sale | eBay");
        collectiblesAndArtPage.clickartLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Art/550/bn_1853728");
        goBack();driver.navigate().to("https://www.ebay.com/");
        homePage.clickCollectiblesAndArtLink();
        collectiblesAndArtPage.clickantiquesLink();
        Assert.assertEquals(getTitle(), "Antiques for sale | eBay");
    }
}
