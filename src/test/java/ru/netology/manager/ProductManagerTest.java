package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    ProductRepository repository = new ProductRepository();
    ProductManager manager = new ProductManager(repository);

    private final Product one = new Book(1, "Hobbit", 1000, "Tolkien");
    private final Product two = new Book(2, "Alice", 500, "Lewis Carroll");
    private final Product three = new Smartphone(3, "Iphone 11", 100000, "Apple");
    private final Product four = new Smartphone(4, "Asus max Pro", 30000, "Asus");


    @BeforeEach
    public void setUp() {
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
    }


    @Test
    public void shouldSearchByFindOnePhone() {
        String findToString = "Asus";

        Product[] expected = {four};
        Product[] actual = manager.searchBy(findToString);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByFindOneBook() {
        String findToString = "Hobbit";

        Product[] expected = {one};
        Product[] actual = manager.searchBy(findToString);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldIsEmptySearch() {
        String findToString = "";

        Product[] expected = {};
        Product[] actual = manager.searchBy(findToString);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldWrongWorldSearch() {
        String findToString = "Hello";

        Product[] expected = {};
        Product[] actual = manager.searchBy(findToString);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByAuthor() {
        String findToString = "Tolkien";

        Product[] expected = {one};
        Product[] actual = manager.searchBy(findToString);

        assertArrayEquals(expected, actual);
    }
}