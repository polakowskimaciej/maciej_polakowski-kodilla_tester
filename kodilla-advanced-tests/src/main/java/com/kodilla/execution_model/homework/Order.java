package com.kodilla.execution_model.homework;

import java.util.Date;

public class Order {
    private double orderCost;
    private Date date = new Date();
    private String userName;

    public Order(double orderCost, Date date, String userName) {
        this.orderCost = orderCost;
        this.date = date;
        this.userName = userName;
    }

    public double getOrderCost() {
        return orderCost;
    }

    public Date getDate() {
        return date;
    }

    public String getUserName() {
        return userName;
    }

}
