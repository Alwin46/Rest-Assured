package com.api.tests;

import com.api.base.AuthService;
import com.api.models.SignUpRequest;
import io.restassured.response.Response;
import org.testng.annotations.Test;

public class SignUpApiTest {

    @Test(description = "Verify if the SignUp Api working")
    public void test() {

        SignUpRequest request = new SignUpRequest.Builder()
                .username("hjgvedf")
                .email("ehvvdyhevdfy")
                .firstname("dhhhdf")
                .lastname("juevbdujhedvb")
                .phoneNumber("5456449499")
                .build();
        AuthService service = new AuthService();
        Response response = service.signUp(request);
        System.out.println(response.asPrettyString());
    }
}
