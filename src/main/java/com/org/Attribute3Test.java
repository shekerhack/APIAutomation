package com.org;

import org.testng.annotations.Test;

public class Attribute3Test {
	
	@Test(priority=3)
	public void promo() {
		System.out.println("Pomogranate fruit");
	}
	
	@Test(priority=2)
	public void mango() {
		System.out.println("Mango fruit");
	}
	
	@Test(priority=5)
	public void apple() {
		System.out.println("Apple fruit");
	}
	
	@Test(priority=1)
	public void orange() {
		System.out.println("Orange fruit");
	}
	
	@Test(priority=4)
	public void grapes() {
		System.out.println("Grapes fruit");
	}
	
   //without priority will be printed first.
	//If there is no @Test annotation it will be printed in alphabetic order
	public void banana() {
		System.out.println("Banana fruit");
	}
	
	

}
