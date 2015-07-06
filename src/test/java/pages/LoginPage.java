package pages;

import webdriver.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class LoginPage extends Driver{

	public LoginPage(AppiumDriver driver) {
		super(driver);				
	}
		
	
	@AndroidFindBy(id = "ru.mail:id/login")
	 private MobileElement inputLogin;
	
	@AndroidFindBy(id = "ru.mail:id/password")
	 private MobileElement inputPassword;	
	
	@AndroidFindBy(id = "ru.mail:id/done")
	 private MobileElement buttonEnter;
	
	public NewsPage login(String username, String password) {
		
		inputLogin.sendKeys(username);
		inputPassword.sendKeys(password);		
		buttonEnter.click();
				
		return new NewsPage(this.driver);
	}

}
