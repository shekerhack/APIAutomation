package com.org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NumbersTest {
	
	@BeforeSuite	
	public void one() {
		System.out.println("One method");
	}
	
	@AfterSuite
	public void two() {
		System.out.println("Two method");
	}
	
	@BeforeTest
	public void three() {
		System.out.println("Three method");
	}
	
	@AfterTest
	public void four() {
		System.out.println("Four method");
	}
	
	@BeforeClass
	public void five() {
		System.out.println("Five method");
	}
	
	@AfterClass
	public void six() {
		System.out.println("Six method");
	}
	
	@BeforeMethod
	public void seven() {
		System.out.println("Seven method");
	}
	
	@AfterMethod
	public void eight() {
		System.out.println("Eight method");
	}
	
	@Test
	public void nine() {
		System.out.println("Nine method");
	}
	
}
	
