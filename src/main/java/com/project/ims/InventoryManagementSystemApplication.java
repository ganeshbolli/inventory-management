package com.project.ims;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project.ims.entity.Product;
import com.project.ims.repository.ProductRepository;

@SpringBootApplication
public class InventoryManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InventoryManagementSystemApplication.class, args);
	}
	
	@Autowired
	private ProductRepository productRepository; 

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * Product product = new Product("Game Leaf","1.49","1");
		 * productRepository.save(product);
		 * 
		 * Product product1 = new Product("Swisher Leaf","2.49","2");
		 * productRepository.save(product1);
		 */
		
	}

}
