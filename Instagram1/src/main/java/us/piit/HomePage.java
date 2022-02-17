package us.piit;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.util.List;

public class HomePage extends CommonAPI {


    @FindBy (xpath = "//div[contains(text(),'Log In')]")
    WebElement login;

    @FindBy (xpath="//body/div[@id='react-root']/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
    WebElement email;

    @FindBy (xpath="//body/div[@id='react-root']/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/label[1]/input[1]")
    WebElement password;

    //public void Test01(){

        //username.sendKeys("sellingsunset007");
        //password.sendKeys("sunset1234");
        //login.click();
        //waitFor(3);
        public void login() {
            type(email,"tubaf64096@gmail.com");
            type(password,"Sunset123");
            click(login);
    }
    public void Wrongusername() {
        type(email,"new@gmail.com");
        type(password,"Sunset123");
        click(login);
    }
    public void Wrongpassword() {
        type(email,"new@gmail.com");
        type(password,"Sunset123");
        click(login);
    }
    }




