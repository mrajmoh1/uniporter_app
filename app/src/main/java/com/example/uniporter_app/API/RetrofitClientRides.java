package com.example.uniporter_app.API;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClientRides {
    private static final String BASE_URL = "http://ec2-54-210-165-217.compute-1.amazonaws.com:8000/api/ride/";
    private static RetrofitClientRides mInstance;
    private Retrofit retrofit;

    private RetrofitClientRides() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static synchronized RetrofitClientRides getInstance() {
        if (mInstance == null) {
            mInstance = new RetrofitClientRides();
        }
        return mInstance;
    }

    public API getAPI() {
        return retrofit.create(API.class);
    }
}
