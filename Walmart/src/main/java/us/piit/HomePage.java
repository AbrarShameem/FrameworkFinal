package us.piit;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import java.util.List;

public class HomePage extends CommonAPI {
    public HomePage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }




    @FindBy(xpath = "//header/div[2]/div[1]/a[1]")
    WebElement Alibabalogo;
    @FindBy(xpath = "//header/div[2]/div[4]/div[4]/div[1]/div[1]/a[1]/div[1]/div[1]/a[1]")
    WebElement Cart;
    @FindBy(xpath = "///header/div[4]/div[1]/div[1]/div[1]/div[1]/h3[1]/span[1]")
    WebElement Categories;
    @FindBy(xpath = "///header/div[2]/div[4]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]")
    WebElement Message;
    @FindBy(xpath = "//body/div[5]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
    WebElement Search;
    @FindBy(xpath = "//a[contains(text(),'Choose your suppliers by regions')]")
    WebElement SupplyRegions;
    @FindBy(xpath = "//header/div[4]/div[1]/div[3]/ul[1]/li[6]/a[1]")
    WebElement Help;
    @FindBy(xpath = "//header/div[4]/div[1]/div[3]/ul[1]/li[1]/a[1]")
    WebElement ReadytoShip;
    @FindBy(xpath = "//header/div[2]/div[3]/div[1]/div[1]/form[1]/div[2]/input[1]")
    WebElement Iphone;
    @FindBy(xpath = "//header/div[2]/div[4]/div[1]/div[1]/div[2]/div[2]")
    WebElement Signin;
    @FindBy(xpath = "//header/div[2]/div[4]/div[1]/div[2]/div[1]/div[2]/a[2]")
    WebElement JoinFree;
    @FindBy(xpath = "//header/div[2]/div[4]/div[3]/div[1]/div[1]/a[1]")
    WebElement Orders;
    @FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/a[1]/div[1]/div[1]/span[2]")
    WebElement ConsumerElectronics;
    @FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/a[2]/div[1]")
    WebElement Apparel;
    @FindBy(xpath = "//span[contains(text(),'Vehicle Parts & Accessories')]")
    WebElement VehiclePartsAccessories;
    @FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/a[4]/div[1]/div[1]/span[2]")
    WebElement SportsEntertainment;
    @FindBy(xpath = "//body/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/a[5]/div[1]")
    WebElement Machinery;
    @FindBy(xpath = "//span[contains(text(),'Home & Garden')]")
    WebElement HomeGarden;
    @FindBy(xpath = "//span[contains(text(),'Beauty & Personal Care')]")
    WebElement BeautyPersonalCare;
    @FindBy(xpath = "//h2[contains(text(),'WEEKLY DEALS')]")
    WebElement WEEKLYDEALS;
    @FindBy(xpath = "//h2[contains(text(),'CONSUMER ELECTRONICS')]")
    WebElement CONSUMERELECTRONICS;
    @FindBy(xpath = "//body/div[4]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[2]/div[1]/h2[1]/a[1]/p[1]")
    WebElement Macbook;
    @FindBy(xpath = "//body/div[4]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/h2[1]/a[1]/p[1]")
    WebElement SamsungTv85inch;
    @FindBy(xpath = "//body/div[4]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[8]/div[1]/div[2]/div[1]/h2[1]/a[1]/p[1]")
    WebElement FoodWarmerHotpot;
    @FindBy(xpath = "//body/div[4]/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[12]/div[1]/div[2]/div[1]/h2[1]/a[1]/p[1]/strong[2]")
    WebElement ElectricCar2DoorSolarMiniCar;
    @FindBy(xpath = "//a[contains(text(),'Global Original Sources')]")
    WebElement GlobalOriginalSources;
    @FindBy(xpath = "//h4[contains(text(),'Top-ranking suppliers')]")
    WebElement Toprankingsuppliers;
    @FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[2]/div[1]/h4[1]/span[1]")
    WebElement ShoesStock;
    @FindBy(xpath = "//span[contains(text(),'All Categories')]")
    WebElement AllCategories;

    public void Search(String itemToSearch){
        typeAndEnter(Search, itemToSearch);
        clear(Search);
    }

    public void searchItem(String itemToSearch){
        type(Search, itemToSearch);
        click(Search);
    }

    public void clickSearchField() {
        click(Search);
    }

    public void clickSearchButton() {
        click(Search);
    }

    public void clickLogoLink() {
        click(Alibabalogo);
    }

    public void clickVehiclePartsAccessories() { click(VehiclePartsAccessories); }

    public void clickApparel() {
        click(Apparel);
    }

    public void clickConsumerElectronics() {
        click(ConsumerElectronics);
    }

    public void clickSportsEntertainment() {
        click(SportsEntertainment);
    }

    public void clickMachinery() { click(Machinery);
    }

    public void clickHomeGarden() {
        click(HomeGarden);
    }

    public void clickWEEKLYDEALS() {
        click(WEEKLYDEALS);
    }

    public void clickCONSUMERELECTRONICS() {click(CONSUMERELECTRONICS);
    }

    public void clickElectricCar2DoorSolarMiniCar() {
        click(ElectricCar2DoorSolarMiniCar);
    }

    public void clickFoodWarmerHotpot() {click(FoodWarmerHotpot);
    }

    public void clickSamsungTv85inch(){click(SamsungTv85inch);
    }

    public void clickMacbook() {
        click(Macbook);
    }

    public void clickBeautyPersonalCare() {
        click(BeautyPersonalCare);
    }

    public void clickIphone() {click(Iphone);}

    public void clickSignin() {click(Signin);}

    public void clickReadytoShip() {click(ReadytoShip);
    }

    public void clickCategories() {click(Categories);
    }

    public void clickSupplyRegions() {click(SupplyRegions);
    }

    public void clickJoinFree() {click(JoinFree);
    }

    public void clickGlobalOriginalSources() {click(GlobalOriginalSources);
    }

    public void clickToprankingsuppliers() {click(Toprankingsuppliers);
    }

    public void clickShoesStock() {click(ShoesStock);
    }
    public void clickAllCategories(){
        click(AllCategories);
    }



}














