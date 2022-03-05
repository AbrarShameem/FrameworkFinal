package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MotorsPage extends CommonAPI {
    public MotorsPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'All Parts & Accessories')]")
    WebElement allPartsAccessoriesLink;
    @FindBy(xpath = "//a[contains(text(),'Apparel, Protective Gear & Merchandise')]")
    WebElement apparelProtectiveGearLink;
    @FindBy(xpath = "//a[contains(text(),'ATV, Side-by-Side, & UTV Parts')]")
    WebElement atvUtvPartsLink;
    @FindBy(xpath = "//a[contains(text(),'Automotive Tools & Supplies')]")
    WebElement automotiveToolsSuppliesLink;
    @FindBy(xpath = "//a[contains(text(),'Boat Parts')]")
    WebElement boatPartsLink;
    @FindBy(xpath = "//a[contains(text(),'Car & Truck Parts')]")
    WebElement carTruckPartsLink;
    @FindBy (xpath = "//a[contains(text(),'Commercial Truck Parts')]")
    WebElement commercialTruckPartsLink;

    @FindBy(xpath = "//a[contains(text(),'In-Car Technology, GPS & Security')]")
    WebElement inCarGPSSecurityLink;
    @FindBy(xpath = "//a[contains(text(),'Motorcycle Parts')]")
    WebElement motorcyclePartsLink;
    @FindBy(xpath = "//a[contains(text(),'Performance & Racing Parts')]")
    WebElement performanceAndRacingPartsLink;
    @FindBy(xpath = "//a[contains(text(),'RV, Trailer & Camper Parts')]")
    WebElement rvTrailerCamperPartsLink;
    @FindBy (xpath = "//a[contains(text(),'Safety & Security Accessories')]")
    WebElement safetySecurityAccessoriesLink;
    @FindBy(xpath = "//a[contains(text(),'Snowmobile Parts')]")
    WebElement snowMobilePartsLink;
    @FindBy(xpath = "//a[contains(text(),'Wheels, Tires & Parts')]")
    WebElement wheelsTiresAndPartsLink;

    public void clickallPartsAccessoriesLink(){click(allPartsAccessoriesLink);
    }
    public void clickapparelProtectiveGearLink(){click(apparelProtectiveGearLink);
    }
    public void clickatvUtvPartsLink(){click(atvUtvPartsLink);
    }
    public void clickautomotiveToolsSuppliesLink(){click(automotiveToolsSuppliesLink);
    }
    public void clickboatPartsLink(){click(boatPartsLink);
    }
    public void clickcarTruckPartsLink(){click(carTruckPartsLink);
    }
    public void clickcommercialTruckPartsLink(){click(commercialTruckPartsLink);
    }
    public void clickinCarGPSSecurityLink(){
        click(inCarGPSSecurityLink);
    }
    public void clickmotorcyclePartsLink(){
        click(motorcyclePartsLink);
    }
    public void clickperformanceAndRacingPartsLink(){
        click(performanceAndRacingPartsLink);
    }
    public void clickrvTrailerCamperPartsLink(){
        click(rvTrailerCamperPartsLink);
    }
    public void clicksafetySecurityAccessoriesLink(){
        click(safetySecurityAccessoriesLink);
    }
    public void clicksnowMobilePartsLink(){
        click(snowMobilePartsLink);
    }
    public void clickwheelsTiresAndPartsLink(){
        click(wheelsTiresAndPartsLink);
    }
}
