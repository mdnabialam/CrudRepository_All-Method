package com.restful.nabi.service;

import java.util.List;

import com.restful.nabi.model.Tourist;


public interface TouristService {

	// Add New Tourist
	public String registerTourist(Tourist  tourist);
	
	// Get All Tourist
	public List<Tourist> fetchAllTourist();
	
	
}
