package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClockServiceTest {

    @Test
    void shouldReturnCurrentTime() {

        ClockService service = new ClockService();

        String time = service.getCurrentTime();

        assertNotNull(time);
        assertFalse(time.isEmpty());
    }
}