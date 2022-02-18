package us.piit;


import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SearchItemPage extends CommonAPI {
    public SearchItemPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);


    }



}
