package com.api;

import java.util.HashMap;

import io.restassured.response.Response;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;


public class AssertTest {
	
	@Test()
	public void assertTest() {
		
		HashMap hm = new HashMap();
		hm.put("name", "Sheker");
		hm.put("job", "jobOne");
		
		Response res = given()
		.contentType("application/json")
		.body(hm)
		.when()
		.post("https://reqres.in/api/users")
		.then()
		.log().all()
		.statusCode(201)
		.extract().response();
		
		String jsonStr = res.asString();
		Assert.assertEquals(jsonStr.contains("Sheker"), true);
		Assert.assertEquals(jsonStr.contains("jobOne"), true);
		
				
	}

}
