package com.online.store.entetie;

public interface Cart {
    boolean isEmpty();

    void addProduct(Product productById);

    Product[] getProducts();

    void clear();
}
