package Pageobj;

import io.appium.java_client.AppiumDriver;

public class LoginPage {
public AppiumDriver driver;
	
	//id
	public  String username = "";
	public String password = "";
	public String login = "";
		
	

	public LoginPage(AppiumDriver driver){
		this.driver = driver;
	}
	

}
