package tests;

import io.appium.java_client.android.AndroidDeviceActionShortcuts;
import io.appium.java_client.android.AndroidKeyCode;

import org.testng.annotations.Test;

import pages.BasePage;
import pages.SearchResultsPage;
import setup.BaseSetup;


public class Searchresultstests extends BaseSetup{

	
	BasePage basepage;
	LoginTest loginTest;
	SearchResultsPage searchResult;
	
	String tv = "65 inch tv";
	BaseSetup bs;
	
	
	@Test
	public void searchAProduct() throws Exception{
		loginTest.login();
		basepage.searchFld.isDisplayed();
		basepage.searchFld.sendKeys(tv);
		
		//moving down
		((AndroidDeviceActionShortcuts) bs).pressKeyCode(AndroidKeyCode.ACTION_DOWN);
		Thread.sleep(1000);
		bs.pressKeyCode(AndroidKeyCode.ENTER);
		
		searchResult.sortby.click();
		Thread.sleep(1000);
		searchResult.filter.click();
		Thread.sleep(1000);
		searchResult.pricerange.click();
		Thread.sleep(1000);
		searchResult.done.click();
		
		searchResult.select.click();
		
	}
	
	@Test
	public void searchAProductAndPurchase() throws Exception{
		searchAProduct();
		
		searchResult.review.click();
		
		searchResult.buyNowBtn.isDisplayed();
		searchResult.buyNowBtn.click();
		searchResult.proceedToPayBtn.isDisplayed();
		searchResult.proceedToPayBtn.click();
	}
	
	
}
