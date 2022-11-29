package com.VintageMart.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.VintageMart.entity.Products;
import com.VintageMart.repository.ProductsRepository;

@Service
public class DeleteProductImpl implements DeleteProduct{

	@Autowired
	private ProductsRepository productsRepository;
	
	
	@Override
	public ResponseEntity<String> deleteProduct(int productId) {
		Optional<Products> p1= productsRepository.findById(productId);
		if(p1.isPresent())
		{
			productsRepository.deleteById(productId);
			return ResponseEntity.status(200).body("Product deleted succesfully");
		}
		else
		{
			return ResponseEntity.status(404).body("Product does not exist...");
		}
	}

}
