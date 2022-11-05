package requestMethods;

import org.testng.annotations.Test;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;



public class GetByName 
{
	
	
	
	@Test
	public void getByName()
	{
	   RestAssured.when()
	   .get("http://localhost:8080/venues/weddinghalls/name/sravanthi")
	   		   
	   
	   .then()
	   .assertThat().statusCode(200)
	   .assertThat().contentType(ContentType.JSON)
	   .and()
	   .log().all();
		   
		
	   
		
	}

}
