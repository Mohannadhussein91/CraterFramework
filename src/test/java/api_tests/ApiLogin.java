package api_tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ApiLogin {
	static String Token;
	public static void main(String[] args) {
		//login();
	}
	
	
	public static void login() {
	   
		RestAssured.baseURI = "http://invoice.primetech-apps.com/api/v1/auth/login";
		
		
		String requestBody = "{\n"
				+ "    \"username\": \"husseinmohanad@gmail.com\",\n"
				+ "    \"password\": \"Test1234\",\n"
				+ "    \"device_name\":\"mobile_app\"\n"
				+ "}";
		
		
		Response myResponse = RestAssured.given().accept(ContentType.JSON)
				.contentType("application/json").body(requestBody).when()
				.post();
		
		myResponse.then().statusCode(200).and().contentType("application/json");
		myResponse.prettyPrint();
		
      
		 Token = myResponse.asString().substring(25, myResponse.asString().length()-1);
      
      
 	
	}
	
	
	
	//log out
	public static void logout() {
	
		RestAssured.baseURI = "http://invoice.primetech-apps.com/api/v1/auth/logout";
		
		
		Response myResponse = RestAssured.given().accept(ContentType.JSON)
				.contentType("application/json").headers("Authorization", "Bearer " +Token).when()
				.post();
		
		   myResponse.then().statusCode(200).and().contentType("application/json");
		   myResponse.prettyPrint();
	}
	
	
	
	
	
	
	
	
	
	
	

}
