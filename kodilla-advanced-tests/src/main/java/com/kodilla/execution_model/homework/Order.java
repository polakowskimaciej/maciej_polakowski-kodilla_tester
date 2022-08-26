package com.kodilla.execution_model.homework;

import java.time.Instant;
import java.util.Date;

public class Order {
    private double orderCost;
    private Instant date;
    private String userName;

    public Order(double orderCost, Instant date, String userName) {
        this.orderCost = orderCost;
        this.date = date;
        this.userName = userName;
    }

    public double getOrderCost() {
        return orderCost;
    }

    public Instant getDate() {
        return date;
    }

    public String getUserName() {
        return userName;
    }

}
