package com.songxiang.uper;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Utils.Action;
import Utils.TestSuit;


public class TestCase extends TestSuit {



	

	@Test
	public void login() throws InterruptedException{
		driver.findElement(By.id("com.youpin.up:id/btn_init_login")).click();
		

		
	}
	@AfterClass
	public void realse(){
		driver.quit();
	}
}
	
	
	


