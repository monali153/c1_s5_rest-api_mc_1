package com.example.restchallenge1.challenge1.controller;

import com.example.restchallenge1.challenge1.domain.Product;
import com.example.restchallenge1.challenge1.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products/v1/")
public class ProductController {

    private ProductServiceImpl productService;

    @Autowired
    public ProductController(ProductServiceImpl productService){
        this.productService = productService;
    }

    @PostMapping(value = "/product")
    public ResponseEntity<?> save(@RequestBody Product product){
        return new ResponseEntity<>(productService.add(product), HttpStatus.CREATED);
    }

    @GetMapping(value = "/product")
    public ResponseEntity<?> get(){

        List<Product> list = productService.getAllProduct();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }
}
