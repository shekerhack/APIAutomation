import static io.restassured.RestAssured.given;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SingleUserTest extends DataReader {
	

	public static Properties pr;
	public static FileReader reader;

	@Test()
	public void singleUser() throws IOException{
			 reader = new FileReader(".//InputData//TestData.properties");
			 pr = new Properties();
			pr.load(reader);
			
			RestAssured.baseURI= pr.getProperty("BaseUri");
			RestAssured.basePath=pr.getProperty("SingleUser");
			
			Response res = given()
					.auth().none()
			.when()
			.get()
			.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.log().all()
			.extract().response();
			String sJ = res.asString();
		Assert.assertTrue(sJ.contains("janet.weaver@reqres.in"));
		Assert.assertTrue(sJ.contains("Janet"));
		Assert.assertTrue(sJ.contains("Weaver"));
			
		
	}
}
