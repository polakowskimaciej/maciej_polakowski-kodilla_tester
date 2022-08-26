package com.kodilla.execution_model.homework;

import org.junit.jupiter.api.*;

import java.time.Instant;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class ShopTest {
    Shop shop = new Shop();
    Instant instant1 = Instant.parse("2011-12-03T10:15:30Z");
    Instant instant2 = Instant.parse("1983-03-30T18:35:20Z");
    Instant instant3 = Instant.parse("1992-06-26T18:35:20Z");
    Order first = new Order(123.50, instant1, "Mafia");
    Order second = new Order(12, instant2, "Blue Monday");
    Order third = new Order(99.99, instant3, "Maciej");
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
        assertEquals(expectedList,shop.getOrderByDates(Instant.parse("1991-06-26T18:35:20Z"), Instant.parse("2018-11-30T18:35:20Z")));
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
        List<Order> result = shop.getOrderByDates(Instant.parse("1995-06-26T18:35:20Z"),Instant.parse("2010-11-30T18:35:24.00Z"));
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