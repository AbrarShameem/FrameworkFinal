package us.piit;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class JewelryAndWatchesPage extends CommonAPI {
public JewelryAndWatchesPage (WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
        }

        @FindBy (xpath = "//a[contains(text(),'Shop All Jewelry')]")
        WebElement shopAllJewelryLink;
        @FindBy (xpath = "//span[contains(text(),'Fine Jewelry')]")
        WebElement fineJewelryLink;
        @FindBy (xpath = "//span[contains(text(),'Fashion Jewelry')]")
        WebElement fashionJewelryLink;
        @FindBy (xpath = "//a[contains(text(),'Vintage & Antique Jewelry')]")
        WebElement vintageAntiqueJewelryLink;

        @FindBy (xpath = "//a[contains(text(),'Engagement & Wedding Jewelry')]")
        WebElement engagementWeddingJewelryLink;
        @FindBy (xpath = "//a[contains(text(),'Handcrafted & Artisan Jewelry')]")
        WebElement handcraftedArtisanJewelryLink;
        @FindBy (xpath = "//a[contains(text(),'Ethnic, Regional & Tribal Jewelry')]")
        WebElement ethnicRegionalTribalJewelryLink;
        @FindBy (xpath = "//a[contains(text(),\"Men's Jewelry\")]")
        WebElement mensJewelryLink;

        @FindBy (xpath = "//a[contains(text(),\"Children's Jewelry\")]")
        WebElement childrensJewelryLink;
        @FindBy (xpath = "//a[contains(text(),'Body Jewelry')]")
        WebElement bodyJewelryLink;
        @FindBy (xpath = "//a[contains(text(),'Loose Beads')]")
        WebElement looseBeadsLink;
        @FindBy (xpath = "//a[contains(text(),'Loose Diamonds & Gemstones')]")
        WebElement looseDiamondsGemstonesLink;
        @FindBy (xpath = "//a[contains(text(),'Jewelry Care, Design & Repair')]")
        WebElement jewelryCareDesignRepairLink;

        public void clickshopAllJewelryLink(){
                click(shopAllJewelryLink);
                }
        public void clickfineJewelryLink(){
                click(fineJewelryLink);
                }
        public void clickfashionJewelryLink(){
                click(fashionJewelryLink);
                }
        public void clickvintageAntiqueJewelryLink(){
                click(vintageAntiqueJewelryLink);
                }

        public void clickengagementWeddingJewelryLink(){
                click(engagementWeddingJewelryLink);
                }
        public void clickhandcraftedArtisanJewelryLink(){
                click(handcraftedArtisanJewelryLink);
                }
        public void clickethnicRegionalTribalJewelryLink(){
                click(ethnicRegionalTribalJewelryLink);
                }
        public void clickmensJewelryLink(){
                click(mensJewelryLink);
                }
        public void clickchildrensJewelryLink(){
                click(childrensJewelryLink);
                }
        public void clickbodyJewelryLink(){
                click(bodyJewelryLink);
                }
        public void clicklooseBeadsLink(){
                click(looseBeadsLink);
                }
        public void clicklooseDiamondsGemstonesLink(){
                click(looseDiamondsGemstonesLink);
                }
        public void clickjewelryCareDesignRepairLink(){
                click(jewelryCareDesignRepairLink);
                }

}