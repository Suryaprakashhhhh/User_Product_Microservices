package com.product.repository;

import com.product.model.Product;

public interface ProductRepository {
	Product findById(int id);
}
