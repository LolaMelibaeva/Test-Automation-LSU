package com.syntax.lsu.testcases;

import org.testng.annotations.Test;

import com.syntax.lsu.pages.LoginPage;
import com.syntax.lsu.utils.BaseClass;

public class LoginPageTestCases extends BaseClass {
//validate login functionality with valid credentials	
	public LoginPage getLoginPage;
	
	@Test
	public void login() {
		getLoginPage=new LoginPage();
		getLoginPage.enterUserName("Admin");
		getLoginPage.enterPassword("xV9D@Q2Hbv");
		getLoginPage.clickLoginBtn();
		
	}
	
}
