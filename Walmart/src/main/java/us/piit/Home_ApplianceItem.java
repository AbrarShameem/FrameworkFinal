package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Action;
import org.testng.Assert;

    public class  Home_ApplianceItem extends CommonAPI {
        public Home_ApplianceItem(WebDriver driver) {
            super.driver = driver;
            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//span[contains(text(),'All Categories')]")
        WebElement AllCategories;
        @FindBy (xpath = "//header/div[4]/div[1]/div[1]/div[1]/div[1]/h3[1]/span[1]")
        WebElement Categories;
        @FindBy (xpath = "//header/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/a[2]")
        WebElement HomeApplience;
        @FindBy (xpath = "//div[contains(text(),'Air Conditioning Appliances')]")
        WebElement AirConditioningAppliances;
        @FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]")
        WebElement BabyAppliances;

        @FindBy (xpath = "//div[contains(text(),'Cleaning Appliances')]")
        WebElement CleaningAppliances;
        @FindBy (xpath = "//div[contains(text(),'Home Appliance Parts')]")
        WebElement HomeApplianceParts;
        @FindBy (xpath = "//div[contains(text(),'Home Appliances Stocks')]")
        WebElement HomeAppliancesStocks;
        @FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[6]/a[1]")
        WebElement HomeHeaters;

        @FindBy (xpath = "//div[contains(text(),'Laundry Appliances')]")
        WebElement LaundryAppliances;
        @FindBy (xpath = "//div[contains(text(),'Major Kitchen Appliances')]")
        WebElement MajorKitchenAppliances;
        @FindBy (xpath = "//div[contains(text(),'Other Home Appliances')]")
        WebElement OtherHomeAppliances;
        @FindBy (xpath = "//div[contains(text(),'Personal Care & Beauty Appliances')]")
        WebElement BeautyAppliances;
        @FindBy (xpath = "//div[contains(text(),'Refrigerators & Freezers')]")
        WebElement RefrigeratorsFreezers;

        public void clickAllCategories(){
            click(AllCategories);
        }
        public void clickCategories(){
            click(Categories);
        }
        public void clickHomeApplience(){
            click(HomeApplience);
        }
        public void clickAirConditioningAppliances(){
            click(AirConditioningAppliances);
        }
        public void clickBabyAppliances(){
            click(BabyAppliances);
        }
        public void clickCleaningAppliances(){
            click(CleaningAppliances);
        }
        public void clickHomeApplianceParts(){
            click(HomeApplianceParts);
        }
        public void clickHomeAppliancesStocks(){
            click(HomeAppliancesStocks);
        }

        public void clickHomeHeaters(){
            click(HomeHeaters);
        }
        public void clickLaundryAppliances(){
            click(LaundryAppliances);
        }
        public void clickMajorKitchenAppliances(){
            click(MajorKitchenAppliances);
        }
        public void clickOtherHomeAppliances(){
            click(OtherHomeAppliances);
        }
        public void clickBeautyAppliances(){
            click(BeautyAppliances);
        }
        public void clickRefrigeratorsFreezers(){
            click(RefrigeratorsFreezers);
        }



    }
