package com.kodilla.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class YearTest {

    @Test
    void shouldBeLeapYearIfDivisibleBy400() {

        //given
        Year year = new Year(1600);

        //when
        boolean isLeapYear = year.isLeap();

        //then
        assertTrue(isLeapYear);
    }
    @Test
    void shouldNotBeLeapYearIfDivisibleByOnly4And100(){
        Year year = new Year(200);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);

    }
    @Test
    void shouldBeLeapYearIfDivisibleBy4AndNotBy100And400(){
        Year year = new Year(8);
        boolean isLeapYear = year.isLeap();
        assertTrue(isLeapYear);
    }
    @Test
    void shouldNotBeLeapYearIfRandom(){
        Year year = new Year(2021);
        boolean isLeapYear = year.isLeap();
        assertFalse(isLeapYear);

    }
}