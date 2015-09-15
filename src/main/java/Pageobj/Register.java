package Pageobj;

import java.util.Random;

import io.appium.java_client.AppiumDriver;

public class Register {
public AppiumDriver driver;
	public String register = "";
	
		
	

	public Register(AppiumDriver driver){
		this.driver = driver;
	}
	
	public long phoneNumber(){
		Random rand = new Random();
		long l = 0;
		//100000000000-->11个0
		double n = 100000000000D ;
		
	    l = (long)(rand.nextDouble() * n + 100000000D);
	    return l;
			
		}
	   
	}


