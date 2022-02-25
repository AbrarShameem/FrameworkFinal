package us.piit;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMotorsDropdownOptions extends CommonAPI {

    //@Test
    public void MotorsOptions1() {
        HomePage homePage = new HomePage(driver);
        homePage.hoverMotorsLink();
        homePage.clickClassicsLink();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
        System.out.println("Woooo!");
    }

    //@Test
    public void MotorsOptions2() {
        HomePage homePage = new HomePage(driver);
        homePage.hoverMotorsLink();
        homePage.clickMotorcyclePartsLink();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }

    //@Test
    public void MotorsOptions3() {
        HomePage homePage = new HomePage(driver);
        homePage.hoverMotorsLink();
        homePage.clickMyGarageLink();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
        System.out.println("Lets get it!");
    }

    //@Test
    public void MotorsOptions4() {
        HomePage homePage = new HomePage(driver);
        homePage.hoverMotorsLink();
        homePage.clickCarsTrucksLink();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }

    //@Test
    public void MotorsOptions5() {
        HomePage homePage = new HomePage(driver);
        homePage.hoverMotorsLink();
        homePage.clickPowerSportsLink();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }
    //@Test
    public void MotorsOptions6() {
        HomePage homePage = new HomePage(driver);
        homePage.hoverMotorsLink();
        homePage.clickRvCampersLink();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }

    //@Test
    public void MotorsOptions7() {
        HomePage homePage = new HomePage(driver);
        homePage.hoverMotorsLink();
        homePage.clickTrailersOthersLink();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
        System.out.println("Go trailers!");
    }

    //@Test
    public void MotorsOptions8() {
        HomePage homePage = new HomePage(driver);
        homePage.hoverMotorsLink();
        homePage.clickBoatsLink();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }

    //@Test
    public void MotorsOptions9() {
        HomePage homePage = new HomePage(driver);
        homePage.hoverMotorsLink();
        homePage.clickApparelMerchandiseLink();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
    }
}