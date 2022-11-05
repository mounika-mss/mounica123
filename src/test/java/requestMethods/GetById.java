package requestMethods;

import org.json.simple.JSONObject;

import org.testng.annotations.Test;

import static org.testng.annotations.Test.*;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.response.Response.*;

public class GetById 
{
	@Test
	public void getById() 
	{
		RestAssured.when()
		.get("http://localhost:8080/venues/weddinghalls/id/36")
		
		.then()
		.assertThat().statusCode(200)
		.assertThat().contentType(ContentType.JSON)
		.and()
		.log().all();
		
		
		
	}

	

}
