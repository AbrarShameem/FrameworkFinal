package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CollectiblesAndArtPage extends CommonAPI {
    public CollectiblesAndArtPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//a[contains(text(),'Vintage & Antique Jewelry')]")
    WebElement vintageAntiqueJewelryLink;
    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[2]/a[1]")
    WebElement sportsMemorabiliaLink;
    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[3]/a[1]")
    WebElement stampsLink;
    @FindBy (xpath = "//a[contains(text(),'Dolls & Teddy Bears')]")
    WebElement dollsTeddyBearsLink;

    @FindBy (xpath = "//a[contains(text(),'Art & Craft Supplies')]")
    WebElement artsCraftsSuppliesLink;
    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[6]/a[1]")
    WebElement antiquesLink;
    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[7]/a[1]")
    WebElement artLink;
    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[8]/a[1]")
    WebElement coinsAndPaperMoneyLink;

    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[9]/a[1]")
    WebElement collectiblesLink;
    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[10]/a[1]")
    WebElement entertainmentMemorabiliaLink;
    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[11]/a[1]")
    WebElement potteryAndGlassLink;
    @FindBy (xpath = "//a[contains(text(),'Bullion')]")
    WebElement bullionLink;

    public void clickvintageAntiqueJewelryLink(){
        click(vintageAntiqueJewelryLink);
    }
    public void clicksportsMemorabiliaLink(){
        click(sportsMemorabiliaLink);
    }
    public void clickstampsLink(){
        click(stampsLink);
    }
    public void clickdollsTeddyBearsLink(){
        click(dollsTeddyBearsLink);
    }
    public void clickartsCraftsSuppliesLink(){
        click(artsCraftsSuppliesLink);
    }
    public void clickantiquesLink(){
        click(antiquesLink);
    }
    public void clickartLink(){
        click(artLink);
    }
    public void clickcoinsAndPaperMoneyLink(){
        click(coinsAndPaperMoneyLink);
    }
    public void clickcollectiblesLink(){
        click(collectiblesLink);
    }
    public void clickentertainmentMemorabiliaLink(){
        click(entertainmentMemorabiliaLink);
    }
    public void clickpotteryAndGlassLink(){
        click(potteryAndGlassLink);
    }
    public void clickbullionLink(){
        click(bullionLink);
    }
}
