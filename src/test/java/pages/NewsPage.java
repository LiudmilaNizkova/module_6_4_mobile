package pages;

import userutils.Swipe;
import webdriver.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NewsPage extends Driver{
	
	public NewsPage(AppiumDriver driver) {
		super(driver);				
	}
	
	@AndroidFindBy(id = "ru.mail:id/whats_new_title")
	 private MobileElement newsTitle;
	
	@AndroidFindBy(id = "ru.mail:id/whats_new_start")
	 private MobileElement startButton;
	
	public void newsTitleClick() {		
		newsTitle.click();
	}
	
	public void nextPage() {		
		Swipe.swipe(driver);
	}
	
	public ChatPage goToGenerlPage() {		
		startButton.click();
		return new ChatPage(driver);
	}	
}
