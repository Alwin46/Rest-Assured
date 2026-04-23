package com.api.base;

import com.api.filters.LoggingFilter;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class BaseService {

    static {
        RestAssured.filters(new LoggingFilter());
    }

    private static final String baseUrl = "http://64.227.160.186:8080";
    private RequestSpecification requestSpecification;

    public BaseService() {
        requestSpecification = given().baseUri(baseUrl);
    }

    protected void setAuthToken(String token) {
        requestSpecification.header("Authorization", "Bearer ", token);
    }

    protected Response getRequest(String endpoint) {
        return requestSpecification.get(endpoint);
    }

    protected Response postRequest(Object payload, String endpoint) {
        return requestSpecification.contentType(ContentType.JSON).body(payload).post(endpoint);
    }
}
