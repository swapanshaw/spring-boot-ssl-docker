package com.swapan.learningspringboot.web;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String HELLO = "Hello ";

	@RequestMapping(name = "/greet", method = RequestMethod.GET)
	public ResponseEntity<String> greet(final @RequestParam("name") String name) {

		return new ResponseEntity<>( HELLO + name, HttpStatus.OK);
	}
}


