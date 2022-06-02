package com.spring.kuganov.sports_store.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@NoArgsConstructor
@Data
@Entity
@Table(name = "products")
public class Product {

    @Id
    @Column(name = "id")
    private int id;
    private String title;
    private String brand;
    private String category;
    private String color;
    private double size;
    private double price;

    public Product(String title, String brand, String category, String color, double size, double price) {
        this.title = title;
        this.brand = brand;
        this.category = category;
        this.color = color;
        this.size = size;
        this.price = price;
    }
}
