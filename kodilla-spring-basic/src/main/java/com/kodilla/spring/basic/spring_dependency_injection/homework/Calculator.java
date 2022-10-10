package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
    Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        return display.display(a + b);
    }

    public double subtract(double a, double b) {
        return display.display(a - b);
    }

    public double multiply(double a, double b) {
        return display.display(a * b);
    }

    public double divide(double a, double b) {
        return display.display(a / b);
    }

}
