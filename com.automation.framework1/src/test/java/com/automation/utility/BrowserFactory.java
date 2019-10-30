package com.automation.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

public static WebDriver startApplication(WebDriver driver,String browserName,String appUrl)
{
if (browserName.equalsIgnoreCase("chrome"))
{
driver = new ChromeDriver();	
}	
else if (browserName.equalsIgnoreCase("firefox"))
{
driver = new FirefoxDriver();	
}
else if (browserName.equalsIgnoreCase("IE"))
{
driver = new InternetExplorerDriver();	
}
else {
	System.out.println("we do not support Browser");
}
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
driver.manage().deleteAllCookies();
driver.get(appUrl);
return driver;

}
	
public static void quitBrowser(WebDriver driver)
{
driver.quit();	

}
	
	
	
	
	
}
