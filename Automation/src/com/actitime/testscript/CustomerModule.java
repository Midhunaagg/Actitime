package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.pom.EnterTimeTrackPage;

public class CustomerModule extends BaseClass{
	@Test
	public void testCreateCustomer()
	Reporter.log("CreateCustomer",true);
	EnterTimeTrackPage e=new EnterTimeTrackPage(driver);
	e.setLogout();
	Thread.sleep(2000);
	
	

}
}