package com.VintageMart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.VintageMart.entity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products,Integer>{

}
