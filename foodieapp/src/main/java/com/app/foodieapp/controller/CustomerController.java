package com.app.foodieapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.foodieapp.Entity.Customer;
import com.app.foodieapp.Entity.Menu;
import com.app.foodieapp.Entity.Restaurant;
import com.app.foodieapp.service.CustomerService;
import com.app.foodieapp.service.RestaurantService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@Autowired
	private RestaurantService restaurantService;


	@GetMapping("/allrestaurant")
	public ResponseEntity<List<Restaurant>> getRestaurants() {

		return ResponseEntity.ok(restaurantService.getAllRestaurant());

	}
	@GetMapping("/byname/{restaurantName}")
	public ResponseEntity<Optional<Restaurant>> getByName(@PathVariable String restaurantName)
	{
		return ResponseEntity.ok(restaurantService.getname(restaurantName));
		
	}
	
	@GetMapping("/bylocation/{restaurantAddress}")
	public ResponseEntity<Optional<List<Restaurant>>> getBylocation(@PathVariable String restaurantAddress)
	{
		return ResponseEntity.ok(restaurantService.getLocation(restaurantAddress));
		
	}
	
	@GetMapping("/getmenu")
	public ResponseEntity<List<Menu>> getMenu() {

		return ResponseEntity.ok(restaurantService.getMenu());
	}
	
}
