package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.MonthDay;

@Configuration
public class CarFactory {
    @Bean
    public Car getCarBasedOnSeason() {
        Car car;
        MonthDay date = MonthDay.now();
        if (date.isAfter(MonthDay.of(3, 20)) && date.isBefore(MonthDay.of(6, 21))) {
            car = new Sedan();
        } else if (date.isAfter(MonthDay.of(6, 21)) && date.isBefore(MonthDay.of(9, 22))) {
            car = new Cabrio();
        } else if (date.isAfter(MonthDay.of(9, 22)) && date.isBefore(MonthDay.of(12, 21))) {
            car = new Sedan();
        } else {
            car = new SUV();
        }
        return car;
    }
}