package com.syntax.lsu.testcases;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleArrayObj {
	
	
	
	
	@Test(dataProvider="getData")
	public void arrayData(String uName, String pass) {
		XSSFWorkbook workbook=new XSSFWorkbook();//XML Spread Sheet Format.
		
	}
	
	@DataProvider()
	public Object[][] getData() {
		
		
		return ConstantsArray.getArrayData();
	}
	
	
}
	
//	@DataProvider(name="getData")
//	public Object getData() {
//		Object[][] data=new Object[2][2];
//		//1st Row
//		data[0][0]="userName";
//		data[0][1]="password";
//		//2nd Row
//		data[1][0]="userName1";
//		data[0][1]="password1";
//		return data;
//	}


