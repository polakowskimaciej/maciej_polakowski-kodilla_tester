package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CarFactoryTest {
    @Test
    void getCarBasedOnSeason() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        //When
        Car car = (Car) context.getBean("getCarBasedOnSeason");
        //Then
        Assertions.assertEquals("Sedan",car.getCarType());
    }

    @Test
    void lightsOnOff() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("getCarBasedOnSeason");
        boolean lights = car.hasHeadlightsTurnedOn();
        Assertions.assertFalse(lights);
    }
}