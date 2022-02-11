package us.piit;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends CommonAPI {


    @FindBy(xpath = "//*[@id= '//a[contains(text(),'Sign In')]']")
    WebElement signInButton;

    @FindBy(xpath = "//*[@id= 'id_userLoginId']")
    WebElement signInEmail;

    @FindBy(xpath = "//input[@id='id_password']")
    WebElement signInPw;

    @FindBy(xpath = "//body/div[@id='appMountPoint']/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[2]']")
    WebElement signIn2;

    @FindBy(xpath = "//*[@id= 'JL7EODNFFZHCZNGYPNGOLLKSWU']")
    WebElement tsukiPage;

    @FindBy(xpath = "//*[@id= '3Y3HN6DX7VAOXKAUP4DLKRMIIM']")
    WebElement leoPage;

    @FindBy(xpath = "//*[@id= 'UMSBLOSNY5DEFEYXSWZII3D3IY']")
    WebElement michaelPage;

    @FindBy(xpath = "//*[@id= '44DFBS5UMFDDVMK2Q7VRPXBFAA']")
    WebElement daddyPage;

    @FindBy(xpath = "//*[@id= 'KWGWPYYG7NENVH6DHKS6VDEXEI']")
    WebElement mommyPage;

    public void clickOnSignInButton () {
        click(signInButton);
    }

    public void enterEmail() {
        typeAndEnter("mta1864@yahoo.com");

    }

}





