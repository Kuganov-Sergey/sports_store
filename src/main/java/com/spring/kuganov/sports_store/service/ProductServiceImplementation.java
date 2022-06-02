package com.spring.kuganov.sports_store.service;

import com.spring.kuganov.sports_store.dao.ProductRepository;
import com.spring.kuganov.sports_store.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImplementation implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public Product getProduct(int id) {
        Product product = null;
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            product = optionalProduct.get();
        }

        /*
                Выбрасывать исключение или записывать в лог
         */

        return product;
    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
