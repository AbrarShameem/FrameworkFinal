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


    @Test
    public void Changepassword() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Assert.assertEquals(getTitle(), "Instagram");
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnChangePassword();
        Assert.assertEquals(getTitle(), "Change Password • Instagram");
    }

    @Test
    public void Clickoneditorofile() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Assert.assertEquals(getTitle(), "Instagram");
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
    }

    @Test
    public void clickoname() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Assert.assertEquals(getTitle(), "Instagram");
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnName();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");

    }

    @Test
    public void clickonusername() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        waitFor(5);
        settings.OnUsername();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        waitFor(5);
    }


    @Test
    public void clickonwebsite() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnWebsite();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
    }

    @Test
    public void clickonbio() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.onBio();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");

    }

    @Test
    public void clickonemailaddress() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnEmailaddress();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
    }

    @Test
    public void clickonphonenumber() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnPhonenumber();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
    }

    @Test
    public void clickongender() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        waitFor(5);
        settings.OnGender();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        waitFor(5);
    }

    @Test
    public void clickonsimilaraccount() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        waitFor(5);
        settings.OnSimilaraccountsuggestions();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        waitFor(5);
    }

    @Test
    public void clickonchangepicture() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        waitFor(5);
        settings.OnChangeprofilepicture();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        waitFor(5);
    }

    @Test
    public void clickonappsandwebsites() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnAppsandwebsites();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
    }

    @Test
    public void clickonemailandsms() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnEmailandsms();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        waitFor(5);
    }

    @Test
    public void clickonnotifications() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnPushnotifications();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        waitFor(5);
    }

    @Test
    public void clickonmanagecontacts() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnManagecontacts();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
    }

    @Test
    public void clickonprivacyandsecurity() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnPrivacyandsecurity();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
    }

    @Test
    public void clickonloginactivity() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnLoginactivity();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        waitFor(5);
    }

    @Test
    public void clcikononemailsfrominstagram() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnEmailsfrominstagram();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        waitFor(5);
    }

    @Test
    public void clickprivacyandsecurityhelp() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnPrivacyandsecurityhelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
    }

    @Test
    public void clickOnHelp() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        waitFor(5);
    }

    @Test
    public void clickOnsupportrequests() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        waitFor(5);
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        waitFor(5);
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        waitFor(4);
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        waitFor(5);
        settings.OnSupportrequests();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        waitFor(5);
    }



    @Test
    public void clickonIdentifyasblackownedbusinesswoman() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        help.OnDiscoverblackownedshoponinstagram();
        help.OnIdentifyAsblackownedbusinesswoman();
    }

    @Test
    public void clickonMusiconinstagram() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        help.OnDiscoverblackownedshoponinstagram();
        waitFor(2);
        help.OnMusiconinstagram();

    }

    @Test
    public void clickonReelsoninstagram() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        help.OnDiscoverblackownedshoponinstagram();
        help.OnMusiconinstagram();
        help.OnReelsoninstagram();

    }

    @Test
    public void clickonHowdoideletemyinstagramaccount() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        help.OnDiscoverblackownedshoponinstagram();
        settings.OnHowdoideletemyinstagramaccount();

    }

    @Test
    public void clickonTipsforpeoplestrugglingwithaneatingdisorder() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        waitFor(2);
        // Assert.assertEquals(getTitle(),"Instagram Help Centre");
        help.OnDiscoverblackownedshoponinstagram();
        settings.OnTipsforpeoplestrugglingwithaneatingdisorder();
        waitFor(2);

    }

    @Test
    public void clickCheckoutoninstagram() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        help.OnDiscoverblackownedshoponinstagram();
        settings.OnCheckoutoninstagram();

    }

    @Test
    public void clickonHowcanitellwhoseenmystory() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        waitFor(2);
        // Assert.assertEquals(getTitle(),"Instagram Help Centre");
        help.OnDiscoverblackownedshoponinstagram();
        waitFor(2);
        settings.OnHowcanitellwhosseenmystory();
    }

    @Test
    public void clickoncheckaccountstatus() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
    }


    @Test
    public void clickOnSwitchtoprofessionalaccount() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnSwitchtoprofessionalaccount();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
    }

    @Test
    public void clickonArrow() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        waitFor(2);
        settings.OnArrow();
    }
    @Test
    public void clickonInstagramfeatures() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        waitFor(2);
        settings.OnInstagramfeatures();}
    @Test
    public void clickonYourprofile() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnYourprofile();}
    @Test
    public void clickonDirectmessaging() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnDirectmessaging();}
    @Test
    public void clickonSharephots() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnSharingphotosandvideos();}
    @Test
    public void clickonExplorephots() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnExploringphotosandvideos();}

    @Test
    public void clickonStories() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnStories();}
    @Test
    public void clickonReels() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnReels();}
    @Test
    public void clickonLive() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnLive();}
    @Test
    public void clickonVideos() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnVideos();}
    @Test
    public void clickonFundraise() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnFundraiseranddonation();}
    @Test
    public void clickonArrowup() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnFundraiseranddonation();
        settings.OnArrowup();}
    @Test
    public void clickonPersonalfund() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnFundraiseranddonation();
        settings.OnArrowup();
        settings.OnPersonalfundraiser();
    }
   @Test
    public void clickonCharityFund() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
       Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnFundraiseranddonation();
        settings.OnArrowup();
        settings.OnCharityfundraiser();}

    @Test
    public void clickonShops() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnShops();}
    @Test
    public void clickonHowdoishop() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnShops();
        settings.OnHowdoishopininstagram();
    }
    @Test
    public void clickonHowdoibuysomethingoninstagram() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnShops();
        settings.OnHowdoibuysomethingoninstagram();
    }
    @Test
    public void clickonHowcanitrackorders() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnShops();
        settings.OnHowcanitrackorders();
    }
    @Test
    public void clickonHowdoicontacttheshop() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnShops();
        settings.OnHowdoicontacttheshop();
    }
    @Test
    public void clickonOnArrowdown() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnShops();
        settings.OnArrowdown();
    }
    @Test
    public void clickonCanmyfollowersseepurchases() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnShops();
        settings.OnCanmyfollowersseepurchases();
    }
    @Test
    public void clickonPaymentoninstagram() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnShops();
        settings.OnPaymentsoninstagram();
    }
    @Test
    public void clickonHowdoigetstartedfacebookpay() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnShops();
        settings.OnPaymentsoninstagram();
        settings.OnHowdoigetstartedfacebookpay();
    }
    @Test
    public void clickonHowdoiconnectfacebookpay() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnShops();
        settings.OnPaymentsoninstagram();
        settings.OnHowdoiconnectfacebookpay();
    }
    @Test
    public void clickonWhatisashoppay() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnShops();
        settings.OnPaymentsoninstagram();
        settings.OnWhatisashoppay();
    }
    @Test
    public void clickonInstagrampolicypages() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnShops();
        settings.OnPaymentsoninstagram();
        settings.OnInstagrampolicypages();
    }
    @Test
    public void clickonPayingforinstagramadd() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnShops();
        settings.OnPaymentsoninstagram();
        settings.OnPayingforinstagramadd();
    }

    @Test
    public void clickonShopsoninstagramwork() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnShops();
        settings.OnHowdoshopsoninstagramwork();}
   @Test
    public void clickonHowdoiusewishlist() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnShops();
        settings.OnHowdowishlistworkoninstagram();}
    @Test
    public void clickonBasketfeature() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnInstagramfeatures();
        settings.OnShops();
        settings.OnHowdoiuseinstagrambasketfeature();}
    @Test
    public void clickonManageyouraccount() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnManageyouraccount();
    }
    @Test
    public void clickonSigningupandgettingstarted() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnManageyouraccount();
        settings.OnSigningupandgettingstarted();
    }
    @Test
    public void clickonCreatingaccountandusername() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnManageyouraccount();
        settings.OnCreatingaccountandusername();
    }
    @Test
    public void clickonNavigatingtheapp() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnManageyouraccount();
        settings.OnNavigatingtheapp();
    }
    @Test
    public void clickonSyncingcontacts() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnManageyouraccount();
        settings.OnSyncingcontacts();
    }
    @Test
    public void clickonBirthdaysoninstagram() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnManageyouraccount();
        settings.OnBirthdaysoninstagram();
    }
    @Test
    public void clickonManagingyourfollowers() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnManageyouraccount();
        settings.OnManagingyourfollowers();
    }
    @Test
    public void clickonTroubleshooting() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        home.login();
        Assert.assertEquals(getTitle(), "Instagram");
        home.profilemain();
        Assert.assertEquals(getTitle(), "Instagram");
        home.onSettings();
        Assert.assertEquals(getTitle(), "Instagram");
        settings.OnEditProfile();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        settings.OnHelp();
        Assert.assertEquals(getTitle(), "Edit Profile • Instagram");
        help.OnHelpcenter();
        settings.OnManageyouraccount();
        settings.OnTroubleshooting();}
    }

