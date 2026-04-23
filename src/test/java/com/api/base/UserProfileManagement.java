package com.api.base;

import io.restassured.response.Response;

public class UserProfileManagement extends BaseService {

    private static final String basePath = "/api/users/";

    public Response getProfile(String token) {
        setAuthToken(token);
        return getRequest(basePath + "profile");
    }
}
