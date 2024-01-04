import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DeleteTest extends DataReader {
	
	public static Properties pr;
	public static FileReader reader;
	
	@Test
	public void delete() throws IOException {
		
		reader = new FileReader(".//InputData//TestData.properties");
		 pr = new Properties();
		pr.load(reader);
		
		RestAssured.baseURI= pr.getProperty("BaseUri");
		RestAssured.basePath=pr.getProperty("Delete");
		
		
		given()
		.auth().none()
		.when()
		.delete()
		.then()
		.log().all()
		.statusCode(204)
		.statusLine("HTTP/1.1 204 No Content");
		
		
	}

}
