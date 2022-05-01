package Batch2.Batch2;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
//import static org.testng.annotations.*;

public class reqres {
	
	@Test(priority=0)
	public void postmethod() {
		
		
		String jsonbody ="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}";
		
		given()
			.body(jsonbody)
		.when()
			.post("https://reqres.in/api/users")
		.then()
				.statusCode(201);
	}
//******************************************
	
	@Test(priority=1)
	public void Putmethod() {
		
		
		String jsonbody ="{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}";
		
		given()
			.body(jsonbody)
		.when()
			.put("https://reqres.in/api/users/2")
		.then()
				.statusCode(200);
	}
	
//************************************************	
	//******************************************
	
		@Test(priority=2)
		public void Getmethod() {
			
			
//			String jsonbody ="{\r\n"
//					+ "    \"name\": \"morpheus\",\r\n"
//					+ "    \"job\": \"leader\"\r\n"
//					+ "}";
			
			given()
//				.body()
			.when()
				.get("https://reqres.in/api/users/2")
			.then()
					.statusCode(200);
		}
		
	//************************************************	
		//******************************************
		
		@Test(priority=3)
		public void Deletmethod() {
			
			
//			String jsonbody ="{\r\n"
//					+ "    \"name\": \"morpheus\",\r\n"
//					+ "    \"job\": \"leader\"\r\n"
//					+ "}";
			
			given()
//				.body(jsonbody)
			.when()
				.delete("https://reqres.in/api/users/2")
			.then()
					.statusCode(204);
		}
		
	//************************************************	
	

	
}
