package us.piit;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ClothingAndAccessoriesPage extends CommonAPI {

    public ClothingAndAccessoriesPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//span[contains(text(),'Baby')]")
    WebElement babyLink;
    @FindBy (xpath = "//span[contains(text(),'Kids')]")
    WebElement kidsLink;
    @FindBy (xpath = "//span[contains(text(),'Men')]")
    WebElement menLink;
    @FindBy (xpath = "//span[contains(text(),'Specialty')]")
    WebElement specialtyLink;

    @FindBy (xpath = "//span[contains(text(),'Women')]")
    WebElement womenLink;
    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[1]/a[1]")
    WebElement luxaryWatchesLink;
    @FindBy (xpath = "//a[contains(text(),'Designer Handbags')]")
    WebElement designerHandbagsLink;
    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[2]/ul[1]/li[3]/a[1]")
    WebElement fineJewelryLink;

    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[3]/ul[1]/li[1]/a[1]")
    WebElement collectibleSneakersLink;
    @FindBy (xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/div[1]/section[3]/ul[1]/li[2]/a[1]")
    WebElement costumesLink;
    @FindBy (xpath = "//a[contains(text(),'Personalized Items')]")
    WebElement personalizedItemsLink;
    @FindBy (xpath = "//a[contains(text(),'Sports Fan Clothing')]")
    WebElement sportsFanClothingLink;
    @FindBy (xpath = "//a[contains(text(),'Traditional & World Clothing')]")
    WebElement traditionalAndWorldClothingLink;

    public void clickbabyLink(){
        click(babyLink);
    }
    public void clickkidsLink(){
        click(kidsLink);
    }
    public void clickmenLink(){
        click(menLink);
    }
    public void clickspecialtyLink(){
        click(specialtyLink);
    }
    public void clickwomenLink(){
        click(womenLink);
    }
    public void clickluxaryWatchesLink(){
        click(luxaryWatchesLink);
    }
    public void clickdesignerHandbagsLink(){
        click(designerHandbagsLink);
    }
    public void clickfineJewelryLink(){
        click(fineJewelryLink);
    }
    public void clickcollectibleSneakersLink(){
        click(collectibleSneakersLink);
    }
    public void clickcostumesLink(){
        click(costumesLink);
    }
    public void clickpersonalizedItemsLink(){
        click(personalizedItemsLink);
    }
    public void clicksportsFanClothingLink(){
        click(sportsFanClothingLink);
    }
    public void clicktraditionalAndWorldClothingLink(){
        click(traditionalAndWorldClothingLink);
    }

}