package us.piit;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends CommonAPI {


    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement signInButton;

    @FindBy(xpath = "//body/div[@id='appMountPoint']/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]")
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

    @FindBy(xpath = "//body/div[@id='appMountPoint']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/span[1]"
            WebElement carrotHover;

    @FindBy(xpath =//a[contains(text(),'Sign out of Netflix')]// )
            WebElement signOutButton;

    public void clickOnSignInButton () {
        click(signInButton);
    }

    public void signInNow () {
        type(signInEmail, "mta1864@yahoo.com");
        type(signInPw,"ilovejesus1864netflix0168");
        click(signIn2);
        System.out.println("signed in");
    }

    public void tsukiSignIn () {
        click(tsukiPage);
        waitFor(3);
    }

    public void leoSignIn () {
        click(leoPage);
    }

    public void michaelSignIn() {
        click(michaelPage);
    }

    public void mommySignIn() {
        click(mommyPage);
    }

    public void daddySignIn() {
        click(daddyPage);
    }

    public void signOut(){
        hoverOver(web driver , web element);
        click(signOutButton);

    }



}





