package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BusinessServicePage extends CommonAPI {
public BusinessServicePage (WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
        }
    @FindBy (xpath = "//span[contains(text(),'All Categories')]")
    WebElement AllCategories;
    @FindBy (xpath = "//body/div[4]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[14]/a[2]")
    WebElement BusinessService;


@FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
WebElement Advertising;
@FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
WebElement InternetAdvertising;
@FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
WebElement MagazineAdvertising;
@FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/a[1]")
WebElement OutdoorAdvertising;

@FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]")
WebElement AgencyService;
@FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/a[1]")
WebElement AdvertisingAgent;
@FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/a[1]")
WebElement AssuranceServices;
@FindBy (xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[4]/a[1]")
WebElement Auction;

}
