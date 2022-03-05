package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsPage extends CommonAPI {
    public ElectronicsPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//span[contains(text(),'Cameras & Photo')]")
    WebElement camerasAndPhotoLink;
    @FindBy (xpath = "//span[contains(text(),'Cell Phones, Smart Watches, & Accessories')]")
    WebElement cellphonesLink;
    @FindBy (xpath = "//span[contains(text(),'Computers, Tablets & Network Hardware')]")
    WebElement computersTabletsLink;
    @FindBy (xpath = "//span[contains(text(),'TV, Video & Home Audio Electronics')]")
    WebElement tvVideolink;

    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[5]/a[1]")
    WebElement portableAudioLink;
    @FindBy (xpath = "//a[contains(text(),'Car Electronics')]")
    WebElement carElectronicsLink;
    @FindBy (xpath = "//a[contains(text(),'Home Surveillance')]")
    WebElement homeSurveillanceLink;
    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[1]/ul[1]/li[8]/a[1]")
    WebElement smartHomeLink;

    @FindBy (xpath = "//span[contains(text(),'Video & PC Gaming')]")
    WebElement videoPCGamingLink;
    @FindBy (xpath = "//a[contains(text(),'Virtual Reality')]")
    WebElement virtualRealityLink;
    @FindBy (xpath = "//a[contains(text(),'Computer Components & Parts')]")
    WebElement computerPartsLink;

    public void clickCamerasAndPhotoLink(){
        click(camerasAndPhotoLink);
    }
    public void clickCellphonesLink(){
        click(cellphonesLink);
    }
    public void clickComputersTabletsLink(){
        click(computersTabletsLink);
    }
    public void clickTvVideoLink(){
        click(tvVideolink);
    }
    public void clickPortableAudioLink(){
        click(portableAudioLink);
    }
    public void clickCarElectronicsLink(){
        click(carElectronicsLink);
    }
    public void clickHomeSurveillanceLink(){
        click(homeSurveillanceLink);
    }
    public void clickSmartHomeLink(){
        click(smartHomeLink);
    }
    public void clickVideoPCGamingLink(){
        click(videoPCGamingLink);
    }
    public void clickVirtualRealityLink(){
        click(virtualRealityLink);
    }
    public void clickComputerPartsLink(){
        click(computerPartsLink);
    }
}
