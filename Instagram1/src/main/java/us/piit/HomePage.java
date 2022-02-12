package us.piit;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends CommonAPI {

    @FindBy (xpath = "//div[contains(text(),'Log In')]")
    WebElement login;

    @FindBy (xpath="//body/div[@id='react-root']/div[1]/div[1]/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/label[1]/input[1]")
    WebElement email;

    @FindBy (xpath="//body/div[@id='react-root']/div[1]/div[1]/section[1]/main[1]/article[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/label[1]/input[1]")
    WebElement password;

    //public void firstTest(){

        //username.sendKeys("mou_rahmans");
        //password.sendKeys("alfie78669");
        //login.click();
        //waitFor(2);
        public void enterEmail() {
            type(email,"mou6097@gmail.com");}
    public void password(){
            type(password,"farmo7866");
    }
    public void login(){
            click(login);
    }
    }
