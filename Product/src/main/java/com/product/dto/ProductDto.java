package com.product.dto;

import com.product.model.Product;

public class ProductDto {
	private Product product;

	public ProductDto() {
		super();
	}

	public ProductDto(Product product) {
		super();
		this.product = product;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
