package com.org;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsTest {

	@Test
	public void result()
	{
		String name="ram";
		String exp="rama";
		Assert.assertTrue(name.equals(exp));
		System.out.println("Selenium Trainer");
		System.out.println("API Trainer");
		System.out.println("Manual Testing Trainer");
		
	}
}
