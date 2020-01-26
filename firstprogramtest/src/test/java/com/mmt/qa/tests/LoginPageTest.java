package com.mmt.qa.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mmt.qa.base.TestBase;
import com.mmt.qa.pages.HomePage;
import com.mmt.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		
		initialization();
		loginpage = new LoginPage();
	}
		
	@Test(priority=1)
	public void loginPageTitleTest() {
	
		String title = loginpage.validateLoginPagetitle();
		Assert.assertEquals(title, "Login • Instagram");
	}
	
	@Test(priority =2)
	public void loginTest() {
		homepage = loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
