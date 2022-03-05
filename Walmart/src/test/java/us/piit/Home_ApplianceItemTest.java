package us.piit;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;


    public class Home_ApplianceItemTest extends CommonAPI {


        @Test
        public void Home_ApplianceItemTest1() {
            HomePage homePage = new HomePage(driver);
            Home_ApplianceItem home_applianceItem = new Home_ApplianceItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickAirConditioningAppliances();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");


        }
        @Test
        public void Home_ApplianceItemTest2() {
            HomePage homePage = new HomePage(driver);
            Home_ApplianceItem home_applianceItem = new Home_ApplianceItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickAirConditioningAppliances();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            goBack();
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickBabyAppliances();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929329.IndustryCategory.2.7457237172cKfu&CateId=201763002&SearchText=Baby+Appliances&language=en&indexArea=product_en");
        }


        @Test
        public void Home_ApplianceItemTest3() {
            HomePage homePage = new HomePage(driver);
            Home_ApplianceItem home_applianceItem = new Home_ApplianceItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickAirConditioningAppliances();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            goBack();
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickCleaningAppliances();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929329.IndustryCategory.3.7457237172cKfu&CateId=201607803&SearchText=Cleaning+Appliances&language=en&indexArea=product_en");
        }


        @Test
        public void Home_ApplianceItemTest4() {
            HomePage homePage = new HomePage(driver);
            Home_ApplianceItem home_applianceItem = new Home_ApplianceItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickAirConditioningAppliances();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            goBack();
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickHomeApplianceParts();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929329.IndustryCategory.4.7457237172cKfu&CateId=100000039&SearchText=Home+Appliance+Parts&language=en&indexArea=product_en");
        }


        @Test
        public void Home_ApplianceItemTest5() {
            HomePage homePage = new HomePage(driver);
            Home_ApplianceItem home_applianceItem = new Home_ApplianceItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickAirConditioningAppliances();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            goBack();
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickHomeApplianceParts();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929329.IndustryCategory.4.7457237172cKfu&CateId=100000039&SearchText=Home+Appliance+Parts&language=en&indexArea=product_en");
        }

        @Test
        public void Home_ApplianceItemTest6() {
            HomePage homePage = new HomePage(driver);
            Home_ApplianceItem home_applianceItem = new Home_ApplianceItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickAirConditioningAppliances();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            goBack();
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickHomeAppliancesStocks();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929329.IndustryCategory.5.7457237172cKfu&CateId=631&SearchText=Home+Appliances+Stocks&language=en&indexArea=product_en");
        }

        @Test
        public void Home_ApplianceItemTest7() {
            HomePage homePage = new HomePage(driver);
            Home_ApplianceItem home_applianceItem = new Home_ApplianceItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickAirConditioningAppliances();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            goBack();
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickHomeHeaters();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929329.IndustryCategory.6.7457237172cKfu&CateId=100000040&SearchText=Home+Heaters&language=en&indexArea=product_en");
        }


        @Test
        public void Home_ApplianceItemTest8() {
            HomePage homePage = new HomePage(driver);
            Home_ApplianceItem home_applianceItem = new Home_ApplianceItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickAirConditioningAppliances();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            goBack();
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickLaundryAppliances();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929329.IndustryCategory.7.7457237172cKfu&CateId=100000042&SearchText=Laundry+Appliances&language=en&indexArea=product_en");
        }

        @Test
        public void Home_ApplianceItemTest9() {
            HomePage homePage = new HomePage(driver);
            Home_ApplianceItem home_applianceItem = new Home_ApplianceItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickAirConditioningAppliances();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            goBack();
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickMajorKitchenAppliances();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929329.IndustryCategory.8.7457237172cKfu&CateId=201326902&SearchText=Major+Kitchen+Appliances&language=en&indexArea=product_en");
        }


        @Test
        public void Home_ApplianceItemTest10() {
            HomePage homePage = new HomePage(driver);
            Home_ApplianceItem home_applianceItem = new Home_ApplianceItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickAirConditioningAppliances();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            goBack();
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickOtherHomeAppliances();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929329.IndustryCategory.9.7457237172cKfu&CateId=628&SearchText=Other+Home+Appliances&language=en&indexArea=product_en");
        }


        @Test
        public void Home_ApplianceItemTest11() {
            HomePage homePage = new HomePage(driver);
            Home_ApplianceItem home_applianceItem = new Home_ApplianceItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickAirConditioningAppliances();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            goBack();
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickBeautyAppliances();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929329.IndustryCategory.10.7457237172cKfu&CateId=200540008&SearchText=Personal+Care+%26+Beauty+Appliances&language=en&indexArea=product_en");
        }

        @Test
        public void Home_ApplianceItemTest12() {
            HomePage homePage = new HomePage(driver);
            Home_ApplianceItem home_applianceItem = new Home_ApplianceItem(driver);
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickAirConditioningAppliances();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            goBack();
            homePage.clickAllCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/");
            home_applianceItem.clickCategories();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/?spm=a2700.8293689.scGlobalHomeHeader.8.2fd267afMGDbML");
            home_applianceItem.clickHomeApplience();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/Home-Appliances_p6?spm=a2700.8293689.scGlobalHomeHeader.392.4b7667af2J7NFb");
            home_applianceItem.clickRefrigeratorsFreezers();
            Assert.assertEquals(getTitle(), "https://www.alibaba.com/trade/search?spm=a27aq.13929329.IndustryCategory.11.7457237172cKfu&CateId=100000136&SearchText=Refrigerators+%26+Freezers&language=en&indexArea=product_en");
        }










    }