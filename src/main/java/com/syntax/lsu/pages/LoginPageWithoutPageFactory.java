package com.syntax.lsu.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.lsu.utils.BaseClass;

public class LoginPageWithoutPageFactory extends BaseClass {
	
	public WebElement username=driver.findElement(By.cssSelector("input#txtUsername"));
	public WebElement password=driver.findElement(By.cssSelector("input#txtPassword"));
	public WebElement clickLoginBtn=driver.findElement(By.cssSelector("input#btnLogin"));

}
