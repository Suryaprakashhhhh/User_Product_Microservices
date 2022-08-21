package com.product.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product", catalog = "userdatabase")
public class Product {
	@Id
	private int productId;
	private String product;
	private int quantity;
	private int userId;

	public Product() {
		super();
	}

	public Product(int productId, String product, int quantity, int userId) {
		super();
		this.productId = productId;
		this.product = product;
		this.quantity = quantity;
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product(int userId) {
		super();
		this.userId = userId;
	}

}
