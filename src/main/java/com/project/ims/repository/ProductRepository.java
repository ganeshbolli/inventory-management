package com.project.ims.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ims.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
