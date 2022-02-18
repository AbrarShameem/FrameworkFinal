package us.piit;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchItemTest extends CommonAPI {

    @Test
    public void WeeklyDeals1() {
        HomePage homePage = new HomePage(driver);
        homePage.clickWEEKLYDEALS();
        String title = homePage.getTitle();
        Assert.assertEquals(getTitle(), title);
        System.out.println("");
    }


    @Test
    public void ConsumerElectronics2() {
        HomePage homePage = new HomePage(driver);
        homePage.clickCONSUMERELECTRONICS();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }

    @Test
    public void LogoLink3() {
        HomePage homePage = new HomePage(driver);
        homePage.clickLogoLink();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }

    @Test
    public void SearchButton4() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSearchButton();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);

    }

    @Test
    public void VehiclePartsAccessories5() {
        HomePage homePage = new HomePage(driver);
        homePage.clickVehiclePartsAccessories();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }

    @Test
    public void Apparel6() {
        HomePage homePage = new HomePage(driver);
        homePage.clickApparel();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }

    @Test
    public void ConsumerElectronics7() {
        HomePage homePage = new HomePage(driver);
        homePage.clickConsumerElectronics();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }

    @Test
    public void SportsEntertainment8() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSportsEntertainment();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }

    @Test
    public void Signin9() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSignin();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }

    @Test
    public void ReadytoShip10() {
        HomePage homePage = new HomePage(driver);
        homePage.clickReadytoShip();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }
    @Test
    public void Categories11() {
        HomePage homePage = new HomePage(driver);
        homePage.clickCategories();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }
    @Test
    public void SupplyRegions12() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSupplyRegions();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }
    @Test
    public void JoinFree13() {
        HomePage homePage = new HomePage(driver);
        homePage.clickJoinFree();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }
    @Test
    public void BeautyPersonalCare14() {
        HomePage homePage = new HomePage(driver);
        homePage.clickBeautyPersonalCare();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }
    @Test
    public void HomeGarden15() {
        HomePage homePage = new HomePage(driver);
        homePage.clickHomeGarden();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }
    @Test
    public void Machinery16() {
        HomePage homePage = new HomePage(driver);
        homePage.clickMachinery();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }
    @Test
    public void Machinery17() {
        HomePage homePage = new HomePage(driver);
        homePage.clickMachinery();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }
    @Test
    public void ShoesStock18() {
        HomePage homePage = new HomePage(driver);
        homePage.clickShoesStock();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }
    @Test
    public void Toprankingsuppliers19() {
        HomePage homePage = new HomePage(driver);
        homePage.clickToprankingsuppliers();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }
    @Test
    public void GlobalOriginalSources20() {
        HomePage homePage = new HomePage(driver);
        homePage.clickGlobalOriginalSources();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }
}
