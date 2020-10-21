package ru.netology.repository;

import ru.netology.domain.Product;

public class ProductRepository {
    private Product[] items = new Product[0];

    public Product[] findAll() {
        return items;
    }

    public void save(Product item) {
        Product[] tmp = new Product[items.length + 1];
        System.arraycopy(items, 0, tmp, 0, items.length);
        tmp[items.length] = item;
        items = tmp;
    }
}
