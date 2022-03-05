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

public class Policies extends CommonAPI {
    public Policies(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]")
    WebElement Policiesandreporting;

    public void OnPoliciesandreporting(){
        click(Policiesandreporting);
    }

}
