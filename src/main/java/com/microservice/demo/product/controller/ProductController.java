package com.microservice.demo.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.demo.product.model.Product;
import com.microservice.demo.product.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	public ProductService productService;
	
	@GetMapping("/")
	public Iterable<Product> getAll() {
		return productService.getAll();
	}
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable("id") int Id) {
		return productService.getProductById(Id);
	}
	
	@PostMapping("/save")
	public Product getProductById(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
	@PostMapping("/delete")
	public void delete() {
		productService.delete();
	}

}
