package com.org;

import org.testng.annotations.Test;

public class BillingTest extends ItemsToCart{
	
	
	@Test(dependsOnMethods="cart")
	public void billing() {
		System.out.println("Reading scanner code for every item");
	}

}
