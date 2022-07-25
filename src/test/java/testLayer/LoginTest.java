package testLayer;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepackage.BaseMPMclass;
import pompackage.PomLogin;
// not using any hard coded value 

public class LoginTest extends BaseMPMclass {
	PomLogin Log;
	
	public  LoginTest() {   // calling constructor of parents class
		super();
	}   
		
		@BeforeMethod      // passing value
		public void initsetup() {
			
			initiate();       // this is imp to write both method
			Log=  new PomLogin();   // calling method
	}
	@Test
	public void Title() {  // i can use log reference variable for login page
		String actual=Log.verify();     // first verify title page
		System.out.println(actual);
		Assert.assertEquals(actual, "OrangeHRM");    
		
	}
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
