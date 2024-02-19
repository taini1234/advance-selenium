package AdvSel;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WorkingWithDataProvider {
	@DataProvider(name="testdata")
	public String[][]getdata(){
		String[][] data=new String[2][5];
		data[0][0]="tezza";
		data[0][1]="john";
		data[0][2]="123456";
		data[0][3]="123456";
		data[0][4]="abc@123";
		
		data[1][0]="john";
		data[1][1]="tezza";
		data[1][2]="1234abc";
		data[1][3]="1234abc";
		data[1][4]="xyz@123";
		
		return data;
	}
	//@Test(dataProvider = "testdata")
	/*public void datademo(String firstname, String lastname, String pwd, String cpswd, String email) {
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(pwd);
		System.out.println(cpswd);
		System.out.println(email);*/
	
		@Test(dataProvider="testdata")
	public void datademo(String[]registerdata)	{
		System.out.println(registerdata[0]);
		System.out.println(registerdata[1]);
		System.out.println(registerdata[2]);
		System.out.println(registerdata[3]);
		System.out.println(registerdata[4]);
		
		
	
		
	}
				
		
		
	}
	
	

