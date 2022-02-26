package us.piit;

import base.CommonAPI;
import org.testng.Assert;

import base.CommonAPI;

        import base.CommonAPI;
        import org.openqa.selenium.support.PageFactory;
        import org.testng.Assert;
        import org.testng.annotations.Test;


public class CommercialFurnitureItemTest extends CommonAPI {

    //  @Test
    public void CommercialFurnitureItemTest1() {
        HomePage homePage = new HomePage(driver);
        CommercialFurnitureItem commercialFurnitureItem = new CommercialFurnitureItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");

        waitFor(3);

        driver.navigate().to("https://www.alibaba.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/");

        System.out.println("hovers working!");

    }

    //  @Test
    public void CommercialFurnitureItemTest2() {
        HomePage homePage = new HomePage(driver);
        CommercialFurnitureItem commercialFurnitureItem = new CommercialFurnitureItem(driver);
        homePage.clickAllCategories();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);


    }

    // @Test
    public void CommercialFurnitureItemTest3() {
        HomePage homePage = new HomePage(driver);
        CommercialFurnitureItem commercialFurnitureItem = new CommercialFurnitureItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        commercialFurnitureItem.clickFurniture();
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
    public void CommercialFurnitureItemTest4() {
        HomePage homePage = new HomePage(driver);
        CommercialFurnitureItem commercialFurnitureItem = new CommercialFurnitureItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        commercialFurnitureItem.clickCommercialFurniture();
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
    public void CommercialFurnitureItemTest5() {
        HomePage homePage = new HomePage(driver);
        CommercialFurnitureItem commercialFurnitureItem = new CommercialFurnitureItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        commercialFurnitureItem.clickCommercialFurniture();
        waitFor(3);
        driver.navigate().to("https://www.alibaba.com/");
        homePage.clickAllCategories();
        driver.navigate().to("https://www.alibaba.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/");
        System.out.println("hovers working!");
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
    }

    // @Test
    public void CommercialFurnitureItemTest6() {
        HomePage homePage = new HomePage(driver);
        CommercialFurnitureItem commercialFurnitureItem = new CommercialFurnitureItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        commercialFurnitureItem.clickOfficeFurniture();
        goBack();
        waitFor(3);
        driver.navigate().to("https://www.alibaba.com/");
        homePage.clickAllCategories();
        driver.navigate().to("https://www.alibaba.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/");
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
    }

    // @Test
    public void CommercialFurnitureItemTest7() {
        HomePage homePage = new HomePage(driver);
        CommercialFurnitureItem commercialFurnitureItem = new CommercialFurnitureItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        commercialFurnitureItem.clickComputerTable();
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
    public void CommercialFurnitureItemTest8() {
        HomePage homePage = new HomePage(driver);
        CommercialFurnitureItem commercialFurnitureItem = new CommercialFurnitureItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        commercialFurnitureItem.clickCabinet();
        waitFor(3);
        driver.navigate().to("https://www.alibaba.com/");
        homePage.clickAllCategories();
        driver.navigate().to("https://www.alibaba.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/");
        System.out.println("hovers working!");
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
    }

    //@Test
    public void CommercialFurnitureItemTest9() {
        HomePage homePage = new HomePage(driver);
        CommercialFurnitureItem commercialFurnitureItem = new CommercialFurnitureItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        commercialFurnitureItem.clickBossChair();
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
    public void CommercialFurnitureItemTest10() {
        HomePage homePage = new HomePage(driver);
        CommercialFurnitureItem commercialFurnitureItem = new CommercialFurnitureItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        commercialFurnitureItem.clickLaptopTable();
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

    //@Test
    public void CommercialFurnitureItemTest11() {
        HomePage homePage = new HomePage(driver);
        CommercialFurnitureItem commercialFurnitureItem = new CommercialFurnitureItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        commercialFurnitureItem.clickDesk();
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

