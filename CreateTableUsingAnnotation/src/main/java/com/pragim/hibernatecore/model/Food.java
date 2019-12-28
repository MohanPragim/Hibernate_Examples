package com.pragim.hibernatecore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Fid")
	private int foodId;

	@Column(name = "Fname", length = 30)
	private String foodName;

	@Column(name = "Restaurant", length = 30)
	private String restaurant;

	@Column(name = "Fitems", length = 10)
	private int foodItems;

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}

	public int getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(int foodItems) {
		this.foodItems = foodItems;
	}

}
