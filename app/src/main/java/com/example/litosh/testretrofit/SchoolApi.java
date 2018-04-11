package com.example.litosh.testretrofit;

import com.example.litosh.testretrofit.models.Student;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface SchoolApi {

    @GET("students")
    Call<List<Student>> getStudents();

    @POST("addStudent")
    Call<Student> addStudent(@Body Student student);

}
