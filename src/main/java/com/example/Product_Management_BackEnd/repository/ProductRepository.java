package com.example.Product_Management_BackEnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Product_Management_BackEnd.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
