package com.VintageMart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.VintageMart.entity.Products;
import com.VintageMart.repository.ProductsRepository;


@Service
public class GetProductsImpl implements GetProducts {

	
	@Autowired
	private ProductsRepository productsRepository;
	
	@Override
	public ResponseEntity<List<Products>> getProducts() {
		List<Products>list=new ArrayList<>();
		list=productsRepository.findAll();
		
		list.forEach((ele)->
		{
			String category=ele.getCategory();
			if(category.equals("Electronics"))
			{
				ele.setDiscount(0.15*ele.getBasePrice());
				ele.setGst(0.18*(ele.getBasePrice()-ele.getDiscount()));
				ele.setDelivery(350);
				ele.setFinalPrice(ele.getBasePrice()-ele.getDiscount()+ele.getGst()+ele.getDelivery());
			}
			else
				if(category.equals("Home Appliances"))
			{
				ele.setDiscount(0.22*ele.getBasePrice());
				ele.setGst(0.24*(ele.getBasePrice()-ele.getDiscount()));
				ele.setDelivery(800);
				ele.setFinalPrice(ele.getBasePrice()-ele.getDiscount()+ele.getGst()+ele.getDelivery());
			}
			else
				if(category.equals("Clothing"))
			{
				ele.setDiscount(0.40*ele.getBasePrice());
				ele.setGst(0.12*(ele.getBasePrice()-ele.getDiscount()));
				ele.setDelivery(0);
				ele.setFinalPrice(ele.getBasePrice()-ele.getDiscount()+ele.getGst()+ele.getDelivery());
			}
			else
				if(category.equals("Furniture"))
			{
				ele.setDiscount(0.10*ele.getBasePrice());
				ele.setGst(0.18*(ele.getBasePrice()-ele.getDiscount()));
				ele.setDelivery(300);
				ele.setFinalPrice(ele.getBasePrice()-ele.getDiscount()+ele.getGst()+ele.getDelivery());
			}
			else
			{
				ele.setDiscount(0);
				ele.setGst(0.9*(ele.getBasePrice()-ele.getDiscount()));
				ele.setDelivery(100);
				ele.setFinalPrice(ele.getBasePrice()-ele.getDiscount()+ele.getGst()+ele.getDelivery());
			}
					
		});
		return ResponseEntity.status(200).body(list);
		
	}

}
