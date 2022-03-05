package us.piit;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;


    public class Construction_RealStateItemTest extends CommonAPI {

         @Test
        public void construction_RealStateItemTest1() {
            HomePage homePage = new HomePage(driver);
            Construction_RealStateItem construction_RealStateItem = new Construction_RealStateItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com");
            construction_RealStateItem.clickConstruction_RealState();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/Construction-Real-Estate_p13?spm=a2700.8293689.HomeLeftCategory.d13.4b7667afXzSpMs");
            construction_RealStateItem.clickBathroom_Kitchen();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/trade/search?spm=a27aq.13929341.IndustryCategory.2.454a1997EfcxlL&CateId=100006265&SearchText=Bathroom+%26+Kitchen&language=en&indexArea=product_en");

        }

         @Test
        public void construction_RealStateItemTest2() {
            HomePage homePage = new HomePage(driver);
            Construction_RealStateItem construction_RealStateItem = new Construction_RealStateItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com");
            construction_RealStateItem.clickConstruction_RealState();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/Construction-Real-Estate_p13?spm=a2700.8293689.HomeLeftCategory.d13.4b7667afXzSpMs");
            construction_RealStateItem.clickBathroom_Kitchen();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/trade/search?spm=a27aq.13929341.IndustryCategory.2.454a1997EfcxlL&CateId=100006265&SearchText=Bathroom+%26+Kitchen&language=en&indexArea=product_en");
            construction_RealStateItem.clickBathroomVanities();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/trade/search?spm=a27aq.13929341.IndustryCategory.34.79c71997tXFo7d&CateId=130180&SearchText=Bathroom+Vanities&language=en&indexArea=product_en");
            construction_RealStateItem.clickKitchenSink();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/trade/search?spm=a27aq.13929341.IndustryCategory.46.79c71997tXFo7d&CateId=130110&SearchText=Bathroom+Sinks&language=en&indexArea=product_en");
        }

         @Test
        public void construction_RealStateItemTest3() {
            HomePage homePage = new HomePage(driver);
            Construction_RealStateItem construction_RealStateItem = new Construction_RealStateItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com");
            construction_RealStateItem.clickConstruction_RealState();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/Construction-Real-Estate_p13?spm=a2700.8293689.HomeLeftCategory.d13.4b7667afXzSpMs");
            construction_RealStateItem.clickBuilding_IndustrialGlass();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/trade/search?spm=a27aq.13929341.IndustryCategory.3.79c71997tXFo7d&CateId=201723103&SearchText=Building+%26+Industrial+Glass&language=en&indexArea=product_en");
            construction_RealStateItem.clickBulletProofGlass();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/trade/search?spm=a27aq.13929341.IndustryCategory.46.79c71997tXFo7d&CateId=130110&SearchText=Bathroom+Sinks&language=en&indexArea=product_en");
            construction_RealStateItem.clickElectricGlass();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/trade/search?spm=a27aq.13929341.IndustryCategory.61.79c71997tXFo7d&CateId=201723603&SearchText=Electronic+glass&language=en&indexArea=product_en");
        }

         @Test
        public void construction_RealStateItemTest4() {
            HomePage homePage = new HomePage(driver);
            Construction_RealStateItem construction_RealStateItem = new Construction_RealStateItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com");
            construction_RealStateItem.clickConstruction_RealState();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/Construction-Real-Estate_p13?spm=a2700.8293689.HomeLeftCategory.d13.4b7667afXzSpMs");
            construction_RealStateItem.clickBuilding_IndustrialGlass();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/trade/search?spm=a27aq.13929341.IndustryCategory.3.79c71997tXFo7d&CateId=201723103&SearchText=Building+%26+Industrial+Glass&language=en&indexArea=product_en");
            construction_RealStateItem.clickBulletProofGlass();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/trade/search?spm=a27aq.13929341.IndustryCategory.46.79c71997tXFo7d&CateId=130110&SearchText=Bathroom+Sinks&language=en&indexArea=product_en");
            construction_RealStateItem.clickElectricGlass();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/trade/search?spm=a27aq.13929341.IndustryCategory.61.79c71997tXFo7d&CateId=201723603&SearchText=Electronic+glass&language=en&indexArea=product_en");
            construction_RealStateItem.clickTintedGlass();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/trade/search?spm=a27aq.13929341.IndustryCategory.85.79c71997tXFo7d&CateId=201733701&SearchText=Tinted+Glass&language=en&indexArea=product_en");
        }
         @Test
        public void construction_RealStateItemTest5() {
            HomePage homePage = new HomePage(driver);
            Construction_RealStateItem construction_RealStateItem = new Construction_RealStateItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com");
            construction_RealStateItem.clickConstruction_RealState();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/Construction-Real-Estate_p13?spm=a2700.8293689.HomeLeftCategory.d13.4b7667afXzSpMs");
            construction_RealStateItem.clickCeilings();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/trade/search?spm=a27aq.13929341.IndustryCategory.5.79c71997tXFo7d&CateId=100007099&SearchText=Ceilings&language=en&indexArea=product_enq");

        }

         @Test
        public void construction_RealStateItemTest6() {
            HomePage homePage = new HomePage(driver);
            Construction_RealStateItem construction_RealStateItem = new Construction_RealStateItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com");
            construction_RealStateItem.clickConstruction_RealState();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/Construction-Real-Estate_p13?spm=a2700.8293689.HomeLeftCategory.d13.4b7667afXzSpMs");
            construction_RealStateItem.clickCeilings();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/trade/search?spm=a27aq.13929341.IndustryCategory.5.79c71997tXFo7d&CateId=100007099&SearchText=Ceilings&language=en&indexArea=product_enq");
            construction_RealStateItem.clickCornerGuards();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/trade/search?spm=a27aq.13929341.IndustryCategory.6.79c71997tXFo7d&CateId=1340&SearchText=Corner+Guards&language=en&indexArea=product_en");

        }
         @Test
        public void construction_RealStateItemTest7() {
            HomePage homePage = new HomePage(driver);
            Construction_RealStateItem construction_RealStateItem = new Construction_RealStateItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com");
            construction_RealStateItem.clickConstruction_RealState();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/Construction-Real-Estate_p13?spm=a2700.8293689.HomeLeftCategory.d13.4b7667afXzSpMs");
            construction_RealStateItem.clickCeilings();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/trade/search?spm=a27aq.13929341.IndustryCategory.5.79c71997tXFo7d&CateId=100007099&SearchText=Ceilings&language=en&indexArea=product_enq");
            construction_RealStateItem.clickTops();
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.alibaba.com/trade/search?spm=a27aq.13929341.IndustryCategory.7.79c71997tXFo7d&CateId=131210&SearchText=Countertops%2CVanity+Tops+%26+Table+Tops&language=en&indexArea=product_en");
        }
    }