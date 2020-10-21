package ru.netology.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.manager.ProductManager;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product = new Product(1, "Honor", 1);

    @Test
    void shouldMatchesFalse() {
        String findToString = "Hello";

        boolean actual = product.matches(findToString);

        assertFalse(actual);
    }

    @Test
    void shouldMatchesTrue() {
        String findToString = "Honor";

        boolean actual = product.matches(findToString);

        assertTrue(actual);
    }
}