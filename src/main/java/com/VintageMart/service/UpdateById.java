package com.VintageMart.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface UpdateById {

	public ResponseEntity<String> updateById(int productId,double basePrice);
}
