package us.piit;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CareersPage extends CommonAPI {

    public CareersPage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy (xpath = "//input[@id='career-search-keyword']")
    WebElement careerSearchBar;
    @FindBy (xpath = "//header/nav[1]/div[1]/ul[1]/li[3]/a[1]")
    WebElement jobsByCategoryLink;
    @FindBy (xpath = "//header/nav[1]/div[1]/ul[1]/li[5]/a[1]")
    WebElement studentsRecentGradsLink;
    @FindBy (xpath = "//body[1]/header[1]/nav[1]/div[1]/ul[1]/li[7]/a[1]")
    WebElement howWeHireLink;
    @FindBy (xpath = "//header/nav[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement jobsByLocationLink;
    @FindBy (xpath = "//header/nav[1]/div[1]/ul[1]/li[4]/a[1]")
    WebElement engineeringCareersLink;
    @FindBy (xpath = "//header/nav[1]/div[1]/ul[1]/li[8]/a[1]")
    WebElement ourJobsLink;
    @FindBy (xpath = "//a[contains(text(),'View Open Positions')]")
    WebElement viewOpenPositionsLink;
    @FindBy (xpath = "//body[1]/header[1]/div[1]/div[1]/div[2]/div[2]/div[2]/span[2]/a[1]")
    WebElement pressRoomLink;
    @FindBy (xpath = "//body[1]/header[1]/div[1]/div[1]/div[2]/div[2]/div[2]/span[4]/a[1]")
    WebElement contactUsLink;

    public void clickcontactUsLink(){
        click(contactUsLink);
    }
    public void clickPressRoomLink(){
        click(pressRoomLink);
    }
    public void searchBarQuery(){
        typeAndEnter(careerSearchBar, "where are your locations?");
    }
    public void clickjobsByCategoryLink() {
        click(jobsByCategoryLink);
    }
    public void clickstudentsRecentGradsLink(){
        click(studentsRecentGradsLink);
    }
    public void clickhowWeHireLink(){
        click(howWeHireLink);
    }
    public void clickjobsByLocationLink(){
        click(jobsByLocationLink);
    }
    public void clickengineeringCareersLink(){
        click(engineeringCareersLink);
    }
    public void clickourJobsLink(){
        click(ourJobsLink);
    }
    public void clickviewOpenPositionsLink(){
            click(viewOpenPositionsLink);
        }
}