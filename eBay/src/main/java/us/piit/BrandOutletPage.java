package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BrandOutletPage extends CommonAPI {

    public BrandOutletPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'Clothing')]")
    WebElement clothingLinkDropdown;
    @FindBy(xpath = "//span[contains(text(),'Handbags')]")
    WebElement handbagsLinkDropdown;
    @FindBy(xpath = "//span[contains(text(),'Jewelry')]")
    WebElement jewelryLinkDropdown;
    @FindBy(xpath = "//span[contains(text(),'Watches')]")
    WebElement watchesLinkDropdown;

    @FindBy(xpath = "//span[contains(text(),'Bedding')]")
    WebElement beddingLinkDropdown;
    @FindBy(xpath = "//span[contains(text(),'Floorcare')]")
    WebElement floorcareLinkDropdown;
    @FindBy (xpath = "//span[contains(text(),'Home Decor')]")
    WebElement homeDecorLinkDropdown;
    @FindBy(xpath = "//span[contains(text(),'Kitchen')]")
    WebElement kitchenLinkDropdown;

    @FindBy(xpath = "//span[contains(text(),'Tools')]")
    WebElement toolsLinkDropdown;
    @FindBy(xpath = "//span[contains(text(),'Accessories')]")
    WebElement accessoriesLinkDropdown;
    @FindBy(xpath = "//span[contains(text(),'Computers & Laptops')]")
    WebElement computersAndLaptopsLinkDropdown;
    @FindBy (xpath = "//span[contains(text(),'Smartphones')]")
    WebElement smartphonesDropdownLink;

    public void clickClothingLinkDropdown() {
        click(clothingLinkDropdown);
    }
    public void clickHandbagsLinkDropdown(){
        click(handbagsLinkDropdown);
    }
    public void clickJewelryLinkDropdown(){
        click(jewelryLinkDropdown);
    }
    public void clickWatchesLinkDropdown(){
        click(watchesLinkDropdown);
    }
    public void clickBeddingLinkDropdown(){
        click(beddingLinkDropdown);
    }
    public void clickFloorcareLinkDropdown(){
        click(floorcareLinkDropdown);
    }
    public void clickHomeDecorLinkDropdown(){
        click(homeDecorLinkDropdown);
    }
    public void clickKitchenLinkDropdown(){
        click(kitchenLinkDropdown);
    }
    public void clickToolsLinkDropdown(){
        click(toolsLinkDropdown);
    }
    public void clickAccessoriesLinkDropdown(){
        click(accessoriesLinkDropdown);
    }
    public void clickComputersAndLaptopsLinkDropdown(){
        click(computersAndLaptopsLinkDropdown);
    }
    public void clickSmartphonesDropdownLink(){
        click(smartphonesDropdownLink);
    }

}
