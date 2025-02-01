package API;

import java.io.IOException;

import io.restassured.RestAssured;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;

public class postRequest {
	public static void main(String[] args) throws IOException {
		
		String body = readdata.generateStringFromResource("C:\\Users\\Vp671\\git\\FleetManagement\\src\\test\\resources\\APITestData\\employee.json");
		Response postrequest = RestAssured.given().headers("content-type", "application/json").body(body).when().post("https://api.restful-api.dev/objects")
				.then().extract().response();
		System.out.println(postrequest.statusCode());
		//Assertion hardAssert = new Assertion();
		System.out.println(postrequest.body().asString());
		
		
		String pathResponce=postrequest.jsonPath().getString("id").toString();
		Response gettrequest =RestAssured.given().headers("content-type", "application/json").when().get("https://api.restful-api.dev/objects/"+pathResponce)
				.then().extract().response();
		
		System.out.println(postrequest.statusCode());
		System.out.println(postrequest.body().asString());
		
		
		/*
		curl --location --request GET 'https://api.restful-api.dev/objects/ff808181932badb60194899fcc3e5947' \
		--header 'Content-Type: application/json' \
		--data '{
		   "name": "Apple MacBook Pro 16",
		   "data": {
		      "year": 2019,
		      "price": 1849.99,
		      "CPU model": "Intel Core i9",
		      "Hard disk size": "1 TB"
		   }
		
		curl --location --request PUT 'https://api.restful-api.dev/objects/ff808181932badb60194899fcc3e5947' \
		--header 'Content-Type: application/json' \
		--data '{
		   "name": "Apple MacBook Pro KOMAL2",
		   "data": {
		      "year": 2024,
		      "price": 20.99,
		      "CPU model": "Intel Core i9",
		      "Hard disk size": "1 TB"
		   }
		}'
	curl --location --request PATCH 'https://api.restful-api.dev/objects/ff808181932badb60194750eeb883c8d' \
	--header 'Content-Type: application/json' \
	--data '{
	   "name": "Apple MacBook Pro KOMAL3"
	}'
	
		
		
		}'
		*/
	}
	
	
}
