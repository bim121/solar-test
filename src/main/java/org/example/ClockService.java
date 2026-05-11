package org.example;

import java.time.LocalTime;

public class ClockService {

    public String getCurrentTime() {
        LocalTime now = LocalTime.now();
        TimeModel model = new TimeModel(
                now.getHour(),
                now.getMinute(),
                now.getSecond()
        );

        return new TimeFormatter().format(model);
    }
}