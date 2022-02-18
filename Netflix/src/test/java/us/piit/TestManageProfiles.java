package us.piit;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestManageProfiles extends CommonAPI {


    @Test
    public void TsukiManageProfile() {
        HomePage homePage = new HomePage(driver);
        TsukiProfile tsukiProfile = new TsukiProfile(driver);
        homePage.clickOnSignInButton();
        homePage.signInNow();
        homePage.tsukiClick();
        tsukiProfile.CarrotHoverOver();
        tsukiProfile.clickOnManageProfile();
    }

    @Test
    public void MichaelManageProfile() {
        HomePage homePage = new HomePage(driver);
        TsukiProfile tsukiProfile = new TsukiProfile(driver);
        homePage.clickOnSignInButton();
        homePage.signInNow();
        homePage.michaelClick();
        tsukiProfile.CarrotHoverOver();
        tsukiProfile.clickOnManageProfile();
    }

    @Test
    public void LeoManageProfile() {
        HomePage homePage = new HomePage(driver);
        TsukiProfile tsukiProfile = new TsukiProfile(driver);
        homePage.clickOnSignInButton();
        homePage.signInNow();
        homePage.leoClick();
        tsukiProfile.CarrotHoverOver();
        tsukiProfile.clickOnManageProfile();
    }

    @Test
    public void MommyManageProfile() {
        HomePage homePage = new HomePage(driver);
        TsukiProfile tsukiProfile = new TsukiProfile(driver);
        homePage.clickOnSignInButton();
        homePage.signInNow();
        homePage.mommyClick();
        tsukiProfile.CarrotHoverOver();
        tsukiProfile.clickOnManageProfile();
    }

    @Test
    public void DaddyManageProfile() {
        HomePage homePage = new HomePage(driver);
        TsukiProfile tsukiProfile = new TsukiProfile(driver);
        homePage.clickOnSignInButton();
        homePage.signInNow();
        homePage.daddyClick();
        tsukiProfile.CarrotHoverOver();
        tsukiProfile.clickOnManageProfile();
    }
}
