package com.product.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.product.model.Product;
import com.product.repository.OrderRepository;
import com.product.serviceinterface.OrderInterface;

public class OrderServiceImplementation implements OrderInterface {
	
	@Autowired
	private OrderRepository orderRepository;


	@Override
	public List<Product> findAllProduct(int id) {
		return orderRepository.findById(id);
	}

}
