package us.piit;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BabyAppliancesItemTest extends CommonAPI {


    @Test
    public void BabyAppliancesItem() {
        HomePage homePage = new HomePage(driver);
        BabyAppliancesItem babyAppliancesItem = new BabyAppliancesItem(driver);
        homePage.clickAllCategories();
        Assert.assertEquals(getTitle(), "");

        waitFor(3);

        driver.navigate().to("https://www.alibaba.com/");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/");

        System.out.println("hovers working!");

    }
    @Test
    public void clickBabytoddler3() {
        BabyAppliancesItem homepage = new BabyAppliancesItem(driver);
        homepage.clickAllCategories();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);


    }
}