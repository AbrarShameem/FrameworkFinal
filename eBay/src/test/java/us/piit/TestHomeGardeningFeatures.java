package us.piit;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHomeGardeningFeatures extends CommonAPI {

    @Test
    public void homeGarden1(){
        HomePage homePage = new HomePage(driver);
        HomeAndGardenPage homeAndGardenPage = new HomeAndGardenPage(driver);
        homePage.clickHomeAndGardenLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Home-Garden/11700/bn_1853126");
        homeAndGardenPage.clickbabyGearLink();
        homeAndGardenPage.clickbathLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Home-Garden/11700/bn_1853126");
        homeAndGardenPage.clickbeddingLink();
        homeAndGardenPage.clickcraftsLink();
        homeAndGardenPage.clickbeddingLink();
        homeAndGardenPage.clickcraftsLink();
        Assert.assertEquals(getTitle(), "Home & Garden products for sale | eBay");
        driver.navigate().to("https://www.ebay.com/");
        homePage.clickHomeAndGardenLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Home-Garden/11700/bn_1853126");
        homeAndGardenPage.clickbabyGearLink();
        homeAndGardenPage.clickbathLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Home-Garden/11700/bn_1853126");
        homeAndGardenPage.clickbeddingLink();
        homeAndGardenPage.clickcraftsLink();
        Assert.assertEquals(getTitle(), "Home & Garden products for sale | eBay");
    }
    @Test
    public void homeGarden2(){
        HomePage homePage = new HomePage(driver);
        HomeAndGardenPage homeAndGardenPage = new HomeAndGardenPage(driver);
        homePage.clickHomeAndGardenLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Home-Garden/11700/bn_1853126");
        homeAndGardenPage.clickbabyGearLink();
        homeAndGardenPage.clickbathLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Home-Garden/11700/bn_1853126");
        homeAndGardenPage.clickbeddingLink();
        homeAndGardenPage.clickcraftsLink();
        homeAndGardenPage.clickfoodAndBeveragesLink();
        homeAndGardenPage.clickfurnitureLink();
        homeAndGardenPage.clickhomeDecorLink();
        homeAndGardenPage.clickhomeImprovementLink();
        Assert.assertEquals(getTitle(), "Home & Garden products for sale | eBay");
        driver.navigate().to("https://www.ebay.com/");
        homePage.clickHomeAndGardenLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Home-Garden/11700/bn_1853126");
        homeAndGardenPage.clickbabyGearLink();
        homeAndGardenPage.clickbathLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Home-Garden/11700/bn_1853126");
        homeAndGardenPage.clickfoodAndBeveragesLink();
        homeAndGardenPage.clickfurnitureLink();
        homeAndGardenPage.clickhomeDecorLink();
        homeAndGardenPage.clickhomeImprovementLink();
        Assert.assertEquals(getTitle(), "Home & Garden products for sale | eBay");
    }
    @Test
    public void homeGarden3(){
        HomePage homePage = new HomePage(driver);
        HomeAndGardenPage homeAndGardenPage = new HomeAndGardenPage(driver);
        homePage.clickHomeAndGardenLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Home-Garden/11700/bn_1853126");
        homeAndGardenPage.clickbabyGearLink();
        homeAndGardenPage.clickbathLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Home-Garden/11700/bn_1853126");
        homeAndGardenPage.clickbeddingLink();
        homeAndGardenPage.clickcraftsLink();
        homeAndGardenPage.clickpetSuppliesLink();
        homeAndGardenPage.clickfurnitureLink();
        homeAndGardenPage.clickhomeDecorLink();
        homeAndGardenPage.clickhomeImprovementLink();
        Assert.assertEquals(getTitle(), "Home & Garden products for sale | eBay");
        driver.navigate().to("https://www.ebay.com/");
        homePage.clickHomeAndGardenLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Home-Garden/11700/bn_1853126");
        homeAndGardenPage.clickbabyGearLink();
        homeAndGardenPage.clickbathLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Home-Garden/11700/bn_1853126");
        homeAndGardenPage.clickhousekeepingAndOrganizationLink();
        homeAndGardenPage.clickmajorAppliancesLink();
        homeAndGardenPage.clickhomeDecorLink();
        homeAndGardenPage.clickhomeImprovementLink();
        Assert.assertEquals(getTitle(), "Home & Garden products for sale | eBay");
    }
    @Test
    public void homeGarden4(){
        HomePage homePage = new HomePage(driver);
        HomeAndGardenPage homeAndGardenPage = new HomeAndGardenPage(driver);
        homePage.clickHomeAndGardenLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Home-Garden/11700/bn_1853126");
        homeAndGardenPage.clickwineLink();
        homeAndGardenPage.clickkitchenDiningAndBarLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Home-Garden/11700/bn_1853126");
        homeAndGardenPage.clickbeddingLink();
        homeAndGardenPage.clickcraftsLink();
        homeAndGardenPage.clickpetSuppliesLink();
        homeAndGardenPage.clickfurnitureLink();
        homeAndGardenPage.clickhomeDecorLink();
        homeAndGardenPage.clickhomeImprovementLink();
        Assert.assertEquals(getTitle(), "Home & Garden products for sale | eBay");
        driver.navigate().to("https://www.ebay.com/");
        homePage.clickHomeAndGardenLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Home-Garden/11700/bn_1853126");
        homeAndGardenPage.clickbabyGearLink();
        homeAndGardenPage.clickbathLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Home-Garden/11700/bn_1853126");
        homeAndGardenPage.clickhousekeepingAndOrganizationLink();
        homeAndGardenPage.clickmajorAppliancesLink();
        homeAndGardenPage.clickhomeDecorLink();
        homeAndGardenPage.clickhomeImprovementLink();
        Assert.assertEquals(getTitle(), "Home & Garden products for sale | eBay");
    }
}
