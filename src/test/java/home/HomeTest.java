package home;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTests {

     static HomePage homePage;

    public HomeTest(WebDriver driver) {
        super();
    }

    @Test
    public static void homepageTest(){
        homePage = new HomePage(driver);
        homePage.VerifyHomePage();
        homePage.clickOnLoginButton();
    }

}
