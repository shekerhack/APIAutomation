package com.api;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class DeleteTest {
	
	@Test()
	public void deleteTest() {
		
		given()
		.when()
		.delete("https://reqres.in/api/users/2")
		.then()
		.log().all()
		.statusCode(204)
		.statusLine("HTTP/1.1 204 No Content");
		
	}

}
