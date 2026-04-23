package com.api.tests;

import com.api.base.UserProfileManagement;
import com.api.models.LoginRequest;
import com.api.models.LoginResponse;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class GetProfileTest {

    @Test
    public void test() {
        LoginApiTest test = new LoginApiTest();
        UserProfileManagement profileManagement = new UserProfileManagement();
        LoginRequest request = new LoginRequest("newMan", "newMan123");

        LoginResponse response = test.login(request);
        Response response1 = profileManagement.getProfile(response.getToken());
        System.out.println(response1.asPrettyString());
    }
}
