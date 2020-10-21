package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    Smartphone smart = new Smartphone(2, "Iphone", 50000, "Apple");

    @Test
    void shouldMatchesFalse() {
        String findToString = "Hello";

        boolean actual = smart.matches(findToString);

        assertFalse(actual);
    }

    @Test
    void shouldMatchesTrue() {
        String findToString = "Iphone";

        boolean actual = smart.matches(findToString);

        assertTrue(actual);
    }
}