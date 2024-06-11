package com.project.ims.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "food")
public class Food {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "food_id")
	    private Integer foodId;

	 @ManyToOne(cascade = CascadeType.ALL)
	    @JoinColumn(name = "product_id", nullable = false)
	    private Product product;

	    @Column(name = "quantity", nullable = false)
	    private Integer quantity;

	    // Getters and Setters
	    public Food() {
	    }

		public Food(Product product, Integer quantity) {
			super();
			this.product = product;
			this.quantity = quantity;
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

		public Integer getFoodId() {
			return foodId;
		}

		public void setFoodId(Integer foodId) {
			this.foodId = foodId;
		}
		

}
