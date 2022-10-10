package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.Clock;
import java.time.LocalDateTime;

public class ReplaceableClockDemo {

    public static void main(String[] args) {
        ReplaceableClockDemo demo = new ReplaceableClockDemo(Clock.systemUTC());
        System.out.println(demo.isNowBefore(LocalDateTime.of(2017, 3, 1, 12, 0)));
    }

    private final Clock clock;

    public ReplaceableClockDemo(Clock clock) {
        this.clock = clock;
    }

    public boolean isNowBefore(LocalDateTime dateTime) {
        return LocalDateTime.now(clock).isBefore(dateTime);
    }

}
