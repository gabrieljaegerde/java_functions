package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VariablesAssignmentTests {

    VariablesAssignment variablesAssignment = new VariablesAssignment();

    @Test
    void testByteVariable() {
        assertTrue(variablesAssignment.byteVariable > 0 && variablesAssignment.byteVariable <= 127, "The byte variable should be initialized between 1 and 127.");
    }

    @Test
    void testShortVariable() {
        assertTrue(variablesAssignment.shortVariable > 0 && variablesAssignment.shortVariable <= 32767, "The short variable should be initialized between 1 and 32767.");
    }

    @Test
    void testIntVariable() {
        assertTrue(variablesAssignment.intVariable > 0, "The int variable should be initialized with a positive value.");
    }

    @Test
    void testLongVariable() {
        assertTrue(variablesAssignment.longVariable > 0, "The long variable should be initialized with a positive value.");
    }

    @Test
    void testFloatVariable() {
        assertTrue(variablesAssignment.floatVariable > 0, "The float variable should be initialized with a positive value.");
    }

    @Test
    void testDoubleVariable() {
        assertTrue(variablesAssignment.doubleVariable > 0, "The double variable should be initialized with a positive value.");
    }

    @Test
    void testCharVariable() {
        assertTrue(Character.isLetter(variablesAssignment.charVariable), "The char variable should be initialized with a letter.");
    }

    @Test
    void testBooleanVariable() {
        assertTrue(variablesAssignment.booleanVariable, "The boolean variable should be initialized with a true or false value.");
    }

    @Test
    void testSumMethod() {
        assertEquals(5, variablesAssignment.sum(2, 3), "The sum method should return the correct sum.");
    }

    @Test
    void testProductMethod() {
        assertEquals(6.0, variablesAssignment.product(2.0, 3.0), 0.01, "The product method should return the correct product.");
    }

    @Test
    void testReverseStringMethod() {
        assertEquals("tac", variablesAssignment.reverseString("cat"), "The reverseString method should return the reversed string.");
    }
}
