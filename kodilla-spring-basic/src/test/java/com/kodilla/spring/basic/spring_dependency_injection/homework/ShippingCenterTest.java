package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class ShippingCenterTest {

    @Test
    void shouldSendPackage() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        //When
        //wysyłam paczkę na adres lżejszą niż30
        String message = bean.sendPackage("Ul. XXX", 25);
        //Than
        Assertions.assertEquals("Package delivered to: Ul. XXX", message);
    }
    @Test
    void shouldNotSendPackage() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        //When
        //wysyłam paczkę na adres cięższą niż30
        String message = bean.sendPackage("Ul. XXX", 35);
        //Than
        Assertions.assertEquals("Package not delivered to: Ul. XXX", message);
    }

}