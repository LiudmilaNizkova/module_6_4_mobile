package frames;

import webdriver.Driver;
import pages.SettingPage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class Frames extends Driver{

	public Frames(AppiumDriver driver) {
		super(driver);				
	}
	
	@AndroidFindBy(xpath ="//android.widget.FrameLayout[2]")
	 private MobileElement chats;
	
	@AndroidFindBy(xpath ="//android.widget.FrameLayout[2]")
	 private MobileElement contacts;
	
	@AndroidFindBy(xpath ="//android.widget.FrameLayout[3]")
	 private MobileElement games;
	
	@AndroidFindBy(xpath ="//android.widget.FrameLayout[4]")
	 private MobileElement settings;
		
	public SettingPage goToSettings() {		
		settings.click();
		return new SettingPage(driver);
	}
}
