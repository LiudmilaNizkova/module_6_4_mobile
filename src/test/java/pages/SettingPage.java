package pages;

import webdriver.Driver;
import pages.SettingPage;
import frames.Frames;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SettingPage extends Driver{

	public SettingPage(AppiumDriver driver) {
		super(driver);				
	}
	
	@AndroidFindBy(id = "ru.mail:id/name")
	 private MobileElement name;
	
	public Frames frames = new Frames(driver);
	
	public String getUserName() {					
		return name.getText();
	}	

}
