package com.app.foodieapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.foodieapp.Entity.Order;
import com.app.foodieapp.dao.OrderDao;

@RestController
@RequestMapping("/placeOrder")
public class OrderController {

	@Autowired
	private OrderDao orderDao; 

	@PostMapping("/order")
	public String placeOrder(@RequestBody Order order)
	{
		orderDao.save(order);
		return "Order Placed";
		
	}
	
}
