package com.kodilla.exception.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTest {

    @Test
    void addOrder() {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("777"));
        assertEquals(1,warehouse.getOrderListSize());
    }

    @Test
    void getOrder() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("666"));
        String orderExists = warehouse.getOrder("666").getNumber("666");
        assertEquals("666",orderExists);
    }
    @Test
    void getOrderWithException() {
        Warehouse warehouse = new Warehouse();
        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("111"));
    }
}