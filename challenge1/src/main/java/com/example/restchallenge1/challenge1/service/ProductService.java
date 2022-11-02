package com.example.restchallenge1.challenge1.service;

import com.example.restchallenge1.challenge1.domain.Product;

import java.util.List;

public interface ProductService {

    public Product add(Product product);
    public List<Product> getAllProduct();
}
