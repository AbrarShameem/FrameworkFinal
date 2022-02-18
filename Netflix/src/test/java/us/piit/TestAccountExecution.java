package us.piit;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestAccountExecution extends CommonAPI {

    @Test
    public void TsukiAccountButton() {
        HomePage homePage = new HomePage(driver);
        TsukiProfile tsukiProfile = new TsukiProfile(driver);
        homePage.clickOnSignInButton();
        homePage.signInNow();
        homePage.tsukiClick();
        tsukiProfile.CarrotHoverOver();
        tsukiProfile.clickOnAccountButton();
    }
    @Test
    public void MichaelAccountButton() {
        HomePage homePage = new HomePage(driver);
        TsukiProfile tsukiProfile = new TsukiProfile(driver);
        homePage.clickOnSignInButton();
        homePage.signInNow();
        homePage.tsukiClick();
        tsukiProfile.CarrotHoverOver();
        tsukiProfile.clickOnAccountButton();

    }
    @Test
    public void MommyAccountButton() {
        HomePage homePage = new HomePage(driver);
        TsukiProfile tsukiProfile = new TsukiProfile(driver);
        homePage.clickOnSignInButton();
        homePage.signInNow();
        homePage.tsukiClick();
        tsukiProfile.CarrotHoverOver();
        tsukiProfile.clickOnAccountButton();
    }

    @Test
    public void DaddyAccountButton() {
        HomePage homePage = new HomePage(driver);
        TsukiProfile tsukiProfile = new TsukiProfile(driver);
        homePage.clickOnSignInButton();
        homePage.signInNow();
        homePage.tsukiClick();
        tsukiProfile.CarrotHoverOver();
        tsukiProfile.clickOnAccountButton();
    }
    @Test
    public void LeoAccountButton() {
        HomePage homePage = new HomePage(driver);
        TsukiProfile tsukiProfile = new TsukiProfile(driver);
        homePage.clickOnSignInButton();
        homePage.signInNow();
        homePage.tsukiClick();
        tsukiProfile.CarrotHoverOver();
        tsukiProfile.clickOnAccountButton();


    }
}

