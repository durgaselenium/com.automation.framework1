package com.automation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LogOutPage;
import com.automation.pages.LoginPage;
import com.automation.utility.ConfigDataProvider;
import com.automation.utility.ExcelDataProvider;
import com.automation.utility.Helper;

public class LoginToOrangeHRM extends BaseClass{
 
@Test	
public void loginToHRMtestCaseDemo()
{
    logger =  report.createTest("Login to OrangeHRM");	
 LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
   
    logger.info("Starting Applicatin");
 //loginpage.verifyLoginPage("Admin", "admin123");
  loginpage.verifyLoginPage(excel.getStringData("login", 0,0),excel.getStringData("login",0,1));
    logger.pass("Login Successfully");
    
  LogOutPage logout = PageFactory.initElements(driver, LogOutPage.class);
    logger.info("Starting Logout Application");
  logout.verifyLogOutPage();
    logger.pass("LogOut Successfully");
   
  Helper.capturedScreenshot(driver);
  
 
}

}
