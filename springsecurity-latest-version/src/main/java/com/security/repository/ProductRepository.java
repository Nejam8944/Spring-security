package com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
