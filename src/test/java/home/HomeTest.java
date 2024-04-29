package home;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomeTest extends BaseTests {

    HomePage homePage;

    public HomeTest(WebDriver driver) {
        super();
    }

    @Test
    public void TestHomepage(){
        homePage = new HomePage(driver);
        homePage.VerifyHomePage();
        homePage.clickOnLoginButton();
    }

}
