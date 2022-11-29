package com.VintageMart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.VintageMart.entity.Products;
import com.VintageMart.repository.ProductsRepository;


@Service
public class UpdateByIdImpl implements UpdateById{

	
	@Autowired
	private ProductsRepository productsRepository;
	
	@Override
	public ResponseEntity<String> updateById(int productId,double basePrice) 
	{
		// TODO Auto-generated method stub
		
		Optional<Products> p=productsRepository.findById(productId);
		
		if(p.isPresent())
		{
			p.get().setBasePrice(basePrice);
			return ResponseEntity.status(200).body("Product price updated to "+basePrice);
		}
		else
		{
			return ResponseEntity.status(404).body("Product does not exist. Check the product ID.");
		}
	}

	
}
