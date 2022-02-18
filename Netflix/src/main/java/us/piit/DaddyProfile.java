package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import us.piit.HomePage;


public class DaddyProfile extends CommonAPI {
    public DaddyProfile(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div.netflix-sans-font-loaded div.bd.dark-background div.pinning-header div.pinning-header-container div.main-header.has-billboard.menu-navigation div.secondary-navigation div.nav-element:nth-child(4) div.account-menu-item div.account-dropdown-button > span.caret:nth-child(2)")
    WebElement carrotProfile;

    @FindBy(xpath = "//*[text()='Sign out of Netflix']")
    WebElement signOutButton1;


    public void CarrotHoverOver() {
        hoverOver(driver, carrotProfile);
        //  selectDropdownOption(signOutButton1, "Sign out of Netflix");
        waitFor(3);
        System.out.println("signed out");

    }public void clickonSignOut(){
        click(signOutButton1);
    }
}
