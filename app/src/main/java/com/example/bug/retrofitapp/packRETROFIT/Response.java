package com.example.bug.retrofitapp.packRETROFIT;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Response {

    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://ipda3.com/sofra/api/v1/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }


}
