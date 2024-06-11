package com.project.ims.service;

import java.util.List;

import com.project.ims.entity.*;
public interface ProductService {
	
	List<Product> getAllProducts();
	
	Product saveProduct(Product product);

	Product updateProduct(Product product);
	
	Product getProductById(Long id);
	
	void deleteProductById(Long id);

}
