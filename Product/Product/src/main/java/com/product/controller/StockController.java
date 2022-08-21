package com.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.dto.StockDto;
import com.product.model.Stock;
import com.product.serviceimplementation.StockServiceImplementation;

@RestController
@CrossOrigin("*")
@RequestMapping("/stock")
public class StockController {
	@Autowired
	private StockServiceImplementation stockServiceImplementation;

	@PostMapping(value = "savestock")
	public Stock saveBook(@RequestBody StockDto stockDto) {
		return stockServiceImplementation.saveStock(stockDto.getStock());
	}
}
