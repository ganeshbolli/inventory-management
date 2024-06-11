package com.project.ims.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "cigars")
public class Cigars {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "cigar_id")
	    private Integer cigarId;

	    @ManyToOne
	    @JoinColumn(name = "product_id", nullable = false)
	    private Product product;

	    @Column(name = "quantity", nullable = false)
	    private Integer quantity;

	    // Getters and Setters
	    public Cigars() {
	    }
	    

		public Cigars(Product product, Integer quantity) {
			super();
			this.product = product;
			this.quantity = quantity;
		}


		public Integer getCigarId() {
			return cigarId;
		}

		public void setCigarId(Integer cigarId) {
			this.cigarId = cigarId;
		}

		public Product getProduct() {
			return product;
		}

		public void setProduct(Product product) {
			this.product = product;
		}

		public Integer getQuantity() {
			return quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}


}
