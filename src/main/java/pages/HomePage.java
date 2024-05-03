package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class HomePage extends MethodHandles {
    public HomePage(WebDriver driver) {
        super(driver);
    }
   private final By homeIcon = By.cssSelector("div[class='item active'] div[class='col-sm-6'] h2");
   private final By signInAndLoginButton = By.cssSelector("a[href='/login']");
   private final By loggedInAsUserName =By.xpath("//li[10]//a[1]");
   private final By deleteAccountButton=By.cssSelector("a[href='/delete_account']");

   public void validateLogInUser(){
       isDisplayed(loggedInAsUserName,5);
   }

   public DeleteAccountPage clickDeleteAccountButton(){
       click(deleteAccountButton,5);
       return new DeleteAccountPage(driver);
   }



    public boolean VerifyHomePage(){
       return isDisplayed(homeIcon,5);
    }


    public LoginAndSignupPage clickOnLoginButton(){
        click(signInAndLoginButton,5);
        return new LoginAndSignupPage(driver );
    }

}
