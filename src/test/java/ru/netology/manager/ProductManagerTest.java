package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Book;
import ru.netology.domain.Product;
import ru.netology.domain.Smartphone;
import ru.netology.repository.ProductRepository;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    private final ProductRepository repository = new ProductRepository();
    private final ru.netology.manager.ProductManager manager = new ru.netology.manager.ProductManager(repository);

    private final Product zero = new Book(6, "History of Iphone", 1000, "Apple");
    private final Product one = new Book(1, "Hobbit", 1000, "John Tolkien");
    private final Product two = new Book(2, "Alice", 500, "Lewis Carroll");
    private final Product three = new Smartphone(3, "Iphone11", 100000, "Apple");
    private final Product four = new Smartphone(4, "Asus max Pro", 30000, "Asus");
    private final Product five = new Smartphone(5, "Iphone12", 300000, "Apple");


    @BeforeEach
    public void setUp() {
        manager.add(zero);
        manager.add(one);
        manager.add(two);
        manager.add(three);
        manager.add(four);
        manager.add(five);
    }


    @Test
    public void shouldSearchByFindSmartphone() {
        String findToString = "Asus";

        Product[] expected = {four};
        Product[] actual = manager.searchBy(findToString);

        assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldSearchByFindBook() {
        String findToString = "Alice";

        Product[] expected = {two};
        Product[] actual = manager.searchBy(findToString);

        assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldSearchIfNotElement() {
        String findToString = "logitech";

        Product[] expected = {};
        Product[] actual = manager.searchBy(findToString);

        assertArrayEquals(expected,actual);
    }

    @Test
    public void shouldSearchByMoreThenOneElement() {
        String findToString = "Apple";

        Product[] expected = {zero, three, five};
        Product[] actual = manager.searchBy(findToString);

        Set<Product> expectedSet = new HashSet<>(Arrays.asList(expected));
        Set<Product> actualSet = new HashSet<>(Arrays.asList(actual));

        assertEquals(expectedSet, actualSet);
    }
}