import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class TsukiProfile extends CommonAPI {

    @FindBy(css = "div.netflix-sans-font-loaded div.bd.dark-background div.pinning-header div.pinning-header-container div.main-header.has-billboard.menu-navigation div.secondary-navigation div.nav-element:nth-child(4) div.account-menu-item div.account-dropdown-button > span.caret:nth-child(2)")
    WebElement carrotProfile;

    @FindBy(xpath = "//a[contains(text(),'Sign out of Netflix')]")
    WebElement signOutButton1;


    public void CarrotHover() {
        hoverOver();
        selectDropdownOption(signOutButton1,"Sign out of Netflix");

    }