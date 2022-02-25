package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends CommonAPI {

    public HomePage(WebDriver driver) {
        super.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "gh-ac")
    WebElement searchField;
    @FindBy(id = "gh-btn")
    WebElement searchButton;
    @FindBy(id = "gh-shop-a")
    WebElement dropdownLeft;
    @FindBy(id = "gh-cat")
    WebElement dropdownRight;
    @FindBy (xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[7]/a[1]")
    WebElement clothingAndAccessoriesLink;
    @FindBy (xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[9]/a[1]")
    WebElement sportingGoodsLink;
    @FindBy (xpath = "//a[contains(text(),'Developers')]")
    WebElement developersLink;

    @FindBy(id = "gh-la")
    WebElement logoLink;
    @FindBy(id = "s0-0-32-4-0-0[0]-2-match-media-0-ebay-carousel-next")
    WebElement nextArrow;
    @FindBy(xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/button[3]")
    WebElement pausePlayButton;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[3]/a[1]")
    WebElement motorsLink;
    @FindBy (xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[5]/a[1]")
    WebElement collectiblesAndArtLink;
    @FindBy (xpath = "//tbody/tr[1]/td[5]/ul[1]/li[2]/a[1]")
    WebElement sellerCenterLink;

    @FindBy(xpath = "//a[contains(text(),'Classics')]")
    WebElement classicsLink;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[4]/a[1]")
    WebElement electronicsLink;
    @FindBy(xpath = "//a[contains(text(),'Daily Deals')]")
    WebElement dailyDealsLink;
    @FindBy (xpath = "//a[contains(text(),'Careers')]")
    WebElement careersLink;
    @FindBy (xpath = "//a[contains(text(),'Brand Outlet')]")
    WebElement brandOutletLink;

    @FindBy(xpath = "//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-p-3']/a[1]")
    WebElement helpAndContactLink;
    @FindBy(xpath = "//a[contains(text(),'Company info')]")
    WebElement compInfoLink;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[10]/a[1]")
    WebElement businessIndustrialLink;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[12]/a[1]")
    WebElement eBayRefurbishedLink;
    @FindBy (xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[11]/a[1]")
    WebElement jewelryAndWatcheslink;

    @FindBy(xpath = "//body[1]/header[1]/div[1]/ul[2]/li[1]/a[1]")
    WebElement sellLink;
    @FindBy(xpath = "//a[contains(text(),'Motorcycle Parts')]")
    WebElement motorcyclePartsLink;
    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[3]/div[2]/div[1]/nav[1]/ul[1]/li[7]/a[1]")
    WebElement myGarageLink;
    @FindBy(xpath = "//a[contains(text(),'Cars & Trucks')]")
    WebElement carsTrucksLink;
    @FindBy (xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[6]/a[1]")
    WebElement homeAndGardenLink;

    @FindBy(xpath = "//a[contains(text(),'Powersports')]")
    WebElement powerSportsLink;
    @FindBy(xpath = "//a[contains(text(),'RVs & Campers')]")
    WebElement rvCampersLink;
    @FindBy(xpath = "//a[contains(text(),'Trailers & Other Vehicles')]")
    WebElement trailersOtherslink;
    @FindBy(xpath = "//a[contains(text(),'Boats')]")
    WebElement boatsLink;
    @FindBy(xpath = "//a[contains(text(),'Apparel & Merchandise')]")
    WebElement apparelMerchandiseLink;
    @FindBy (xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[8]/a[1]")
    WebElement toysLink;

    public void searchAndClear(String itemToSearch){
        typeAndEnter(searchField, itemToSearch);
        clear(searchField);
    }
    public void searchItem(String itemToSearch){
        type(searchField, itemToSearch);
        click(searchButton);
    }
    public void clickBrandOutletLink() {
        click(brandOutletLink);
    }
    public void clickSearchField() {
        click(searchField);
    }
    public void clickSearchButton() {
        click(searchButton);
    }
    public void clickDropdownLeft() {
        click(dropdownLeft);
    }
    public void clickDropdownRight() {
        click(dropdownRight);
    }
    public void clickLogoLink() {
        click(logoLink);
    }
    public void clickCareersLink(){
        click(careersLink);
    }
    public void clickNextArrow() {
        click(nextArrow);
    }
    public void clickDevelopersLink() {
        click(developersLink);
    }
    public void clickSellerCenterLink() {
        click(sellerCenterLink);
    }
    public void hoverMotorsLink() {
        hoverOver(driver, motorsLink);
    }
    public void clickMotorsLink() {
        click(motorsLink);
    }
    public void hoverJewelryAndWatcheslink(){
        hoverOver(driver, jewelryAndWatcheslink);
    }
    public void clickJewelryAndWatcheslink(){
        click(jewelryAndWatcheslink);
    }
    public void hoverCollectiblesAndArtLink(){
        hoverOver(driver, collectiblesAndArtLink);
    }
    public void clickCollectiblesAndArtLink(){
        click(collectiblesAndArtLink);
    }
    public void hoverClothingAndAccessorieslink(){
        hoverOver(driver, clothingAndAccessoriesLink);
    }
    public void clickClothingAndAccessorieslink(){
        click(clothingAndAccessoriesLink);
    }
    public void hoverHomeAndGardenLink(){
        hoverOver(driver, homeAndGardenLink);
    }
    public void clickHomeAndGardenLink(){
        click(homeAndGardenLink);
    }
    public void clickPausePlayButton() {
        click(pausePlayButton);
    }
    public void hoverElectronicsLink() {
        hoverOver(driver, electronicsLink);
    }
    public void clickElectronicsLink() {
        click(electronicsLink);
    }
    public void hoverSportingGoodsLink(){
        hoverOver(driver, sportingGoodsLink);
    }
    public void clickSportingGoodsLink(){
        click(sportingGoodsLink);
    }
    public void hoverToysLink(){
        hoverOver(driver, toysLink);
    }
    public void clickToysLink(){
        click(toysLink);
    }
    public void clickDailyDealsLink() {
        click(dailyDealsLink);
    }
    public void clickHelpContactLink() {
        click(helpAndContactLink);
    }
    public void clickCompanyInfoLink() {
        click(compInfoLink);
    }
    public void hoverBusinessIndustrialLink() {
        hoverOver(driver, businessIndustrialLink);
    }
    public void clickBusinessIndustrialLink() {
        click(businessIndustrialLink);
    }
    public void hoverEbayRefurbishedLink(){
        hoverOver(driver, eBayRefurbishedLink);
    }
    public void clickEbayRefurbishedLink(){
        click(eBayRefurbishedLink);
    }
    public void clickSellLink() {
        click(sellLink);
    }
    public void clickClassicsLink() {
        click(classicsLink);
    }
    public void clickMotorcyclePartsLink(){
        click(motorcyclePartsLink);
    }
    public void clickMyGarageLink(){
        click(myGarageLink);
    }
    public void selectLeftDropdownOption(String option){
        selectDropdownOption(dropdownLeft, option);
    }
    public void clickCarsTrucksLink(){
        click(carsTrucksLink);
    }
    public void clickPowerSportsLink(){
        click(powerSportsLink);
    }
    public void clickRvCampersLink(){
        click(rvCampersLink);
    }
    public void clickTrailersOthersLink(){
        click(trailersOtherslink);
    }
    public void clickBoatsLink(){
        click(boatsLink);
    }
    public void clickApparelMerchandiseLink(){
        click(trailersOtherslink);
    }

}
