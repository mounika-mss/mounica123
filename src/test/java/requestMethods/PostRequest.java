package requestMethods;

import org.json.simple.JSONObject;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostRequest

{
	@Test
	public void postRequest()
	{
		JSONObject a=new JSONObject();
		a.put("capacity", 10);
		a.put("foodType", "starters");
		a.put("id",1319);
		a.put( "liquor", "Imperial Blue");
		a.put("location","Hyderabd");
		a.put( "name", "$hiv@");
		a.put("parking" ,2115);
		a.put("rentPerDay",1500);
		a.put("status", "On going");
		
		given()
		.contentType(ContentType.JSON)
		.body(a)
		
		.when()
		.post("http://localhost:8080/venues/weddinghalls")
		
		.then()
		.assertThat().statusCode(201)
		.assertThat().contentType(ContentType.JSON)
		.and()
		.log().all();
		
		
		
		
		
	}

	
	
	

}
