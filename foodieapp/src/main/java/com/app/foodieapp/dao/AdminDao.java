package com.app.foodieapp.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.foodieapp.Entity.Admin;


@Repository
public interface AdminDao extends JpaRepository<Admin , Integer>{

}
