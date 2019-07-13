package com.example.bug.retrofitapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.example.bug.retrofitapp.packRETROFIT.ApiEndPoint;
import com.example.bug.retrofitapp.packRETROFIT.JsonResponse;
import com.example.bug.retrofitapp.packRETROFIT.Response;
import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiEndPoint apiEndPoint = Response.getClient().create(ApiEndPoint.class);
        apiEndPoint.getRestaurants(1).enqueue(new Callback<JsonResponse>() {
            @Override
            public void onResponse(Call<JsonResponse> call, retrofit2.Response<JsonResponse> response) {
                Log.v("MainActivity:", response.body().getData().getData().toString());
            }
            @Override
            public void onFailure(Call<JsonResponse> call, Throwable t) {
                Log.v("MainActivity:", "Error");
            }
        });
    }
}
