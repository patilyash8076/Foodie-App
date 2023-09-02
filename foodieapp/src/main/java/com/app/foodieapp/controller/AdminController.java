package com.app.foodieapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.foodieapp.Entity.Restaurant;
import com.app.foodieapp.service.MenuService;
import com.app.foodieapp.service.RestaurantService;

@RestController
@RequestMapping("/admin")

public class AdminController {

	
	@Autowired
	private RestaurantService restaurantService;

	@GetMapping("/allrestaurant")
	public ResponseEntity<List<Restaurant>> getRestaurants() {

		return ResponseEntity.ok(restaurantService.getAllRestaurant());
	}

	@DeleteMapping("/delete/{restaurantId}")
	public String deleteRestaurantById(@PathVariable int restaurantId) {
		if (restaurantService.deleteRestaurantById(restaurantId) == true) {
			return "Deleted";
		}
		return "Restaurant Not Found";

	}
	
}
