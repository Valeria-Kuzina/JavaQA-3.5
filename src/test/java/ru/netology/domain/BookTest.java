package ru.netology.domain;

import org.junit.jupiter.api.Test;

class BookTest {

    @Test
    void test() {
        Book book = new Book();
        book.setAuthor("Я");
        book.setName("мфяк");

        System.out.println("Hi!");
    }

    @Test
    void shouldCastFromBaseClass() {
        Product product = new Book();

        if (product instanceof Book) {
            Book book = (Book) product;
        }
    }
}
