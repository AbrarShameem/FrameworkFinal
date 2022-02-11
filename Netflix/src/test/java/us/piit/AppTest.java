package us.piit;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AppTest extends CommonAPI{

    HomePage home = new HomePage();

    @Test
    public void signIntoNetflix() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.clickOnSignInButton();
        waitFor(3);
    }

    @Test
    public void








    }




}
