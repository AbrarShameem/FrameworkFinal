package us.piit;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SellerCenterPage extends CommonAPI {

    public SellerCenterPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//a[@id='sellercenter_m02_getStarted_button']")
    WebElement getStartedLink;
    @FindBy (xpath = "//a[@id='sellercenter_m02_listingAndMarketing_button']")
    WebElement listingAndMarketingLink;
    @FindBy (xpath = "//a[@id='sellercenter_m02_runYourStore_button']")
    WebElement runYourStoreLink;
    @FindBy (xpath = "//a[@id='sellercenter_m02_shipping_button']")
    WebElement shippingLink;

    @FindBy (xpath = "//a[@id='sellercenter_m02_serviceAndPayments_button']")
    WebElement serviceAndPaymentsLink;
    @FindBy (xpath = "//a[@id='sellercenter_m02_start_selling_button']")
    WebElement startSellingLink;
    @FindBy (xpath = "//a[@id='m22_tb_a1__1']")
    WebElement gettingStartedLink;
    @FindBy (xpath = "//a[@id='m22_tb_a1__2']")
    WebElement feesAndFeaturesLink;

    @FindBy (xpath = "//a[@id='m22_tb_a1__3']")
    WebElement shipTheWayYouWantLink;
    @FindBy (xpath = "//a[@id='m22_tb_a1__4']")
    WebElement whatToSellLink;
    @FindBy (xpath = "//a[@id='m22_tb_a1__5']")
    WebElement simpleToGetPaidLink;
    @FindBy (xpath = "//a[contains(text(),'Expand all')]")
    WebElement expandAllLink;
    @FindBy (xpath = "//a[contains(text(),'Collapse all')]")
    WebElement collapseAllLink;

    public void clickgetStartedLink(){
        click(getStartedLink);
    }
    public void clicklistingAndMarketingLink(){
        click(listingAndMarketingLink);
    }
    public void clickshippingLink(){
        click(shippingLink);
    }
    public void clickserviceAndPaymentsLink(){
        click(serviceAndPaymentsLink);
    }
    public void clickstartSellingLink(){
        click(startSellingLink);
    }
    public void clickgettingStartedLink(){click(gettingStartedLink);}
    public void clickfeesAndFeaturesLink(){
        click(feesAndFeaturesLink);
    }
    public void clickshipTheWayYouWantLink(){
        click(shipTheWayYouWantLink);
    }
    public void clickwhatToSellLink(){
        click(whatToSellLink);
    }
    public void clicksimpleToGetPaidLink(){
        click(simpleToGetPaidLink);
    }
    public void clickexpandAllLink(){
        click(expandAllLink);
    }
    public void clickcollapseAllLink(){
        click(collapseAllLink);
    }


}