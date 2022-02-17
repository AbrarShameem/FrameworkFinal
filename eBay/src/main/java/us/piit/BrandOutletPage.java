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

}
