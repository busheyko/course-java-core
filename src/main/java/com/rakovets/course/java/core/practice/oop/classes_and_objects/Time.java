package com.rakovets.course.java.core.practice.oop.classes_and_objects;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int totalSeconds) {
        hours = totalSeconds / 3600;
        minutes = totalSeconds / 60 % 60;
        seconds = totalSeconds % 60;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getTotalSeconds() {
        return this.hours * 3600 + this.minutes * 60 + this.minutes;
    }
}
