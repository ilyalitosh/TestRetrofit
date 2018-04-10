package com.example.litosh.testretrofit;

import com.example.litosh.testretrofit.models.Groups;
import com.example.litosh.testretrofit.models.schedule.group.ScheduleCore;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface BsuirApi {

    @GET("groups")
    Call<List<Groups>> getGroupsData();

    @GET("studentGroup/schedule")
    Call<ScheduleCore> getSchedule(@Query("studentGroup") int name);

}
