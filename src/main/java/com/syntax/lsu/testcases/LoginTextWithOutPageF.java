package com.syntax.lsu.testcases;

import org.testng.annotations.Test;

import com.syntax.lsu.pages.LoginPageWithoutPageFactory;
import com.syntax.lsu.utils.BaseClass;

public class LoginTextWithOutPageF extends BaseClass{
	
	@Test
	public void loginWithOutPf() {
		
		LoginPageWithoutPageFactory getLogin=new LoginPageWithoutPageFactory();
		getLogin.username.sendKeys("Admin");
		getLogin.password.sendKeys("xV9D@Q2Hbv");
		getLogin.clickLoginBtn.click();
	}

}
