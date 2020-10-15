package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product = new Product();

    @Test
    void shouldMatchesFalse() {
        String findToString = "Hello";

        boolean actual = product.matches(findToString);

        assertEquals(false, actual);
    }
}