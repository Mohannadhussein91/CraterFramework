package api_tests;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ApiTest {
	String token;
	String customerId;
	
  @BeforeTest
	public void setup() {
	  RestAssured.baseURI = "http://invoice.primetech-apps.com/api";
	}
  
  
  @Test
  public void login() {
	   String requestBody = "{\n"
				+ "    \"username\": \"husseinmohanad@gmail.com\",\n"
				+ "    \"password\": \"Test1234\",\n"
				+ "    \"device_name\":\"mobile_app\"\n"
				+ "}";
		
		
		Response myResponse = RestAssured.given().accept(ContentType.JSON)
				.contentType("application/json").body(requestBody).when()
				.post("v1/auth/login");
		
		myResponse.then().statusCode(200).and().contentType("application/json");
		myResponse.prettyPrint();
		token = myResponse.body().jsonPath().getString("token");
	//	Token = myResponse.asString().substring(25, myResponse.asString().length()-1); didnt work
	
    
  }
  
  
  @Test  (dependsOnMethods= "login")
  public void createCustomer() {
	  
		String requestBody1 = "{\n"
				+ "    \"name\": \"Hussein13\",\n"
				+ "    \"email\": \"jenkins134555555.sdfds@example.org\",\n"
				+ "    \"enable_portal\": true,\n"
				+ "    \"billing\": [],\n"
				+ "    \"shipping\": []\n"
				+ "}";
		
		Response myResponse = RestAssured.given().accept(ContentType.JSON)
				.contentType("application/json").headers("Authorization","Bearer  " +token)
				.body(requestBody1).when().post("/v1/customers");
	
		myResponse.then().statusCode(200).and().contentType("application/json");
		myResponse.prettyPrint();
		customerId = myResponse.body().jsonPath().getString("data.id");
		
		
		

 }
  

  @Test (dependsOnMethods= "createCustomer")
    public void updateCustomer() {
	  String requestBody = "{\n"
				+ "    \"name\": \"Testy Besties for lovers1\",\n"
				+ "    \"email\": \"testy.besties146@lovers.com\",\n"
				+ "    \"password\": \"itisapassword\",\n"
				+ "    \"companies\": [\n"
				+ "        {\n"
				+ "            \"id\": \"1\",\n"
				+ "            \"role\": \"vel\"\n"
				+ "        }\n"
				+ "    ]\n"
				+ "}";
	
	   System.out.println(token);
		Response myResponse = RestAssured.given().accept(ContentType.JSON)
				.contentType("application/json").headers("Authorization", "Bearer " +token)
				.body(requestBody).when().put("/v1/customers/"+customerId);
		
		myResponse.then().statusCode(200).and().contentType("application/json");
		myResponse.prettyPrint();
		
	}


@Test (dependsOnMethods= "updateCustomer")
public void deleteCustomer() {
	String requestBody = "{\n"
			+ "    \"ids\": [\n"
			+ "        "+customerId+"\n"
			+ "    ]\n"
			+ "}";
	
	Response myResponse = RestAssured.given().accept(ContentType.JSON)
			.contentType("application/json").headers("Authorization", "Bearer  " +token)
			.body(requestBody).when().post("/v1/customers/delete");
	
	myResponse.then().statusCode(200).and().contentType("application/json");
	myResponse.prettyPrint();
	  myResponse.asString();
	 
	 Assert.assertTrue(myResponse.asString().contains("true"));
}
  
  
  
  
  
  
  @Test (dependsOnMethods = "deleteCustomer")
  public void logout() {
	  
		Response myResponse = RestAssured.given().accept(ContentType.JSON)
				.contentType("application/json").headers("Authorization", "Bearer "+token).when()
				.post("/v1/auth/logout");
		
		   myResponse.then().statusCode(200).and().contentType("application/json");
		   myResponse.prettyPrint();
	}
  
 
  
}
