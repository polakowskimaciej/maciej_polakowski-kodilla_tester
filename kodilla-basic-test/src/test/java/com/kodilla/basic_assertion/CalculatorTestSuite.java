package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    Calculator calculator = new Calculator();

    @Test
    public void testSum() {

        int a = 5;
        int b = 8;
        int sumResult = calculator.add(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSub() {

        int a = 5;
        int b = 8;
        int subResult = calculator.sub(a,b);
        assertEquals(-3, subResult);
    }
    @Test
    public void testSquare() {

        double a = 5;
        double squareResult = calculator.square(a);
        assertEquals(25, squareResult);
    }
    @Test
            public void testSquareZero() {
        double b = 0;
        double squareResultZero = calculator.square(b);
        assertEquals(0, squareResultZero, 0.01);
    }
    @Test
            public void testSquareNegative() {
                double c = -7;
                double squareResultMinus = calculator.square(c);
                assertEquals(49,squareResultMinus,0.01);
    }
}