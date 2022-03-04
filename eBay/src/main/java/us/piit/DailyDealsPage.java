package us.piit;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DailyDealsPage extends CommonAPI {
    public DailyDealsPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//span[contains(text(),'Featured')]")
    WebElement featuredDropdown;
    @FindBy (xpath = "//body[1]/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]/span[1]")
    WebElement techDropdown;
    @FindBy (xpath = "//body[1]/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]")
    WebElement fashionDropdown;
    @FindBy (xpath = "//body[1]/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]/span[1]")
    WebElement homeAndGardenDropdown;

    @FindBy (xpath = "//body[1]/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[5]/a[1]/span[1]")
    WebElement sportingGoodsDropdown;
    @FindBy (xpath = "//body[1]/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[6]/a[1]/span[1]")
    WebElement automotiveDropdown;
    @FindBy (xpath = "//body[1]/main[1]/div[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]/span[1]")
    WebElement otherDealsDropdown;
    @FindBy (xpath = "//span[contains(text(),'Sales & Events')]")
    WebElement salesAndEventsDropdown;

    public void clickFeaturedDropdown(){click(featuredDropdown);}
    public void clickTechDropdown(){
        click(techDropdown);
    }
    public void clickFashionDropdown(){
        click(fashionDropdown);
    }
    public void clickHomeGardenDropdown(){
        click(homeAndGardenDropdown);
    }
    public void clickSportingGoodsDropdown(){
        click(sportingGoodsDropdown);
    }
    public void clickAutomotiveDropdown(){
        click(automotiveDropdown);
    }
    public void clickOtherDealsDropdown(){
        click(otherDealsDropdown);
    }
    public void clickSalesEventsDropdown(){
        click(salesAndEventsDropdown);
    }
}
