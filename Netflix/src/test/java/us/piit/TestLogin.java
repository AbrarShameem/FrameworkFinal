package us.piit;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class TestLogin extends CommonAPI{

    HomePage home = new HomePage();

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
    }


//
//    //@Test
//    public void test3() {
//        HomePage home = PageFactory.initElements(driver, HomePage.class);
//        home.clickOnSignInButton();
//        waitFor(3);
//        home.signInNow();
//        waitFor(3);
//
//
//
//        home.tsukiSignIn();
//        waitFor(3);
//    }
//
//    //@Test
//    public void test4() {
//        home.tsukiSignIn();
//        waitFor(3);
//        home.signOut();
//        waitFor(3);
//    }
//
//    //@Test
//    public void test5() {
//        home.leoSignIn();
//        waitFor(3);
//    }
//
//    //@Test
//    public void test6() {
//        home.leoSignIn();
//        waitFor(3);
//        home.signOut();
//        waitFor(3);
//
//    //@Test
//    public void test7() {
//        home.mommySignIn();
//        waitFor(3);
//    }
//
//    //@Test
//        public void test8() {
//            home.mommySignIn();
//            waitFor(3);
//            home.signOut();
//            waitFor(3);
//        }
//
//    //@Test
//        public void test9() {
//            home.daddySignIn();
//            waitFor(3);
//        }
//
//    //@Test
//    public void test10() {
//        home.daddySignIn();
//        waitFor(3);
//        home.signOut();
//        waitFor(3);
//        }
//
//
//
//
//
//
//
//
//
//
//
//
//    }
//



}
