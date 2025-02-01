package org.example.Day2;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Get {

    @Test
    public void getrequest() {
        RestAssured
                .given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking/1")
                .when()
                .get()
                .then().log().all()
                .statusCode(200);
    }

}
