package com.basesetup;

import io.appium.java_client.android.AndroidDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

public class BaseSetup {

	static Properties properties;
	 static AndroidDriver androidDriver = null;
	
	 @BeforeClass
	 public void setup() throws IOException
	 {
		 driversetup();
	 }
	 
	 public AndroidDriver getDriver()
	 {
		 return androidDriver;
	 }
	 
	public void driversetup() throws IOException
	{
//read data from properties file
	String Filepath = "E:\\Projects\\Ebaymobileautomation\\Properties\\object.properties";
	FileInputStream Locator = new FileInputStream(Filepath);
	properties=new Properties();
	properties.load(Locator);
	//Initialize desire capabilities
	 DesiredCapabilities cap = new DesiredCapabilities();
	 cap.setCapability("deviceName", properties.getProperty("DeviceName"));
	 cap.setCapability("platformName", properties.getProperty("PlatFormName"));
	 cap.setCapability("platformVersion", properties.getProperty("7.0"));
	 cap.setCapability("appPackage", properties.getProperty("AppPackage"));
	 cap.setCapability("appActivity", properties.getProperty("AppActivity"));
	 URL u=new URL(properties.getProperty("URL"));
	
	 try
	 {
		 androidDriver=new AndroidDriver(u,cap);
	 }
	 catch(NullPointerException e)
	 {
		 throw new RuntimeException("appium driver could not be initialised for device ");
	 }
	}

	 @BeforeClass
	 public void tearDown(){
	        androidDriver.quit();
	    }
}
