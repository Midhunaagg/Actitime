package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test(groups= {"SmokeTest","regressionTest`"})
	public void createproject() {
		Reporter.log("createproject",true);
	}
	@Test(groups="regressionTest")
	public void modifyproject() {
		Reporter.log("modifyproject",true);
		
	}
	@Test
	public void deleteproject() {
		Reporter.log("deleteproject",true);

}
}
