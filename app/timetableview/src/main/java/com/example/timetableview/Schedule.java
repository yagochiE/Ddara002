package com.example.timetableview;

import java.io.Serializable;

public class Schedule implements Serializable {
    static final int MON = 0;
    static final int TUE = 1;
    static final int WED = 2;
    static final int THU = 3;
    static final int FRI = 4;
    static final int SAT = 5;
    static final int SUN = 6;

    String thisWeek = "";

    String planTitle = "";
    String planContent = "";

    private int day = 0;
    private Time startTime;
    private Time endTime;

    public String getThisWeek() {
        return thisWeek;
    }

    public Schedule setThisWeek(String thisWeek) {
        this.thisWeek = thisWeek;
        return this;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Time getStartTime() {
        return startTime;
    }

    public void setStartTime(Time startTime) {
        this.startTime = startTime;
    }

    public Time getEndTime() {
        return endTime;
    }

    public void setEndTime(Time endTime) {
        this.endTime = endTime;
    }

    public String getPlanTitle() {
        return planTitle;
    }

    public Schedule setPlanTitle(String planTitle) {
        this.planTitle = planTitle;
        return this;
    }

    public String getPlanContent() {
        return planContent;
    }

    public Schedule setPlanContent(String planContent) {
        this.planContent = planContent;
        return this;
    }
}
