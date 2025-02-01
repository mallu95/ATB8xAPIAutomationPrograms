package org.example.Day2.Post;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITest009NonBDD {
    //  //https://restful-booker.herokuapp.com/auth
    @Description("Verify that post method non bdd style")
    @Test
    public void test_nonbdd(){
        String payload="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RequestSpecification r=new RestAssured().given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.baseUri("/auth");
        r.contentType(ContentType.JSON);
        r.body(payload);
        r.when().log().all().post();
        r.then().log().all().statusCode(200);
    }
}
