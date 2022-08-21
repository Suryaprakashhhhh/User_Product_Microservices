package com.product.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "Order", catalog = "userdatabase")
public class Order {
	@Id
	private int orderId;
	private int productId;
	private int userId;

	@OneToMany(targetEntity = Product.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@Fetch(FetchMode.JOIN)
	@JoinColumn(name = "UA_FK", referencedColumnName = "userId")
	private List<Product> products;

	public Order() {
		super();
	}

	public Order(int orderId, int productId, int userId, List<Product> products) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.userId = userId;
		this.products = products;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
