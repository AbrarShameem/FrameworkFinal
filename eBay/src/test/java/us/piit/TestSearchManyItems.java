package us.piit;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchManyItems  extends CommonAPI {

    @Test
    public void testManyItems1() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        homePage.searchAndClear("Water gun");
        homePage.searchAndClear("wwe action figure ring");
        System.out.println(getTitle());
        waitFor(5);
        System.out.println("Done!");
    }

    @Test
    public void testManyItems2() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        homePage.searchAndClear("bathrobe");
        homePage.searchAndClear("dove soap");
        System.out.println(getTitle());
        waitFor(5);
        System.out.println("Donezo!");
    }

    @Test
    public void testManyItems3() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        homePage.searchAndClear("ottoman chair");
        homePage.searchAndClear("fluffy towel");
        homePage.searchAndClear("floor mat");
        System.out.println(driver.getCurrentUrl());
        System.out.println(getTitle());
        waitFor(5);
        System.out.println("Finito!");
    }

    @Test
    public void testManyItems4() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        homePage.searchAndClear("airpods");
        homePage.searchAndClear("beats solo 3");
        homePage.searchAndClear("skull candy headphones");
        System.out.println(getTitle());
        waitFor(5);
        System.out.println("Khatam!");
    }

    @Test
    public void testManyItems5() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        homePage.searchAndClear("standing lamp");
        homePage.searchAndClear("table lamp");
        homePage.searchAndClear("lava lamp");
        System.out.println(getTitle());
        waitFor(5);
        System.out.println("Khalas!");
    }
    @Test
    public void testManyItems6() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        homePage.searchAndClear("Water gun");
        homePage.searchAndClear("wwe action figure ring");
        System.out.println(getTitle());
        waitFor(5);
        System.out.println("Done!");
    }

    @Test
    public void testManyItems7() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        homePage.searchAndClear("bathrobe");
        homePage.searchAndClear("dove soap");
        System.out.println(getTitle());
        waitFor(5);
        System.out.println("Donezo!");
    }

    @Test
    public void testManyItems8() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        homePage.searchAndClear("ottoman chair");
        homePage.searchAndClear("fluffy towel");
        homePage.searchAndClear("floor mat");
        System.out.println(driver.getCurrentUrl());
        System.out.println(getTitle());
        waitFor(5);
        System.out.println("Finito!");
    }

    @Test
    public void testManyItems9() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        homePage.searchAndClear("airpods");
        homePage.searchAndClear("beats solo 3");
        homePage.searchAndClear("skull candy headphones");
        System.out.println(getTitle());
        waitFor(5);
        System.out.println("Khatam!");
    }

    @Test
    public void testManyItems10() {
        HomePage homePage = new HomePage(driver);
        Assert.assertEquals(getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        homePage.searchAndClear("standing lamp");
        homePage.searchAndClear("table lamp");
        homePage.searchAndClear("lava lamp");
        System.out.println(getTitle());
        waitFor(5);
        System.out.println("Khalas!");
    }
}
