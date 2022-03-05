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
    @Test
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
    @Test
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
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/");
        System.out.println("hovers working!");
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
    }
    @Test
    public void Bath_kitchenTest4() {
        HomePage homePage = new HomePage(driver);
        Bathroom_KitchenItem bathroomKitchenItem = new Bathroom_KitchenItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        bathroomKitchenItem.clickShowerCurtain();
        goBack();
        waitFor(3);
        driver.navigate().to("https://www.alibaba.com/");
        homePage.clickAllCategories();
        driver.navigate().to("https://www.alibaba.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/");
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
    }
    @Test
    public void Bath_kitchenTest5() {
        HomePage homePage = new HomePage(driver);
        Bathroom_KitchenItem bathroomKitchenItem = new Bathroom_KitchenItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        bathroomKitchenItem.clickBasins();
        goBack();
        waitFor(3);
        driver.navigate().to("https://www.alibaba.com/");
        homePage.clickAllCategories();
        driver.navigate().to("https://www.alibaba.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/");
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
    }
    @Test
    public void Bath_kitchenTest6() {
        HomePage homePage = new HomePage(driver);
        Bathroom_KitchenItem bathroomKitchenItem = new Bathroom_KitchenItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        bathroomKitchenItem.clickLuxuryBathPillow();goBack();
        bathroomKitchenItem.clickBathPillows();goBack();
        waitFor(3);
        driver.navigate().to("https://www.alibaba.com/");
        homePage.clickAllCategories();
        driver.navigate().to("https://www.alibaba.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/");
        System.out.println("hovers working!");
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
    }
    @Test
    public void Bath_kitchenTest7() {
        HomePage homePage = new HomePage(driver);
        Bathroom_KitchenItem bathroomKitchenItem = new Bathroom_KitchenItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        bathroomKitchenItem.clickBathroomProduct();
        bathroomKitchenItem.clickWashTubs();
        goBack();
        waitFor(3);
        driver.navigate().to("https://www.alibaba.com/");
        homePage.clickAllCategories();
        driver.navigate().to("https://www.alibaba.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/");
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
    }
    @Test
    public void Bath_kitchenTest8() {
        HomePage homePage = new HomePage(driver);
        Bathroom_KitchenItem bathroomKitchenItem = new Bathroom_KitchenItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        bathroomKitchenItem.clickHomeAndGarden();
        bathroomKitchenItem.clickBathroomProduct();
        Assert.assertEquals(getTitle(), "");
        bathroomKitchenItem.clickMatSets();
        goBack();
        waitFor(3);
        driver.navigate().to("https://www.alibaba.com/");
        homePage.clickAllCategories();
        driver.navigate().to("https://www.alibaba.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/");
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
    }
    @Test
    public void Bath_kitchenTest9() {
        HomePage homePage = new HomePage(driver);
        Bathroom_KitchenItem bathroomKitchenItem = new Bathroom_KitchenItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        bathroomKitchenItem.clickHomeAndGarden();
        Assert.assertEquals(getTitle(), "");
        bathroomKitchenItem.clickBathroomProduct();
        Assert.assertEquals(getTitle(), "");
        bathroomKitchenItem.clickBathMats();
        waitFor(3);
        driver.navigate().to("https://www.alibaba.com/");
        homePage.clickAllCategories();
        driver.navigate().to("https://www.alibaba.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/");
        System.out.println("hovers working!");
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
    }
}
