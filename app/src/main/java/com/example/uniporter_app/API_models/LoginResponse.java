package com.example.uniporter_app.API_models;

import com.google.gson.annotations.SerializedName;

public class LoginResponse {
    private String token;

    public LoginResponse(String token) {
        this.token = token;
    }
    public String getToken() {
        return token;
    }

}
