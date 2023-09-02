package com.app.foodieapp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Orders")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int orderId;
	@Column
	String restaurantName;
	@Column
	String orderedItems;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, String restaurantName, String orderedItems) {
		super();
		this.orderId = orderId;
		this.restaurantName = restaurantName;
		this.orderedItems = orderedItems;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getOrderedItems() {
		return orderedItems;
	}
	public void setOrderedItems(String orderedItems) {
		this.orderedItems = orderedItems;
	}
	
	
	
}
