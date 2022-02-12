package us.piit;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AppTest extends CommonAPI {

    HomePage home = new HomePage();

    //@Test
    public void test1() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.firstTest();
    }
    //@Test
    public void test2() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.secondTest();
    }
    @Test
    public void test3() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.testTest();


    }}
