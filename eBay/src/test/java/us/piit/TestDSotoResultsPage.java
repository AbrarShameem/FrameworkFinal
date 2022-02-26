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

}
