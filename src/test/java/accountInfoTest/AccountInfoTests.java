package accountInfoTest;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AccountInfoPage;

import static loginAndSignup.LoginAndSignupTests.signUpTest;

public class AccountInfoTests extends BaseTests {
    static AccountInfoPage accountInfoPage;
    @Test
    public static void  testEnterAccountInfoFeature(){
        accountInfoPage = new AccountInfoPage(driver);
        signUpTest();
        accountInfoPage.VerifyAccountInfoTitleVisible();
        accountInfoPage.enterAccountInfoFeature("My password");
        accountInfoPage.addressInformationFeature("mahmoud","magdy","Entra","Elbadrasheen",
                "Giza","Giza","01144503868","12355","Canada" );
        accountInfoPage.clickCreateAccountButton();
    }

}
