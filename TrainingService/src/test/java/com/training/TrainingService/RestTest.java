package com.training.TrainingService;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import static com.jayway.restassured.RestAssured.*;

public class RestTest {

	
	@BeforeClass
	public static void setUp()
	{
		String port=System.getProperty("server.port");
		if(port==null)
			RestAssured.port=Integer.valueOf(8080);
		else
			RestAssured.port=Integer.valueOf(port);	
		
	}
	@Test
	public static void testURI()
	{
		given().when().get().then().statusCode(200);
	}
}
