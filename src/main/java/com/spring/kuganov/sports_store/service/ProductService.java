package com.spring.kuganov.sports_store.service;

import com.spring.kuganov.sports_store.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    void saveProduct(Product product);

    Product getProduct(int id);

    void deleteProduct(int id);
}
