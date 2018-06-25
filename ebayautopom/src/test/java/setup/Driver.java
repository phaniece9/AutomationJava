package setup;

import io.appium.java_client.android.AndroidDriver;

public class Driver extends BaseSetup {
	public AndroidDriver driver;

    public Driver() {
        this.driver = super.getDriver();
    }
}
