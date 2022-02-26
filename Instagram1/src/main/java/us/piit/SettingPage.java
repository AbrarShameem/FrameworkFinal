package us.piit;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class SettingPage extends CommonAPI {
    public SettingPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

        @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/article[1]/form[1]/div[9]/aside[1]/label[1]")
        WebElement Similaraccountsuggestions;

        @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/article[1]/div[1]/div[2]/button[1]")
        WebElement Changeprofilephoto;

        @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/ul[1]/li[3]/a[1]")
        WebElement Appsandwebsites;

        @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/ul[1]/li[4]/a[1]")
        WebElement Emailandsms;

        @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/ul[1]/li[5]/a[1]")
        WebElement Pushnotiications;

        @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/ul[1]/li[6]/a[1]")
        WebElement Managecontacts;
        @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/ul[1]/li[7]/a[1]")
        WebElement Privacyandsecurity;
        @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/ul[1]/li[8]/a[1]")
        WebElement Loginactivity;

        @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/ul[1]/li[9]/a[1]")
        WebElement Emailsfrominstagram;

        @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/ul[1]/li[10]/a[1]")
        WebElement Help;

        @FindBy (xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/ul[1]/div[1]/div[1]/div[1]/a[1]")
        WebElement Switchtoprofessionalaccount;
        @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/article[1]/form[1]/div[4]/aside[1]/label[1]")
        WebElement Bio;
        @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/article[1]/form[1]/div[8]/div[1]/aside[1]/label[1]")
        WebElement Gender;

       @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/article[1]/form[1]/div[2]/aside[1]/label[1]")
       WebElement Username;

       @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/article[1]/form[1]/div[3]/aside[1]/label[1]")
       WebElement Website;

      @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/article[1]/form[1]/div[6]/aside[1]/label[1]")
      WebElement Emailaddress;

      @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/article[1]/form[1]/div[1]/aside[1]/label[1]")
      WebElement Name;

      @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/article[1]/form[1]/div[7]/aside[1]/label[1]")
      WebElement Phonenumber;

     @FindBy(xpath = "//a[contains(text(),'Edit Profile')]")
     WebElement editprofile;
     @FindBy(xpath = "//a[contains(text(),'Change Password')]")
     WebElement Changepassword;

     @FindBy (xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
     WebElement Helpcenter;

     @FindBy (xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]")
     WebElement Privacyandsecurityhelp;

     @FindBy (xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]")
     WebElement Supportrequests;


    public void OnEditProfile() {
        click(editprofile);
    }

    public void OnChangePassword() {
        click(Changepassword);
    }
    public void OnName() {
        click(Name);
    }

    public void OnUsername() {
        click(Username);
    }

    public void OnWebsite() {
        click(Website);
    }

    public void OnEmailaddress() {
        click(Emailaddress);
    }

    public void OnPhonenumber() {
        click(Phonenumber);
    }
    public void onBio() {
        click(Bio);
    }
    public void OnGender() {
        click(Gender);
    }
    public void OnSimilaraccountsuggestions() {
        click(Similaraccountsuggestions);
    }

    public void OnChangeprofilepicture() {
        click(Changeprofilephoto);
    }

    public void OnAppsandwebsites() {
        click(Appsandwebsites);
    }

    public void OnEmailandsms() {
        click(Emailandsms);
    }

    public void OnPushnotifications() {
        click(Pushnotiications);
    }

    public void OnManagecontacts() {
        click(Managecontacts);
    }

    public void OnPrivacyandsecurity() {
        click(Privacyandsecurity);
    }

    public void OnLoginactivity() {
        click(Loginactivity);
    }
    public void OnEmailsfrominstagram(){
        click(Emailsfrominstagram);
    }
    public void OnHelp() {
        click(Help);
    }
    public void OnHelpcenter() {
        click(Helpcenter);}

    public void OnPrivacyandsecurityhelp() {
        click(Privacyandsecurityhelp);
    }

    public void OnSupportrequests() {
        click(Supportrequests);
    }

    public void OnSwitchtoprofessionalaccount(){
        click(Switchtoprofessionalaccount);
    }

}

