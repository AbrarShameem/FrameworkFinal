package us.piit;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBrandOutletFeatures extends CommonAPI {

    @Test
    public void brandOutletUses1(){
        HomePage homePage = new HomePage(driver);
        BrandOutletPage brandOutletPage = new BrandOutletPage(driver);
        homePage.clickBrandOutletLink();
        Assert.assertEquals(getTitle(), "Brand Outlet products for sale | eBay");
        brandOutletPage.clickAccessoriesLinkDropdown();
        waitFor(2);
        brandOutletPage.clickClothingLinkDropdown();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Brand-Outlet/bn_7115532402");
        brandOutletPage.clickBeddingLinkDropdown();
        brandOutletPage.clickComputersAndLaptopsLinkDropdown();
        System.out.println("working");
        Assert.assertEquals(getTitle(), "Brand Outlet products for sale | eBay");
        brandOutletPage.clickHandbagsLinkDropdown();
        brandOutletPage.clickFloorcareLinkDropdown();
        waitFor(2);
        System.out.println("Brand Outlet products for sale | eBay");
        System.out.println("https://www.ebay.com/b/Brand-Outlet/bn_7115532402");
    }
    @Test
    public void brandOutletUses2(){
        HomePage homePage = new HomePage(driver);
        BrandOutletPage brandOutletPage = new BrandOutletPage(driver);
        homePage.clickBrandOutletLink();
        Assert.assertEquals(getTitle(), "Brand Outlet products for sale | eBay");
        brandOutletPage.clickJewelryLinkDropdown();
        brandOutletPage.clickWatchesLinkDropdown();
        brandOutletPage.clickJewelryLinkDropdown();
        brandOutletPage.clickWatchesLinkDropdown();
        waitFor(3);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Brand-Outlet/bn_7115532402");
        brandOutletPage.clickHomeDecorLinkDropdown();
        brandOutletPage.clickKitchenLinkDropdown();
        brandOutletPage.clickHomeDecorLinkDropdown();
        brandOutletPage.clickKitchenLinkDropdown();
        System.out.println("working");
        Assert.assertEquals(getTitle(), "Brand Outlet products for sale | eBay");
        brandOutletPage.clickHandbagsLinkDropdown();
        brandOutletPage.clickFloorcareLinkDropdown();
        waitFor(2);
        System.out.println("Brand Outlet products for sale | eBay");
        System.out.println("https://www.ebay.com/b/Brand-Outlet/bn_7115532402");
    }
    @Test
    public void brandOutletUses3(){
        HomePage homePage = new HomePage(driver);
        BrandOutletPage brandOutletPage = new BrandOutletPage(driver);
        homePage.clickBrandOutletLink();
        Assert.assertEquals(getTitle(), "Brand Outlet products for sale | eBay");
        brandOutletPage.clickJewelryLinkDropdown();
        brandOutletPage.clickWatchesLinkDropdown();
        brandOutletPage.clickToolsLinkDropdown();
        System.out.println("functionalities");
        brandOutletPage.clickSmartphonesDropdownLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Brand-Outlet/bn_7115532402");
        brandOutletPage.clickHomeDecorLinkDropdown();
        brandOutletPage.clickKitchenLinkDropdown();
        brandOutletPage.clickHomeDecorLinkDropdown();
        brandOutletPage.clickKitchenLinkDropdown();
        System.out.println("working");
        Assert.assertEquals(getTitle(), "Brand Outlet products for sale | eBay");
        brandOutletPage.clickHandbagsLinkDropdown();
        brandOutletPage.clickFloorcareLinkDropdown();
        waitFor(2);
        System.out.println("Brand Outlet products for sale | eBay");
        System.out.println("https://www.ebay.com/b/Brand-Outlet/bn_7115532402");
    }
}
