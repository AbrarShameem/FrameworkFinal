package us.piit.home;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import us.piit.HomePage;
import us.piit.InProfile;
import us.piit.ProfilePage;

public class OnHome extends CommonAPI{

    @Test
    public void logginbutton() {
        HomePage home = new HomePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(10);

    }


    @Test
    public void Wrongusername() {
        HomePage home = new HomePage(driver);
        home.Wrongusername();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);

    }

    @Test
    public void Wrongpassword() {
        HomePage home = new HomePage(driver);
        home.Wrongpassword();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
    }

    @Test
    public void Clickonnotnow() {
        HomePage home = new HomePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(2);
        home.clickOnNotNow();Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
    }
    @Test
    public void Search() {
        HomePage home = new HomePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        home.clickOnNotNow();
        Assert.assertEquals(getTitle(),"Instagram");
        home.onSearch();
        Assert.assertEquals(getTitle(),"Instagram");
    }
    @Test
    public void Clickonprofile() {
        HomePage home = new HomePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");

    }
    @Test
    public void Profile() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        Assert.assertEquals(getTitle(),"Instagram");
        home.login();
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        profile.secondProfile();
        Assert.assertEquals(getTitle(),"Instagram");
    }
    @Test
    public void Clickonsaved() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        profile.OnSaved();
        Assert.assertEquals(getTitle(),"Instagram");
    }
    @Test
    public void Clickonsetting() {
        HomePage home = new HomePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
    }
    @Test
    public void Clickonpolygon() {
        HomePage home = new HomePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        home.onPolygon();
        Assert.assertEquals(getTitle(),"Instagram");
    }

    @Test
    public void Clickonsendmessage() {
        HomePage home = new HomePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        home.onSendMessage();
        Assert.assertEquals(getTitle(),"Instagram");
    }

    @Test
    public void Clickonswitchaccount() {
        HomePage home = new HomePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        home.onSwitchAccount();
        Assert.assertEquals(getTitle(),"Instagram");
    }
    @Test
    public void clickonlogout() {
        HomePage home = new HomePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        home.onLogOut();
        Assert.assertEquals(getTitle(),"Instagram");
    }
    @Test
    public void clickonaddpost() {
        HomePage home = new HomePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        home.onAddPost();
        Assert.assertEquals(getTitle(),"Create new post • Instagram");
    }
    @Test
    public void clcikonSelectfromcomputer() {
        HomePage home = new HomePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        home.onAddPost();
        Assert.assertEquals(getTitle(),"Instagram");
        home.onSelectFromComputer();
        Assert.assertEquals(getTitle(),"Create new post • Instagram");
    }

    @Test
    public void clcikonloginnow() {
        HomePage home = new HomePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
    }
    @Test
    public void clcikonposts() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();Assert.assertEquals(getTitle(),"Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        profile.OnPosts();
        Assert.assertEquals(getTitle(),"Instagram");
    }

    @Test
    public void clcikonvideos() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        profile.OnVideos();
        Assert.assertEquals(getTitle(),"Instagram");
 }
    @Test
    public void clcikontagged() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        profile.OnTagged();
        Assert.assertEquals(getTitle(),"Instagram");
  }

}
