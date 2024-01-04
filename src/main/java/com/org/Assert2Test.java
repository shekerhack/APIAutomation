package com.org;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert2Test {
	
	@Test
	public void softValidation()
	{
		String name="ram";
		String exp="rama";
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(name.equals(exp));
		System.out.println("Selenium Trainer");
		System.out.println("API Trainer");
		System.out.println("Manual Testing Trainer");
	}

}
