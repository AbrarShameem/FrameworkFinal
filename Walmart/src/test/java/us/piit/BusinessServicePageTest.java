package us.piit;

import base.CommonAPI;

        import base.CommonAPI;
        import org.openqa.selenium.support.PageFactory;
        import org.testng.Assert;
        import org.testng.annotations.Test;


public class BusinessServicePageTest extends CommonAPI {

     @Test
    public void BusinessServicePageTest1() {
        HomePage homePage = new HomePage(driver);
        BusinessServicePage businessServicePage = new BusinessServicePage(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");

        waitFor(3);

        driver.navigate().to("https://www.alibaba.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/");

        System.out.println("hovers working!");

    }
     @Test
    public void BusinessServicePageTest2() {
        HomePage homePage = new HomePage(driver);
        BusinessServicePage businessServicePage = new BusinessServicePage(driver);
        homePage.clickAllCategories();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);


    }
     @Test
    public void BusinessServicePageTest3() {
        HomePage homePage = new HomePage(driver);
        BusinessServicePage businessServicePage = new BusinessServicePage(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        businessServicePage.clickBusinessService();
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
    public void BusinessServicePageTest4() {
        HomePage homePage = new HomePage(driver);
        BusinessServicePage businessServicePage = new BusinessServicePage(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        businessServicePage.clickAdvertising();
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
    public void BusinessServicePageTest5() {
        HomePage homePage = new HomePage(driver);
        BusinessServicePage businessServicePage = new BusinessServicePage(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        businessServicePage.clickInternetAdvertising();
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
    public void BusinessServicePageTest6() {
        HomePage homePage = new HomePage(driver);
        BusinessServicePage businessServicePage = new BusinessServicePage(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        businessServicePage.clickMagazineAdvertising();
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
    public void BusinessServicePageTest7() {
        HomePage homePage = new HomePage(driver);
        BusinessServicePage businessServicePage = new BusinessServicePage(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        businessServicePage.clickOutdoorAdvertising();
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
    public void BusinessServicePageTest8() {
        HomePage homePage = new HomePage(driver);
        BusinessServicePage businessServicePage = new BusinessServicePage(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        businessServicePage.clickAgencyService();
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
    public void BusinessServicePageTest9() {
        HomePage homePage = new HomePage(driver);
        BusinessServicePage businessServicePage = new BusinessServicePage(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        businessServicePage.clickAdvertisingAgent();
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
    public void BusinessServicePageTest10() {
        HomePage homePage = new HomePage(driver);
        BusinessServicePage businessServicePage = new BusinessServicePage(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        businessServicePage.clickAssuranceServices();
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
    public void BusinessServicePageTest11() {
        HomePage homePage = new HomePage(driver);
        BusinessServicePage businessServicePage = new BusinessServicePage(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");
        businessServicePage.clickAuction();
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