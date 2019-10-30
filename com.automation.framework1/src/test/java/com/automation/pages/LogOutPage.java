package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage {

	WebDriver driver;
	//construcotor
public LogOutPage(WebDriver ldriver)
{
 this.driver=ldriver;	
}

@FindBy(xpath="//a[text()='Welcome Admin']")WebElement welcomeAdmin;
@FindBy(xpath="//a[text()='Logout']")WebElement btnLogOut;
	
public void verifyLogOutPage()
{
welcomeAdmin.click();
btnLogOut.click();
}
		
	
	
	
	
}
