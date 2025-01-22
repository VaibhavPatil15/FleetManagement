package API;

import org.openqa.selenium.devtools.v129.fetch.model.AuthChallengeResponse.Response;

public class postRequest {
	public static void main(String[] args) {
		Response postrequest = RestAssured.given().headers("content-type", "application/json").body("{\r\n"
				+ "   \"name\": \"Apple MacBook Pro 16\",\r\n"
				+ "   \"data\": {\r\n"
				+ "      \"year\": 2019,\r\n"
				+ "      \"price\": 1849.99,\r\n"
				+ "      \"CPU model\": \"Intel Core i9\",\r\n"
				+ "      \"Hard disk size\": \"1 TB\"\r\n"
				+ "   }\r\n"
				+ "}").when().post("https://api.restful-api.dev/objects")
				.then().extract().response();
		System.out.println(postrequest.statusCode);
		System.out.println(postrequest.body.asString());
		
		
		String pathResponce=postrequest.jsonPath.getString("id").toString();
		Response gettrequest =RestAssured.given().headers("content-type", "application/json").when().get("https://api.restful-api.dev/objects/"+)
				.then().extract().response();
		
		System.out.println(postrequest.statusCode);
		System.out.println(postrequest.body.asString());
	}
	
	
}
