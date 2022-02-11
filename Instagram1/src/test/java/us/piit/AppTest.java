package us.piit;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;

public class AppTest extends CommonAPI{
    HomePage home = new HomePage();

    @Test
    public void test1(){
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.firstTest();
    }

}