package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    Shop shop = new Shop();
    Order first = new Order(123.50, new Date(2022, Calendar.FEBRUARY, 1), "Mafia");
    Order second = new Order(12, new Date(1983, Calendar.MARCH,7), "Blue Monday");
    Order third = new Order(99.99, new Date(1992, Calendar.JUNE,26), "Maciej");
    @BeforeEach
    public void setUp() {
    shop.addOrder(first);
    shop.addOrder(second);
    shop.addOrder(third);
    }

    @AfterEach
    public void tearDown() {
        shop.clearOrderList();
    }

    @Test
    void shouldAddOrder() {
        int numberOfOrders = shop.getNumberOfOrders();
        assertEquals(3,numberOfOrders);
    }

    @Test
    void shouldGetOrderByDates() {
        List<Order> expectedList = new ArrayList<>();
        expectedList.add(first);
        expectedList.add(third);
        assertEquals(expectedList,shop.getOrderByDates(new Date(1992, Calendar.JUNE,26),new Date(2022, Calendar.FEBRUARY, 1)));
    }

    @Test
    void shouldGetOrderByCost() {
        List<Order> expectedList = new ArrayList<>();
        expectedList.add(second);
        expectedList.add(third);
        assertEquals(expectedList,shop.getOrderByCost(12,99.99));
    }
    @Test
    void shouldReturnNullWhenPassingNonExistingCost() {
        List<Order> result = shop.getOrderByCost(1, 11);
        assertTrue(result.isEmpty());
    }
    @Test
    void shouldReturnNullWhenPassingNonExistingDates() {
        List<Order> result = shop.getOrderByDates(new Date(1995, Calendar.JUNE,26),new Date(2021, Calendar.FEBRUARY, 1));
        assertTrue(result.isEmpty());
    }
    @Test
    void shouldGetSumOfOrderCost() {
        assertEquals(235.49, shop.getSumOfOrderCost());
    }

    @Test
    void getNumberOfOrders() {
        assertEquals(3,shop.getNumberOfOrders());
    }
    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }

    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

}