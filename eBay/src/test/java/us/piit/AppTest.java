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

    //@Test
    public void test3() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.thirdTest();
    }

    //@Test
    public void test4() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.fourthTest();
    }

    //@Test
    public void test5() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.fifthTest();
    }

    //@Test
    public void test6() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.sixthTest();
    }

    //@Test
    public void test7() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.seventhTest();
    }

    //@Test
    public void test8() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.eighthTest();
    }

    //@Test
    public void test9() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.ninthTest();
    }

    //@Test
    public void test10() {
        HomePage home = PageFactory.initElements(driver, HomePage.class);
        home.tenthTest();
    }
}