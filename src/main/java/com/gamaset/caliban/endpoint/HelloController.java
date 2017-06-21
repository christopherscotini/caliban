package com.gamaset.caliban.endpoint;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ResponseEntity<?> hello(){
		
		 return new ResponseEntity<String>("Olá pessoal.", HttpStatus.OK);
	}
}
