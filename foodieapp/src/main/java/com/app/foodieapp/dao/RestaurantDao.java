package com.app.foodieapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.foodieapp.Entity.Restaurant;

@Repository
public interface RestaurantDao extends JpaRepository <Restaurant, Integer> {

	

}
