package authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

@Test
public class BearerToken
{
	public void bearerToken()
	{
		baseURI="https://api.github.com";
		
		JSONObject obj=new JSONObject();
		
		//obj.post("name","BasicAuth");
		
		
		given().auth().oauth2("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")
		.body(obj).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();

		
	}
	

	
	
	

	
	

	

}
