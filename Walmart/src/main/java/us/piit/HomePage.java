package us.piit;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;
public class HomePage extends CommonAPI {

    @FindBy(xpath = "//body/div[@id='__next']/div[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[3]/div[1]/a[1]/img[1]")
    WebElement iphone;
    @FindBy(xpath = "//div[contains(text(),'Reorder')]")
    WebElement MyItems;
    @FindBy(xpath = "//*[text()='Departments']")
    WebElement Departments;
  //  @FindBy(css = "body.h-100.overflow-hidden.w-100:nth-child(2) div.flex.flex-column.min-vh-100.shadow-2 span.bg-blue.sticky.w-100.top-0.z-1 header:nth-child(2) div.center.flex.items-center.justify-center.pa4 div.relative:nth-child(2) > a.flex.items-center.no-underline.ph3.white.desktop-header-trigger.lh-title.b")
  //     WebElement Departments;
    @FindBy(xpath = "//header/div[1]/a[1]/img[1]")
    WebElement WalmartLogo;
    @FindBy(xpath = "//header/div[1]/div[5]/button[1]/i[1]")
    WebElement cart;
    @FindBy(xpath = "//header/div[1]/div[2]/a[1]")
    WebElement Service;
    @FindBy(xpath = "//h3[contains(text(),'COVID vaccine & booster')]")
    WebElement Covidvaccinebooster;
    @FindBy(xpath = "//h3[contains(text(),'At-home COVID-19 tests')]")
    WebElement Covidtest;
    @FindBy (xpath = "//button[contains(text(),'Grocery')]")
    WebElement groceries;
    @FindBy (xpath = "//header/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement slicedBread;

    public void firstTest() {
        for (int i = 0; i < 10; i++) {

        }
        WalmartLogo.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.walmart.com/");
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getTitle(), "Walmart.com | Save Money. Live Better");
        System.out.println(getTitle());
    }

    public void secondTest() {
        iphone.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.walmart.com/");
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getTitle(), "Apple iPhone on Straight Talk");
        System.out.println(getTitle());

    }

    public void testTest(){
        waitFor(2);
        hoverOver(driver, Departments);
        //Departments.click();
        waitFor(2);
        hoverOver(driver, groceries);
        waitFor(2);
        slicedBread.click();
        waitFor(2);

    }
}







