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
public class PolicyCase extends CommonAPI{

    @Test
    public void clickonPolicies() {
        HomePage home = new HomePage(driver);
        SettingPage settings = new SettingPage(driver);
        ProfilePage profile = new ProfilePage(driver);
        Help help = new Help(driver);
        Policies policies = new Policies(driver);
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
        policies.OnPoliciesandreporting();}
}