package us.piit;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestBusinessAndIndustrialOptions extends CommonAPI {

    @Test
    public void businessIndustrialOptions1() {
        HomePage homePage = new HomePage(driver);
        BusinessAndIndustrialPage businessAndIndustrialPage = new BusinessAndIndustrialPage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        homePage.clickBusinessIndustrialLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Business-Industrial/12576/bn_1853744");
        businessAndIndustrialPage.clickAgricultureForestryEquipmentLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Business-Industrial/12576/bn_1853744");
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickBuildingMaterialsSuppliesLink();
        businessAndIndustrialPage.clickCleaningJanitorialLink();
        waitFor(2);
        businessAndIndustrialPage.clickCleaningJanitorialLink();
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickCncMetalworkingLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Business-Industrial/12576/bn_1853744");
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickElectricalEquipmentSuppliesLink();
        businessAndIndustrialPage.clickFacilityMaintenanceLink();
        Assert.assertEquals(getTitle(), "Business & Industrial products for sale | eBay");
        click(homePage.logoLink);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        waitFor(2);
        System.out.println("Passed once more");
    }
    @Test
    public void businessIndustrialOptions2() {
        HomePage homePage = new HomePage(driver);
        BusinessAndIndustrialPage businessAndIndustrialPage = new BusinessAndIndustrialPage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        homePage.clickBusinessIndustrialLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Business-Industrial/12576/bn_1853744");
        businessAndIndustrialPage.clickAgricultureForestryEquipmentLink();
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickBuildingMaterialsSuppliesLink();
        businessAndIndustrialPage.clickCleaningJanitorialLink();
        waitFor(3);
        businessAndIndustrialPage.clickCleaningJanitorialLink();
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickCncMetalworkingLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Business-Industrial/12576/bn_1853744");
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickElectricalEquipmentSuppliesLink();
        businessAndIndustrialPage.clickFacilityMaintenanceLink();
        Assert.assertEquals(getTitle(), "Business & Industrial products for sale | eBay");
        click(homePage.logoLink);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        waitFor(2);
        System.out.println("Passed once more");
    }
    @Test
    public void businessIndustrialOptions3() {
        HomePage homePage = new HomePage(driver);
        BusinessAndIndustrialPage businessAndIndustrialPage = new BusinessAndIndustrialPage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        homePage.clickBusinessIndustrialLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Business-Industrial/12576/bn_1853744");
        businessAndIndustrialPage.clickAgricultureForestryEquipmentLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Business-Industrial/12576/bn_1853744");
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickFastenersHardwareLink();
        businessAndIndustrialPage.clickHealthcareLabDentalLink();
        waitFor(2);
        businessAndIndustrialPage.clickCleaningJanitorialLink();
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickCncMetalworkingLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Business-Industrial/12576/bn_1853744");
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickElectricalEquipmentSuppliesLink();
        businessAndIndustrialPage.clickFacilityMaintenanceLink();
        Assert.assertEquals(getTitle(), "Business & Industrial products for sale | eBay");
        click(homePage.logoLink);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        waitFor(2);
        System.out.println("Passed once more");
    }
    @Test
    public void businessIndustrialOptions4() {
        HomePage homePage = new HomePage(driver);
        BusinessAndIndustrialPage businessAndIndustrialPage = new BusinessAndIndustrialPage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        homePage.clickBusinessIndustrialLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Business-Industrial/12576/bn_1853744");
        businessAndIndustrialPage.clickAgricultureForestryEquipmentLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Business-Industrial/12576/bn_1853744");
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickFastenersHardwareLink();
        businessAndIndustrialPage.clickHealthcareLabDentalLink();
        waitFor(2);
        businessAndIndustrialPage.clickCleaningJanitorialLink();
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickHeavyEquipmentPartsAttachmentsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Business-Industrial/12576/bn_1853744");
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickHydraulicsPneumaticsLink();
        businessAndIndustrialPage.clickFacilityMaintenanceLink();
        Assert.assertEquals(getTitle(), "Business & Industrial products for sale | eBay");
        click(homePage.logoLink);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        waitFor(2);
        System.out.println("Passed once more");
    }
    @Test
    public void businessIndustrialOptions5() {
        HomePage homePage = new HomePage(driver);
        BusinessAndIndustrialPage businessAndIndustrialPage = new BusinessAndIndustrialPage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        homePage.clickBusinessIndustrialLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Business-Industrial/12576/bn_1853744");
        businessAndIndustrialPage.clickAgricultureForestryEquipmentLink();
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickHvacRefrigerationLink();
        businessAndIndustrialPage.clickHealthcareLabDentalLink();
        waitFor(2);
        businessAndIndustrialPage.clickIndustrialAdhesivesLink();
        Assert.assertEquals(getTitle(), "Business & Industrial products for sale | eBay");
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickHeavyEquipmentPartsAttachmentsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Business-Industrial/12576/bn_1853744");
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickHydraulicsPneumaticsLink();
        businessAndIndustrialPage.clickFacilityMaintenanceLink();
        Assert.assertEquals(getTitle(), "Business & Industrial products for sale | eBay");
        click(homePage.logoLink);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        waitFor(2);
        System.out.println("Passed once more");
    }
    @Test
    public void businessIndustrialOptions6() {
        HomePage homePage = new HomePage(driver);
        BusinessAndIndustrialPage businessAndIndustrialPage = new BusinessAndIndustrialPage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        homePage.clickBusinessIndustrialLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Business-Industrial/12576/bn_1853744");
        businessAndIndustrialPage.clickAgricultureForestryEquipmentLink();
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickBuildingMaterialsSuppliesLink();
        businessAndIndustrialPage.clickCleaningJanitorialLink();
        waitFor(3);
        businessAndIndustrialPage.clickCleaningJanitorialLink();
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickCncMetalworkingLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Business-Industrial/12576/bn_1853744");
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickElectricalEquipmentSuppliesLink();
        businessAndIndustrialPage.clickFacilityMaintenanceLink();
        Assert.assertEquals(getTitle(), "Business & Industrial products for sale | eBay");
        click(homePage.logoLink);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        waitFor(2);
        System.out.println("Passed once more");
    }
    @Test
    public void businessIndustrialOptions7() {
        HomePage homePage = new HomePage(driver);
        BusinessAndIndustrialPage businessAndIndustrialPage = new BusinessAndIndustrialPage(driver);
        HelpAndContactPage helpAndContactPage = new HelpAndContactPage(driver);
        homePage.clickBusinessIndustrialLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Business-Industrial/12576/bn_1853744");
        businessAndIndustrialPage.clickAgricultureForestryEquipmentLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Business-Industrial/12576/bn_1853744");
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickFastenersHardwareLink();
        businessAndIndustrialPage.clickHealthcareLabDentalLink();
        waitFor(2);
        businessAndIndustrialPage.clickCleaningJanitorialLink();
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickHeavyEquipmentPartsAttachmentsLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Business-Industrial/12576/bn_1853744");
        click(homePage.logoLink);
        homePage.clickBusinessIndustrialLink();
        businessAndIndustrialPage.clickHydraulicsPneumaticsLink();
        businessAndIndustrialPage.clickFacilityMaintenanceLink();
        Assert.assertEquals(getTitle(), "Business & Industrial products for sale | eBay");
        click(homePage.logoLink);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        waitFor(2);
        System.out.println("Passed once more");
    }
}
