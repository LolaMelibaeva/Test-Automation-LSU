package com.syntax.lsu.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.lsu.utils.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(id="txtUsername")
	public WebElement userName;
	
	@FindBy(id="txtPassword")
	public WebElement password;
	
	@FindBy(id="btnLogin")
	public WebElement loginBtn;
	
	@FindBy(css="img[src*='logo.png']")
	public WebElement logo;
	
	@FindBy(xpath="//div[@class='toast-message']   ")
    public WebElement errorMessage;
	
	
	//initialize our variables;
	public LoginPage() {
		PageFactory.initElements(driver, this);;
	}

	public void enterUserName(String username) {
		userName.sendKeys(username);
	}
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickLoginBtn() {
		loginBtn.click();
	}
}
