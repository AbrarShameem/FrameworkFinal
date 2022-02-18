package us.piit;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class AppTest extends CommonAPI{


   //@Test
    public void test01(){
        HomePage home = new HomePage(driver);
        //home.first(Test);
        home.login();
        waitFor(10);

    }


   //@Test
    public void test02(){
        HomePage home = new HomePage(driver);
         home.Wrongusername();
          //home.first(Test);
         // home.enterWrongEmail();
       waitFor(5);

    }
    //@Test
    public void test03(){
        HomePage home = new HomePage(driver);
        home.Wrongpassword();
        //home.first(Test);
        // home.enterWrongEmail();
        waitFor(5);
    }

    @Test
    public void test04(){
        HomePage home = new HomePage(driver);
        home.login();
        waitFor(2);
        home.clickOnNotNow();
        waitFor(5);
    }

    //@Test
    public void test05(){
        HomePage home = new HomePage(driver);
        home.login();
        waitFor(5);
        home.clickOnNotNow();
        waitFor(6);
        home.onSearch();
        waitFor(7);
    }
    //@Test
    public void test06(){
        HomePage home = new HomePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(4);}
    //@Test
    public void test7(){
        HomePage home = new HomePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        home.secondProfile();
        waitFor(4);}
   //@Test
    public void test08(){
        HomePage home = new HomePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        home.OnSaved();
        waitFor(4);}
     //@Test
    public void test09(){
        HomePage home = new HomePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        home.onSettings();
        waitFor(4);}

   // @Test
    public void test10(){
        HomePage home = new HomePage(driver);
        home.login();
        waitFor(5);
        home.onPolygon();
        waitFor(5);}
    //@Test
    public void test11(){
        HomePage home = new HomePage(driver);
        home.login();
        waitFor(5);
        home.onSendMessage();
        waitFor(5);}
   // @Test
    public void test12(){
        HomePage home = new HomePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        home.secondProfile();
        waitFor(4);
        home.onFollowing();
        waitFor(5);}

    //@Test
    public void test13(){
        HomePage home = new HomePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        home.onSwitchAccount();
        waitFor(6);}

    //@Test
    public void test14(){
        HomePage home = new HomePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
         home.onLogOut();
        waitFor(6);}

    //@Test
    public void test15(){
        HomePage home = new HomePage(driver);
        home.login();
        waitFor(5);
        home.onAddPost();
        waitFor(5);}

    //@Test
    public void test16(){
        HomePage home = new HomePage(driver);
        home.login();
        waitFor(5);
        home.onAddPost();
        waitFor(5);
        home.onSelectFromComputer();
        waitFor(5);}

      //@Test
      public void test17(){
        HomePage home = new HomePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        home.onSettings();
        waitFor(4);
        home.OnChangePassword();
        waitFor(5);}

      //@Test
      public void test18(){
        HomePage home = new HomePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(5);
        home.onSettings();
        waitFor(4);
        home.OnEditProfile();
        waitFor(5);}


    //@Test
    public void test19(){
        HomePage home = new HomePage(driver);
        //home.first(Test);
        home.login();
        waitFor(5);
        //home.loginNow();
        waitFor(6);}

    //@Test
    public void test20(){
        HomePage home = new HomePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(5);
        home.onSettings();
        waitFor(4);
        home.OnEditProfile();
        waitFor(5);
        home.OnName();
        waitFor(5);

    }




}

