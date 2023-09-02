package com.app.foodieapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.foodieapp.Entity.Menu;
import com.app.foodieapp.Entity.Restaurant;
import com.app.foodieapp.dao.MenuDao;
import com.app.foodieapp.dao.RestaurantDao;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantDao restaurantDao;

	@Autowired
	private MenuDao menuDao;

	public List<Restaurant> getAllRestaurant() {
		return restaurantDao.findAll();
	}

	public Optional<Restaurant> getname(String restaurantName) {
		List<Restaurant> allRestaurant = getAllRestaurant();
		for (Restaurant r : allRestaurant) {
			if (r.getRestaurantName().equals(restaurantName)) {
				return Optional.ofNullable(r);
			}

		}

		return null;

	}

	public Optional<List<Restaurant>> getLocation(String restaurantAddress) {
		List<Restaurant> allRestaurant = getAllRestaurant();
		List<Restaurant> restaurantByAddress = new ArrayList<>();
		for (Restaurant r : allRestaurant) {
			if (r.getRestaurantAddress().equals(restaurantAddress)) {

				restaurantByAddress.add(r);
			}

		}
		return Optional.ofNullable(restaurantByAddress);
	}

	public Object addRestaurant(Restaurant restaurant) {
		return restaurantDao.save(restaurant);

	}

	public List<Menu> getMenu() {

		return menuDao.findAll();
	}

	public Object addMenu(Menu menu) {

		return menuDao.save(menu);
	}

	public boolean deleteMenu(int itemId) {
		// TODO Auto-generated method stub
		try {
		menuDao.deleteById(itemId);
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	public boolean deleteRestaurantById(int restaurantId) {
		try {
			restaurantDao.deleteById(restaurantId);
		} catch (Exception e) {
			return false;
		}
		return true;

	}

}
