package com.VintageMart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.VintageMart.entity.Products;
import com.VintageMart.repository.ProductsRepository;



@Service
public class AddProductsImpl implements AddProducts {

	@Autowired
	private ProductsRepository productsRepository;
	
	@Override
	public Products addProducts(Products product) {
		
		return productsRepository.save(product);
	}

}
