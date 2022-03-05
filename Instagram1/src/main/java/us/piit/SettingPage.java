package us.piit;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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

    @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/ul[1]/div[1]/div[1]/div[1]/a[1]")
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

    @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]")
    WebElement Privacyandsecurityhelp;

    @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/article[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/span[1]")
    WebElement Supportrequests;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/span[1]/a[1]")
    WebElement Howdoideletemyinstagramaccount;
    @FindBy(xpath = "//a[text()='Identify as a Black-Owned Business on Instagram']")
    WebElement Identifyingasblackownedbusinessoninstagram;

    @FindBy(xpath = "//a[text()='How can I tell who's seen my Instagram story?']")
    WebElement Howcanitellwhosseenmystory;
    @FindBy(xpath = "//a[text()='Tips for people struggling with an eating disorder']")
    WebElement Tipsforpeoplestrugglingwithaneatingdisorder;
    @FindBy(xpath = "//a[text()='Checkout on Instagram']")
    WebElement Checkoutoninstagram;

    @FindBy(xpath = "//a[text()='Do More with Reels']")
    WebElement Domorewithreels;
    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/i[1]")
    WebElement Arrow;
    @FindBy (xpath = "//span[text()='Instagram features']")
    WebElement Instsgramfeatures;
    @FindBy (xpath = "//span[text()='Your profile']")
    WebElement Yourprofile;

    @FindBy (xpath = "//span[text()='Sharing photos and videos']")
    WebElement Sharingphotosandvideos;
    @FindBy (xpath = "//span[text()='Exploring photos and videos']")
    WebElement Exploringphotosandvideos;
    @FindBy (xpath = "//span[text()='Direct messaging']")
    WebElement Directmessaging;
    @FindBy (xpath = "//span[text()='Stories']")
    WebElement Stories;
    @FindBy (xpath = "//span[text()='Reels']")
    WebElement Reels;
    @FindBy (xpath = "//span[text()='Live']")
    WebElement Live;
    @FindBy (xpath = "//span[text()='Videos']")
    WebElement Videos;
    @FindBy (xpath = "//span[text()='Fundraisers and donations']")
    WebElement Fundraiseranddonation;
    @FindBy(xpath = "iv[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[9]/div[1]/div[1]/div[1]/a[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]")
    WebElement Arrowup;
    @FindBy (xpath ="//span[text()='Personal fundraisers']")
    WebElement Personalfundraisers;
    @FindBy (xpath = "//span[text()='Charity fundraisers']")
    WebElement Charityfundraisers;
    @FindBy (xpath = "//span[text()='Shop']")
    WebElement Shops;
    @FindBy (xpath ="//span[text()='How do I shop on Instagram?']")
    WebElement Howdoishoponinstagram;
    @FindBy (xpath ="//span[text()='How do shops on Instagram work?']")
    WebElement Howdoshopsworkoninstagram;
    @FindBy (xpath = "//span[text()='How do wishlists work on Instagram?']")
    WebElement Howdowishlistworksoninstagram;
    @FindBy (xpath = "//span[text()='How do I use Instagram's basket feature?']")
    WebElement Howdoiuseinstagrambasketfeature;
    @FindBy (xpath = "//span[text()='How do I buy something on Instagram?']")
    WebElement Howdoibuysomethingoninstagram;
    @FindBy (xpath = "//span[text()='How can I track orders that I placed on Instagram?']")
    WebElement Howcanitrackorders;
    @FindBy (xpath = "//span[text()='How do I report a seller or product that I see on Instagram?']")
    WebElement Howdoireportaseller;
    @FindBy (xpath ="//span[text()='How do I contact the shop or Instagram for help with my order?']")
    WebElement Howdoicontacttheshop;
    @FindBy (xpath ="//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/i[1]")
    WebElement Arrowdown;
    @FindBy (xpath ="//span[text()='Can my followers see purchases that I've made on Instagram?']")
    WebElement Canmyfollowersseepurchases;
    @FindBy (xpath = "//span[text()='Payments on Instagram']")
    WebElement Paymentsoninstagram;
    @FindBy (xpath= "//span[text()='How do I get started with Facebook Pay? ']")
    WebElement Howdoigetstartedfacebookpay;
    @FindBy (xpath="//span[text()='How do I connect Facebook Pay across Instagram and Facebook?']")
    WebElement Howdoiconnectfacebookpay;
    @FindBy (xpath="//span[text()=' What is Shop Pay?']")
    WebElement Whatisashoppay;
    @FindBy (xpath="//span[text()=' Instagram policy pages']")
    WebElement Instagrampolicypages;
    @FindBy (xpath="//span[text()=' About paying for Instagram ads']")
    WebElement Payingforinstagramadd;
    @FindBy (xpath ="//span[text()='Manage Your Account']")
    WebElement Manageyouraccount;
    @FindBy (xpath = "//span[text()='Signing up and getting started']")
    WebElement Signingupandgettingstarted;
    @FindBy (xpath ="//span[text()='Creating an Account and Username']")
    WebElement Creatingaccountandusername;
    @FindBy (xpath ="//span[text()='Navigating the app']")
    WebElement Navigatingtheapp;
    @FindBy (xpath ="//span[text()='Syncing contacts and finding people to follow']")
    WebElement Syncingcontacts;
    @FindBy (xpath = "//span[text()='Birthdays on Instagram ']")
    WebElement Birthdaysoninstagram;
    @FindBy (xpath ="//span[text()='Managing your followers']")
    WebElement Managingyourfollowers;
    @FindBy (xpath = "//span[text()='Troubleshooting']")
    WebElement Troubleshooting;





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

    public void OnEmailsfrominstagram() {
        click(Emailsfrominstagram);
    }

    public void OnHelp() {
        click(Help);
    }

    public void OnPrivacyandsecurityhelp() {
        click(Privacyandsecurityhelp);
    }

    public void OnSupportrequests() {
        click(Supportrequests);
    }

    public void OnSwitchtoprofessionalaccount() {
        click(Switchtoprofessionalaccount);
    }

    public void OnHowdoideletemyinstagramaccount() {
        click(Howdoideletemyinstagramaccount);
    }

    public void OnIdentifyingasblackownedbusinessoninstagram() {
        click(Identifyingasblackownedbusinessoninstagram);
    }

    public void OnHowcanitellwhosseenmystory() {
        click(Howcanitellwhosseenmystory);
    }

    public void OnTipsforpeoplestrugglingwithaneatingdisorder() {
        click(Tipsforpeoplestrugglingwithaneatingdisorder);
    }

    public void OnCheckoutoninstagram() {
        click(Checkoutoninstagram);
    }

    public void OnDomorewithreels() {
        click(Domorewithreels);
    }
    public void OnArrow(){
        click(Arrow);
    }
    public void OnInstagramfeatures(){
        click(Instsgramfeatures);
    }
    public void OnYourprofile(){
        click(Yourprofile);
    }
    public void OnSharingphotosandvideos(){
        click(Sharingphotosandvideos);
    }
    public void OnExploringphotosandvideos(){
        click(Exploringphotosandvideos);
    }
    public void OnDirectmessaging(){
        click(Directmessaging);
    }
    public void OnStories(){
        click(Stories);
    }
    public void OnReels(){
        click(Reels);
    }
    public void OnLive(){
        click(Live);
    }
    public void OnVideos(){
        click(Videos);
    }
    public void OnFundraiseranddonation(){
        click(Fundraiseranddonation);
    }
    public void OnArrowup(){
        click(Arrowup);
    }
    public void OnPersonalfundraiser(){
        click(Personalfundraisers);
    }
    public void OnCharityfundraiser(){
        click(Charityfundraisers);
    }
    public void OnShops(){
        click(Shops);
    }
    public void OnHowdoishopininstagram(){
        click(Howdoishoponinstagram);
    }
    public void OnHowdoshopsoninstagramwork(){
        click(Howdoshopsworkoninstagram);
    }
    public void OnHowdowishlistworkoninstagram(){
        click(Howdowishlistworksoninstagram);
    }
    public void OnHowdoiuseinstagrambasketfeature(){
        click(Howdoiuseinstagrambasketfeature);
    }
    public void OnHowdoibuysomethingoninstagram(){
        click(Howdoibuysomethingoninstagram);
    }
    public void OnHowcanitrackorders(){
        click(Howcanitrackorders);
    }
    public void OnHowdoicontacttheshop(){
        click(Howdoicontacttheshop);
    }
    public void OnArrowdown(){
        click(Arrowdown);
    }
    public void OnCanmyfollowersseepurchases(){
        click(Canmyfollowersseepurchases);
    }
    public void OnPaymentsoninstagram(){
        click(Paymentsoninstagram);
    }
    public void OnHowdoigetstartedfacebookpay(){
        click(Howdoigetstartedfacebookpay);
    }
    public void OnHowdoiconnectfacebookpay(){
        click(Howdoiconnectfacebookpay);
    }
    public void OnWhatisashoppay(){
        click(Whatisashoppay);
    }
    public void OnInstagrampolicypages(){
        click(Instagrampolicypages);
    }
    public void OnPayingforinstagramadd(){
        click(Payingforinstagramadd);
    }
    public void OnManageyouraccount(){
        click(Manageyouraccount);
    }
    public void OnSigningupandgettingstarted(){
        click(Signingupandgettingstarted);
    }
    public void OnCreatingaccountandusername(){
        click(Creatingaccountandusername);
    }
    public void OnNavigatingtheapp(){
        click(Navigatingtheapp);
    }
    public void OnSyncingcontacts(){
        click(Syncingcontacts);
    }
    public void OnBirthdaysoninstagram(){
        click(Birthdaysoninstagram);
    }
    public void OnManagingyourfollowers(){
        click(Managingyourfollowers);
    }
    public void OnTroubleshooting(){
        click(Troubleshooting);
    }
}