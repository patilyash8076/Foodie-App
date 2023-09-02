package com.app.foodieapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.foodieapp.Entity.Menu;
import com.app.foodieapp.Entity.Restaurant;
import com.app.foodieapp.service.CustomerService;
import com.app.foodieapp.service.MenuService;
import com.app.foodieapp.service.RestaurantService;

@RestController
@RequestMapping("/Restaurant")
public class RestaurantController  {

	@Autowired
	private CustomerService customerService;

	@Autowired
	private RestaurantService restaurantService;
	
	@Autowired
	private MenuService menuService;
	
	@PostMapping("/addRestaurant")
	public ResponseEntity<Object> addRestaurant(@RequestBody Restaurant restaurant)
	{
		return ResponseEntity.ok(restaurantService.addRestaurant(restaurant));
		
	}
	
	@PostMapping("/addtomenu")
	public ResponseEntity<Object> addMenu(@RequestBody Menu menu)
	{
		return ResponseEntity.ok(restaurantService.addMenu(menu));
		
	}
	
	@DeleteMapping("/deletemenu/{itemId}")
	public String deleteMenu(@PathVariable int itemId)
	{
		if(restaurantService.deleteMenu(itemId)==true)
		{
			return "Menu deleted";
		}
		return "Not Deleted";
	}
	
	
	
}
