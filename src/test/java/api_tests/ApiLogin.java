package api_tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ApiLogin {
	public static void main(String[] args) {
		setUp();
		//setUp1();
	}
//@APILogin
//	Feature: API Login Validation
//
//	  @validAPI
//	  Scenario: Valid API Validation
//	    Given Authorized user of LOGIN REST API web Services
//	    And send a request to the LOGIN with POST HTTP Method
//	    When passing husseinmohanad@gmail.com and password Test1234 and device_name mobile _app
//	    Then if the request is seccessful HTTP Status Code should be 200 
//	    And and response body should provide type: Beares and Token: token Value
	   
	
	public static void setUp() {
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
	}
	
	//log out
	public static void setUp1() {
		RestAssured.baseURI = "http://invoice.primetech-apps.com/api/v1/auth/logout";
		
		
		String token = "141|IJTrC0hWR0xJX8O4I0hWwLax6NOLLVMuiAn8rR0F";
		
		
		Response myResponse = RestAssured.given().accept(ContentType.JSON)
				.contentType("application/json").headers("Authorization", "Bearer " +token).when()
				.post();
		
		myResponse.then().statusCode(200).and().contentType("application/json");
		myResponse.prettyPrint();
	}
	
	
	
	
	
	
	
	
	
	
	

}
