package com.restful.nabi.exception;

import org.springframework.web.bind.annotation.RestControllerAdvice;

@SuppressWarnings("serial")
@RestControllerAdvice
public class TouristNotFoundException extends Exception {
	public TouristNotFoundException() {
		
	}

	public TouristNotFoundException(String string) {
		// TODO Auto-generated constructor stub
	}
}
