package com.tek;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TargetDemoApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;
	
	@Test
	public void testGreetingMethod() {
		String body = this.restTemplate.getForObject("/", String.class);
		
		assertThat(body).isEqualTo("Hello Docker World");
	}

	@Test
	public void testAddMethod() {
		AdditionRequest additionRequest = new AdditionRequest(2, 4);
		AdditionResponse response = this.restTemplate.postForObject("/add", additionRequest ,AdditionResponse.class);
		
		assertThat(response.getSum()).isEqualTo(6);
	}
	
}
