package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Action;
import org.testng.Assert;

public class  Construction_RealStateItem extends CommonAPI {
    public Construction_RealStateItem(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'All Categories')]")
    WebElement AllCategories;
    @FindBy (xpath = "//body/div[4]/div[3]/div[1]/div[2]/div[1]/div[2]")
    WebElement Construction_RealState;
    @FindBy (xpath = "//div[contains(text(),'Bathroom & Kitchen')]")
    WebElement Bathroom_Kitchen;
    @FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]")
    WebElement BathroomVanities;
    @FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]")
    WebElement KitchenSink;

    @FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/a[1]")
    WebElement Building_IndustrialGlass;
    @FindBy (xpath = "//body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]")
    WebElement BulletProofGlass;
    @FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]")
    WebElement ElectricGlass;
    @FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]")
    WebElement TintedGlass;
    @FindBy (xpath = "//div[contains(text(),'Ceilings')]")
    WebElement Ceilings;
    @FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/a[1]")
    WebElement CornerGuards;
    @FindBy (xpath = "//div[contains(text(),'Countertops,Vanity Tops & Table Tops')]")
    WebElement Tops;

    public void clickAllCategories(){
        click(AllCategories);
    }
    public void clickConstruction_RealState(){
        click(Construction_RealState);
    }
    public void clickBathroom_Kitchen(){
        click(Bathroom_Kitchen);
    }
    public void clickBathroomVanities(){
        click(BathroomVanities);
    }
    public void clickKitchenSink(){
        click(KitchenSink);
    }
    public void clickBuilding_IndustrialGlass(){
        click(Building_IndustrialGlass);
    }
    public void clickBulletProofGlass(){
        click(BulletProofGlass);
    }
    public void clickElectricGlass(){
        click(ElectricGlass);
    }
    public void clickTintedGlass(){
        click(TintedGlass);
    }
    public void clickCeilings(){
        click(Ceilings);
    }
    public void clickCornerGuards(){
        click(CornerGuards);
    }
    public void clickTops(){
        click(Tops);
    }




}