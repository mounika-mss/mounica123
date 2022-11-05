package requestMethods;

import org.testng.annotations.Test;




import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class DeleteById
{
	
	@Test
	public void deleteById()
	{
		
	     // baseURI = "http://localhost:8080";

		 		
		 RestAssured.when()
       .delete("http://localhost:8080/venues/weddinghalls/62")
		
		.then()
		.assertThat().contentType(ContentType.JSON)
	     .assertThat().statusCode(200)
	     .and()
		.log().all();
		
	}

}
