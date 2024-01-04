package com.api;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class JavaFakeData {
	
	@Test()
	public void fakeData() {

		Faker fk = new Faker();
		System.out.println(fk.name().firstName());
		System.out.println(fk.name().lastName());
		System.out.println(fk.job().title());
		System.out.println(fk.job().position());
		
	}
}
