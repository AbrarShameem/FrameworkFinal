package us.piit;

import base.CommonAPI;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.interactions.Action;
        import org.openqa.selenium.interactions.Actions;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import org.testng.Assert;

public class  CommercialFurnitureItem extends CommonAPI{
public CommercialFurnitureItem  (WebDriver driver)

    {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[contains(text(),'All Categories')]")
    WebElement AllCategories;

@FindBy(xpath = "//a[contains(text(),'Furniture')]")
WebElement Furniture;

@FindBy(xpath = "//div[contains(text(),'Commercial Furniture')]")
WebElement CommercialFurniture;
@FindBy(xpath = "//body/div[3]/div[1]/div[1]/div[1]/div[1]/div[3]")
WebElement OfficeFurniture;
@FindBy(xpath = "//body/div[3]/div[3]/div[9]/div[1]/a[1]/div[1]/div[1]/div[2]")
WebElement ComputerTable;

@FindBy(xpath = "//body/div[3]/div[3]/div[23]/div[1]/div[1]/div[12]/div[1]/a[1]/div[1]/div[1]/div[2]")
WebElement Cabinet;
@FindBy(xpath = "//body/div[3]/div[3]/div[23]/div[1]/div[1]/div[24]/div[1]/a[1]/div[1]/div[1]/div[2]")
WebElement BossChair;
@FindBy(xpath = "//body/div[3]/div[3]/div[23]/div[1]/div[1]/div[10]/div[1]/a[1]/div[1]/div[1]/div[2]")
WebElement LaptopTable;
@FindBy(xpath = "//body/div[3]/div[3]/div[23]/div[1]/div[1]/div[43]/div[1]/a[1]/div[1]/div[1]/div[2]")
WebElement Desk;
    public void clickAllCategories(){
        click(AllCategories);
    }
    public void clickFurniture(){
        click(Furniture);
    }
    public void clickCommercialFurniture(){
        click(CommercialFurniture);
    }
    public void clickOfficeFurniture(){
        click(OfficeFurniture);
    }
    public void clickComputerTable(){
        click(ComputerTable);
    }
    public void clickCabinet(){
        click(Cabinet);
    }
    public void clickBossChair(){
        click(BossChair);
    }
    public void clickLaptopTable(){
        click(LaptopTable);
    }
    public void clickDesk(){
        click(Desk);
    }
        }