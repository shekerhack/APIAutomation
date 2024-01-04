package com.org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnimalsTest {
	
	// execute second
	@BeforeClass	
	public void lion() {
		System.out.println("Lion");
	}

	// execute first
	@BeforeSuite
	public void tiger() {
		System.out.println("Tiger");
	}
	
	// execute third
	@Test
	public void zebra() {
		System.out.println("Zebra");
	}
	
	// execute fourth
	@AfterMethod
	public void monkey() {
		System.out.println("Monkey");
	}
	
	// execute fifth
	@AfterClass
	public void dog() {
		System.out.println("Dog");
	}
}
