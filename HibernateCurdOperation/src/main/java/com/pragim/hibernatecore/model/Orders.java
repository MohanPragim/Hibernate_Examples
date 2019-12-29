package com.pragim.hibernatecore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "OId", length = 10)
	private long orderId;

	@Column(name = "NoOfItems", length = 10)
	private int noOfItems;

	@Column(name = "Fname", length = 30)
	private String foodName;

	@Column(name = "restaurantName", length = 30)
	private String restaurantName;

	@Column(name = "Price", length = 10)
	private double price;

	@Column(name = "Discount", length = 10)
	private int discount;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public int getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", noOfItems=" + noOfItems + ", foodName=" + foodName
				+ ", restaurantName=" + restaurantName + ", price=" + price + ", discount=" + discount + "]";
	}

}
