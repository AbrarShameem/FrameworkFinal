package us.piit;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


public class InProfile extends CommonAPI
{
    @Test
    public void clickonfollowing() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(6);
        profile.secondProfile();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        profile.onFollowing();
        Assert.assertEquals(getTitle(),"@sellingsunset007 • Instagram photos and videos");
        waitFor(5);
    }
    @Test
    public void Clickonmeta() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(6);
        profile.secondProfile();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        profile.OnMeta();
        waitFor(2);

    }
    @Test
    public void Clickonlocations() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        profile.secondProfile();
        Assert.assertEquals(getTitle(),"Instagram");
        profile.OnLocations();
    }

    @Test
    public void ClickonUnitedstates() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        profile.secondProfile();
        Assert.assertEquals(getTitle(),"Instagram");
        profile.OnUnitedstates();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);}


    @Test
    public void Clickonabout() {
        HomePage home = new HomePage(driver);
        ProfilePage profile = new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        profile.secondProfile();
        Assert.assertEquals(getTitle(), "Instagram");
        profile.OnAbout();
    }
   @Test
    public void Onblog() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        profile.secondProfile();
        Assert.assertEquals(getTitle(),"Instagram");
        profile.OnBlog();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        }

    @Test
    public void Onjobs() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(6);
        profile.OnJobs();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);}
    @Test
    public void onhelp() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        profile.OnHelp();}
    @Test
    public void onAPI() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        profile.OnAPI();
        waitFor(5);}
    @Test
    public void oNPrivacy() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        profile.OnPrivacy();
        waitFor(5);}
    @Test
    public void onTerms() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        profile.OnTerms();
        waitFor(5);}
    @Test
    public void onTopaccounts() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        profile.OnTopaccounts();
        waitFor(5);}
    @Test
    public void onHashtags() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        home.profilemain();
        profile.OnHashtags();}

    @Test
    public void OnInstagramlite() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        home.profilemain();
        profile.OnInstagramlite();
        }

    @Test
    public void onEnglish() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        profile.OnEnglish();
        waitFor(5);}
    @Test
    public void onInstagramfrommeta() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        profile.OnInstagramfrommeta();
        waitFor(5);}

}
