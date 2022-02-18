package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import us.piit.HomePage;

public class TsukiProfile extends CommonAPI {

    public TsukiProfile(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div.netflix-sans-font-loaded div.bd.dark-background div.pinning-header div.pinning-header-container div.main-header.has-billboard.menu-navigation div.secondary-navigation div.nav-element:nth-child(4) div.account-menu-item div.account-dropdown-button > span.caret:nth-child(2)")
    WebElement carrotProfile;

    @FindBy(xpath = "//*[text()='Sign out of Netflix']")
    WebElement signOutButton1;

    @FindBy(xpath = "//span[contains(text(),'Manage Profiles')]")
    WebElement manageProfiles;

    @FindBy(xpath = "//span[contains(text(),'Account')]")
    WebElement accountButton;


    public void CarrotHoverOver() {
        hoverOver(driver, carrotProfile);
        waitFor(3);
        System.out.println("signed out");

    }
    public void clickOnSignOut(){
        click(signOutButton1);
    }

    public void clickOnManageProfile() {
        click(manageProfiles);
    }

    public void clickOnAccountButton() {
        click(accountButton);
    }

}