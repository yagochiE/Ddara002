package com.example.timetableview;

import android.widget.RelativeLayout;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class Sticker implements Serializable {
    private ArrayList<TextView> view;
    private ArrayList<TextView> view2;
    private ArrayList<RelativeLayout> relative;
    private ArrayList<Schedule> schedules;

    public Sticker() {
        this.view = new ArrayList<TextView>();
        this.view2 = new ArrayList<TextView>();
        this.relative = new ArrayList<RelativeLayout>();
        this.schedules = new ArrayList<Schedule>();
    }

    public void addTextView(TextView v) {
        view.add(v);
    }

    public void addTextView2(TextView v) { view2.add(v); }

    public void addRelative(RelativeLayout v) { relative.add(v); }

    public void addSchedule(Schedule schedule) {
        schedules.add(schedule);
    }

    public ArrayList<TextView> getView() {
        return view;
    }

    public ArrayList<TextView> getView2() { return view2; }

    public ArrayList<RelativeLayout> getRelative() { return relative; }

    public ArrayList<Schedule> getSchedules() {
        return schedules;
    }

}
