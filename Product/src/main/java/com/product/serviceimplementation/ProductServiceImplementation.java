package com.product.serviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;


import com.product.model.Product;
import com.product.repository.ProductRepository;
import com.product.serviceinterface.ProductInterface;

public class ProductServiceImplementation implements ProductInterface {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product getProductById(int id) {
		return productRepository.findById(id);
	}
}
