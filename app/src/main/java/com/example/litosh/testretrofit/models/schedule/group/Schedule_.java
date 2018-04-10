package com.example.litosh.testretrofit.models.schedule.group;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Schedule_ {

    @SerializedName("weekNumber")
    @Expose
    private List<Integer> weekNumber = null;
    @SerializedName("studentGroup")
    @Expose
    private List<String> studentGroup = null;
    @SerializedName("studentGroupInformation")
    @Expose
    private List<String> studentGroupInformation = null;
    @SerializedName("numSubgroup")
    @Expose
    private Integer numSubgroup;
    @SerializedName("auditory")
    @Expose
    private List<String> auditory = null;
    @SerializedName("lessonTime")
    @Expose
    private String lessonTime;
    @SerializedName("startLessonTime")
    @Expose
    private String startLessonTime;
    @SerializedName("endLessonTime")
    @Expose
    private String endLessonTime;
    @SerializedName("subject")
    @Expose
    private String subject;
    @SerializedName("note")
    @Expose
    private String note;
    @SerializedName("lessonType")
    @Expose
    private String lessonType;
    @SerializedName("employee")
    @Expose
    private List<Employee> employee = null;
    @SerializedName("studentGroupModelList")
    @Expose
    private Object studentGroupModelList;
    @SerializedName("zaoch")
    @Expose
    private Boolean zaoch;

    public List<Integer> getWeekNumber() {
        return weekNumber;
    }

    public void setWeekNumber(List<Integer> weekNumber) {
        this.weekNumber = weekNumber;
    }

    public List<String> getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(List<String> studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<String> getStudentGroupInformation() {
        return studentGroupInformation;
    }

    public void setStudentGroupInformation(List<String> studentGroupInformation) {
        this.studentGroupInformation = studentGroupInformation;
    }

    public Integer getNumSubgroup() {
        return numSubgroup;
    }

    public void setNumSubgroup(Integer numSubgroup) {
        this.numSubgroup = numSubgroup;
    }

    public List<String> getAuditory() {
        return auditory;
    }

    public void setAuditory(List<String> auditory) {
        this.auditory = auditory;
    }

    public String getLessonTime() {
        return lessonTime;
    }

    public void setLessonTime(String lessonTime) {
        this.lessonTime = lessonTime;
    }

    public String getStartLessonTime() {
        return startLessonTime;
    }

    public void setStartLessonTime(String startLessonTime) {
        this.startLessonTime = startLessonTime;
    }

    public String getEndLessonTime() {
        return endLessonTime;
    }

    public void setEndLessonTime(String endLessonTime) {
        this.endLessonTime = endLessonTime;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getLessonType() {
        return lessonType;
    }

    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    public Object getStudentGroupModelList() {
        return studentGroupModelList;
    }

    public void setStudentGroupModelList(Object studentGroupModelList) {
        this.studentGroupModelList = studentGroupModelList;
    }

    public Boolean getZaoch() {
        return zaoch;
    }

    public void setZaoch(Boolean zaoch) {
        this.zaoch = zaoch;
    }

}
