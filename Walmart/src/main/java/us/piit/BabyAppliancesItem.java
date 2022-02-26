package us.piit;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import java.util.List;

public class BabyAppliancesItem extends CommonAPI {
    public BabyAppliancesItem(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//header/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement AllCategories;
    @FindBy(xpath = "///body/div[3]/div[3]/div[4]/div[1]/a[1]/div[1]/div[1]/div[2]")
    WebElement Babytoddler;
    @FindBy(xpath = "//body/div[3]/div[3]/div[8]/div[1]/a[1]/div[1]/div[1]/div[2]")
    WebElement ElectricToothbrush;
    @FindBy(xpath = "//body/div[3]/div[3]/div[18]/div[1]/a[1]/div[1]/div[1]/div[2]")
    WebElement OralCleaner;
    @FindBy(xpath = "//body/div[3]/div[3]/div[23]/div[1]/div[1]/div[19]/div[1]/a[1]/div[1]/div[1]/div[2]")
    WebElement FoodMaker;
    @FindBy(xpath = "//body/div[3]/div[3]/div[23]/div[1]/div[1]/div[81]/div[1]/a[1]/div[1]/div[1]/div[2]")
    WebElement HairClipper;
    @FindBy(xpath = "//body/div[3]/div[3]/div[23]/div[1]/div[1]/div[86]/div[1]/a[1]/div[1]/div[1]/div[2]")
    WebElement WashingMachine;
    @FindBy(xpath = "//span[contains(text(),'Multi-functional high capacity 6 bottles baby bott')]")
    WebElement  BottleSteriliser;
    @FindBy(xpath = "//body/div[3]/div[2]/div[6]/div[1]/a[1]/div[1]/div[1]/div[2]")
    WebElement  BottleWarmer;

    public void clickAllCategories(){
        click(AllCategories);
    }

    public void clickBabytoddler(){
        click(Babytoddler);
    }
    public void clickElectricToothbrush(){
        click(ElectricToothbrush);
    }
    public void clickOralCleaner(){
        click(OralCleaner);
    }
    public void clickFoodMaker(){
        click(FoodMaker);
    }

    public void clickHairClipper(){
        click(HairClipper);
    }
    public void clickWashingMachine(){
        click(WashingMachine);
    }
    public void clickBottleSteriliser(){
        click(BottleSteriliser);
    }
    public void clickBottleWarmer(){
        click(BottleWarmer);
    }



}