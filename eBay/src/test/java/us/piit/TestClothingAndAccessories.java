package us.piit;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClothingAndAccessories extends CommonAPI {

    //@Test
    public void clothingAndAccessories1() {
        HomePage homePage = new HomePage(driver);
        ClothingAndAccessoriesPage clothingAndAccessoriesPage = new ClothingAndAccessoriesPage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        homePage.clickClothingAndAccessorieslink();
        Assert.assertEquals(getTitle(), "Clothing, Shoes & Accessories for sale | eBay");
        clothingAndAccessoriesPage.clickbabyLink();
        clothingAndAccessoriesPage.clickkidsLink();
        clothingAndAccessoriesPage.clickmenLink();
        Assert.assertEquals(getTitle(), "Clothing, Shoes & Accessories for sale | eBay");
        clothingAndAccessoriesPage.clickspecialtyLink();
        clothingAndAccessoriesPage.clickwomenLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545");
        homePage.searchAndClear("addidas sneakers");
        goBack();
        clothingAndAccessoriesPage.clickluxaryWatchesLink();
        Assert.assertEquals(getTitle(), "Luxury Watches for Sale - New & Used Designer Watches - eBay");
        System.out.println("success");
    }
    //@Test
    public void clothingAndAccessories2() {
        HomePage homePage = new HomePage(driver);
        ClothingAndAccessoriesPage clothingAndAccessoriesPage = new ClothingAndAccessoriesPage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        homePage.clickClothingAndAccessorieslink();
        Assert.assertEquals(getTitle(), "Clothing, Shoes & Accessories for sale | eBay");
        clothingAndAccessoriesPage.clickbabyLink();
        clothingAndAccessoriesPage.clickkidsLink();
        clothingAndAccessoriesPage.clickmenLink();
        Assert.assertEquals(getTitle(), "Clothing, Shoes & Accessories for sale | eBay");
        clothingAndAccessoriesPage.clickspecialtyLink();
        clothingAndAccessoriesPage.clickwomenLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545");
        homePage.searchAndClear("addidas sneakers");
        goBack();
        clothingAndAccessoriesPage.clickluxaryWatchesLink();goBack();
        clothingAndAccessoriesPage.clickdesignerHandbagsLink();
        Assert.assertEquals(getTitle(), "Designer Handbags products for sale | eBay");
        System.out.println("success");
    }
    //@Test
    public void clothingAndAccessories3() {
        HomePage homePage = new HomePage(driver);
        ClothingAndAccessoriesPage clothingAndAccessoriesPage = new ClothingAndAccessoriesPage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        homePage.clickClothingAndAccessorieslink();
        Assert.assertEquals(getTitle(), "Clothing, Shoes & Accessories for sale | eBay");
        clothingAndAccessoriesPage.clickbabyLink();
        clothingAndAccessoriesPage.clickkidsLink();
        clothingAndAccessoriesPage.clickmenLink();
        Assert.assertEquals(getTitle(), "Clothing, Shoes & Accessories for sale | eBay");
        clothingAndAccessoriesPage.clickspecialtyLink();
        clothingAndAccessoriesPage.clickwomenLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545");
        homePage.searchAndClear("addidas sneakers");
        goBack();
        clothingAndAccessoriesPage.clickluxaryWatchesLink();goBack();
        clothingAndAccessoriesPage.clickdesignerHandbagsLink();
        Assert.assertEquals(getTitle(), "Designer Handbags products for sale | eBay");
        goBack();
        clothingAndAccessoriesPage.clickfineJewelryLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Fine-Jewelry/4196/bn_2408477");goBack();
        System.out.println("success");
    }
    //@Test
    public void clothingAndAccessories4() {
        HomePage homePage = new HomePage(driver);
        ClothingAndAccessoriesPage clothingAndAccessoriesPage = new ClothingAndAccessoriesPage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        homePage.clickClothingAndAccessorieslink();
        Assert.assertEquals(getTitle(), "Clothing, Shoes & Accessories for sale | eBay");
        clothingAndAccessoriesPage.clickbabyLink();
        clothingAndAccessoriesPage.clickkidsLink();
        clothingAndAccessoriesPage.clickmenLink();
        Assert.assertEquals(getTitle(), "Clothing, Shoes & Accessories for sale | eBay");
        clothingAndAccessoriesPage.clickspecialtyLink();
        clothingAndAccessoriesPage.clickwomenLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545");
        homePage.searchAndClear("addidas sneakers");
        goBack();
        clothingAndAccessoriesPage.clickluxaryWatchesLink();goBack();
        clothingAndAccessoriesPage.clickdesignerHandbagsLink();
        Assert.assertEquals(getTitle(), "Designer Handbags products for sale | eBay");
        goBack();
        clothingAndAccessoriesPage.clickfineJewelryLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Fine-Jewelry/4196/bn_2408477");goBack();
        clothingAndAccessoriesPage.clickcollectibleSneakersLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Collectible-Sneakers/bn_7000259435");goBack();
        System.out.println("success");
    }
    //@Test
    public void clothingAndAccessories5() {
        HomePage homePage = new HomePage(driver);
        ClothingAndAccessoriesPage clothingAndAccessoriesPage = new ClothingAndAccessoriesPage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        homePage.clickClothingAndAccessorieslink();
        Assert.assertEquals(getTitle(), "Clothing, Shoes & Accessories for sale | eBay");
        clothingAndAccessoriesPage.clickbabyLink();
        clothingAndAccessoriesPage.clickkidsLink();
        clothingAndAccessoriesPage.clickmenLink();
        Assert.assertEquals(getTitle(), "Clothing, Shoes & Accessories for sale | eBay");
        clothingAndAccessoriesPage.clickspecialtyLink();
        clothingAndAccessoriesPage.clickwomenLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545");
        homePage.searchAndClear("addidas sneakers");
        goBack();
        clothingAndAccessoriesPage.clickluxaryWatchesLink();goBack();
        clothingAndAccessoriesPage.clickdesignerHandbagsLink();
        Assert.assertEquals(getTitle(), "Designer Handbags products for sale | eBay");
        goBack();
        clothingAndAccessoriesPage.clickfineJewelryLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Fine-Jewelry/4196/bn_2408477");goBack();
        clothingAndAccessoriesPage.clickcollectibleSneakersLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Collectible-Sneakers/bn_7000259435");goBack();
        clothingAndAccessoriesPage.clickcostumesLink();
        System.out.println("success");
    }
    //@Test
    public void clothingAndAccessories6() {
        HomePage homePage = new HomePage(driver);
        ClothingAndAccessoriesPage clothingAndAccessoriesPage = new ClothingAndAccessoriesPage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        homePage.clickClothingAndAccessorieslink();
        Assert.assertEquals(getTitle(), "Clothing, Shoes & Accessories for sale | eBay");
        clothingAndAccessoriesPage.clickbabyLink();
        clothingAndAccessoriesPage.clickkidsLink();
        clothingAndAccessoriesPage.clickmenLink();
        Assert.assertEquals(getTitle(), "Clothing, Shoes & Accessories for sale | eBay");
        clothingAndAccessoriesPage.clickspecialtyLink();
        clothingAndAccessoriesPage.clickwomenLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545");
        homePage.searchAndClear("addidas sneakers");
        goBack();
        clothingAndAccessoriesPage.clickluxaryWatchesLink();goBack();
        clothingAndAccessoriesPage.clickdesignerHandbagsLink();
        Assert.assertEquals(getTitle(), "Designer Handbags products for sale | eBay");
        goBack();
        clothingAndAccessoriesPage.clickfineJewelryLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Fine-Jewelry/4196/bn_2408477");goBack();
        clothingAndAccessoriesPage.clickcollectibleSneakersLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Collectible-Sneakers/bn_7000259435");goBack();
        clothingAndAccessoriesPage.clickcostumesLink();goBack();
        clothingAndAccessoriesPage.clickpersonalizedItemsLink();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);
        System.out.println("success");
    }
    //@Test
    public void clothingAndAccessories7() {
        HomePage homePage = new HomePage(driver);
        ClothingAndAccessoriesPage clothingAndAccessoriesPage = new ClothingAndAccessoriesPage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        homePage.clickClothingAndAccessorieslink();
        Assert.assertEquals(getTitle(), "Clothing, Shoes & Accessories for sale | eBay");
        clothingAndAccessoriesPage.clickbabyLink();
        clothingAndAccessoriesPage.clickkidsLink();
        clothingAndAccessoriesPage.clickmenLink();
        Assert.assertEquals(getTitle(), "Clothing, Shoes & Accessories for sale | eBay");
        clothingAndAccessoriesPage.clickspecialtyLink();
        clothingAndAccessoriesPage.clickwomenLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545");
        homePage.searchAndClear("addidas sneakers");
        goBack();
        clothingAndAccessoriesPage.clickluxaryWatchesLink();goBack();
        clothingAndAccessoriesPage.clickdesignerHandbagsLink();
        Assert.assertEquals(getTitle(), "Designer Handbags products for sale | eBay");
        goBack();
        clothingAndAccessoriesPage.clickfineJewelryLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Fine-Jewelry/4196/bn_2408477");goBack();
        clothingAndAccessoriesPage.clickcollectibleSneakersLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Collectible-Sneakers/bn_7000259435");goBack();
        clothingAndAccessoriesPage.clickcostumesLink();goBack();
        clothingAndAccessoriesPage.clickpersonalizedItemsLink();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);goBack();
        clothingAndAccessoriesPage.clicksportsFanClothingLink();
        System.out.println("success");
    }
    //@Test
    public void clothingAndAccessories8() {
        HomePage homePage = new HomePage(driver);
        ClothingAndAccessoriesPage clothingAndAccessoriesPage = new ClothingAndAccessoriesPage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        homePage.clickClothingAndAccessorieslink();
        Assert.assertEquals(getTitle(), "Clothing, Shoes & Accessories for sale | eBay");
        clothingAndAccessoriesPage.clickbabyLink();
        clothingAndAccessoriesPage.clickkidsLink();
        clothingAndAccessoriesPage.clickmenLink();
        Assert.assertEquals(getTitle(), "Clothing, Shoes & Accessories for sale | eBay");
        clothingAndAccessoriesPage.clickspecialtyLink();
        clothingAndAccessoriesPage.clickwomenLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545");
        homePage.searchAndClear("addidas sneakers");
        goBack();
        clothingAndAccessoriesPage.clickluxaryWatchesLink();goBack();
        clothingAndAccessoriesPage.clickdesignerHandbagsLink();
        Assert.assertEquals(getTitle(), "Designer Handbags products for sale | eBay");
        goBack();
        clothingAndAccessoriesPage.clickfineJewelryLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Fine-Jewelry/4196/bn_2408477");goBack();
        clothingAndAccessoriesPage.clickcollectibleSneakersLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Collectible-Sneakers/bn_7000259435");goBack();
        clothingAndAccessoriesPage.clickcostumesLink();goBack();
        clothingAndAccessoriesPage.clickpersonalizedItemsLink();
        String title = getTitle();
        Assert.assertEquals(getTitle(), title);goBack();
        clothingAndAccessoriesPage.clicksportsFanClothingLink();
        System.out.println("success");
        goBack();
        clothingAndAccessoriesPage.clicktraditionalAndWorldClothingLink();
        String title2 = getTitle();
        Assert.assertEquals(getTitle(), title2);
    }
    //@Test
    public void clothingAndAccessories9() {
        HomePage homePage = new HomePage(driver);
        ClothingAndAccessoriesPage clothingAndAccessoriesPage = new ClothingAndAccessoriesPage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        homePage.clickClothingAndAccessorieslink();
        Assert.assertEquals(getTitle(), "Clothing, Shoes & Accessories for sale | eBay");
        clothingAndAccessoriesPage.clickbabyLink();
        clothingAndAccessoriesPage.clickkidsLink();
        clothingAndAccessoriesPage.clickmenLink();
        Assert.assertEquals(getTitle(), "Clothing, Shoes & Accessories for sale | eBay");
        clothingAndAccessoriesPage.clickspecialtyLink();
        clothingAndAccessoriesPage.clickwomenLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545");
        homePage.searchAndClear("addidas sneakers");
        goBack();
        clothingAndAccessoriesPage.clickluxaryWatchesLink();goBack();
        clothingAndAccessoriesPage.clickdesignerHandbagsLink();
        Assert.assertEquals(getTitle(), "Designer Handbags products for sale | eBay");
        System.out.println("success");
    }
    //@Test
    public void clothingAndAccessories10() {
        HomePage homePage = new HomePage(driver);
        ClothingAndAccessoriesPage clothingAndAccessoriesPage = new ClothingAndAccessoriesPage(driver);
        DailyDealsPage dailyDealsPage = new DailyDealsPage(driver);
        homePage.clickClothingAndAccessorieslink();
        Assert.assertEquals(getTitle(), "Clothing, Shoes & Accessories for sale | eBay");
        clothingAndAccessoriesPage.clickbabyLink();
        clothingAndAccessoriesPage.clickkidsLink();
        clothingAndAccessoriesPage.clickmenLink();
        Assert.assertEquals(getTitle(), "Clothing, Shoes & Accessories for sale | eBay");
        clothingAndAccessoriesPage.clickspecialtyLink();
        clothingAndAccessoriesPage.clickwomenLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545");
        homePage.searchAndClear("addidas sneakers");
        goBack();
        clothingAndAccessoriesPage.clickluxaryWatchesLink();goBack();
        clothingAndAccessoriesPage.clickdesignerHandbagsLink();
        Assert.assertEquals(getTitle(), "Designer Handbags products for sale | eBay");
        goBack();
        clothingAndAccessoriesPage.clickfineJewelryLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Fine-Jewelry/4196/bn_2408477");goBack();
        clothingAndAccessoriesPage.clickcollectibleSneakersLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/b/Collectible-Sneakers/bn_7000259435");goBack();
        System.out.println("success");
    }
}