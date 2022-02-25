package us.piit;
import base.CommonAPI;
import com.google.protobuf.ExperimentalApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HelpAndContactPage extends CommonAPI {

    public HelpAndContactPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//input[@id='search_input_element']")
    WebElement searchbarEbayHelp;
    @FindBy (xpath = "//h2[contains(text(),'Buying as a guest')]")
    WebElement buyingAsGuestLink;
    @FindBy (xpath = "//h2[contains(text(),\"Get help with an item that hasn't arrived\")]")
    WebElement itemHasNotArrivedLink;
    @FindBy (xpath = "//h2[contains(text(),'Get help with a hacked account')]")
    WebElement hackedAccountHelpLink;

    @FindBy (xpath = "//h2[contains(text(),'Get help if you bought as a guest')]")
    WebElement buyingAsGuestHelpLink;
    @FindBy (xpath = "//h2[contains(text(),'Signing up for an eBay account')]")
    WebElement signUpForEbayLink;
    @FindBy (xpath = "//h2[contains(text(),'Reset your password')]")
    WebElement resetPasswordLinkLink;

    public void clickFeaturedDropdown(){
        typeAndEnter(searchbarEbayHelp, "how do i delete my account?");
    }
    public void clickBuyingAsGuestLink(){
        click(buyingAsGuestLink);
    }
    public void clickItemHasNotArrivedLink(){
        click(itemHasNotArrivedLink);
    }
    public void clickHackedAccountHelp(){
        click(hackedAccountHelpLink);
    }
    public void clickBuyingAsGuest(){
        click(buyingAsGuestLink);
    }
    public void clickBuyingAsGuestHelp(){
        click(buyingAsGuestHelpLink);
    }
    public void clickResetPassword(){
        click(resetPasswordLinkLink);
    }
    public void clickSignUpForEbayLink(){
        click(signUpForEbayLink);
    }


}
