package Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;



public class TestSuit {
	public AppiumDriver driver;
	public Action au;

	@BeforeClass
	public void initalAppiumSettings() throws MalformedURLException, InterruptedException{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("deviceName","bad01ec" );
		cap.setCapability("appActivity","com.youpin.up.activity.init.LoginListActivity" );
		cap.setCapability("appPackage","com.youpin.up" );
		cap.setCapability("appWaitActivity","com.youpin.up.activity.init.LoginListActivity" );
		cap.setCapability("appWaitPackage","com.youpin.up" );
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		au = new Action(driver);
		Thread.sleep(3000);
	}
}
