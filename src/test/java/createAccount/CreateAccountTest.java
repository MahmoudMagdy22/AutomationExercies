package createAccount;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AccountCreatedPage;
import pages.DeleteAccountPage;
import pages.HomePage;

import static accountInfoTest.AccountInfoTests.testEnterAccountInfoFeature;

public class CreateAccountTest extends BaseTests {

    AccountCreatedPage accountCreatedPage;
    HomePage homePage1=new HomePage(driver);

    @Test
    public void CreateAccountTest(){
        accountCreatedPage =new AccountCreatedPage(driver);
        testEnterAccountInfoFeature();
        accountCreatedPage.VerifyVisibilityOfAccountCreatedMessage();
        accountCreatedPage.clickContinueButton();
        homePage1.validateLogInUser();
        DeleteAccountPage deleteAccountPage= homePage1.clickDeleteAccountButton();
        deleteAccountPage.deleteAccountMessageVisible();
        homePage = deleteAccountPage.clickContinueButton();
            }
}
