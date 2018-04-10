package com.example.litosh.testretrofit.models.schedule.group;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ScheduleCore {

    @SerializedName("employee")
    @Expose
    private Object employee;
    @SerializedName("studentGroup")
    @Expose
    private StudentGroup studentGroup;
    @SerializedName("schedules")
    @Expose
    private List<Schedule> schedules = null;
    @SerializedName("examSchedules")
    @Expose
    private List<Object> examSchedules = null;
    @SerializedName("todayDate")
    @Expose
    private String todayDate;
    @SerializedName("todaySchedules")
    @Expose
    private List<TodaySchedule> todaySchedules = null;
    @SerializedName("tomorrowDate")
    @Expose
    private String tomorrowDate;
    @SerializedName("tomorrowSchedules")
    @Expose
    private List<TomorrowSchedule> tomorrowSchedules = null;
    @SerializedName("currentWeekNumber")
    @Expose
    private Integer currentWeekNumber;

    public Object getEmployee() {
        return employee;
    }

    public void setEmployee(Object employee) {
        this.employee = employee;
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }

    public List<Object> getExamSchedules() {
        return examSchedules;
    }

    public void setExamSchedules(List<Object> examSchedules) {
        this.examSchedules = examSchedules;
    }

    public String getTodayDate() {
        return todayDate;
    }

    public void setTodayDate(String todayDate) {
        this.todayDate = todayDate;
    }

    public List<TodaySchedule> getTodaySchedules() {
        return todaySchedules;
    }

    public void setTodaySchedules(List<TodaySchedule> todaySchedules) {
        this.todaySchedules = todaySchedules;
    }

    public String getTomorrowDate() {
        return tomorrowDate;
    }

    public void setTomorrowDate(String tomorrowDate) {
        this.tomorrowDate = tomorrowDate;
    }

    public List<TomorrowSchedule> getTomorrowSchedules() {
        return tomorrowSchedules;
    }

    public void setTomorrowSchedules(List<TomorrowSchedule> tomorrowSchedules) {
        this.tomorrowSchedules = tomorrowSchedules;
    }

    public Integer getCurrentWeekNumber() {
        return currentWeekNumber;
    }

    public void setCurrentWeekNumber(Integer currentWeekNumber) {
        this.currentWeekNumber = currentWeekNumber;
    }

}