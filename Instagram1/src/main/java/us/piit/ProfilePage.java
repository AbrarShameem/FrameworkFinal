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

public class ProfilePage  extends CommonAPI{
    public ProfilePage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//header/section[1]/ul[1]/li[3]/a[1]/div[1]")
    WebElement following;

    @FindBy(xpath = "//div[contains(text(),'Profile')]")
    WebElement onProfile;

    @FindBy (xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/a[1]/span[1]/span[1]")
    WebElement Posts;

    @FindBy (xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/a[2]/span[1]/span[1]")
    WebElement Videos;
    @FindBy (xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/a[3]/div[1]/span[1]")
    WebElement Saved;

    @FindBy (xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/a[4]/span[1]/span[1]")
    WebElement Tagged;

    @FindBy (xpath= "//body[1]/div[1]/section[1]/footer[1]/div[1]/div[1]/div[1]/div[11]/a[1]/div[1]")
    WebElement Locations;

    @FindBy (xpath= "//body[1]/div[1]/section[1]/footer[1]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]")
    WebElement Meta;

    @FindBy (xpath ="//body[1]/div[1]/section[1]/footer[1]/div[1]/div[1]/div[1]/div[3]/a[1]/div[1]")
    WebElement Blog;

    @FindBy (xpath = "//body[1]/div[1]/section[1]/footer[1]/div[1]/div[1]/div[1]/div[2]/a[1]/div[1]")
    WebElement About;

    @FindBy (xpath = "//body[1]/div[1]/section[1]/footer[1]/div[1]/div[1]/div[1]/div[4]/a[1]/div[1]")
    WebElement Jobs;

    @FindBy (xpath ="//body[1]/div[1]/section[1]/footer[1]/div[1]/div[1]/div[1]/div[5]/a[1]/div[1]")
    WebElement Help;

    @FindBy (xpath = "//body[1]/div[1]/section[1]/footer[1]/div[1]/div[1]/div[1]/div[6]/a[1]/div[1]")
    WebElement API;

    @FindBy (xpath = "//body[1]/div[1]/section[1]/footer[1]/div[1]/div[1]/div[1]/div[7]/a[1]/div[1]")
    WebElement Privacy;

    @FindBy (xpath = "//body[1]/div[1]/section[1]/footer[1]/div[1]/div[1]/div[1]/div[8]/a[1]/div[1]")
    WebElement Terms;

    @FindBy (xpath = "//body[1]/div[1]/section[1]/footer[1]/div[1]/div[1]/div[1]/div[9]/a[1]/div[1]")
    WebElement Topaccounts;

    @FindBy (xpath = "//body[1]/div[1]/section[1]/footer[1]/div[1]/div[1]/div[1]/div[10]/a[1]/div[1]")
    WebElement Hashtags;

    @FindBy (xpath = "//body[1]/div[1]/section[1]/footer[1]/div[1]/div[1]/div[1]/div[10]/a[1]/div[1]")
    WebElement Instagramlite;

    @FindBy (xpath = "//body[1]/div[1]/section[1]/footer[1]/div[1]/div[2]/div[1]/span[1]/select[1]")
    WebElement English;

    @FindBy (xpath = "//body[1]/div[1]/section[1]/footer[1]/div[1]/div[2]/div[2]/div[1]")
    WebElement Instagramfrommeta;

    @FindBy (xpath = "//body[1]/div[1]/section[1]/nav[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[6]/div[2]/div[2]/div[2]/a[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]")
    WebElement Profile;

    @FindBy (xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]")
    WebElement Unitedstates;

    @FindBy (xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/a[1]")
    WebElement Brazil;

    public void OnUnitedstates(){
        click(Unitedstates);
    }

    public void OnBrazil(){
        click(Brazil);
    }

    public void onProfile(){
        click(Profile);
    }
    public void OnPosts(){
        click(Posts);
    }
    public void OnVideos(){
        click(Videos);
    }
    public void OnSaved() {
        click(Saved);
    }

    public void OnTagged(){
        click(Tagged);
    }
    public void onFollowing() {
        click(following);
    }

    public void secondProfile() {
        click(onProfile);
    }

    public void OnLocations(){
        click(Locations);
    }
    public void OnMeta(){
        click(Meta);
    }
    public void OnAbout(){
        click(About);
    }
    public void OnBlog(){
        click(Blog);
    }
    public void OnJobs() {
        click(Jobs);
    }
    public void OnHelp(){
        click(Help);
    }
    public void OnAPI(){
        click(API);
    }
    public void OnPrivacy(){
        click(Privacy);
    }
    public void OnTerms(){
        click(Terms);
    }
    public void OnTopaccounts(){
        click(Topaccounts);
    }
    public void OnHashtags(){
        click(Hashtags);
    }
    public void OnInstagramlite(){
        click(Instagramlite);
    }
    public void OnEnglish(){
        click(English);
    }
    public void OnInstagramfrommeta(){
        click(Instagramfrommeta);
    }
}
