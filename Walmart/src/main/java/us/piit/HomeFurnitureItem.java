package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 import org.openqa.selenium.interactions.Action;
 import org.testng.Assert;

public class  HomeFurnitureItem extends CommonAPI {
    public HomeFurnitureItem(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[contains(text(),'All Categories')]")
    WebElement AllCategories;



}