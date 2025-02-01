package org.example.Day2;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting_006_NonBDDStyle {
    static RequestSpecification r=new RestAssured().given();

    @Severity(SeverityLevel.CRITICAL)
    @Description("Testcase 1 Non-BDD Style Positive")
    @Test
    public void test_nonbdd_style_positive(){
        r.baseUri("https://api.zippopotam.us/");
        r.basePath("/IN/388620");
        r.when().log().all().get();
        r.then().log().all().statusCode(200);
    }

    @Severity(SeverityLevel.NORMAL)
    @Description("Testcase 2 Non-BDD Style Negative")
    @Test
    public void test_nonbdd_style_negative(){
        r.baseUri("https://api.zippopotam.us/");
        r.basePath("/IN/587112");
        r.when().log().all().get();
        r.then().log().all().statusCode(404);
    }
}
