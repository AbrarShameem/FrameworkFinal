package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Bathroom_KitchenItem extends CommonAPI {
    public Bathroom_KitchenItem(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[contains(text(),'All Categories')]")
    WebElement AllCategories;
    @FindBy(xpath = "//body/div[4]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/a[6]/div[1]")
    WebElement HomeAndGarden;
    @FindBy(xpath = "//a[contains(text(),'Bathroom Products')]")
    WebElement BathroomProduct;

    @FindBy(xpath = "//body/div[3]/div[3]/div[23]/div[1]/div[1]/div[74]/div[1]/a[1]/div[1]/div[1]/div[2]")
    WebElement ShowerCurtain;
    @FindBy(xpath = "//a[contains(text(),'Basins')]")
    WebElement Basins;
    @FindBy(xpath = "//span[contains(text(),'OEM&ODM Factory Price plastic washbasin muti-size ')]")
    WebElement WashTubs;
    @FindBy(xpath = "//a[contains(text(),'Bath Mats')]")
    WebElement BathMats;

    @FindBy(xpath = "//body/div[3]/div[2]/div[8]/div[1]/a[1]/div[1]/div[1]/div[2]")
    WebElement FloorMats;

    @FindBy(xpath = "//a[contains(text(),'Bath Pillows')]")
    WebElement BathPillows;

    @FindBy(xpath = "//body/div[3]/div[2]/div[3]/div[1]/a[1]/div[1]/div[1]/div[2]")
    WebElement LuxuryBathPillow;

    @FindBy(xpath = "//a[contains(text(),'Bathroom Sets')]")
    WebElement BathroomSets;
    @FindBy(xpath = "///body/div[3]/div[2]/div[17]/div[1]/a[1]/div[1]/div[1]/div[2]")
    WebElement MatSets;

    public void clickShowerCurtain(){
        click(ShowerCurtain);
    }
    public void clickBasins(){
        click(Basins);
    }
    public void clickWashTubs(){
        click(WashTubs);
    }
    public void clickBathMats(){
        click(BathMats);
    }


    public void clickFloorMats(){
        click(FloorMats);
    }
    public void clickBathPillows(){
        click(BathPillows);
    }
    public void clickLuxuryBathPillow(){
        click(LuxuryBathPillow);
    }
    public void clickBathroomSets(){
        click(BathroomSets);
    }
    public void clickMatSets(){
        click(MatSets);
    }

    public void clickAllCategories(){
        click(AllCategories);
    }
    public void clickHomeAndGarden(){
        click(HomeAndGarden);
    }
    public void clickBathroomProduct(){
        click(BathroomProduct);
    }



}

