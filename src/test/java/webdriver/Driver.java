package webdriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

public class Driver {
	protected AppiumDriver driver;	

	public  Driver(AppiumDriver driver) {						
		this.driver = driver;				
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
	}		

	public AppiumDriver getDriver() {
		return driver;
	}

	public void setDriver(AppiumDriver driver) {
		this.driver = driver;
	}

}
