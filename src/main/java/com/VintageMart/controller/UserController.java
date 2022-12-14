package com.VintageMart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.VintageMart.entity.Products;
import com.VintageMart.service.AddProducts;
import com.VintageMart.service.DeleteProduct;
import com.VintageMart.service.GetProducts;
import com.VintageMart.service.UpdateById;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

@RestController
public class UserController {

	
	@RequestMapping("/test")
	public ResponseEntity<String> test() throws JsonMappingException,JsonProcessingException
	{
		String s="This is Vintage Mart application and it is working fine...";
		return ResponseEntity.status(200).body(s);
	}
	
	
	@Autowired
	private AddProducts add;
	
	@RequestMapping("/addProducts")
	public void addProducts(@RequestBody Products product) throws JsonMappingException,JsonProcessingException
	{
		add.addProducts(product);
	}
	
	
	@Autowired
	private GetProducts get;
	
	@RequestMapping("/getProducts")
	public ResponseEntity<List<Products>> get()
	{
		return get.getProducts();
	}
	@Autowired
	private DeleteProduct delete;
	
	@RequestMapping(value = "/deleteProduct")
	public ResponseEntity<String> delete(@RequestHeader("productId")int productId)
	{
		return delete.deleteProduct(productId);
	}
	
	@Autowired
	private UpdateById update;
	
	@RequestMapping(value = "/updatePrice")
	public ResponseEntity<String> updateById(@RequestHeader int productId,@RequestHeader double basePrice)
	{
		return update.updateById(productId,basePrice);
	}
	
}