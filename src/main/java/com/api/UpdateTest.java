package com.api;

import java.util.HashMap;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class UpdateTest {
	
	@Test()
	public void updateTest() {
		
	HashMap hm = new HashMap();
	Faker fk = new Faker();
	String firstName = fk.name().firstName();
	String jobTitle = fk.job().title();
	hm.put("name", firstName);
	hm.put("job", jobTitle);
	
	
	//hm.put("name", "morpheus");
	//hm.put("job","zion resident");
	
    Response res = given()
	.contentType("application/json")
	.body(hm)
	.when()
	.put("https://reqres.in/api/users/2")
	.then()
	.log().all()
	.statusCode(200)
	.extract().response();
    
    String jsonStr = res.asString();
    Assert.assertEquals(jsonStr.contains(firstName), true);
    Assert.assertEquals(jsonStr.contains(jobTitle), true);
    
	
	
	}

}
