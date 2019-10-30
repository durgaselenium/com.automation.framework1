package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
  WebDriver driver;
  
//constructor
 public LoginPage(WebDriver ldriver)
{
 this.driver=ldriver;		
}
	

@FindBy(xpath="//input[@name='txtUsername']")WebElement username;
@FindBy(xpath="//input[@name='txtPassword']")WebElement password;
@FindBy(xpath="//input[@name='Submit']")WebElement btnLogin;

public void verifyLoginPage(String usernameapplication,String passwordapplication)
{
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e)
	{
		
	}
username.sendKeys(usernameapplication);	
password.sendKeys(passwordapplication);
btnLogin.click();
	
}	
	
	
}
