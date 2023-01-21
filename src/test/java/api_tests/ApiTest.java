package api_tests;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ApiTest {
	String Token;
	int ID;
	
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
		
		Token = myResponse.asString().substring(25, myResponse.asString().length()-1);
    
  }
  
  
  @Test  (dependsOnMethods= "login")
  public void createCustomer() {
	  
		String requestBody1 = "{\n"
				+ "    \"name\": \"Hussein12\",\n"
				+ "    \"email\": \"jenkins.sdfds@example.org\",\n"
				+ "    \"enable_portal\": true,\n"
				+ "    \"billing\": [],\n"
				+ "    \"shipping\": []\n"
				+ "}";
		
		
		System.out.println("Bearer " +Token);
		Response myResponse = RestAssured.given().accept(ContentType.JSON)
				.contentType("application/json").headers("Authorization","Bearer  " +Token)
				.body(requestBody1).when().post("/v1/customers");
	
		myResponse.then().statusCode(200).and().contentType("application/json");
		myResponse.prettyPrint();
		String newID = myResponse.asString().substring(14, 17);
	    ID =(int)ValueOf(newID);
 }
  
  private int ValueOf(String newID) {
	// TODO Auto-generated method stub
	return 0;
}
@Test (dependsOnMethods = "createCustomer")
  public void updateCustomer() {
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
	
		
		Response myResponse = RestAssured.given().accept(ContentType.JSON)
				.contentType("application/json").headers("Authorization", "Bearer  " +Token)
				.body(requestBody).when().put("v1/customers/" +ID);
		
		myResponse.then().statusCode(200).and().contentType("application/json");
		myResponse.prettyPrint();
	}
	
@AfterTest (enabled = true)
public void cleanUp() {
	deleteCustomer();
	
}


public void deleteCustomer() {
	String requestBody = "{\n"
			+ "    \"ids\": [\n"
			+ "        "+ID+"\n"
			+ "    ]\n"
			+ "}\n"
			+ "";
	
	Response myResponse = RestAssured.given().accept(ContentType.JSON)
			.contentType("application/json").headers("Authorization", "Bearer  " +Token)
			.body(requestBody).when().post("/v1/customers/delete");
	
	myResponse.then().statusCode(200).and().contentType("application/json");
	myResponse.prettyPrint();
	  myResponse.asString();
	 
	 Assert.assertTrue(myResponse.asString().contains("true"));
}
  
  
  
  
  
  
  @Test (dependsOnMethods = "login")
  public void logout() {
	  
		Response myResponse = RestAssured.given().accept(ContentType.JSON)
				.contentType("application/json").headers("Authorization", "Bearer "+Token).when()
				.post("/v1/auth/logout");
		
		   myResponse.then().statusCode(200).and().contentType("application/json");
		   myResponse.prettyPrint();
	}
  
 
  
}
