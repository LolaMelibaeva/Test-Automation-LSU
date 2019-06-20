package com.syntax.lsu.testcases;

import org.testng.annotations.DataProvider;

public class ConstantsArray {
	
	
	
	public static Object[][] getArrayData() {
		
		Object[][] data=new Object[][] {
			{"userName1", "Password1"},
			{"userName2", "Password2"},
			{"userName2", "Password2"},
		};
		return data;
	}

}
