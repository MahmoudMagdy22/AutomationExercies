package loginAndSignup;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginAndSignupPage;
import static home.HomeTest.homepageTest;

public class LoginAndSignupTests extends BaseTests {


   static LoginAndSignupPage loginAndSignupPage ;

    @Test
    public static void signUpTest(){
        loginAndSignupPage =new LoginAndSignupPage(driver);
        homepageTest();
        loginAndSignupPage.signUpFormExist();
        loginAndSignupPage.signUpFeature("mahmoud","mmagde22@yahoo.com");
    }




}
