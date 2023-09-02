package com.app.foodieapp.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Menu {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int itemId;
	@Column
	private String item;
	@Column
	private int amount;
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(int itemId, String item, int amount) {
		super();
		this.itemId = itemId;
		this.item = item;
		this.amount = amount;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}