package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Action;
import org.testng.Assert;

    public class  FurnitureItem extends CommonAPI {
        public FurnitureItem(WebDriver driver) {
            super.driver = driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//span[contains(text(),'All Categories')]")
        WebElement AllCategories;
        @FindBy (xpath = "//body/div[4]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[5]/a[2]")
        WebElement Furniture;
        @FindBy (xpath = "//div[contains(text(),'Commercial Furniture')]")
        WebElement CommercialFurniture;
        @FindBy (xpath = "//div[contains(text(),'Furniture Accessories')]")
        WebElement FurnitureAccessories;
        @FindBy (xpath = "//div[contains(text(),'Furniture Hardware')]")
        WebElement FurnitureHardware;

        @FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/a[1]")
        WebElement FurnitureParts;
        @FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/a[1]")
        WebElement HomeFurniture;
        @FindBy (xpath = "//div[contains(text(),\"Kid's Furniture\")]")
        WebElement KidsFurniture;
        @FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[7]/a[1]")
        WebElement OtherFurniture;

        @FindBy (xpath = "//div[contains(text(),'Outdoor Furniture')]")
        WebElement OutdoorFurniture;
        @FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]")
        WebElement HospitalFurniture;

        public void clickAllCategories(){
            click(AllCategories);
        }
        public void clickFurniture(){
            click(Furniture);
        }
        public void clickCommercialFurniture(){
            click(CommercialFurniture);
        }
        public void clickFurnitureAccessories(){
            click(FurnitureAccessories);
        }
        public void clickFurnitureHardware(){
            click(FurnitureHardware);
        }
        public void clickFurnitureParts(){
            click(FurnitureParts);
        }
        public void clickHomeFurniture(){
            click(HomeFurniture);
        }
        public void clickKidsFurniture(){
            click(KidsFurniture);
        }
        public void clickOtherFurniture(){
            click(OtherFurniture);
        }
        public void clickOutdoorFurniture(){
            click( OutdoorFurniture);
        }
        public void clickHospitalFurniture(){
            click(HospitalFurniture);
        }



    }
