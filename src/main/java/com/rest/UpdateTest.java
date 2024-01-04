package com.rest;
import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import java.util.HashMap;
public class UpdateTest extends DataReader {
	public static Properties pr;
	public static FileReader reader;
	
	@Test()
	public void update() throws IOException {
		reader = new FileReader(".//InputData//TestData.properties");
		 pr = new Properties();
		pr.load(reader);
		
		RestAssured.baseURI= pr.getProperty("BaseUri");
		RestAssured.basePath=pr.getProperty("Update");
		
		HashMap<String, String> hm = new HashMap<String, String>();
		Faker fk = new Faker();
		String firstName = fk.name().firstName();
		String jobTitle = fk.job().title();
		hm.put("name", firstName);
		hm.put("job", jobTitle);
		
		
		Response res = given()
				.auth().none()
		.contentType("application/json")
		.body(hm)
		.when()
		.put()
		.then()
		.log().all()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.extract().response();
		
		String sJ = res.asString();
	Assert.assertEquals(sJ.contains(firstName), true);
	Assert.assertEquals(sJ.contains(jobTitle), true);

		
	}

}
