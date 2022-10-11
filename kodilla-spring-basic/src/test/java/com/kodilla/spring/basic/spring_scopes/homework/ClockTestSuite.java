package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ClockTestSuite {
    @Test
    void shouldCreateDifferentTime() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Clock clock1 = context.getBean(Clock.class);
        Clock clock = context.getBean(Clock.class);
        Clock clock2 = context.getBean(Clock.class);
        Assertions.assertNotEquals(clock, clock1);
        Assertions.assertNotEquals(clock2, clock1);
        Assertions.assertNotEquals(clock, clock2);
    }
}