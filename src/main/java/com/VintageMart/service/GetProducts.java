package com.VintageMart.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.VintageMart.entity.Products;


@Service
public interface GetProducts {

	public ResponseEntity<List<Products>> getProducts();
}
