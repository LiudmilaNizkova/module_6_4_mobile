package userutils;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.Dimension;

public class Swipe {
	
	public static void swipe(AppiumDriver driver) {
		 
		 driver.context("NATIVE_APP");
	 Dimension size = driver.manage().window().getSize();	 
	    
	    int startX = (int)(size.width * 0.80);		  	    
	    int startY = (int)(size.width * 0.20);		    		    
	    int endXY = size.height/2;		 	
	
	 driver.swipe(startX,endXY,startY,endXY, 1000);	
	
	 }

}
