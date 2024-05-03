package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;

public class LoginAndSignupPage extends MethodHandles {
    public LoginAndSignupPage(WebDriver driver) {
        super(driver);
    }

    private final By signUpForm= By.xpath("//*[@class='signup-form']");
    private final By userNameField =By.xpath("//*[@placeholder='Name']");
    private final By signUpEmailField =By.xpath("//*[@data-qa='signup-email']");

    private final By signUpButton =By.cssSelector("button[data-qa='signup-button']");

    private final By loginForm = By.cssSelector("form[action='/login']");

    public Boolean signUpFormExist(){
       return isDisplayed(signUpForm,5);
    }

    public Boolean logInFormExist(){
        return isDisplayed(loginForm,5);
    }

   private void clickSignup(){
        click(signUpButton,5);
   }

   private void setUserName( String username){
        clearFiled(userNameField);
        sendKeys(userNameField,5,username);
   }

   private void setEmail(String email){
        clearFiled(signUpEmailField);
        sendKeys(signUpEmailField,5,email);
   }

    public AccountInfoPage signUpFeature(String userName, String email){
       setUserName(userName);
       setEmail(email);
       clickSignup();
       return new AccountInfoPage(driver);
    }




}
