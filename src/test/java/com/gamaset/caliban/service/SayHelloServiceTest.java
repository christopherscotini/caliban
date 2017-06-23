package com.gamaset.caliban.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class SayHelloServiceTest {

	@InjectMocks
	private SayHelloService sayHelloService;
	
	@Test
	public void testSaySucess(){
		
		String response = sayHelloService.say();
		
		Assert.assertEquals("Hello fat guys.", response);
		
	}
}
