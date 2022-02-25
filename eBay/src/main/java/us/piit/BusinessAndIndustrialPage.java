package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BusinessAndIndustrialPage extends CommonAPI{
    public BusinessAndIndustrialPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//span[contains(text(),'Agriculture & Forestry Equipment')]")
    WebElement agricultureForestryEquipmentLink;
    @FindBy (xpath = "//span[contains(text(),'Building Materials & Supplies')]")
    WebElement buildingMaterialsSuppliesLink;
    @FindBy (xpath = "//span[contains(text(),'Cleaning & Janitorial Supplies')]")
    WebElement cleaningJanitorialLink;
    @FindBy (xpath = "//span[contains(text(),'CNC, Metalworking & Manufacturing')]")
    WebElement cncMetalWorkingLink;

    @FindBy (xpath = "//span[contains(text(),'Electrical Equipment & Supplies')]")
    WebElement electricalEquipmentSuppliesLink;
    @FindBy (xpath = "//span[contains(text(),'Facility Maintenance & Safety')]")
    WebElement facilityMaintenanceLink;
    @FindBy (xpath = "//span[contains(text(),'Fasteners & Hardware')]")
    WebElement fastenersHardwareLink;
    @FindBy (xpath = "//span[contains(text(),'Healthcare, Lab & Dental')]")
    WebElement healthcareLabDentalLink;

    @FindBy (xpath = "//span[contains(text(),'Heavy Equipment, Parts & Attachments')]")
    WebElement heavyEquipmentPartsAttachmentsLink;
    @FindBy (xpath = "//span[contains(text(),'HVAC & Refrigeration')]")
    WebElement hvacRefrigerationLink;
    @FindBy (xpath = "//span[contains(text(),'Hydraulics, Pneumatics, Pumps & Plumbing')]")
    WebElement hydraulicsPneumaticsLink;
    @FindBy (xpath = "//span[contains(text(),'Industrial Adhesives Sealants & Tapes')]")
    WebElement industrialAdhesivesLink;

    public void clickAgricultureForestryEquipmentLink(){
        click(agricultureForestryEquipmentLink);
    }
    public void clickBuildingMaterialsSuppliesLink(){
        click(buildingMaterialsSuppliesLink);
    }
    public void clickCleaningJanitorialLink(){
        click(cleaningJanitorialLink);
    }
    public void clickCncMetalworkingLink(){
        click(cncMetalWorkingLink);
    }
    public void clickElectricalEquipmentSuppliesLink(){
        click(electricalEquipmentSuppliesLink);
    }
    public void clickFacilityMaintenanceLink(){
        click(facilityMaintenanceLink);
    }
    public void clickFastenersHardwareLink(){
        click(fastenersHardwareLink);
    }
    public void clickHealthcareLabDentalLink(){
        click(healthcareLabDentalLink);
    }
    public void clickHeavyEquipmentPartsAttachmentsLink(){
        click(heavyEquipmentPartsAttachmentsLink);
    }
    public void clickHydraulicsPneumaticsLink(){
        click(hydraulicsPneumaticsLink);
    }
    public void clickHvacRefrigerationLink(){
        click(hvacRefrigerationLink);
    }
    public void clickIndustrialAdhesivesLink(){
        click(industrialAdhesivesLink);
    }
}
