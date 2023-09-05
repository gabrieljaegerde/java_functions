package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {

    @Test
    public void testAdd() {
        SumCalculator calculator = new SumCalculator();

        assertEquals(5, calculator.add(2, 3), "2 + 3 should equal 5");
        assertEquals(0, calculator.add(-1, 1), "-1 + 1 should equal 0");
        assertEquals(-3, calculator.add(-1, -2), "-1 + (-2) should equal -3");
    }
}
