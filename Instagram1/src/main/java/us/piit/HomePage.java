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

public class HomePage extends CommonAPI {


    @FindBy(xpath = "//div[contains(text(),'Log In')]")
    WebElement login;

    @FindBy (xpath ="//button[contains(text(),'Not now')]")
    WebElement notnow;

    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
    WebElement email;

    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/label[1]/input[1]")
    WebElement password;

    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]/img[1]")
    WebElement Profile;

    @FindBy(xpath = "//div[contains(text(),'Profile')]")
    WebElement onProfile;

    @FindBy(xpath = "//*[text()='Saved']")
    WebElement saved;

    @FindBy(xpath = "//div[contains(text(),'Settings')]")
    WebElement settings;

    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[4]/a[1]/*[1]")
    WebElement polygon;

    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/a[1]/*[1]")
    WebElement sendmessage;

    @FindBy(xpath = "//header/section[1]/ul[1]/li[3]/a[1]/div[1]")
    WebElement following;

    @FindBy(xpath = "//span[contains(text(),'Search')]")
    WebElement Search;

    public void onFollowing() {
        click(following);
    }

    public void OnSaved() {
        click(saved);
    }

    //public void Test01(){

    //username.sendKeys("sellingsunset007");
    //password.sendKeys("Sunset1234");
    //login.click();
    //waitFor(3);
    public void login() {
        type(email, "tubaf64096@gmail.com");
        type(password, "Sunset123");
        click(login);
    }

    public void Wrongusername() {
        type(email, "new@gmail.com");
        type(password, "Sunset123");
        click(login);
    }

    public void Wrongpassword() {
        type(email, "new@gmail.com");
        type(password, "Sunset123");
        click(login);
    }

    public void onSearch() {
        type(Search, "angelinajolie");
        waitFor(3);
        Search.sendKeys(Keys.ARROW_DOWN);
        Search.sendKeys(Keys.ENTER);
    }


    public void profilemain(){
        click(Profile);
    }
    public void secondProfile(){
        click(onProfile);
    }
    public void onSettings(){
        click(settings);
    }
    public void onPolygon(){
        click(polygon);
    }
    public void onSendMessage(){
        click(sendmessage);
    }
    public void loginNow(){
        click(notnow);
    }
    }




