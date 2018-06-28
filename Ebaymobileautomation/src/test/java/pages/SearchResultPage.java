package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage {
	@CacheLookup
    @FindBy(xpath = "//*[@resource-id='com.ebay.mobile:id/button_filter']")
    public WebElement filter;

	
	//select sort 
	@CacheLookup
    @FindBy(xpath = "//*[@text='Sort by']")
	public WebElement sortby;
	
	//select price range by
	@CacheLookup
    @FindBy(xpath = "//*[@text='Lowest Price + Shipping']")
	public WebElement pricerange;
	
	
	@CacheLookup
    @FindBy(xpath = "//*[@text='DONE']")
	public WebElement done;
	
	
	@CacheLookup
    @FindBy(xpath = "//*[@text='65 inch 4K UHD ANDROID SMART SAMSUNG PANEL 8GB LED TV +REPLACEMENT WARRANTY']")
	public WebElement select;
	
	
	@CacheLookup
    @FindBy(xpath = "//*[@text='BUY IT NOW']")
    public WebElement buyNowBtn;
	
	@CacheLookup
	@FindBy(xpath="//*[@text='REVIEW']")
	public WebElement review;
	
	@CacheLookup
    @FindBy(xpath = "//*[@text='Proceed to Pay']")
    public WebElement proceedToPayBtn;
}
