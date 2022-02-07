package us.piit;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class AppTest extends CommonAPI {

    App home = new App();
    @Test
    public void search(){
        driver.findElement(By.cssSelector("#gh-ac")).sendKeys("nintendo");
        driver.findElement(By.cssSelector("#gh-btn")).click();}



    }

