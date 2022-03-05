package us.piit;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;



    public class Lights_LightingItemTest extends CommonAPI {


        @Test
        public void Lights_LightingItemTest1() {
            HomePage homePage = new HomePage(driver);
            Lights_LightingItem lights_lightingItem = new Lights_LightingItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickLightsLighting();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Lights-Lighting_p39?spm=a2700.8293689.HomeLeftCategory.d39.4b7667af2J7NFb");


        }

        @Test
        public void Lights_LightingItemTest2() {
            HomePage homePage = new HomePage(driver);
            Lights_LightingItem lights_lightingItem = new Lights_LightingItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickLightsLighting();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Lights-Lighting_p39?spm=a2700.8293689.HomeLeftCategory.d39.4b7667af2J7NFb");
            lights_lightingItem.clickCommercialIndustrialLighting();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929362.IndustryCategory.1.3fd11823HfeZo8&CateId=190000122&SearchText=Commercial+%26+Industrial+Lighting&language=en&indexArea=product_en/");
        }

        @Test
        public void Lights_LightingItemTest3() {
            HomePage homePage = new HomePage(driver);
            Lights_LightingItem lights_lightingItem = new Lights_LightingItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickLightsLighting();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Lights-Lighting_p39?spm=a2700.8293689.HomeLeftCategory.d39.4b7667af2J7NFb");
            lights_lightingItem.clickHealthcareLighting();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929362.IndustryCategory.2.3fd11823HfeZo8&CateId=201708004&SearchText=Healthcare+Lighting&language=en&indexArea=product_en");
        }

        @Test
        public void Lights_LightingItemTest4() {
            HomePage homePage = new HomePage(driver);
            Lights_LightingItem lights_lightingItem = new Lights_LightingItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickLightsLighting();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Lights-Lighting_p39?spm=a2700.8293689.HomeLeftCategory.d39.4b7667af2J7NFb");
            lights_lightingItem.clickHolidayLighting();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929362.IndustryCategory.3.3fd11823HfeZo8&CateId=201614401&SearchText=Holiday+Lighting&language=en&indexArea=product_en");
        }


        @Test
        public void Lights_LightingItemTest5() {
            HomePage homePage = new HomePage(driver);
            Lights_LightingItem lights_lightingItem = new Lights_LightingItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickLightsLighting();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Lights-Lighting_p39?spm=a2700.8293689.HomeLeftCategory.d39.4b7667af2J7NFb");
            lights_lightingItem.clickHolidayLighting();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929362.IndustryCategory.3.3fd11823HfeZo8&CateId=201614401&SearchText=Holiday+Lighting&language=en&indexArea=product_en");
        }


        @Test
        public void Lights_LightingItemTest6() {
            HomePage homePage = new HomePage(driver);
            Lights_LightingItem lights_lightingItem = new Lights_LightingItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickLightsLighting();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Lights-Lighting_p39?spm=a2700.8293689.HomeLeftCategory.d39.4b7667af2J7NFb");
            lights_lightingItem.clickIndoorLighting();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929362.IndustryCategory.4.3fd11823HfeZo8&CateId=150406&SearchText=Indoor+Lighting&language=en&indexArea=product_en");
        }


        @Test
        public void Lights_LightingItemTest7() {
            HomePage homePage = new HomePage(driver);
            Lights_LightingItem lights_lightingItem = new Lights_LightingItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickLightsLighting();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Lights-Lighting_p39?spm=a2700.8293689.HomeLeftCategory.d39.4b7667af2J7NFb");
            lights_lightingItem.clickLandscapeLighting();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929362.IndustryCategory.5.3fd11823HfeZo8&CateId=100010494&SearchText=Landscape+Lighting&language=en&indexArea=product_en");
        }


        @Test
        public void Lights_LightingItemTest8() {
            HomePage homePage = new HomePage(driver);
            Lights_LightingItem lights_lightingItem = new Lights_LightingItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickLightsLighting();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Lights-Lighting_p39?spm=a2700.8293689.HomeLeftCategory.d39.4b7667af2J7NFb");
            lights_lightingItem.clickLightingAccessories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929362.IndustryCategory.6.3fd11823HfeZo8&CateId=530&SearchText=Lighting+Accessories&language=en&indexArea=product_en");
        }

        @Test
        public void Lights_LightingItemTest9() {
            HomePage homePage = new HomePage(driver);
            Lights_LightingItem lights_lightingItem = new Lights_LightingItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickLightsLighting();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Lights-Lighting_p39?spm=a2700.8293689.HomeLeftCategory.d39.4b7667af2J7NFb");
            lights_lightingItem.clickLightingBulbsTubes();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929362.IndustryCategory.7.3fd11823HfeZo8&CateId=150402&SearchText=Lighting+Bulbs+%26+Tubes&language=en&indexArea=product_en");
        }

        @Test
        public void Lights_LightingItemTest10() {
            HomePage homePage = new HomePage(driver);
            Lights_LightingItem lights_lightingItem = new Lights_LightingItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickLightsLighting();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Lights-Lighting_p39?spm=a2700.8293689.HomeLeftCategory.d39.4b7667af2J7NFb");
            lights_lightingItem.clickLightingProducts();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929362.IndustryCategory.8.3fd11823HfeZo8&CateId=201615201&SearchText=Other+Lights+%26+Lighting+Products&language=en&indexArea=product_en");
        }

        @Test
        public void Lights_LightingItemTest11() {
            HomePage homePage = new HomePage(driver);
            Lights_LightingItem lights_lightingItem = new Lights_LightingItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickLightsLighting();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Lights-Lighting_p39?spm=a2700.8293689.HomeLeftCategory.d39.4b7667af2J7NFb");
            lights_lightingItem.clickOutdoorLighting();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929362.IndustryCategory.9.3fd11823HfeZo8&CateId=100010530&SearchText=Outdoor+Lighting&language=en&indexArea=product_en");

        }

        @Test
        public void Lights_LightingItemTest12() {
            HomePage homePage = new HomePage(driver);
            Lights_LightingItem lights_lightingItem = new Lights_LightingItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            lights_lightingItem.clickLightsLighting();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Lights-Lighting_p39?spm=a2700.8293689.HomeLeftCategory.d39.4b7667af2J7NFb");
            lights_lightingItem.clickProfessionalLighting();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929362.IndustryCategory.10.3fd11823HfeZo8&CateId=100010540&SearchText=Professional+Lighting&language=en&indexArea=product_en");

        }

    }
