package us.piit;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

public class Help extends CommonAPI {
    public Help(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='COVID-19 Information Center']")
    WebElement Covid19informationcenter;

    @FindBy(xpath = "//span[text()='Help Centre']")
    WebElement Helpcenter;

    @FindBy(xpath = "//a[text()='Check your account status']")
    WebElement Checkyouraccountstatus;

    @FindBy(xpath = "//a[text()='Account Status']")
    WebElement Accountstatus;

    @FindBy(xpath = "//a[text()='Discover Black-owned shops on Instagram']")
    WebElement Discoverblackownedshoponinstagram;
    @FindBy(xpath = "//a[text()='Identify as a Black-Owned Business on Instagram']")
    WebElement IdentifyAsablackownedbusinesswoman;

    @FindBy(xpath = "//a[text()='Music on Instagram']")
    WebElement Musiconinstagram;

    @FindBy(xpath = "//a[text()='Reels on Instagram']")
    WebElement Reelsoninstagram;

    public void OnHelpcenter() {
        click(Helpcenter);
    }

    public void Oncovid19informationcenter() {
        click(Covid19informationcenter);
    }

    public void OnCheckyouraccountstatus() {
        click(Checkyouraccountstatus);
    }

    public void OnDiscoverblackownedshoponinstagram() {
        click(Discoverblackownedshoponinstagram);
    }

    public void OnIdentifyAsblackownedbusinesswoman() {
        click(IdentifyAsablackownedbusinesswoman);
    }

    public void OnMusiconinstagram() {
        click(Musiconinstagram);
    }

    public void OnReelsoninstagram() {
        click(Reelsoninstagram);
    }
}