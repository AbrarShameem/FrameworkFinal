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
    public HomePage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[contains(text(),'Log In')]")
    WebElement login;
    @FindBy(xpath = "//body[1]/div[1]/section[1]/main[1]/div[1]/div[1]/div[1]/div[1]/button[1]")
    WebElement notnow;

    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[6]/span[1]/img[1]")
    WebElement Profile;

    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
    WebElement email;

    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/label[1]/input[1]")
    WebElement password;

    @FindBy(xpath = "//*[text()='Saved']")
    WebElement saved;

    @FindBy(xpath = "//div[contains(text(),'Settings')]")
    WebElement settings;

    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[4]/a[1]/*[1]")
    WebElement polygon;

    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/a[1]/*[1]")
    WebElement sendmessage;

    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[2]/input[1]")
    WebElement Search;

    @FindBy(xpath = "//div[contains(text(),'Switch Accounts')]")
    WebElement SwitchAccounts;

    @FindBy(xpath = "//div[contains(text(),'Log Out')]")
    WebElement LogOut;

    @FindBy(xpath = "//body/div[@id='react-root']/section[1]/nav[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/div[1]/button[1]/div[1]/*[1]")
    WebElement AddPost;

    @FindBy(xpath = "//button[contains(text(),'Select from computer')]")
    WebElement SelectFromComputar;


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
        type(Search, "tarnima99");
        waitFor(3);
        Search.sendKeys(Keys.ARROW_DOWN);
        Search.sendKeys(Keys.ENTER);
    }

    public void onSettings() {
        click(settings);
    }

    public void profilemain() {
        click(Profile);
    }

    public void onPolygon() {
        click(polygon);
    }

    public void onSendMessage() {
        click(sendmessage);
    }

    public void clickOnNotNow() {
        click(notnow);
    }

    public void onSwitchAccount() {
        click(SwitchAccounts);
    }

    public void onLogOut() {
        click(LogOut);
    }

    public void onAddPost() {
        click(AddPost);
    }

    public void onSelectFromComputer() {
        click(SelectFromComputar);
    }
}






