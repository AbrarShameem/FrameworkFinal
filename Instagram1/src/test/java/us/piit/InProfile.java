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
      //  Assert.assertEquals(getTitle(),"Instagram");
       // waitFor(5);
       // home.profilemain();
       // Assert.assertEquals(getTitle(),"Instagram");
       // waitFor(6);
      //  profile.secondProfile();
       // Assert.assertEquals(getTitle(),"Instagram");
        //waitFor(4);
       // profile.OnMeta();
       // Assert.assertEquals(getTitle(),"Instagram");
       // waitFor(5);

    }
    @Test
    public void Clickonlocations() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(6);
        profile.OnLocations();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);}

    @Test
    public void ClickonUnitedstates() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(6);
        profile.OnUnitedstates();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);}


    @Test
    public void Clickonabout() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(6);
        profile.OnAbout();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);}
    @Test
    public void Clickonblog() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(6);
        profile.OnBlog();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);}

    @Test
    public void onjobs() {
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
        waitFor(6);
        profile.OnHelp();
        waitFor(5);}
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
    //@Test
    public void onTerms() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        profile.OnTerms();
        waitFor(5);}
    //@Test
    public void onTopaccounts() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        profile.OnTopaccounts();
        waitFor(5);}
    //@Test
    public void onHashtags() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        profile.OnHashtags();
        waitFor(5);}
    //@Test
    public void OnInstagramlite() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        profile.OnInstagramlite();
        waitFor(5);}
    //@Test
    public void onEnglish() {
        HomePage home = new HomePage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        waitFor(5);
        home.profilemain();
        waitFor(6);
        profile.OnEnglish();
        waitFor(5);}
    //@Test
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
