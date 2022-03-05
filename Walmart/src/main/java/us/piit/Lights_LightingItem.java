package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Action;
import org.testng.Assert;

    public class  Lights_LightingItem extends CommonAPI {
        public Lights_LightingItem(WebDriver driver) {
            super.driver = driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//span[contains(text(),'All Categories')]")
        WebElement AllCategories;
        @FindBy (xpath = "//body/div[4]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[4]/a[1]")
        WebElement LightsLighting;
        @FindBy (xpath = "//div[contains(text(),'Commercial & Industrial Lighting')]")
        WebElement CommercialIndustrialLighting;
        @FindBy (xpath = "//div[contains(text(),'Healthcare Lighting')]")
        WebElement HealthcareLighting;
        @FindBy (xpath = "//div[contains(text(),'Holiday Lighting')]")
        WebElement HolidayLighting;

        @FindBy (xpath = "//div[contains(text(),'Indoor Lighting')]")
        WebElement IndoorLighting;
        @FindBy (xpath = "//div[contains(text(),'Landscape Lighting')]")
        WebElement LandscapeLighting;
        @FindBy (xpath = "//div[contains(text(),'Lighting Accessories')]")
        WebElement LightingAccessories;
        @FindBy (xpath = "//div[contains(text(),'Lighting Bulbs & Tubes')]")
        WebElement LightingBulbsTubes;

        @FindBy (xpath = "//div[contains(text(),'Other Lights & Lighting Products')]")
        WebElement LightingProducts;
        @FindBy (xpath = "//div[contains(text(),'Outdoor Lighting')]")
        WebElement OutdoorLighting;
        @FindBy (xpath = "//div[contains(text(),'Professional Lighting')]")
        WebElement ProfessionalLighting;
        @FindBy (xpath = "//div[contains(text(),'Smart lighting')]")
        WebElement Smartlighting;

        public void clickAllCategories(){
            click(AllCategories);
        }
        public void clickLightsLighting(){
            click(LightsLighting);
        }
        public void clickCommercialIndustrialLighting(){
            click(CommercialIndustrialLighting);
        }
        public void clickHealthcareLighting(){
            click(HealthcareLighting);
        }
        public void clickHolidayLighting(){
            click(HolidayLighting);
        }
        public void clickIndoorLighting(){
            click(IndoorLighting);
        }
        public void clickLandscapeLighting(){
            click(LandscapeLighting);
        }
        public void clickLightingAccessories(){
            click(LightingAccessories);
        }
        public void clickLightingBulbsTubes(){
            click(LightingBulbsTubes);
        }
        public void clickLightingProducts(){
            click(LightingProducts);
        }
        public void clickOutdoorLighting(){
            click(OutdoorLighting);
        }
        public void clickProfessionalLighting(){
            click(ProfessionalLighting);
        }
        public void clickSmartlighting() {
            click(Smartlighting);

        }


    }
