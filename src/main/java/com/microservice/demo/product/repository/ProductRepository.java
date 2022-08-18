package com.microservice.demo.product.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservice.demo.product.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	Product findProductById(int Id);
}
