package com.api;

import java.util.HashMap;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class ResgisterTest {
	
	@Test()
	public void register() {
		
		HashMap hm = new HashMap();
		hm.put("email","eve.holt@reqres.in");
		hm.put("password", "pistol");
		
		given()
		.contentType("application/json")
		.body(hm)
		.when()
		.post("https://reqres.in/api/register")
		.then()
		.log().all()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK");
		
		
	}

}
