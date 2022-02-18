package us.piit;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLogout extends CommonAPI {

    @Test
    public void SignOutTsuki() {
        HomePage homePage = new HomePage(driver);
        TsukiProfile tsukiProfile = new TsukiProfile(driver);
        homePage.clickOnSignInButton();
        homePage.signInNow();
        homePage.tsukiClick();
        tsukiProfile.CarrotHoverOver();
        tsukiProfile.clickOnSignOut();
    }
    @Test
    public void SignOutMichael() {
    HomePage homePage = new HomePage(driver);
       MichaelProfile michaelProfile = new MichaelProfile(driver);
       homePage.clickOnSignInButton();
       homePage.signInNow();
       homePage.michaelClick();
       michaelProfile.CarrotHoverOver();
       michaelProfile.clickonSignOut();
    }
    @Test
   public void SignOutMommy() {
        HomePage homePage = new HomePage(driver);
        MommyProfile mommyProfile = new MommyProfile(driver);
        homePage.clickOnSignInButton();
        homePage.signInNow();
        homePage.mommyClick();
        mommyProfile.CarrotHoverOver();
        mommyProfile.clickonSignOut();
    }

    @Test
    public void SignOutDaddy() {
        HomePage homePage = new HomePage(driver);
        DaddyProfile daddyProfile = new DaddyProfile(driver);
        homePage.clickOnSignInButton();
        homePage.signInNow();
        homePage.daddyClick();
        daddyProfile.CarrotHoverOver();
        daddyProfile.clickonSignOut();
    }
    @Test
    public void SignOutLeo() {
        HomePage homePage = new HomePage(driver);
        LeoProfile leoProfile = new LeoProfile(driver);
        homePage.clickOnSignInButton();
        homePage.signInNow();
        homePage.leoClick();
        leoProfile.CarrotHoverOver();
        leoProfile.clickonSignOut();

    }
}
