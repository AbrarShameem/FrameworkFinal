package us.piit;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


    public class FurnitureItemTest extends CommonAPI {


        @Test
        public void FurnitureItemTest1() {
            HomePage homePage = new HomePage(driver);
            FurnitureItem furnitureItem = new FurnitureItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickFurniture();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Furniture_p1503?spm=a2700.8293689.HomeLeftCategory.d1503.4b7667afnN85YC");
            goBack();
            driver.navigate().to("https://www.alibaba.com/");

        }

        @Test
        public void FurnitureItemTest2() {
            HomePage homePage = new HomePage(driver);
            FurnitureItem furnitureItem = new FurnitureItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickFurniture();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Furniture_p1503?spm=a2700.8293689.HomeLeftCategory.d1503.4b7667afnN85YC");
            goBack();
            driver.navigate().to("https://www.alibaba.com/");
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickFurniture();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Furniture_p1503?spm=a2700.8293689.HomeLeftCategory.d1503.4b7667afnN85YC");
            furnitureItem.clickCommercialFurniture();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929384.IndustryCategory.1.55271d2aVsW92O&CateId=150301&SearchText=Commercial+Furniture&language=en&indexArea=product_en");
        }

        @Test
        public void FurnitureItemTest3() {
            HomePage homePage = new HomePage(driver);
            FurnitureItem furnitureItem = new FurnitureItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickFurniture();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Furniture_p1503?spm=a2700.8293689.HomeLeftCategory.d1503.4b7667afnN85YC");
            goBack();
            driver.navigate().to("https://www.alibaba.com/");
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickFurniture();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Furniture_p1503?spm=a2700.8293689.HomeLeftCategory.d1503.4b7667afnN85YC");
            furnitureItem.clickCommercialFurniture();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929384.IndustryCategory.1.55271d2aVsW92O&CateId=150301&SearchText=Commercial+Furniture&language=en&indexArea=product_en");
            furnitureItem.clickFurnitureAccessories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929384.IndustryCategory.2.55271d2aVsW92O&CateId=201346305&SearchText=Furniture+Accessories&language=en&indexArea=product_en");
            goBack();
            furnitureItem.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
        }

        @Test
        public void FurnitureItemTest4() {
            HomePage homePage = new HomePage(driver);
            FurnitureItem furnitureItem = new FurnitureItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickFurniture();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Furniture_p1503?spm=a2700.8293689.HomeLeftCategory.d1503.4b7667afnN85YC");
            goBack();
            driver.navigate().to("https://www.alibaba.com/");
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickFurnitureHardware();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929384.IndustryCategory.3.55271d2aVsW92O&CateId=150306&SearchText=Furniture+Hardware&language=en&indexArea=product_en");


        }

        @Test
        public void FurnitureItemTest5() {
            HomePage homePage = new HomePage(driver);
            FurnitureItem furnitureItem = new FurnitureItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickFurniture();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Furniture_p1503?spm=a2700.8293689.HomeLeftCategory.d1503.4b7667afnN85YC");
            goBack();
            driver.navigate().to("https://www.alibaba.com/");
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickFurnitureHardware();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929384.IndustryCategory.3.55271d2aVsW92O&CateId=150306&SearchText=Furniture+Hardware&language=en&indexArea=product_en");
            goBack();
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickFurnitureParts();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929384.IndustryCategory.4.55271d2aVsW92O&CateId=3708&SearchText=Furniture+Parts&language=en&indexArea=product_en");


        }

        @Test
        public void FurnitureItemTest6() {
            HomePage homePage = new HomePage(driver);
            FurnitureItem furnitureItem = new FurnitureItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickFurniture();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Furniture_p1503?spm=a2700.8293689.HomeLeftCategory.d1503.4b7667afnN85YC");
            goBack();
            driver.navigate().to("https://www.alibaba.com/");
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickFurnitureHardware();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929384.IndustryCategory.3.55271d2aVsW92O&CateId=150306&SearchText=Furniture+Hardware&language=en&indexArea=product_en");
            goBack();
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickHomeFurniture();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929384.IndustryCategory.5.55271d2aVsW92O&CateId=150303&SearchText=Home+Furniture&language=en&indexArea=product_en");

        }

        @Test
        public void FurnitureItemTest7() {
            HomePage homePage = new HomePage(driver);
            FurnitureItem furnitureItem = new FurnitureItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickFurniture();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Furniture_p1503?spm=a2700.8293689.HomeLeftCategory.d1503.4b7667afnN85YC");
            goBack();
            driver.navigate().to("https://www.alibaba.com/");
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickFurnitureHardware();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929384.IndustryCategory.3.55271d2aVsW92O&CateId=150306&SearchText=Furniture+Hardware&language=en&indexArea=product_en");
            goBack();
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickKidsFurniture();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929384.IndustryCategory.6.55271d2aVsW92O&CateId=100003020&SearchText=Kid%27s+Furniture&language=en&indexArea=product_en");

        }

        @Test
        public void FurnitureItemTest8() {
            HomePage homePage = new HomePage(driver);
            FurnitureItem furnitureItem = new FurnitureItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickFurniture();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Furniture_p1503?spm=a2700.8293689.HomeLeftCategory.d1503.4b7667afnN85YC");
            goBack();
            driver.navigate().to("https://www.alibaba.com/");
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickFurnitureHardware();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929384.IndustryCategory.3.55271d2aVsW92O&CateId=150306&SearchText=Furniture+Hardware&language=en&indexArea=product_en");
            goBack();
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickOtherFurniture();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929384.IndustryCategory.7.55271d2aVsW92O&CateId=150399&SearchText=Other+Furniture&language=en&indexArea=product_en");

        }

        @Test
        public void FurnitureItemTest9() {
            HomePage homePage = new HomePage(driver);
            FurnitureItem furnitureItem = new FurnitureItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickFurniture();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Furniture_p1503?spm=a2700.8293689.HomeLeftCategory.d1503.4b7667afnN85YC");
            goBack();
            driver.navigate().to("https://www.alibaba.com/");
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickFurnitureHardware();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929384.IndustryCategory.3.55271d2aVsW92O&CateId=150306&SearchText=Furniture+Hardware&language=en&indexArea=product_en");
            goBack();
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickOutdoorFurniture();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929384.IndustryCategory.8.55271d2aVsW92O&CateId=150302&SearchText=Outdoor+Furniture&language=en&indexArea=product_en");

        }

        @Test
        public void FurnitureItemTest10() {
            HomePage homePage = new HomePage(driver);
            FurnitureItem furnitureItem = new FurnitureItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickFurniture();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Furniture_p1503?spm=a2700.8293689.HomeLeftCategory.d1503.4b7667afnN85YC");
            goBack();
            driver.navigate().to("https://www.alibaba.com/");
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            furnitureItem.clickHospitalFurniture();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929384.IndustryCategory.25.458d1d2aQPaP0e&CateId=100001030&SearchText=Hospital+Furniture&language=en&indexArea=product_en");

        }


    }