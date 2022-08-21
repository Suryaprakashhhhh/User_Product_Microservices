package com.product.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.model.Stock;
import com.product.repository.StockRepository;
import com.product.serviceinterface.StockInterface;

@Service
public class StockServiceImplementation implements StockInterface {
	@Autowired
	private StockRepository stockRepository;

	@Override
	public Stock saveStock(Stock stock) {
		return stockRepository.save(stock);
	}

}
