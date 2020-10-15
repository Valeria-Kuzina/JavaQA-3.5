package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book = new Book();

    @Test
    void shouldMatchesFalse() {
        String findToString = "Hello";

        boolean actual = book.matches(findToString);

        assertEquals(false, actual);
    }

    @Test
    void shouldMatchesTrue() {
        String findToString = "Asus";

        boolean actual = book.matches(findToString);

        assertNotEquals(true, actual);
    }
}