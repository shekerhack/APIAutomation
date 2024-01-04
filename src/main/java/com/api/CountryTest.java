package com.api;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class CountryTest {
	
	@Test
	public void country() {
		
		 given()
		.when()
		.get("http://restcountries.com/v3.1/name/india")
		.then()
		.log().all()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.body("name[0].common", equalTo("British Indian Ocean Territory"))
		.body("name[1].common", equalTo("India"))
		.body("currencies[0].USD.name", equalTo("United States dollar"))
		.body("currencies[1].INR.name", equalTo("Indian rupee"));
		
		
	}

}
