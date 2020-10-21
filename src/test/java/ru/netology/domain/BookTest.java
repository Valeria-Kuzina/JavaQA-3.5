package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book = new Book(1, "Alice", 100, "Carroll");

    @Test
    void shouldMatchesFalse() {
        String findToString = "Hello";

        boolean actual = book.matches(findToString);

        assertFalse(actual);
    }

    @Test
    void shouldMatchesTrue() {
        String findToString = "Carroll";

        boolean actual = book.matches(findToString);

        assertTrue(actual);
    }
}