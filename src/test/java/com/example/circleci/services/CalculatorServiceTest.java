package com.example.circleci.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    private CalculatorService calculatorService;

    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    void whenSum0And0ThenReturn0() {
        assertEquals(0, calculatorService.sum(0, 0));
    }

    @Test
    void whenSum1NegativeAnd4ThenReturn3() {
        assertEquals(3, calculatorService.sum(-1, 4));
    }

    @Test
    void whenSum3And4ThenReturn7() {
        assertEquals(7, calculatorService.sum(3, 4));
    }
}