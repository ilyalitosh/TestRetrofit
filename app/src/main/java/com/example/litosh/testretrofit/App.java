package com.example.litosh.testretrofit;

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class App extends Application {

    private static SchoolApi schoolApi;
    private Retrofit retrofit;

    @Override
    public void onCreate() {
        super.onCreate();

        Gson gson = new GsonBuilder().setLenient().create();

        retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.15.82:4545/api/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        schoolApi = retrofit.create(SchoolApi.class);

    }

    public static SchoolApi getSchoolApi(){
        return schoolApi;
    }

}
