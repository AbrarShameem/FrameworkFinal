package us.piit;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchSingleItem extends CommonAPI {


    @Test
    public void searchNintendoDSI() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        homePage.searchItem("Nintendo DSI");
        waitFor(5);
        System.out.println(getTitle());
    }

    @Test
    public void searchChromeBook() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        homePage.searchItem("Chromebook");
        System.out.println(getTitle());
        waitFor(5);
        System.out.println("Test Passed!!");
    }

    @Test
    public void searchHolesBook() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        homePage.searchItem("Holes book");
        System.out.println(getTitle());
        waitFor(5);
        System.out.println("Wooooo!");

    }

    @Test
    public void searchMacBookPro() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        homePage.searchItem("Macbook Pro");
        System.out.println(getTitle());
        waitFor(5);
        System.out.println("Macbook search results are here");
    }

    @Test
    public void searchPolandSpringWater() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        homePage.searchItem("Poland Spring Water");
        System.out.println(getTitle());
        waitFor(5);
        System.out.println("Stay hydrated!");

    }
    @Test
    public void searchNintendoDSI2() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        homePage.searchItem("Nintendo DSI");
        waitFor(5);
        System.out.println(getTitle());
    }

    @Test
    public void searchChromeBook2() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        homePage.searchItem("Chromebook");
        System.out.println(getTitle());
        waitFor(5);
        System.out.println("Test Passed!!");
    }

    @Test
    public void searchHolesBook2() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        homePage.searchItem("Holes book");
        System.out.println(getTitle());
        waitFor(5);
        System.out.println("Wooooo!");

    }

    @Test
    public void searchMacBookPro2() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        homePage.searchItem("Macbook Pro");
        System.out.println(getTitle());
        waitFor(5);
        System.out.println("Macbook search results are here");
    }

    @Test
    public void searchPolandSpringWater2() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        homePage.searchItem("Poland Spring Water");
        System.out.println(getTitle());
        waitFor(5);
        System.out.println("Stay hydrated!");

    }

}