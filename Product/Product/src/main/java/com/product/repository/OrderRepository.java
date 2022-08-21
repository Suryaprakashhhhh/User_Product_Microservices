package com.product.repository;

import java.util.List;

import com.product.model.Product;

public interface OrderRepository {
	List<Product> findById(int id);
}
