package us.piit;

import base.CommonAPI;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AppTest extends CommonAPI{

    HomePage home = new HomePage();

    @Test
    public void test1() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.clickOnSignInButton();
        waitFor(3);
    }

    @Test
    public void test2() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.clickOnSignInButton();
        waitFor(3);
        home.signInNow();
        waitFor(3);
    }

    @Test
    public void test3() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.clickOnSignInButton();
        waitFor(3);
        home.signInNow();
        waitFor(3);



        home.tsukiSignIn();
        waitFor(3);
    }

    @Test
    public void test4() {
        home.tsukiSignIn();
        waitFor(3);
        home.signOut();
        waitFor(3);
    }

    @Test
    public void test5() {
        home.leoSignIn();
        waitFor(3);
    }

    @Test
    public void test6() {
        home.leoSignIn();
        waitFor(3);
        home.signOut();
        waitFor(3);

    @Test
    public void test7() {
        home.mommySignIn();
        waitFor(3);
    }

    @Test
        public void test8() {
            home.mommySignIn();
            waitFor(3);
            home.signOut();
            waitFor(3);
        }

    @Test
        public void test9() {
            home.daddySignIn();
            waitFor(3);
        }

    @Test
    public void test10() {
        home.daddySignIn();
        waitFor(3);
        home.signOut();
        waitFor(3);
        }












    }




}
