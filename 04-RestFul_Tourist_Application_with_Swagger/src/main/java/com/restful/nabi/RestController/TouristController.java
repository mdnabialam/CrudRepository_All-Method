package com.restful.nabi.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restful.nabi.model.Tourist;
import com.restful.nabi.service.TouristService;

@RestController
@RequestMapping("/tourist")
public class TouristController {
	
	@Autowired
	private TouristService service;
	
	@PostMapping("/register")
	public ResponseEntity<String> enrollTourist(@RequestBody Tourist tourist){
		
		try {
			String result=service.registerTourist(tourist);
			return new ResponseEntity<String>(result,HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>("Problem in Enrollment . .",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	@GetMapping("/findAll")
	public ResponseEntity<?> displayTourist(){
		try {
			List<Tourist> list= service.fetchAllTourist();
			return new ResponseEntity<List<Tourist>>(list,HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Problem in Fetcing Tourist . .",HttpStatus.OK);
		}
	}
	
	
	
	
	
	

}
