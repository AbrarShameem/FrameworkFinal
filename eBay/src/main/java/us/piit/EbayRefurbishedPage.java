package us.piit;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EbayRefurbishedPage extends CommonAPI {
public EbayRefurbishedPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
        }

        @FindBy (xpath = "//a[contains(text(),'Certified Refurbished')]")
        WebElement certifiedRefurbishedLink;
        @FindBy (xpath = "//a[contains(text(),'Excellent Refurbished')]")
        WebElement excellentRefurbishedLink;
        @FindBy (xpath = "//a[contains(text(),'Very Good Refurbished')]")
        WebElement veryGoodRefurbishedLink;
        @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[4]/a[1]")
        WebElement goodRefurbishedLink;

        @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[1]/a[1]")
        WebElement laptopsLink;
        @FindBy (xpath = "//span[contains(text(),'Cell Phones, Smart Watches & Accessories')]")
        WebElement cellphonesSmartWatchesAccessoriesLink;
        @FindBy (xpath = "//span[contains(text(),'Cameras & Camera Drones')]")
        WebElement camerasCameraDronesLink;
        @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[4]/a[1]")
        WebElement desktopComputersLink;

        @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[5]/a[1]")
        WebElement monitorsLink;
        @FindBy (xpath = "//span[contains(text(),'PC gaming')]")
        WebElement pcGamingLink;
        @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[7]/a[1]")
        WebElement portableAudioAndHeadphonesLink;
        @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[8]/a[1]")
        WebElement tabletsLink;

        public void clickcertifiedRefurbishedLink(){
                click(certifiedRefurbishedLink);
                }
        public void clickexcellentRefurbishedLink(){
                click(excellentRefurbishedLink);
                }
        public void clickveryGoodRefurbishedLink(){
                click(veryGoodRefurbishedLink);
                }
        public void clickgoodRefurbishedLink(){
                click(goodRefurbishedLink);
                }
        public void clicklaptopsLink(){
                click(laptopsLink);
                }
        public void clickcellphonesSmartWatchesAccessoriesLink(){
                click(cellphonesSmartWatchesAccessoriesLink);
                }
        public void clickcamerasCameraDronesLink(){
                click(camerasCameraDronesLink);
                }
        public void clickdesktopComputersLink(){
                click(desktopComputersLink);
                }
        public void clickmonitorsLink(){
                click(monitorsLink);
                }
        public void clickpcGamingLink(){
                click(pcGamingLink);
                }
        public void clickportableAudioAndHeadphonesLink(){
                click(portableAudioAndHeadphonesLink);
                }
        public void clicktabletsLink(){ click(tabletsLink);}

}