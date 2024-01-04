package com.org;

import org.testng.annotations.Test;

public class AttributeGroup1Test {
	
	@Test(groups= {"smoke"})
	public void loginPage() {
		System.out.println("Facebook login page");
	}

}
