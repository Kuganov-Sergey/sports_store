package com.spring.kuganov.sports_store.dao;

import com.spring.kuganov.sports_store.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
