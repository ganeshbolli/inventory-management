package com.project.ims.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.ims.entity.Product;
import com.project.ims.repository.ProductRepository;
import com.project.ims.service.ProductService;

@Service
public class ProductServiceImpl  implements ProductService{
	
	private ProductRepository productRepository;
	


	

	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}


	@Override
	public List<Product> getAllProducts() {

		return productRepository.findAll();
	}


	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}


	@Override
	public Product getProductById(Long id) {
		return productRepository.findById(id).get();
	}

	@Override
	public Product updateProduct(Product product) {
		return productRepository.save(product);
	}


	@Override
	public void deleteProductById(Long id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
		
	}
	

	   

}
