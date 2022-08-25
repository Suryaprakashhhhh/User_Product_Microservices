package com.product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.model.Order;
import com.product.model.Product;

public interface OrderRepository extends JpaRepository<Order, Integer>{
	List<Product> findById(int id);
}
