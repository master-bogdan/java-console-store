package com.online.store.services;

import com.online.store.entetie.Product;

public interface ProductManagementService {
    Product[] getProducts();

    Product getProductById(int productIdToAddToCart);

}
