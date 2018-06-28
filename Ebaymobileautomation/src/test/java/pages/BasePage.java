package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BasePage {
	@CacheLookup
    @FindBy(xpath = "//*[@text='SIGN IN']")
    public WebElement signInBtn;
	 
	 @CacheLookup
    @FindBy(id = "register")
    public WebElement registerBtn;

	 @CacheLookup
    @FindBy(xpath = "//*[@text='Search for anything']")
    public WebElement searchFld;
}
