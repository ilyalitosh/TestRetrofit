package com.example.litosh.testretrofit.models.schedule.group;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Employee__ {

    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("middleName")
    @Expose
    private String middleName;
    @SerializedName("rank")
    @Expose
    private String rank;
    @SerializedName("photoLink")
    @Expose
    private String photoLink;
    @SerializedName("calendarId")
    @Expose
    private String calendarId;
    @SerializedName("academicDepartment")
    @Expose
    private List<String> academicDepartment = null;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("fio")
    @Expose
    private String fio;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    public String getCalendarId() {
        return calendarId;
    }

    public void setCalendarId(String calendarId) {
        this.calendarId = calendarId;
    }

    public List<String> getAcademicDepartment() {
        return academicDepartment;
    }

    public void setAcademicDepartment(List<String> academicDepartment) {
        this.academicDepartment = academicDepartment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

}
