package us.piit;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestHeaderPages extends CommonAPI {


    @Test
    public void headerPages1() {
        HomePage homePage = new HomePage(driver);
        ElectronicsPage electronicsPage = new ElectronicsPage(driver);
        homePage.clickElectronicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electronics/bn_7000259124");
        electronicsPage.clickCarElectronicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Vehicle-Electronics/3270/bn_887004");
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        electronicsPage.clickCamerasAndPhotoLink();
        Assert.assertEquals(getTitle(), "Electronics products for sale | eBay");
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electronics/bn_7000259124");
    }
    @Test
    public void headerPages2() {
        HomePage homePage = new HomePage(driver);
        ElectronicsPage electronicsPage = new ElectronicsPage(driver);
        homePage.clickElectronicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electronics/bn_7000259124");
        electronicsPage.clickPortableAudioLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Portable-Audio/15052/bn_1642614");
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        electronicsPage.clickVideoPCGamingLink();
        Assert.assertEquals(getTitle(), "Electronics products for sale | eBay");
        click(homePage.logoLink);
        waitFor(3);
        homePage.clickElectronicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electronics/bn_7000259124");
        System.out.println("Passed");
    }
    @Test
    public void headerPages3() {
        HomePage homePage = new HomePage(driver);
        ElectronicsPage electronicsPage = new ElectronicsPage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        homePage.clickElectronicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electronics/bn_7000259124");
        electronicsPage.clickPortableAudioLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Portable-Audio/15052/bn_1642614");
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        electronicsPage.clickTvVideoLink();
        electronicsPage.clickTvVideoLink();
        electronicsPage.clickComputersTabletsLink();
        Assert.assertEquals(getTitle(), "Electronics products for sale | eBay");
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electronics/bn_7000259124");
        System.out.println("Passed once more");
    }
    @Test
    public void headerPages4() {
        HomePage homePage = new HomePage(driver);
        ElectronicsPage electronicsPage = new ElectronicsPage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        homePage.clickElectronicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electronics/bn_7000259124");
        electronicsPage.clickPortableAudioLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Portable-Audio/15052/bn_1642614");
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        electronicsPage.clickTvVideoLink();
        electronicsPage.clickTvVideoLink();
        waitFor(2);
        electronicsPage.clickCellphonesLink();
        electronicsPage.clickComputersTabletsLink();
        Assert.assertEquals(getTitle(), "Electronics products for sale | eBay");
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        electronicsPage.clickTvVideoLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electronics/bn_7000259124");
        System.out.println("Passed once more");
    }
    @Test
    public void headerPages5() {
        HomePage homePage = new HomePage(driver);
        ElectronicsPage electronicsPage = new ElectronicsPage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        homePage.clickElectronicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electronics/bn_7000259124");
        electronicsPage.clickPortableAudioLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Portable-Audio/15052/bn_1642614");
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        electronicsPage.clickTvVideoLink();
        electronicsPage.clickTvVideoLink();
        waitFor(2);
        electronicsPage.clickHomeSurveillanceLink();
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        electronicsPage.clickSmartHomeLink();
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        electronicsPage.clickCellphonesLink();
        electronicsPage.clickComputersTabletsLink();
        Assert.assertEquals(getTitle(), "Electronics products for sale | eBay");
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        electronicsPage.clickTvVideoLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electronics/bn_7000259124");
        System.out.println("Passed once more");
    }
    @Test
    public void headerPages6() {
        HomePage homePage = new HomePage(driver);
        ElectronicsPage electronicsPage = new ElectronicsPage(driver);
        homePage.clickElectronicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electronics/bn_7000259124");
        electronicsPage.clickCarElectronicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Vehicle-Electronics/3270/bn_887004");
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        electronicsPage.clickCamerasAndPhotoLink();
        Assert.assertEquals(getTitle(), "Electronics products for sale | eBay");
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electronics/bn_7000259124");
    }
    @Test
    public void headerPages7() {
        HomePage homePage = new HomePage(driver);
        ElectronicsPage electronicsPage = new ElectronicsPage(driver);
        homePage.clickElectronicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electronics/bn_7000259124");
        electronicsPage.clickPortableAudioLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Portable-Audio/15052/bn_1642614");
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        electronicsPage.clickVideoPCGamingLink();
        Assert.assertEquals(getTitle(), "Electronics products for sale | eBay");
        click(homePage.logoLink);
        waitFor(3);
        homePage.clickElectronicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electronics/bn_7000259124");
        System.out.println("Passed");
    }
    @Test
    public void headerPages8() {
        HomePage homePage = new HomePage(driver);
        ElectronicsPage electronicsPage = new ElectronicsPage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        homePage.clickElectronicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electronics/bn_7000259124");
        electronicsPage.clickPortableAudioLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Portable-Audio/15052/bn_1642614");
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        electronicsPage.clickTvVideoLink();
        electronicsPage.clickTvVideoLink();
        electronicsPage.clickComputersTabletsLink();
        Assert.assertEquals(getTitle(), "Electronics products for sale | eBay");
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electronics/bn_7000259124");
        System.out.println("Passed once more");
    }
    @Test
    public void headerPages9() {
        HomePage homePage = new HomePage(driver);
        ElectronicsPage electronicsPage = new ElectronicsPage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        homePage.clickElectronicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electronics/bn_7000259124");
        electronicsPage.clickPortableAudioLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Portable-Audio/15052/bn_1642614");
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        electronicsPage.clickTvVideoLink();
        electronicsPage.clickTvVideoLink();
        waitFor(2);
        electronicsPage.clickCellphonesLink();
        electronicsPage.clickComputersTabletsLink();
        Assert.assertEquals(getTitle(), "Electronics products for sale | eBay");
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        electronicsPage.clickTvVideoLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electronics/bn_7000259124");
        System.out.println("Passed once more");
    }
    @Test
    public void headerPages10() {
        HomePage homePage = new HomePage(driver);
        ElectronicsPage electronicsPage = new ElectronicsPage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        homePage.clickElectronicsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electronics/bn_7000259124");
        electronicsPage.clickPortableAudioLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Portable-Audio/15052/bn_1642614");
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        electronicsPage.clickTvVideoLink();
        electronicsPage.clickTvVideoLink();
        waitFor(2);
        electronicsPage.clickVirtualRealityLink();
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        electronicsPage.clickComputerPartsLink();
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        electronicsPage.clickCellphonesLink();
        electronicsPage.clickComputersTabletsLink();
        Assert.assertEquals(getTitle(), "Electronics products for sale | eBay");
        click(homePage.logoLink);
        homePage.clickElectronicsLink();
        electronicsPage.clickTvVideoLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Electronics/bn_7000259124");
        System.out.println("Passed once more");
    }
}