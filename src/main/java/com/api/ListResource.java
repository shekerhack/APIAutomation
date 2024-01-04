package com.api;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;


public class ListResource {
	
	@Test
	public void listResource()
	{
		given()
		.when()
		.get("https://reqres.in/api/unknown")
		.then()
		.log().all()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.body("data.name", hasItems("cerulean","aqua sky"));
	}

}
