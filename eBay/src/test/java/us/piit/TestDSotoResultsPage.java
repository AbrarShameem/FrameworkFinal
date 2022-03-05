package us.piit;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDSotoResultsPage extends CommonAPI {

    @Test
    public void DeSotoResults(){
        HomePage homePage = new HomePage(driver);
        ClassicsPage classicsPage = new ClassicsPage(driver);
        DeSotoPage deSotoPage = new DeSotoPage(driver);
        homePage.hoverMotorsLink();
        homePage.clickClassicsLink();
        Assert.assertEquals(getTitle(), "Classics products for sale | eBay");
        classicsPage.clickDeSotoLink();
        deSotoPage.getDeSotoPageTitle();
        String dSotoUrl = driver.getCurrentUrl();
        Assert.assertEquals(dSotoUrl, "https://www.ebay.com/b/DeSoto-Cars-and-Trucks/6001/bn_24017478");
        System.out.println(deSotoPage);
        System.out.println(dSotoUrl);
    }

    @Test
    public void DeSotoMotorsResults(){
        HomePage homePage = new HomePage(driver);
        MotorsPage motorsPage = new MotorsPage(driver);
        homePage.clickMotorsLink();
        Assert.assertEquals(getTitle(), "eBay Motors: Auto Parts and Vehicles | eBay");
        motorsPage.clickallPartsAccessoriesLink();goBack();
        motorsPage.clickapparelProtectiveGearLink();goBack();
        motorsPage.clickatvUtvPartsLink();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.ebay.com/b/ATV-Side-by-Side-UTV-Parts-Accessories/43962/bn_562707");goBack();
        motorsPage.clickautomotiveToolsSuppliesLink();goBack();
        System.out.println("Car results");
        motorsPage.clickboatPartsLink();goBack();System.out.println("DeSoto");
        motorsPage.clickcarTruckPartsLink();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.ebay.com/b/Car-Truck-Parts-Accessories/6030/bn_562630");
        goBack();
        motorsPage.clickcommercialTruckPartsLink();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.ebay.com/b/Commercial-Truck-Parts/184646/bn_115385024");goBack();
        motorsPage.clickinCarGPSSecurityLink();goBack();
        motorsPage.clickmotorcyclePartsLink();
        Assert.assertEquals(getTitle(), "Motorcycle Parts for Sale - eBay");
    }
    @Test
    public void DeSotoMotorsResults2(){
        HomePage homePage = new HomePage(driver);
        MotorsPage motorsPage = new MotorsPage(driver);
        homePage.clickMotorsLink();
        Assert.assertEquals(getTitle(), "eBay Motors: Auto Parts and Vehicles | eBay");
        motorsPage.clickallPartsAccessoriesLink();goBack();
        motorsPage.clickapparelProtectiveGearLink();goBack();
        motorsPage.clickatvUtvPartsLink();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.ebay.com/b/ATV-Side-by-Side-UTV-Parts-Accessories/43962/bn_562707");goBack();
        motorsPage.clickautomotiveToolsSuppliesLink();goBack();
        System.out.println("Car results");
        motorsPage.clickboatPartsLink();goBack();System.out.println("DeSoto");
        motorsPage.clickcarTruckPartsLink();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.ebay.com/b/Car-Truck-Parts-Accessories/6030/bn_562630");
        goBack();
        motorsPage.clickcommercialTruckPartsLink();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.ebay.com/b/Commercial-Truck-Parts/184646/bn_115385024");goBack();
        motorsPage.clickinCarGPSSecurityLink();goBack();
        motorsPage.clickmotorcyclePartsLink();
        Assert.assertEquals(getTitle(), "Motorcycle Parts for Sale - eBay");
        driver.navigate().to("https://www.ebay.com/");
        homePage.clickMotorsLink();
        motorsPage.clickperformanceAndRacingPartsLink();
        goBack();motorsPage.clickrvTrailerCamperPartsLink();
        goBack();motorsPage.clicksafetySecurityAccessoriesLink();
        Assert.assertEquals(getTitle(), "Car & Truck Safety & Security Accessories for sale | eBay");goBack();
        motorsPage.clicksnowMobilePartsLink();
        Assert.assertEquals(getTitle(), "Snowmobile Parts in Motors for Sale - eBay");goBack();
        motorsPage.clickwheelsTiresAndPartsLink();
        Assert.assertEquals(getTitle(), "Car & Truck Wheels, Tires & Parts for sale | eBay");
    }
}
