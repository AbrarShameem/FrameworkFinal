package us.piit;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DevelopersPage extends CommonAPI {
    public DevelopersPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
        }

        @FindBy (xpath = "//body[1]/section[1]/header[1]/nav[1]/ul[1]/li[1]/a[1]")
        WebElement devSignInLink;
        @FindBy (xpath = "//body[1]/section[1]/header[1]/nav[1]/ul[1]/li[2]/a[1]")
        WebElement registerLink;
        @FindBy (xpath = "//body[1]/section[1]/header[1]/nav[1]/ul[1]/li[3]/a[1]")
        WebElement forumsLink;
        @FindBy (xpath = "//body[1]/section[1]/header[1]/nav[1]/ul[1]/li[4]/a[1]")
        WebElement docsAndKBsLink;

        @FindBy (xpath = "//body[1]/section[1]/header[1]/nav[1]/ul[1]/li[5]/a[1]")
        WebElement supportLink;
        @FindBy (xpath = "//body[1]/section[1]/header[1]/nav[1]/ul[1]/li[6]/a[1]")
        WebElement toolsAndSamplesLink;
        @FindBy (xpath = "//body[1]/section[1]/header[1]/nav[1]/ul[1]/li[7]/a[1]")
        WebElement growthLink;
        @FindBy (xpath = "//div[contains(text(),'Buy APIs')]")
        WebElement buyAPIsLink;

        @FindBy (xpath = "//div[contains(text(),'Sell APIs')]")
        WebElement sellAPIsLink;
        @FindBy (xpath = "//div[contains(text(),'Commerce APIs')]")
        WebElement commerceAPIsLink;
        @FindBy (xpath = "//div[contains(text(),'Developer APIs')]")
        WebElement developersAPIsLink;
        @FindBy (xpath = "//span[contains(text(),'Developer Help Center')]")
        WebElement developerHelpCenterLink;
        @FindBy (xpath = "//span[contains(text(),'Developer Sandbox')]")
        WebElement developerSandboxLink;

    public void clickDevSignInLink(){
            click(devSignInLink);
            }
    public void clickregisterLink(){
            click(registerLink);
            }
    public void clickforumsLink(){
            click(forumsLink);
            }
    public void clickdocsAndKBsLink(){
            click(docsAndKBsLink);
            }
    public void clicksupportLink(){
            click(supportLink);
            }
    public void clicktoolsAndSamplesLink(){
            click(toolsAndSamplesLink);
            }
    public void clickgrowthLink(){
            click(growthLink);
            }
    public void clickbuyAPIsLink(){
            click(buyAPIsLink);
            }
    public void clicksellAPIsLink(){
            click(sellAPIsLink);
            }
    public void clickcommerceAPIsLink(){
            click(commerceAPIsLink);
            }
    public void clickdevelopersAPIsLink(){
            click(developersAPIsLink);
            }
    public void clickdeveloperHelpCenterLink(){
            click(developerHelpCenterLink);
            }
    public void clickdeveloperSandboxLink(){
            click(developerSandboxLink);
            }

}