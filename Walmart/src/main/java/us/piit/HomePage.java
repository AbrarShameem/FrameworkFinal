package us.piit;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
public class HomePage extends CommonAPI {

    @FindBy (xpath = "//button[text()='Sign In']")
    WebElement SignIn;



}
