package com.api;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import static io.restassured.RestAssured.given;

public class CreateUser {
	
	@Test()
	public void newUser() {
		HashMap hm = new HashMap();
		Faker fk = new Faker();
		
		hm.put("name", fk.name().firstName());
		//hm.put("name", "Rama");
		
		hm.put("job", fk.job().title());
		//hm.put("job", "testing");
		System.out.println(hm);
		
		given()
		.contentType("application/json")
		.body(hm)
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.log().all()
		.statusCode(201)
		.statusLine("HTTP/1.1 201 Created");				
	}

}
