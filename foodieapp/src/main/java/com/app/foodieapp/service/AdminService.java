package com.app.foodieapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.foodieapp.dao.AdminDao;

@Service
public class AdminService {

	@Autowired
	private AdminDao adminDao;
}
