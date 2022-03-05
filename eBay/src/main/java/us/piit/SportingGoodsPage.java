package us.piit;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SportingGoodsPage extends CommonAPI {

    public SportingGoodsPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[1]/a[1]")
    WebElement golfClubsLink;
    @FindBy (xpath = "//a[contains(text(),'Electric Bikes')]")
    WebElement electricBikesLink;
    @FindBy (xpath = "//a[contains(text(),'Camping & Hiking Equipment')]")
    WebElement campingHikingEquipmentLink;
    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[4]/a[1]")
    WebElement huntingEquipmentLink;

    @FindBy (xpath = "//span[contains(text(),'Boxing, Martial Arts & MMA')]")
    WebElement boxingMartialArtsMMALink;
    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[2]/button[1]/span[1]")
    WebElement campingAndHikingLink;
    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[3]/button[1]/span[1]")
    WebElement cyclingLink;
    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[4]/button[1]/span[1]")
    WebElement fishingLink;

    @FindBy (xpath = "//span[contains(text(),'Fitness, Running & Yoga')]")
    WebElement fitnessRunningYogaLink;
    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[6]/button[1]/span[1]")
    WebElement golfLink;
    @FindBy (xpath = "//span[contains(text(),'Hunting')]")
    WebElement huntingLink;
    @FindBy (xpath = "//span[contains(text(),'Indoor Games')]")
    WebElement indoorGamesLink;

    public void clickgolfClubsLink(){
        click(golfClubsLink);
    }
    public void clickelectricBikesLink(){
        click(electricBikesLink);
    }
    public void clickcampingHikingEquipmentLink(){
        click(campingHikingEquipmentLink);
    }
    public void clickhuntingEquipmentLink(){
        click(huntingEquipmentLink);
    }

    public void clickboxingMartialArtsMMALink(){
        click(boxingMartialArtsMMALink);
    }
    public void clickcampingAndHikingLink(){
        click(campingAndHikingLink);
    }
    public void clickcyclingLink(){
        click(cyclingLink);
    }
    public void clickfishingLink(){
        click(fishingLink);
    }
    public void clickfitnessRunningYogaLink(){
        click(fitnessRunningYogaLink);
    }
    public void clickgolfLink(){
        click(golfLink);
    }
    public void clickhuntingLink(){
        click(huntingLink);
    }
    public void clickindoorGamesLink(){
        click(indoorGamesLink);
    }


}