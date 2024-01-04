package com.org;

import org.testng.annotations.Test;

public class PaymentTest extends BillingTest {
	
	@Test(dependsOnMethods="billing")
	public void payment() {
		System.out.println("Payment can be done through debot/credit cart");
	}

}
