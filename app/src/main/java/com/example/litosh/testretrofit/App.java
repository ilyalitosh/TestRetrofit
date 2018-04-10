package com.example.litosh.testretrofit;

import android.app.Application;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {

    private static BsuirApi bsuirApi;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://students.bsuir.by/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        bsuirApi = retrofit.create(BsuirApi.class);

    }

    public static BsuirApi getBsuirApi(){
        return bsuirApi;
    }

}
