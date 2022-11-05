package authentication;

import org.testng.annotations.Test;

import com.base.generic.BaseClass2;

import static io.restassured.RestAssured.*;

public class BasicAuth extends BaseClass2
{
	@Test
	public void basicAuthTest()	
	
	{
		
	   baseURI = "https://github.com";
	   
	   given().auth().basic("mounika-mss", "Mounik@$1" );
		when().get("/login")
		.then().log().all();
		
	}
}
	


