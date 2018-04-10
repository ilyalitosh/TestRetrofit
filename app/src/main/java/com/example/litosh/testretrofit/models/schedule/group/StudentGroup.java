package com.example.litosh.testretrofit.models.schedule.group;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StudentGroup {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("facultyId")
    @Expose
    private Integer facultyId;
    @SerializedName("facultyName")
    @Expose
    private Object facultyName;
    @SerializedName("specialityDepartmentEducationFormId")
    @Expose
    private Integer specialityDepartmentEducationFormId;
    @SerializedName("specialityName")
    @Expose
    private Object specialityName;
    @SerializedName("course")
    @Expose
    private Integer course;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("calendarId")
    @Expose
    private String calendarId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(Integer facultyId) {
        this.facultyId = facultyId;
    }

    public Object getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(Object facultyName) {
        this.facultyName = facultyName;
    }

    public Integer getSpecialityDepartmentEducationFormId() {
        return specialityDepartmentEducationFormId;
    }

    public void setSpecialityDepartmentEducationFormId(Integer specialityDepartmentEducationFormId) {
        this.specialityDepartmentEducationFormId = specialityDepartmentEducationFormId;
    }

    public Object getSpecialityName() {
        return specialityName;
    }

    public void setSpecialityName(Object specialityName) {
        this.specialityName = specialityName;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

}
