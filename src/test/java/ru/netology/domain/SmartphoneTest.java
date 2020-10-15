package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    Smartphone smart = new Smartphone();

    @Test
    void shouldMatchesFalse() {
        String findToString = "Hello";

        boolean actual = smart.matches(findToString);

        assertEquals(false, actual);
    }
}