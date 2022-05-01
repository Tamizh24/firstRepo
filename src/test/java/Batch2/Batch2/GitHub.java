package Batch2.Batch2;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class GitHub {
	
	@Test(priority=1)
	public void Postmethod() {
		String jsonBody = "{\"name\":\"hello-world12345\"}";		
		
		RestAssured.given()
				.body(jsonBody)
				.header("authorization","Bearer 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")
				.accept(ContentType.JSON)
			    .contentType(ContentType.JSON).
			   
	    when().
			 	 post("https://api.github.com/user/repos").
			  
		then().
			 	statusCode(201) ;
		
	}
	
	
	@Test(priority=3)
	public void GetMethod() {
//		String jsonBody = "{\"name\":\"jsonn\"}";		
		
		RestAssured.given()
//				.body(jsonBody)
				.header("authorizatison","Bearer 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")
				.accept(ContentType.JSON)
			    .contentType(ContentType.JSON).
			   
	    when().
			 	 get("https://api.github.com/repos/Greens25/hello-world12345").
			  
		then().
			 	statusCode(200) ;
		
	}
	
	@Test(priority=0)
	public void PutMethod() {
		String jsonBody = "{\"names\":[\"list\"]}";		
		
		RestAssured.given()
				.body(jsonBody)
				.header("authorization","Bearer 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")
				.accept(ContentType.JSON)
			    .contentType(ContentType.JSON).
			   
	    when().
			 	 put(" https://api.github.com/repos/Greens25/hello-world12345/topics").
			  
		then().
			 	statusCode(200) ;
		
	}
	

	
	@Test(priority=2)
	public void DeleteMethod() {
//		String jsonBody = "{\"name\":\"jsonn\"}";		
		
		RestAssured.given()
//				.body(jsonBody)
				.header("authorization","Bearer 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")
				.accept(ContentType.JSON)
			    .contentType(ContentType.JSON).
			   
	    when().
			 	 delete("https://api.github.com/repos/Greens25/hello-world12345").
			  
		then().
			 	statusCode(204) ;
		
	}

	
	
	
	
	
}
