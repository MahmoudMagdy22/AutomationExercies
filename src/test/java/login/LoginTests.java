package login;

import base.BaseTests;
import home.HomeTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import reader.ReadDataFromJson;

import java.io.FileNotFoundException;

public class LoginTests extends BaseTests {


   LoginPage loginPage ;

    @Test
    public void loginTest(){
        loginPage =new LoginPage(driver);
        homeTest=new HomeTest(driver);
        homeTest.TestHomepage();
    }




}
