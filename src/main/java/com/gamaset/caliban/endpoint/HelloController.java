package com.gamaset.caliban.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gamaset.caliban.service.SayHelloService;

/**
 * 
 * @author Christopher Rozario
 *
 * @since
 */
@RestController
public class HelloController {

	@Autowired
	private SayHelloService sayHelloService;
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello(){
		
		 return sayHelloService.say();
	}
}
