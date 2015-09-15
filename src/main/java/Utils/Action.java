package Utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Action {
		public AppiumDriver driver;
		public TouchAction au;
		public Actions ac;
		private int timeout =20;
		
		public Action(AppiumDriver driver){	
			this.driver = driver;	
			au = new TouchAction(driver);
			ac = new Actions(driver);
		}
      //封装点击函数
		public void click(By by){
			try{
				driver.findElement(by).click();
			}catch(Exception e){
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				driver.findElement(by).click();
			}
			
		}
		
		//封装滑动函数
		public void swipe(By startElement,By endElement,boolean Up){
			Point beginLoc;			
			WebElement start = driver.findElement(startElement);		
			beginLoc = start.getLocation();	
			WebElement end;
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MICROSECONDS);
			while(true){
				try{				
					end = driver.findElement(endElement);
					break;
				}catch(Exception e){
					if(Up){
						driver.swipe(beginLoc.getX(), beginLoc.getY(), beginLoc.getX()+30, beginLoc.getY()+90, 4000);
					}else{
						driver.swipe(beginLoc.getX(), beginLoc.getY(), beginLoc.getX()-30, beginLoc.getY()-90, 4000);
					}
				}
				
			}
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);	
			
		}
		
		
		public void tap(By by){		
			au.tap(driver.findElement(by)).release().perform();		
		}
		
		public void categorySwipe(By source){
			
			WebElement start = driver.findElement(source);		
			Point beginLoc = start.getLocation();

			driver.swipe(beginLoc.getX(), beginLoc.getY(), beginLoc.getX()-700, beginLoc.getY(),8000);

		}
		
		
		
		public boolean isElementPresented(By by){
			boolean isDisplayed = false;
			
			try{
				isDisplayed = driver.findElement(by).isDisplayed();
			}catch(Exception e){
				isDisplayed = false;
			}
			return isDisplayed;
			
		}
		
		public void waitForElementPresent(By by){
			try{
				(new WebDriverWait(driver, timeout)).until(ExpectedConditions.presenceOfElementLocated(by));
			}catch(Exception e){
				
			}
			
		}
		

		
		
		public void waitForElementIsEnable(By by){
			(new WebDriverWait(driver, timeout)).until(ExpectedConditions.elementToBeClickable(by));
		}
		
		public void waitFor(long timeout){
			try {
				Thread.sleep(timeout);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}



