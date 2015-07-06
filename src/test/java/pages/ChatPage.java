package pages;

import frames.Frames;
import webdriver.Driver;
import io.appium.java_client.AppiumDriver;


public class ChatPage extends Driver{
	
	public ChatPage(AppiumDriver driver) {
		super(driver);				
	}
	
	public Frames frames = new Frames(driver);	

}
