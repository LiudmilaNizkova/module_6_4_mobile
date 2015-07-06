package tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import tests.BaseTest;
import pages.ChatPage;
import pages.LoginPage;
import pages.NewsPage;
import pages.SettingPage;
import pages.StartPage;


public class RuMailTest extends BaseTest {
	
	private final String UserLogin = "emailfortestwebdriver";
	private final String UserPsw = "aA123456";

	@Test
	  public void MailRuTest() throws InterruptedException {
		 
		 StartPage startPage = new StartPage(driver);
		 LoginPage loginPage = startPage.goToLogin();
		 NewsPage newsPage = loginPage.login(UserLogin, UserPsw);
		 newsPage.newsTitleClick();
		 newsPage.nextPage();	
		 ChatPage  chatPage = newsPage.goToGenerlPage();
		 SettingPage settingPage = chatPage.frames.goToSettings();
		 String userName = settingPage.getUserName();
		 Assert.assertEquals(userName, "NameForTest SurnameForTest", "Incorrect user name");
		
	  }

}
