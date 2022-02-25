package us.piit;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SellPage extends CommonAPI {

    public SellPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//body/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[1]/button[1]")
    WebElement theBasicsLink;
    @FindBy (xpath = "//body/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/button[1]")
    WebElement businessSellingLink;
    @FindBy (xpath = "//body/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/button[1]")
    WebElement tipsForListingLink;
    @FindBy (xpath = "//body/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[4]/button[1]")
    WebElement faqLink;
    @FindBy (xpath = "//body/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[5]/a[1]")
    WebElement myEbayLink;
    @FindBy (xpath = "//body/div[2]/div[2]/main[1]/div[1]/div[1]/section[1]/div[1]/div[1]/a[1]")
    WebElement listAnItemLink;

    public void clicktheBasicsLink(){
        click(theBasicsLink);
    }
    public void clickbusinessSellingLink(){
        click(businessSellingLink);
    }
    public void clicktipsForListingLink(){
        click(tipsForListingLink);
    }
    public void clickfaqLink(){
        click(faqLink);
    }

    public void clickmyEbayLink(){
        click(myEbayLink);
    }
    public void clicklistAnItemLink(){
        click(listAnItemLink);
    }

}