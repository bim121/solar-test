package org.example;

public class TimeFormatter {

    public String format(TimeModel time) {
        return String.format("%02d:%02d:%02d",
                time.getHours(),
                time.getMinutes(),
                time.getSeconds());
    }
}