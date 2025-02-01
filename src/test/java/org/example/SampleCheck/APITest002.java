package org.example.SampleCheck;

import io.restassured.RestAssured;

public class APITest002 {
    public static void main(String[] args) {

        //Gherkin Syntax
        //Full-URL: https://restful-booker.herokuapp.com/booking/1
        //Base-URL : https://restful-booker.herokuapp.com
        //Base-Path :/booking/1
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
