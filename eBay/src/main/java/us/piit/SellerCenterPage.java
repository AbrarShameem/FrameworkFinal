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
    @FindBy (xpath = "//body[1]/div[3]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement getStartedLink;
    @FindBy (xpath = "//body[1]/div[3]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[3]/a[1]")
    WebElement listingAndMarketingLink;
    @FindBy (xpath = "//body[1]/div[3]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[4]/a[1]")
    WebElement runYourStoreLink;
    @FindBy (xpath = "//body[1]/div[3]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[5]/a[1]")
    WebElement shippingLink;

    @FindBy (xpath = "//body[1]/div[3]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[6]/a[1]")
    WebElement serviceAndPaymentsLink;
    @FindBy (xpath = "//body[1]/div[3]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[7]/a[1]")
    WebElement startSellingLink;
    @FindBy (xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")
    WebElement gettingStartedLink;
    @FindBy (xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement feesAndFeaturesLink;

    @FindBy (xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")
    WebElement shipTheWayYouWantLink;
    @FindBy (xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[4]/a[1]")
    WebElement whatToSellLink;
    @FindBy (xpath = "//body[1]/div[4]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[5]/a[1]")
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
    public void clickrunYourStoreLink(){
        click(runYourStoreLink);
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
    public void clickgettingStartedLink(){
        click(gettingStartedLink);
    }
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