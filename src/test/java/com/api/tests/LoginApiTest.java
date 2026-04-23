package com.api.tests;

import com.api.base.AuthService;
import com.api.listners.TestListener;
import com.api.models.LoginRequest;
import com.api.models.LoginResponse;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class LoginApiTest {

    public LoginResponse login(LoginRequest request) {
        AuthService service = new AuthService();
        Response response = service.login(request);
        LoginResponse loginResponse = response.as(LoginResponse.class);

        Assert.assertEquals(loginResponse.getUsername(), "newMan");
        Assert.assertEquals(loginResponse.getEmail(), "ehjfgvyf@gmail.com");
        Assert.assertEquals(loginResponse.getId(), 5035);
        Assert.assertEquals(loginResponse.getType(), "Bearer");
        Assert.assertNotNull(loginResponse.getToken());

        return loginResponse;
    }

    @Test(description = "Verify if the login API is working")
    public void test() {
        LoginRequest request = new LoginRequest("newMan", "newMan123");
        login(request);
    }
}
