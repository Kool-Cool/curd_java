package com.example.curd_java.service;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curd_java.models.Product;

public interface  ProductRepository extends JpaRepository<Product, Integer>{
    // model and primarykey

    
}