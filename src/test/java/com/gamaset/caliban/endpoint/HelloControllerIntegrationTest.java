package com.gamaset.caliban.endpoint;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.gamaset.caliban.CalibanApplication;

/**
 * 
 * @author Christopher Rozario
 *
 * @since
 */
@RunWith(SpringRunner.class)
@SpringBootTest(
  webEnvironment = WebEnvironment.RANDOM_PORT,
  classes = CalibanApplication.class)
@ActiveProfiles("test")
public class HelloControllerIntegrationTest {

	
	@Autowired
    private TestRestTemplate restTemplate;
	
	@Test
	public void testSays(){
		
		String responseObject = restTemplate.getForObject("/hello", String.class);
		Assert.assertThat(responseObject, Matchers.is("Hello fat guys."));
		
	}
	
	
}
