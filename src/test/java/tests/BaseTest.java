package tests;

import io.appium.java_client.AppiumDriver;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	public AppiumDriver driver;	
	
	@BeforeClass
	  public void setup() throws Exception {
		String apkpath = "ru.mail.apk"; 		
		File app = new File (apkpath);
	    DesiredCapabilities capabilities = new DesiredCapabilities();
	    capabilities.setCapability(CapabilityType.BROWSER_NAME, "");	    
	    capabilities.setCapability("deviceName","Android Emulator");
	    capabilities.setCapability("platformName","Android");
	    capabilities.setCapability("device", "Android");
	    capabilities.setCapability("app", app.getAbsolutePath());
	    driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);	    	
	    
	  }
	
	@AfterClass
    public void tearDownClass() {               
            driver.quit();
                  
    }

}
