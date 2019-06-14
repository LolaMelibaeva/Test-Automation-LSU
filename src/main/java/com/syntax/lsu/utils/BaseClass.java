package com.syntax.lsu.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




public class BaseClass {
	
	

	public static WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public static void setUp() {
		
		
		String browser = ConfigReader.getProperty("browser");
		String url=ConfigReader.getProperty("url");
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", Constants.WEB_DRIVER_PATH_CHROME);
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", Constants.WEB_DRIVER_PATH_FIREFOX);
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", Constants.WEB_DRIVER_PATH_IE);
			driver = new InternetExplorerDriver();
		} else {
			System.err.println("Please pass the right browser.");
		}
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
		
		
	}
	
	
	@AfterMethod(alwaysRun = true)
	public static void tearDown() {
		driver.quit();
	}

}
