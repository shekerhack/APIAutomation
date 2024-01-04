package com.fruits;

import org.testng.annotations.Test;

public class BananaTest {
	
	@Test(enabled=false)//it will skip the suite in xml file
	public void banana() {
		System.out.println("Banana test method");
	}


}
