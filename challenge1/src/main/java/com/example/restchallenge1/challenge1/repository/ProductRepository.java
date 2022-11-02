package com.example.restchallenge1.challenge1.repository;

import com.example.restchallenge1.challenge1.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
