package us.piit;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestLogout extends CommonAPI {

    @Test
    public void SignOutTsuki() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        click(home.signInButton);
        home.clickOnSignInButton();
        waitFor(3);
        home.signInNow();
        waitFor(3);
        home.tsukiClick();




    }
}
