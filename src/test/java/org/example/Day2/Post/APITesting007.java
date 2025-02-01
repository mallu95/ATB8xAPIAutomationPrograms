package org.example.Day2.Post;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITesting007{
    //https://restful-booker.herokuapp.com/auth
    // -H 'Content-Type: application/json' \
    /*'{
            "username" : "admin",
            "password" : "password123"
}'*/

    @Description("Verifi that post request BDD Style")
    @Test
    public void test_bdd(){
        String payload="{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/auth")
                .contentType(ContentType.JSON)
                .log().all().body(payload)
                .when()
                .log().all().post()
                .then()
                .log().all().statusCode(200);
    }
}
