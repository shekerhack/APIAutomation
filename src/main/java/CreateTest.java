import static io.restassured.RestAssured.given;
import java.util.HashMap;

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

public class CreateTest extends DataReader {
	
	public static Properties pr;
	public static FileReader reader;
	
	@Test()
	public void create() throws IOException {
		reader = new FileReader(".//InputData//TestData.properties");
		 pr = new Properties();
		pr.load(reader);
		
		RestAssured.baseURI= pr.getProperty("BaseUri");
		RestAssured.basePath=pr.getProperty("Create");
		
		HashMap hm = new HashMap();
		Faker fk = new Faker();
		
		hm.put("name", fk.name().firstName());
		hm.put("job", fk.job().title());
		
		
		given()
		.auth().none()
		.contentType("application/json")
		.body(hm)
		.when()
		.post()
		.then()
		.log().all()
		.statusCode(201)
		.statusLine("HTTP/1.1 201 Created");
			
	}

}
