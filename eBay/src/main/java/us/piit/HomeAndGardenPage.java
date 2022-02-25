package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomeAndGardenPage extends CommonAPI {
    public HomeAndGardenPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

        @FindBy(xpath = "//span[contains(text(),'Baby Gear')]")
        WebElement babyGearLink;
        @FindBy(xpath = "//span[contains(text(),'Bath')]")
        WebElement bathLink;
        @FindBy(xpath = "//span[contains(text(),'Bedding')]")
        WebElement beddingLink;
        @FindBy(xpath = "//span[contains(text(),'Crafts')]")
        WebElement craftsLink;

        @FindBy(xpath = "//span[contains(text(),'Food & Beverages')]")
        WebElement foodAndBeveragesLink;
        @FindBy(xpath = "//span[contains(text(),'Furniture')]")
        WebElement furnitureLink;
        @FindBy(xpath = "//span[contains(text(),'Home Décor')]")
        WebElement homeDecorLink;
        @FindBy(xpath = "//span[contains(text(),'Home Improvement')]")
        WebElement homeImprovementLink;

        @FindBy(xpath = "//span[contains(text(),'Housekeeping & Organization')]")
        WebElement housekeepingAndOrganizationLink;
        @FindBy(xpath = "//span[contains(text(),'Kitchen Dining & Bar')]")
        WebElement kitchenDiningAndBarLink;
        @FindBy(xpath = "//span[contains(text(),'Major Appliances')]")
        WebElement majorAppliancesLink;
        @FindBy(xpath = "//span[contains(text(),'Pet Supplies')]")
        WebElement petSuppliesLink;
        @FindBy(xpath = "//span[contains(text(),'Wine')]")
        WebElement wineLink;

        public void clickbabyGearLink() {
            click(babyGearLink);
        }

        public void clickbathLink() {
            click(bathLink);
        }

        public void clickbeddingLink() {
            click(beddingLink);
        }

        public void clickcraftsLink() {
            click(craftsLink);
        }

        public void clickfoodAndBeveragesLink() {
            click(foodAndBeveragesLink);
        }

        public void clickfurnitureLink() {
            click(furnitureLink);
        }

        public void clickhomeDecorLink() {
            click(homeDecorLink);
        }

        public void clickhomeImprovementLink() {
            click(homeImprovementLink);
        }

        public void clickhousekeepingAndOrganizationLink() {
            click(housekeepingAndOrganizationLink);
        }

        public void clickmajorAppliancesLink() {
            click(majorAppliancesLink);
        }

        public void clickpetSuppliesLink() {
            click(petSuppliesLink);
        }

        public void clickwineLink() {
            click(wineLink);
        }

        public void clickkitchenDiningAndBarLink() {
            click(kitchenDiningAndBarLink);
        }
}