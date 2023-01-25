package api_tests;

import org.junit.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class customersApi {
	public static void main(String[] args) {
		
		createCustomer();
		//updateCustomer();
		//deleteCustomer();
	
	
		
	}
	
	int ID;
	
	public static void createCustomer() {
		
		
			RestAssured.baseURI = "http://invoice.primetech-apps.com/api/v1/customers";
			
			String token = "232|G43gOTJkNUkHfMH8LLz5CvIRniJo7FrI7y0SzOM8";
			String requestBody = "{\n"
					+ "    \"name\": \"Hussein18\",\n"
					+ "    \"email\": \"jekshfssffxvddnelle@example.org\",\n"
					+ "    \"enable_portal\": true,\n"
					+ "    \"billing\": [],\n"
					+ "    \"shipping\": []\n"
					+ "}";
			
			
			
			Response myResponse = RestAssured.given().accept(ContentType.JSON)
					.contentType("application/json").headers("Authorization", "Bearer  " +token)
					.body(requestBody).when().post();
			
			myResponse.then().statusCode(200).and().contentType("application/json");
			myResponse.prettyPrint();
		
			
			 String newID = myResponse.asString().substring(14, 17);
			
			int id =(int)ValueOf(newID);
		}
		
	private static Object ValueOf(String iD2) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void updateCustomer() {
		RestAssured.baseURI = "http://invoice.primetech-apps.com/api/v1/customers/207";
		
		String requestBody = "{\n"
				+ "    \"name\": \"Testy Besties for lovers\",\n"
				+ "    \"email\": \"testy.besties@lovers.com\",\n"
				+ "    \"password\": \"itisapassword\",\n"
				+ "    \"companies\": [\n"
				+ "        {\n"
				+ "            \"id\": \"1\",\n"
				+ "            \"role\": \"vel\"\n"
				+ "        }\n"
				+ "    ]\n"
				+ "}";
		String token = "170|32AvzJHLaMW5Iz07C5BIZEkPiefKuPOghJZJZMKl";
		
		Response myResponse = RestAssured.given().accept(ContentType.JSON)
				.contentType("application/json").headers("Authorization", "Bearer  " +token)
				.body(requestBody).when().put();
		
		myResponse.then().statusCode(200).and().contentType("application/json");
		myResponse.prettyPrint();
	}
	
	public static void deleteCustomer() {
		
		
		RestAssured.baseURI = "http://invoice.primetech-apps.com/api/v1/customers/delete";
		
		
		String requestBody = "{\n"
				+ "    \"ids\": [\n"
				+ "        216\n"
				+ "    ]\n"
				+ "}\n"
				+ "";
		String token = "206|bqEAskdSDXEh5HtR4ZODx9mfyvl28JXmCSkBacSN";
		
		
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




