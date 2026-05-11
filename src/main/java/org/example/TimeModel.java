package org.example;

public class TimeModel {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeModel(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() { return hours; }
    public int getMinutes() { return minutes; }
    public int getSeconds() { return seconds; }
}