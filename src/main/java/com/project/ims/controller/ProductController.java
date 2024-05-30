package com.project.ims.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.ims.entity.Product;
import com.project.ims.repository.ProductRepository;
import com.project.ims.service.ProductService;

@Controller
public class ProductController {

	private ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/products")
	public String listProducts(Model model) {
		model.addAttribute("products", productService.getAllProducts());

		return "products";

		
	}

	@GetMapping("/products/new")
	public String createProductForm(Model model) {
		// create object to hold the form data
		Product product = new Product();
		model.addAttribute("product", product);

		return "create_product";
	}

	@PostMapping("/products")
	public String saveProduct(@ModelAttribute("product") Product product) {

		productService.saveProduct(product);
		return "redirect:/products";

	}
	
	
	@GetMapping("/products/edit/{id}")
	public String editProductForm(@PathVariable Long id, Model model) {
		model.addAttribute("product", productService.getProductById(id));
		return "edit_product";
	}

	@PostMapping("/products/{id}")
	public String updateProduct(@PathVariable Long id,
			@ModelAttribute("student") Product product,
			Model model) {
		
		// get student from database by id
		Product existingData = productService.getProductById(id);
		existingData.setId(id);
		existingData.setProductName(product.getProductName());
		existingData.setProductPrice(product.getProductPrice());
		existingData.setProductSerialNum(product.getProductSerialNum());
		
		// save updated product object
		productService.updateProduct(existingData);
		return "redirect:/products";		
	}
	
	
	//delete product data
	@GetMapping("/products/{id}")
	public String deleteProduct(@PathVariable Long id) {
		 productService.deleteProductById(id);
			return "redirect:/products";		

		
	}

}
