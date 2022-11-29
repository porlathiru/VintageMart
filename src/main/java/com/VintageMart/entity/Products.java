package com.VintageMart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	
	@Column(nullable=false)
	private String productName;
	
	@Column(nullable=false)
	private String productType;
	
	@Column(nullable=false)
	private String category;
	
	@Column(nullable=false)
	private double basePrice;
	
	@Column(nullable=true)
	private double discount;
	
	@Column(nullable=true)
	private double finalPrice;

	@Column(nullable=true)
	private double gst;
	
	@Column(nullable=true)
	private double delivery;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(double finalPrice) {
		this.finalPrice = finalPrice;
	}

	public double getGst() {
		return gst;
	}

	public void setGst(double gst) {
		this.gst = gst;
	}

	public double getDelivery() {
		return delivery;
	}

	public void setDelivery(double delivery) {
		this.delivery = delivery;
	}

	public Products(int productId, String productName, String productType, String category, double basePrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productType = productType;
		this.category = category;
		this.basePrice = basePrice;
	}
	
	public Products() {
		super();
	}
	
}
