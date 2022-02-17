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
    @Test
    public void test03(){
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.Wrongpassword();
        //home.first(Test);
        // home.enterWrongEmail();
        waitFor(5);
    }

    }