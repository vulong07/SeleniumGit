package com.qa.selection04;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class sudungDataprovieder {
	@Test(dataProvider="getData")
	public void loginTest(String username, String password) {
		System.out.println("My username:"+username);
		System.out.println("My password:"+password);
	}
	@DataProvider(name="getData")
	public Object[][] getData(){
		Object[][] data= new Object[2][2];
			data[0][0]="test00@gmail.com";
			data[0][1]="test01@gmail.com";
			data[1][0]="test02@gmail.com";
			data[1][1]="test03@gmail.com";

		return data;
	}
	                           
			

}
