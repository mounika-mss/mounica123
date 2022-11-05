package requestMethods;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GetAll 
{
	
	@Test
	public void getAll()
	{
		RestAssured.when()
		.get(" http://localhost:8080/venues/weddinghalls/getall")
		
		.then()
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(200)
		.and()
		.log().all();
	}

}
