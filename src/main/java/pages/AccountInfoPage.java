package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.MethodHandles;
public class AccountInfoPage extends MethodHandles {
    public AccountInfoPage(WebDriver driver) {
        super(driver);
    }

    private final By accountInfoTitle = By.xpath("//b[normalize-space()='Enter Account Information']");

    private final By titleRadioButton= By.xpath("//*[@id='id_gender1']");

    private final By nameFiled= By.xpath("//*[@id='name']");

    private final By emailField = By.xpath("//*[@id='email']");

    private final By passwordField =By.xpath("//*[@id='password']");

    public boolean VerifyAccountInfoTitleVisible (){
       return isDisplayed(accountInfoTitle,5);
    }

    private final By dropDownDays = By.xpath("//*[@id='days']");
    private final By dropDownMonths= By.xpath("//*[@id='months']");
    private final By dropDownYears=By.xpath("//*[@id='years']");


}
