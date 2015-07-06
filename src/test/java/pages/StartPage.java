package pages;

import webdriver.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class StartPage extends Driver {	
	
	public StartPage(AppiumDriver driver) {
		super(driver);				
	}
			
	@AndroidFindBy(id = "ru.mail:id/email")
	 private MobileElement useMailRuButton;
	
	public LoginPage goToLogin() {
		
		useMailRuButton.click();				
		return new LoginPage(this.driver);
	}
}
