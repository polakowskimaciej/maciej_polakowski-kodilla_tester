package com.kodilla.execution_model.homework;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private static final List<Order> orderList = new ArrayList<>();

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public List<Order> getOrderByDates(Instant firstDate, Instant lastDate) {
        //
        return orderList.stream()
                .filter(date -> date.getDate().isAfter(firstDate))
                .filter(date -> date.getDate().isBefore(lastDate))
                .collect(Collectors.toList());
    }
    public List<Order> getOrderByCost(double lowestCost, double highestCost) {
        return orderList.stream()
                .filter(cost -> cost.getOrderCost() >= lowestCost)
                .filter(cost-> cost.getOrderCost() <= highestCost)
                .collect(Collectors.toList());
    }
    public double getSumOfOrderCost() {
        return orderList.stream()
                .mapToDouble(Order::getOrderCost).sum();
    }

    public int getNumberOfOrders() {
        return orderList.size();
    }

    public List<Order> getOrderList() {
        return orderList;
    }
    public void clearOrderList() {
        orderList.clear();
    }
}
