package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.model.Product;
import com.product.serviceimplementation.OrderServiceImplementation;

@RestController
@CrossOrigin("*")
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderServiceImplementation orderServiceImplementation;


	@GetMapping(value = "productlist/{id}")
	public List<Product> findAllBooks(@PathVariable int id) {
		return orderServiceImplementation.findAllProduct(id);
	}

}
