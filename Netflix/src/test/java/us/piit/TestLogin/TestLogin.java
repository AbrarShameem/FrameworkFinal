package us.piit.TestLogin;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;


public class TestLogin extends CommonAPI{

    HomePage home = new HomePage(driver);

    @Test
    public void firstSignIn() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        click(home.signInButton);
        Assert.assertEquals(getTitle(), "Sign In");
        waitFor(3);
    }

    @Test
    public void logInWithCredentials() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.clickOnSignInButton();
        waitFor(3);
        home.signInNow();
        Assert.assertEquals(getTitle(), "Home - Sign In");
    }

    @Test
    public void logInWithTsuki() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.clickOnSignInButton();
        home.signInNow();
        String logInTitle = getTitle();
        System.out.println(logInTitle);
        Assert.assertEquals(getTitle(), "Home - Netflix");
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
        String leoTitle = getTitle();
        System.out.println(leoTitle);
        Assert.assertEquals(getTitle(), "Home - Netflix");

    }

    @Test
    public void logInWithMichael() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.clickOnSignInButton();
        waitFor(3);
        home.signInNow();
        waitFor(3);
        home.michaelClick();
        String michaelTitle = getTitle();
        System.out.println(michaelTitle);
        Assert.assertEquals(getTitle(), "Home - Netflix");


    }

   @Test
    public void logInWithDaddy() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.clickOnSignInButton();
        waitFor(3);
        home.signInNow();
        waitFor(3);
        home.daddyClick();
       String daddyTitle = getTitle();
       System.out.println(daddyTitle);
       Assert.assertEquals(getTitle(), "Home - Netflix");

   }

    @Test
    public void logInWithMommy() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.clickOnSignInButton();
        waitFor(3);
        home.signInNow();
        waitFor(3);
        String mommyTitle = getTitle();
        System.out.println(mommyTitle);
        Assert.assertEquals(getTitle(), "Home - Netflix");

    }}