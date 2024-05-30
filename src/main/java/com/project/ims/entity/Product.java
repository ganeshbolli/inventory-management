package com.project.ims.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "product_name", nullable = false)
	private String productName;
	@Column(name = "product_price")
	private String productPrice;
	@Column(name = "product_num")
	private String productSerialNum;

	public Product() {

	}

	public Product(String productName, String productPrice, String productSerialNum) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productSerialNum = productSerialNum;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductSerialNum() {
		return productSerialNum;
	}

	public void setProductSerialNum(String productSerialNum) {
		this.productSerialNum = productSerialNum;
	}

}
