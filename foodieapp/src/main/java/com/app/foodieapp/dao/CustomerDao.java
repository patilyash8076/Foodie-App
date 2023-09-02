package com.app.foodieapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.foodieapp.Entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Long> {

}
