package com.example.litosh.testretrofit.models.schedule.group;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Schedule {

    @SerializedName("weekDay")
    @Expose
    private String weekDay;
    @SerializedName("schedule")
    @Expose
    private List<Schedule_> schedule = null;

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public List<Schedule_> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<Schedule_> schedule) {
        this.schedule = schedule;
    }

}
