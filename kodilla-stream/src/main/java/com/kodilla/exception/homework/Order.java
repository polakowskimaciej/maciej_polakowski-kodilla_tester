package com.kodilla.exception.homework;

public class Order {
    private String number;

    public Order(String number) {
        this.number = number;
    }

    public String getNumber(String number) {
        return this.number;
    }

    @Override
    public String toString() {
        return "Order{" +
                "number='" + number + '\'' +
                '}';
    }
}
