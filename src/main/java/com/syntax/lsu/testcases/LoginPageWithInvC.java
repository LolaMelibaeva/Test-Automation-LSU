package com.syntax.lsu.testcases;

import org.testng.annotations.Test;

import com.syntax.lsu.pages.LoginPage;
import com.syntax.lsu.utils.BaseClass;

public class LoginPageWithInvC extends BaseClass {
	
	LoginPage getLoginPage;
	//validate login functionality with invalid credentials

		@Test
		public void loginWithInvC() {
			getLoginPage=new LoginPage();
			getLoginPage.enterUserName("Tester");
			getLoginPage.enterPassword("agadfae");
			getLoginPage.clickLoginBtn();
			if(getLoginPage.errorMessage.isDisplayed()) {
				System.out.println("Test Case Passed");
			}else {
				System.err.println("Test case Failed");
			}
		}

}
