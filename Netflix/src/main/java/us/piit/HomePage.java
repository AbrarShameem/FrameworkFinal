package us.piit;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

public class HomePage extends CommonAPI {

    public HomePage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }



    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    public
    WebElement signInButton;

    @FindBy(xpath = "//body/div[@id='appMountPoint']/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]")
    WebElement signInEmail;

    @FindBy(xpath = "//input[@id='id_password']")
    WebElement signInPw;

    @FindBy(xpath = "//button[contains(text(),'Sign In')]")
    WebElement signIn2;

    @FindBy(xpath = "//body/div[@id='appMountPoint']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[5]/div[1]/a[1]/div[1]/div[1]")
    WebElement tsukiPage;

    @FindBy(xpath = "//body/div[@id='appMountPoint']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[4]/div[1]/a[1]/div[1]/div[1]")
    WebElement leoPage;

    @FindBy(xpath = "//body/div[@id='appMountPoint']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/div[1]/a[1]/div[1]/div[1]")
    WebElement michaelPage;

    @FindBy(xpath = "//body/div[@id='appMountPoint']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[2]/div[1]/a[1]/div[1]/div[1]")
    WebElement daddyPage;

    @FindBy(xpath = "//body/div[@id='appMountPoint']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[3]/div[1]/a[1]/div[1]/div[1]")
    WebElement mommyPage;


    @FindBy(xpath = "//a[contains(text(),'Sign out of Netflix')]")
            WebElement signOutButton;

    public void clickOnSignInButton() {
        click(signInButton);
    }

    public void signInNow () {
        type(signInEmail, "mta1864@yahoo.com");
        type(signInPw,"ilovejesus1864netflix0168");
        click(signIn2);
        System.out.println("signed in");
    }

    public void tsukiClick () {
        click(tsukiPage);
        waitFor(3);
    }

    public void tsukiPage () {
        type(signInEmail, "mta1864@yahoo.com");
        type(signInPw, "ilovejesus1864netflix0168");
        click(signIn2);
        System.out.println("signed in");
        click(tsukiPage);
    }

    public void leoClick () {
        click(leoPage);
    }

    public void michaelClick() {
        click(michaelPage);
    }

    public void mommyClick() {
        click(mommyPage);
    }

    public void daddyClick() {
        click(daddyPage);
    }



    }









