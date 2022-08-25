package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {

	Stock save(Stock stock);

}
