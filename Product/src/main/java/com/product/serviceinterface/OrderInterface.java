package com.product.serviceinterface;

import java.util.List;

import com.product.model.Product;

public interface OrderInterface  {
	public List<Product> findAllProduct(int id);
}
