package com.VintageMart.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public interface DeleteProduct {

	public ResponseEntity<String> deleteProduct(int productId);

}
