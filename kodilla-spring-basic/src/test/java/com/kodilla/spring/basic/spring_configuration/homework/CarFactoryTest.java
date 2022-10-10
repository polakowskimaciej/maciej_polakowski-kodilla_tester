package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.MonthDay;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CarFactoryTest {

    @Test
    void getCarBasedOnSeason() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //When
        MonthDay date = MonthDay.of(1,1);
        Car car = (Car) context.getBean("getCarBasedOnSeason");
        //Then
        Car expectedCar = new SUV();
        Assertions.assertEquals(expectedCar, car);
    }

    @Test
    void lightsOnOff() {
    }
}