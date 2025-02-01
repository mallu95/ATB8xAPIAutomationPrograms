package org.example.Day2;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_005_BDDStyle {
    @Test
    public void bddstyle_getpositive(){
        String pincode="388620";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/IN/"+pincode)
                .when()
                .log()
                .all()
                .get()
                .then()
                .log()
                .all()
                .statusCode(200);
    }

    @Test
    public void bddstyle_getnegative(){
        String pincode="-1";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us/")
                .basePath("/IN/"+pincode)
                .when()
                .log()
                .all()
                .get()
                .then()
                .log()
                .all()
                .statusCode(200);
    }
}
