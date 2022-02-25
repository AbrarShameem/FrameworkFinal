package us.piit;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCareers extends CommonAPI {

    //@Test
    public void careerTest1() {
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);
        homePage.clickCareersLink();
        Assert.assertEquals(getTitle(), "Find Your Dream Job - eBay Inc. Careers");
        careersPage.clickourJobsLink();goBack();
        careersPage.searchBarQuery();goBack();
        waitFor(3);
        driver.navigate().to("https://www.ebay.com/");
        homePage.clickCareersLink();
        careersPage.clickhowWeHireLink();
        driver.navigate().to("https://www.ebay.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.hoverEbayRefurbishedLink();
        homePage.hoverElectronicsLink();
        homePage.hoverJewelryAndWatcheslink();
        System.out.println("hovers working!");
        homePage.clickCareersLink();
        Assert.assertEquals(getTitle(), "Find Your Dream Job - eBay Inc. Careers");
    }
    //@Test
    public void careerTest2() {
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);
        homePage.clickCareersLink();
        Assert.assertEquals(getTitle(), "Find Your Dream Job - eBay Inc. Careers");
        careersPage.clickjobsByCategoryLink();goBack();
        careersPage.searchBarQuery();goBack();
        waitFor(3);
        driver.navigate().to("https://www.ebay.com/");
        homePage.clickCareersLink();
        careersPage.clickstudentsRecentGradsLink();
        driver.navigate().to("https://www.ebay.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.hoverEbayRefurbishedLink();
        homePage.hoverElectronicsLink();
        homePage.hoverJewelryAndWatcheslink();
        System.out.println("hovers working!");
        homePage.clickCareersLink();
        Assert.assertEquals(getTitle(), "Find Your Dream Job - eBay Inc. Careers");
    }
    //@Test
    public void careerTest3() {
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);
        homePage.clickCareersLink();
        Assert.assertEquals(getTitle(), "Find Your Dream Job - eBay Inc. Careers");
        careersPage.clickcontactUsLink();goBack();
        careersPage.clickPressRoomLink();goBack();
        waitFor(3);
        driver.navigate().to("https://www.ebay.com/");
        homePage.clickCareersLink();
        careersPage.clickstudentsRecentGradsLink();
        driver.navigate().to("https://www.ebay.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.hoverEbayRefurbishedLink();
        homePage.hoverElectronicsLink();
        homePage.hoverJewelryAndWatcheslink();
        System.out.println("hovers working!");
        homePage.clickCareersLink();
        Assert.assertEquals(getTitle(), "Find Your Dream Job - eBay Inc. Careers");
    }
    //@Test
    public void careerTest4() {
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);
        homePage.clickCareersLink();
        Assert.assertEquals(getTitle(), "Find Your Dream Job - eBay Inc. Careers");
        careersPage.clickjobsByLocationLink();goBack();
        careersPage.clickengineeringCareersLink();goBack();
        waitFor(3);
        driver.navigate().to("https://www.ebay.com/");
        homePage.clickCareersLink();
        careersPage.clickstudentsRecentGradsLink();
        driver.navigate().to("https://www.ebay.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.hoverEbayRefurbishedLink();
        homePage.hoverElectronicsLink();
        homePage.hoverJewelryAndWatcheslink();
        System.out.println("hovers working!");
        homePage.clickCareersLink();
        Assert.assertEquals(getTitle(), "Find Your Dream Job - eBay Inc. Careers");
    }
    //@Test
    public void careerTest5() {
        HomePage homePage = new HomePage(driver);
        CareersPage careersPage = new CareersPage(driver);
        homePage.clickCareersLink();
        Assert.assertEquals(getTitle(), "Find Your Dream Job - eBay Inc. Careers");
        careersPage.clickjobsByLocationLink();goBack();
        careersPage.clickengineeringCareersLink();goBack();
        waitFor(3);
        driver.navigate().to("https://www.ebay.com/");
        homePage.clickCareersLink();
        careersPage.clickengineeringCareersLink();goBack();
        careersPage.clickstudentsRecentGradsLink();
        driver.navigate().to("https://www.ebay.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        homePage.hoverEbayRefurbishedLink();
        homePage.hoverElectronicsLink();
        homePage.hoverJewelryAndWatcheslink();
        System.out.println("hovers working!");
        homePage.clickCareersLink();
        Assert.assertEquals(getTitle(), "Find Your Dream Job - eBay Inc. Careers");
        careersPage.clickviewOpenPositionsLink();goBack();
        careersPage.clickengineeringCareersLink();goBack();
    }
}
