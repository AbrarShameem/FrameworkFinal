package us.piit;


import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Bathroom_KitchenItemTest extends CommonAPI {
    @Test
    public void Bath_kitchenTest1() {
        HomePage homePage = new HomePage(driver);
        Bathroom_KitchenItem bathroomKitchenItem = new Bathroom_KitchenItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        bathroomKitchenItem.clickFloorMats();
        goBack();
        waitFor(3);
        driver.navigate().to("https://www.alibaba.com/");
        homePage.clickAllCategories();
        driver.navigate().to("https://www.alibaba.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/");
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
    }

    public void Bath_kitchenTest2() {
        HomePage homePage = new HomePage(driver);
        Bathroom_KitchenItem bathroomKitchenItem = new Bathroom_KitchenItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        bathroomKitchenItem.clickBathPillows();
        goBack();
        waitFor(3);
        driver.navigate().to("https://www.alibaba.com/");
        homePage.clickAllCategories();
        driver.navigate().to("https://www.alibaba.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/");
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
    }
    //@Test
    public void Bath_kitchenTest3() {
        HomePage homePage = new HomePage(driver);
        Bathroom_KitchenItem bathroomKitchenItem = new Bathroom_KitchenItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        bathroomKitchenItem.clickLuxuryBathPillow();goBack();
        bathroomKitchenItem.clickBathroomSets();goBack();
        waitFor(3);
        driver.navigate().to("https://www.alibaba.com/");
        homePage.clickAllCategories();
        driver.navigate().to("https://www.alibaba.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        System.out.println("hovers working!");
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
    }
}
