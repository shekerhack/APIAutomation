package com.org;

import org.testng.annotations.Test;

public class AttributeGroup3Test {

	@Test(groups= {"sanity"})
	public void logout() {
		System.out.println("Application logout");
	}

}
