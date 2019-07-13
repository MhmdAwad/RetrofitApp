package com.example.bug.retrofitapp.packRETROFIT;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface ApiEndPoint {

    @GET("restaurants")
    Call<JsonResponse> getRestaurants(@Query("page") int page );


}
