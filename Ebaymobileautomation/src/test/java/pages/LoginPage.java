package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	//initalize username
	@CacheLookup
    @FindBy(xpath = "//*[@text='Email or username']")
    public WebElement userNameFld;
//initalize password
    @CacheLookup
    @FindBy(xpath = "//android.widget.EditText[@password='true']")
    public WebElement passwordFld;
//initalize sign in button
    @CacheLookup
    @FindBy(xpath = "//android.widget.Button[@text='SIGN IN']")
    public WebElement loginBtn;

    
    @CacheLookup
    @FindBy(name = "forgot")
    public WebElement forgotBtn;
    
    
    //link accountspage
    @CacheLookup
    @FindBy(xpath = "//*[@text='Link accounts']")
    public WebElement linkaccounts;
    
    //click No thanks
    @CacheLookup
    @FindBy(xpath = "//*[@text='NO THANKS']")
    public WebElement Nothanks;
}
