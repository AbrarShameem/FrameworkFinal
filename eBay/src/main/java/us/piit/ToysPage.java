package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ToysPage extends CommonAPI {
    public ToysPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Action Figures & Accessories')]")
    WebElement actionFiguresAndAccessoriesLink;
    @FindBy(xpath = "//span[contains(text(),'Beanbag Plush')]")
    WebElement beanbagPlushLink;
    @FindBy(xpath = "//span[contains(text(),'Building Toys')]")
    WebElement buildingToysLink;
    @FindBy(xpath = "//span[contains(text(),'Classic Toys')]")
    WebElement classicToysLink;

    @FindBy(xpath = "//span[contains(text(),'Collectible Card Games')]")
    WebElement collectibleCardGamesLink;
    @FindBy(xpath = "//span[contains(text(),'Diecast & Toy Vehicles')]")
    WebElement diecastAndToyVehiclesLink;
    @FindBy (xpath = "//span[contains(text(),'Educational')]")
    WebElement educationalToysLink;
    @FindBy(xpath = "//span[contains(text(),'Electronic, Battery & Wind-Up')]")
    WebElement electronicBatteryWindupLink;

    @FindBy(xpath = "//span[contains(text(),'Fast Food & Cereal Premiums')]")
    WebElement fastFoodAndCerealPremiumslink;
    @FindBy(xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[10]/button[1]/span[1]")
    WebElement gamesLink;
    @FindBy(xpath = "//a[contains(text(),'Marbles')]")
    WebElement marblesLink;
    @FindBy (xpath = "//span[contains(text(),'Model Railroads & Trains')]")
    WebElement modelRailroadsTrainsLink;

    @FindBy(xpath = "//span[contains(text(),'Models & Kits')]")
    WebElement modelsAndKitsLink;
    @FindBy(xpath = "//span[contains(text(),'Outdoor Toys & Structures')]")
    WebElement outdoorToysAndStructuresLink;
    @FindBy(xpath = "//span[contains(text(),'Preschool Toys & Pretend Play')]")
    WebElement preschoolToysLink;
    @FindBy (xpath = "//span[contains(text(),'Puzzles')]")
    WebElement puzzlesLink;

    public void clickactionFiguresAndAccessoriesLink(){
        click(actionFiguresAndAccessoriesLink);
    }
    public void clickbeanbagPlushLink(){
        click(beanbagPlushLink);
    }
    public void clickbuildingToysLink(){
        click(buildingToysLink);
    }
    public void clickclassicToysLink(){
        click(classicToysLink);
    }
    public void clickcollectibleCardGamesLink(){
        click(collectibleCardGamesLink);
    }
    public void clickdiecastAndToyVehiclesLink(){
        click(diecastAndToyVehiclesLink);
    }
    public void clickeducationalToysLink(){
        click(educationalToysLink);
    }
    public void clickelectronicBatteryWindupLink(){
        click(electronicBatteryWindupLink);
    }
    public void clickfastFoodAndCerealPremiumslink(){
        click(fastFoodAndCerealPremiumslink);
    }
    public void clickGamesLink(){
        click(gamesLink);
    }
    public void clickMarblesLink(){
        click(marblesLink);
    }
    public void clickmodelRailroadsTrainsLink(){
        click(modelRailroadsTrainsLink);
    }
    public void clickmodelsAndKitsLink(){
        click(modelsAndKitsLink);
    }
    public void clickoutdoorToysAndStructuresLink(){
        click(outdoorToysAndStructuresLink);
    }
    public void clickpreschoolToysLink(){
        click(preschoolToysLink);
    }
    public void clickPuzzles(){
        click(puzzlesLink);
    }


}
