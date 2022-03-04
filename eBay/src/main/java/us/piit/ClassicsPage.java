package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassicsPage extends CommonAPI {

    public ClassicsPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//a[contains(text(),'DeSoto')]")
    WebElement DeSotoLink;
    @FindBy (xpath = "//a[contains(text(),'AMC')]")
    WebElement amcLink;
    @FindBy (xpath = "//a[contains(text(),'Cord')]")
    WebElement cordLink;
    @FindBy (xpath = "//a[contains(text(),'Edsel')]")
    WebElement edselLink;

    @FindBy (xpath = "//a[contains(text(),'Hudson')]")
    WebElement hudsonLink;
    @FindBy (xpath = "//a[contains(text(),'Mercury')]")
    WebElement mercuryLink;
    @FindBy (xpath = "//a[contains(text(),'MG')]")
    WebElement mgLink;
    @FindBy (xpath = "//a[contains(text(),'Nash')]")
    WebElement nashLink;

    @FindBy (xpath = "//a[contains(text(),'Oldsmobile')]")
    WebElement oldsmobileLink;
    @FindBy (xpath = "//a[contains(text(),'Packard')]")
    WebElement packardLink;
    @FindBy (xpath = "//a[contains(text(),'Plymouth')]")
    WebElement plymouthLink;
    @FindBy (xpath = "//a[contains(text(),'Pontiac')]")
    WebElement pontiacLink;
    @FindBy (xpath = "//a[contains(text(),'Willys')]")
    WebElement willysLink;
    @FindBy (xpath = "//h2[contains(text(),'Auction')]")
    WebElement auctionLink;
    @FindBy (xpath = "//h2[contains(text(),'Buy It Now')]")
    WebElement buyNowLink;


    public void clickDeSotoLink(){
        click(DeSotoLink);
    }
    public void clickAmcLink(){
        click(amcLink);
    }
    public void clickauctionLink(){
        click(auctionLink);
    }
    public void clickbuyNowLink(){
        click(buyNowLink);
    }
    public void clickCordLink(){
        click(cordLink);
    }
    public void clickEdselLink(){
        click(edselLink);
    }
    public void clickHudsonLink(){
        click(hudsonLink);
    }
    public void clickMercuryLink(){
        click(mercuryLink);
    }
    public void clickMgLink(){
        click(mgLink);
    }
    public void clickNashLink(){
        click(nashLink);
    }
    public void clickOldsmobileLink(){
        click(oldsmobileLink);
    }
    public void clickPackardLink(){
        click(packardLink);
    }
    public void clickPlymouthLink(){
        click(plymouthLink);
    }
    public void clickPontiacLink(){
        click(pontiacLink);
    }
    public void clickWillysLink(){
        click(willysLink);
    }

}
