package us.piit.TestLogin;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import us.piit.HomePage;


public class TestLogin extends CommonAPI{

    HomePage home = new HomePage(driver);

    @Test
    public void firstSignIn() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        click(home.signInButton);
        waitFor(3);
    }

    @Test
    public void logInWithCredentials() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.clickOnSignInButton();
        waitFor(3);
        home.signInNow();
        waitFor(3);
    }

    @Test
    public void logInWithTsuki() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.clickOnSignInButton();
        waitFor(3);
        home.signInNow();
        waitFor(3);
        home.tsukiClick();

    }

    @Test
    public void logInWithLeo() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.clickOnSignInButton();
        waitFor(3);
        home.signInNow();
        waitFor(3);
        home.leoClick();

    }

    @Test
    public void logInWithMichael() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.clickOnSignInButton();
        waitFor(3);
        home.signInNow();
        waitFor(3);
        home.michaelClick();

    }

    @Test
    public void logInWithDaddy() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.clickOnSignInButton();
        waitFor(3);
        home.signInNow();
        waitFor(3);
        home.daddyClick();
    }

    @Test
    public void logInWithMommy() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.clickOnSignInButton();
        waitFor(3);
        home.signInNow();
        waitFor(3);
        home.mommyClick();
    }}