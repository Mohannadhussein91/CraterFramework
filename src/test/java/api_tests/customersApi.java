package api_tests;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class customersApi {
	public static void main(String[] args) {
		
		//createCustomer();
		deleteCustomer();
	
	
		
	}
	
	
	
	public static void createCustomer() {
		
		
			RestAssured.baseURI = "http://invoice.primetech-apps.com/api/v1/customers";
			
			
			String requestBody = "{\n"
					+ "    \"name\": \"Hussein1f44\",\n"
					+ "    \"email\": \"jenkins.shaxvddnelle@example.org\",\n"
					+ "    \"enable_portal\": true,\n"
					+ "    \"billing\": [],\n"
					+ "    \"shipping\": []\n"
					+ "}";
			String token = "142|tA7VJIIaW0Zs0BgFQ0wKSyAkgFwSNrowftj3guoP";
			
			
			Response myResponse = RestAssured.given().accept(ContentType.JSON)
					.contentType("application/json").headers("Authorization", "Bearer  " +token)
					.body(requestBody).when().post();
			
			myResponse.then().statusCode(200).and().contentType("application/json");
			myResponse.prettyPrint();
		}
		
	
	public static void deleteCustomer() {
		
		
		RestAssured.baseURI = "http://invoice.primetech-apps.com/api/v1/customers/delete";
		
		
		String requestBody = "{\n"
				+ "    \"ids\": [\n"
				+ "        193\n"
				+ "    ]\n"
				+ "}\n"
				+ "";
		String token = "130|F7DmoLrlXwtebolAjekTBOk9kfo1f3GjzVpGX3Ak";
		
		
		Response myResponse = RestAssured.given().accept(ContentType.JSON)
				.contentType("application/json").headers("Authorization", "Bearer  " +token)
				.body(requestBody).when().post();
		
		myResponse.then().statusCode(200).and().contentType("application/json");
		myResponse.prettyPrint();
		 String actualResponseBody= myResponse.asString();
		 System.out.println(actualResponseBody);
		 Assert.assertTrue(actualResponseBody.contains(""));
	}
	}




