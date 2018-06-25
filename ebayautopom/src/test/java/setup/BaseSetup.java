package setup;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;


public class BaseSetup {
	 private DesiredCapabilities capabilities = new DesiredCapabilities();
	    private static AndroidDriver androidDriver = null;

	    private String appiumPort = "4723";
	    private String serverIp = "0.0.0.0";

	    @BeforeClass
	    public void setup(){
	        initDriver();
	    }

	    @SuppressWarnings("rawtypes")
		public AndroidDriver getDriver() {
	        return androidDriver;
	    }

	    @SuppressWarnings("rawtypes")
		private void initDriver(){
	        System.out.println("Inside initDriver method");

	        DesiredCapabilities cap = new DesiredCapabilities();
	        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
	        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "RQ3003STNS");
	        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
	        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.ebay.mobile.activities.MainActivity" );
	        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.ebay.mobile");
	        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
	        //cap.setCapability(MobileCapabilityType.APP, "E://Appium setup//ebay.apk");
	        cap.setCapability("noReset", true);        String serverUrl ="http://" + serverIp + ":" + appiumPort + "/wd/hub";


	        try
	        {
	            System.out.println("Argument to driver object : " + serverUrl);
	            androidDriver = new AndroidDriver(new URL(serverUrl), cap);

	        }
	        catch (NullPointerException | MalformedURLException ex) {
	            throw new RuntimeException("appium driver could not be initialised for device ");
	        }
	        System.out.println("Driver in initdriver is : "+androidDriver);

	    }

		public void pressKeyCode(int enter) {
			// TODO Auto-generated method stub
			
		}

	   /* @AfterClass
	    public void tearDown(){
	        androidDriver.quit();
	    }*/
}
