package com.product.dto;

import com.product.model.Order;

public class OrderDto {
	private Order order;

	public OrderDto() {
		super();
	}

	public OrderDto(Order order) {
		super();
		this.order = order;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
