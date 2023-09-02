package com.app.foodieapp.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.foodieapp.Entity.Menu;

@Repository
public interface MenuDao extends JpaRepository<Menu, Integer>{

}
