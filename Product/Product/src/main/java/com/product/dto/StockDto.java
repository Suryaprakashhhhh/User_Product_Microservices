package com.product.dto;

import com.product.model.Stock;

public class StockDto {
	private Stock stock;

	public StockDto() {
		super();
	}

	public StockDto(Stock stock) {
		super();
		this.stock = stock;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

}
