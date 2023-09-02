package com.app.foodieapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.foodieapp.Entity.Order;

@Repository
public interface OrderDao extends JpaRepository<Order, Integer> {

}
