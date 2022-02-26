package us.piit;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import org.testng.Assert;

import us.piit.HomePage;


public class OnSettings extends CommonAPI {

    //@Test
    public void Changepassword() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        Assert.assertEquals(getTitle(),"Instagram");
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(6);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnChangePassword();
        Assert.assertEquals(getTitle(),"Change Password • Instagram");
        waitFor(5);
    }

    //@Test
    public void Clickoneidtorofile() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        Assert.assertEquals(getTitle(),"Instagram");
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
    }
    //@Test
    public void clickoname() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        Assert.assertEquals(getTitle(),"Instagram");
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnName();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);

    }
    //@Test
    public void clickonusername() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnUsername();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
    }


    //@Test
    public void clickonwebsite() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnWebsite();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
    }

    //@Test
    public void clickonbio() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.onBio();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);

    }

    //@Test
    public void clickonemailaddress() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnEmailaddress();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
    }

    //@Test
    public void clickonphonenumber() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnPhonenumber();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
    }

    //@Test
    public void clickongender() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnGender();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
    }
   // @Test
    public void clcikongender() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnGender();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
    }
    //@Test
    public void clickonsimilaraccount() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnSimilaraccountsuggestions();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);}
    //@Test
    public void clickonchangepicture() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnChangeprofilepicture();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);}

    //@Test
    public void clickonappsandwebsites() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnAppsandwebsites();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);}

    //@Test
    public void clickonemailandsms() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnEmailandsms();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);}

    //@Test
    public void clickonnotifications() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnPushnotifications();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);}
    //@Test
    public void clickonmanagecontacts() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnManagecontacts();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);}

    //@Test
    public void clickonprivacyandsecurity() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnPrivacyandsecurity();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);}
    //@Test
    public void clickonloginactivity() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnLoginactivity();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);}
    //@Test
    public void clcikonOnEmailsfrominstagram() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnEmailsfrominstagram();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);}
    //@Test
    public void clickprivacyandsecurityhelp() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnPrivacyandsecurityhelp();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);}

    //@Test
    public void clickOnHelp() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnHelp();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);}

    //@Test
    public void clickOnsupportrequests() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnSupportrequests();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);}

    //@Test
    public void clickonhelpcenter() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnHelpcenter();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);}


    //@Test
    public void clickOnSwitchtoprofessionalaccount() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile =new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(),"Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);
        settings.OnSwitchtoprofessionalaccount();
        Assert.assertEquals(getTitle(),"Edit Profile • Instagram");
        waitFor(5);}


}
