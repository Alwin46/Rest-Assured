package com.api.base;

import com.api.models.LoginRequest;
import com.api.models.SignUpRequest;
import io.restassured.response.Response;

public class AuthService extends BaseService {

    //private static final String baseUrl = "http://64.227.160.186:8080";
    private static final String baseAuth = "/api/auth/";

    public Response login(LoginRequest payload) {
        return postRequest(payload, baseAuth + "login");
    }

    public Response signUp(SignUpRequest payload) {
        return postRequest(payload, baseAuth + "signup");
    }
}
