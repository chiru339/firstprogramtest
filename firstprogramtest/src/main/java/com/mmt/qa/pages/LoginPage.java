package com.mmt.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmt.qa.base.TestBase;

public class LoginPage extends TestBase {

	//Object Repository
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name ="password")
	WebElement password;
	
	@FindBy(xpath ="//input[@type ='submit']")
	WebElement loginbtn;
	
	//Initializing the page factory
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public String validateLoginPagetitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new HomePage();
		
	}
	
}
