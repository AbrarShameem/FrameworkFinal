package us.piit;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HomePage extends CommonAPI {

    @FindBy(id = "gh-ac")
    WebElement searchField;

    @FindBy(id = "gh-btn")
    WebElement searchBtn;

    @FindBy(id = "gh-shop-a")
    WebElement dropDownLeft;

    @FindBy(id = "gh-cat")
    WebElement dropDownRight;

    @FindBy(id = "gh-la")
    WebElement logo;

    @FindBy(id = "s0-0-32-4-0-0[0]-2-match-media-0-ebay-carousel-next")
    WebElement nextArrow;

    @FindBy(xpath = "//body[1]/div[5]/div[3]/div[1]/div[1]/div[1]/button[3]")
    WebElement pausePlayBtn;

    @FindBy(xpath = "//*[@id=\"gh-cat\"]/option[2]")
    WebElement antiques;

    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[3]/a[1]")
    WebElement motors;

    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[4]/a[1]")
    WebElement fashion;

    @FindBy(xpath = "//body/div[@id='mainContent']/div[1]/ul[1]/li[5]/a[1]")
    WebElement electronics;

    @FindBy(xpath = "//a[contains(text(),'Daily Deals')]")
    WebElement dailyDeals;

    @FindBy(xpath = "//header/div[@id='gh-top']/ul[@id='gh-topl']/li[@id='gh-p-3']/a[1]")
    WebElement helpAndContact;

    @FindBy (xpath = "//a[contains(text(),'Company info')]")
    WebElement compInfo;

    @FindBy (xpath = "//body[1]/header[1]/div[1]/div[1]/div[2]/div[2]/nav[1]/ul[1]/li[3]/a[1]")
    WebElement stories;

    public void firstTest() {
        dropDownLeft.click();
        for (int i = 0; i < 10; i++) {
            nextArrow.click();
        }
        logo.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ebay.com/");
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(driver.getTitle(), "Electronics, Cars, Fashion, Collectibles & More | eBay");
        System.out.println(getTitle());
    }

    public void secondTest() {
        searchBtn.click();
        dropDownRight.click();
        String newUrl = driver.getCurrentUrl();
        Assert.assertEquals(newUrl, "https://www.ebay.com/n/all-categories");
        System.out.println(newUrl);
        antiques.click();
        searchBtn.click();
        String newUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(newUrl1, "https://www.ebay.com/b/Antiques/20081/bn_1851017");
        System.out.println(newUrl1);

    }

    public void thirdTest() {
        hoverOver(driver, motors);
        String grabbingText = getText(motors);
        System.out.println(grabbingText);
        hoverOver(driver, fashion);
        String grabbingText1 = getText(fashion);
        System.out.println(grabbingText1);
        hoverOver(driver, electronics);
        String grabbingText2 = getText(electronics);
        System.out.println(grabbingText2);
        waitFor(3);
    }

    public void fourthTest() {
        searchField.sendKeys("java book");
        searchBtn.click();
        String url1 = driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(url1, "https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2380057.m570.l1313&_nkw=java+book&_sacat=0");
        clear(searchField);
        waitFor(2);
        searchField.sendKeys("80' flat screen");
        searchBtn.click();
        String url2 = driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(url2, "https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2334524.m570.l1313&_nkw=80%27+flat+screen&_sacat=0&LH_TitleDesc=0&_odkw=java+book&_osacat=0");
        clear(searchField);
        waitFor(2);
    }

    public void fifthTest(){
        dailyDeals.click();
        String dd = driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(dd, "https://www.ebay.com/deals");
        waitFor(2);
        helpAndContact.click();
        String hc = driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(hc, "https://www.ebay.com/help/home");
        waitFor(2);
    }


}



