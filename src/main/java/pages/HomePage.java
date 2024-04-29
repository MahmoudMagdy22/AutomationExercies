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


    public boolean VerifyHomePage(){
       return isDisplayed(homeIcon,5);
    }


    public LoginPage clickOnLoginButton(){
        click(signInAndLoginButton,5);
        return new LoginPage(driver );
    }

}
