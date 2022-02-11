package us.piit;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends CommonAPI {

    @FindBy (xpath = "//body/div[@id='react-root']/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
    WebElement username;

    @FindBy (xpath = "//body/div[@id='react-root']/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/label[1]/input[1]")
    WebElement password;

    @FindBy (xpath = "//div[contains(text(),'Log In')]")
    WebElement login;

    public void firstTest(){
        username.sendKeys("mou_rahmans");
        password.sendKeys("alfie78669");
        login.click();
        waitFor(2);
    }

}
