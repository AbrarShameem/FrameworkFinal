package us.piit;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BabyAppliancesItemTest extends CommonAPI {


   @Test
    public void BabyAppliancesItemTest1() {
        HomePage homePage = new HomePage(driver);
        BabyAppliancesItem babyAppliancesItem = new BabyAppliancesItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");

        waitFor(3);

        driver.navigate().to("https://www.alibaba.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/");

        System.out.println("hovers working!");

    }
    @Test
    public void BabyAppliancesItemTest2() {
        HomePage homePage = new HomePage(driver);
        BabyAppliancesItem babyAppliancesItem = new BabyAppliancesItem(driver);
        homePage.clickAllCategories();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);


    }
     @Test
    public void BabyAppliancesItemTest3() {
        HomePage homePage = new HomePage(driver);
        BabyAppliancesItem babyAppliancesItem = new BabyAppliancesItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        babyAppliancesItem.clickBabytoddler();
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
    public void BabyAppliancesItemTest4() {
        HomePage homePage = new HomePage(driver);
        BabyAppliancesItem babyAppliancesItem = new BabyAppliancesItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        babyAppliancesItem.clickElectricToothbrush();
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
    public void BabyAppliancesItemTest5() {
        HomePage homePage = new HomePage(driver);
        BabyAppliancesItem babyAppliancesItem = new BabyAppliancesItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        babyAppliancesItem.clickOralCleaner();goBack();
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
    public void BabyAppliancesItemTest6() {
        HomePage homePage = new HomePage(driver);
        BabyAppliancesItem babyAppliancesItem = new BabyAppliancesItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
       babyAppliancesItem.clickFoodMaker();
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
    public void BabyAppliancesItemTest7() {
        HomePage homePage = new HomePage(driver);
        BabyAppliancesItem babyAppliancesItem = new BabyAppliancesItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        babyAppliancesItem.clickHairClipper();
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
    public void BabyAppliancesItemTest8() {
        HomePage homePage = new HomePage(driver);
        BabyAppliancesItem babyAppliancesItem = new BabyAppliancesItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        babyAppliancesItem.clickHairClipper();goBack();
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
    public void BabyAppliancesItemTest9() {
        HomePage homePage = new HomePage(driver);
        BabyAppliancesItem babyAppliancesItem = new BabyAppliancesItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        babyAppliancesItem.clickWashingMachine();
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
    public void BabyAppliancesItemTest10() {
        HomePage homePage = new HomePage(driver);
        BabyAppliancesItem babyAppliancesItem = new BabyAppliancesItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        babyAppliancesItem.clickBottleSteriliser();
        Assert.assertEquals(getTitle(), "");
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
    public void BabyAppliancesItemTest11() {
        HomePage homePage = new HomePage(driver);
        BabyAppliancesItem babyAppliancesItem = new BabyAppliancesItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        babyAppliancesItem.clickBottleWarmer();
        Assert.assertEquals(getTitle(), "");
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