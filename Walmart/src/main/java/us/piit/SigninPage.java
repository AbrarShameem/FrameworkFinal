package us.piit;


import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage extends CommonAPI {

    public SigninPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//header/div[2]/div[4]/div[1]/div[1]/div[2]/div[2]")
    WebElement SigninPage;

    public void Test1() {
        SigninPage.click();
        String cUrl = driver.getCurrentUrl();
        System.out.println(cUrl);


    }
}
