package com.VintageMart.service;

import org.springframework.stereotype.Service;

import com.VintageMart.entity.Products;


@Service
public interface AddProducts {

	public Products addProducts(Products product);

}
