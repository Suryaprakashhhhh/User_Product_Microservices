package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;
import com.product.serviceimplementation.ProductServiceImplementation;

@RestController
@CrossOrigin("*")
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductServiceImplementation productServiceImplementation;

	@GetMapping(value = "getproduct/{id}")
	public Product findUserById(@PathVariable int id) {
		return productServiceImplementation.getProductById(id);
	}
	
}
