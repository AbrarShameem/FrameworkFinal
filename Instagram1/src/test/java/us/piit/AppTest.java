package us.piit;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class AppTest extends CommonAPI{
    HomePage home = new HomePage();

   //@Test
    public void test01(){
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        //home.first(Test);
        home.login();
        waitFor(10);
    }


   //@Test
    public void test02(){
         HomePage home = PageFactory.initElements(driver, HomePage.class);
         home.Wrongusername();
          //home.first(Test);
         // home.enterWrongEmail();
       waitFor(5);

    }
    //@Test
    public void test03(){
        HomePage home = PageFactory.initElements(driver, HomePage.class);
       // home.Wrongpassword();
        //home.first(Test);
        // home.enterWrongEmail();
        waitFor(5);
    }



    //@Test
    public void test04() {
         HomePage home = PageFactory.initElements(driver, HomePage.class);
       ////home.Userscrolldown();
        //home.first(Test);
        // home.enterEmail();
        waitFor(5);
    }

    //@Test
    public void test05(){
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        //home.first(Test);
        home.login();
        waitFor(10);
       home.onSearch();
        waitFor(6);
    }
    @Test
    public void test06(){
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        //home.first(Test);
        home.login();
        waitFor(2);
        home.loginNow();
       waitFor(6);
    }
    //@Test
    public void test07(){
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        //home.first(Test);
        home.login();
        waitFor(5);
        //home.loginNow();
        waitFor(6);
    }
    //@Test
    public void test08(){
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        //home.first(Test);
        home.login();
        waitFor(5);
       // home.loginNow();
        waitFor(6);
        home.onSearch();
        waitFor(7);
    }
   // @Test
    public void test09(){
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.login();
        waitFor(5);
       home.profilemain();
       waitFor(4);}
    //@Test
    public void test10(){
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        home.secondProfile();
        waitFor(4);}
   // @Test
    public void test11(){
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        home.OnSaved();
        waitFor(4);}
     //@Test
    public void test12(){
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        home.onSettings();
        waitFor(4);}

   // @Test
    public void test13(){
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.login();
        waitFor(5);
        home.onPolygon();
        waitFor(5);}
    //@Test
    public void test14(){
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.login();
        waitFor(5);
        home.onSendMessage();
        waitFor(5);}
   // @Test
    public void test15(){
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        home.secondProfile();
        waitFor(4);
    home.onFollowing();
    waitFor(5);}


}

