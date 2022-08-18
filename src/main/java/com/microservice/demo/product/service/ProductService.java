package com.microservice.demo.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.demo.product.model.Product;
import com.microservice.demo.product.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	public ProductRepository productRepo;
	
	public Iterable<Product> getAll() {
		return productRepo.findAll();
	}
	
	public Product getProductById(int Id) {
		return productRepo.findProductById(Id);
	}

	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	public void delete() {
		// TODO Auto-generated method stub
		productRepo.deleteAll();
	}

}
