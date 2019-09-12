package com.example.transaction;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransactionViewApplicationTests {
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void example0() {
			
		 String url = "http://localhost:8080/ticket/get?items=1 book at 12.4";
		
		 HttpHeaders headers = new HttpHeaders();
		 headers.set("Accept", "application/json");

		 HttpEntity<String> request = new HttpEntity<>(headers);
		 
		RestTemplate restTemplate = new RestTemplate();
		
//		Uri.Builder uriBuilder = Uri.parse(url).buildUpon();
//		uriBuilder.appendQueryParameter(key, value);
//		uriBuilder.appendQueryParameter(key, value);
//		

		//String url = uriBuilder.build().toString();

//		ResponseEntity<Ticket> response = restTemplate.exchange(url, HttpMethod.GET, request , Ticket.class);
//		System.out.println(response.toString());
//		
		ResponseEntity<String> ticket = restTemplate.getForEntity(url, String.class);
		
		System.out.println(ticket.toString());
		
		
		
	}
		
	
	
	
	@Test
	public void example1() {
			
		 String uri = "http://localhost:8080/ticket/get";
		
		RestTemplate restTemplate = new RestTemplate();
				
		
		StringBuilder parametros=new StringBuilder();
		
		parametros.append("1 imported box of chocolates at 10.00,");
		parametros.append("1 imported bottle of perfume at 47.50");
		
		uri=uri+"?items="+parametros.toString();
		
		
		ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
		
		System.out.println(result.toString());
		
		
		
	}
	
	@Test
	public void example2() {
			
		 String uri = "http://localhost:8080/ticket/get";
		
		RestTemplate restTemplate = new RestTemplate();
		
		StringBuilder parametros=new StringBuilder();
		
		parametros.append("1 imported box of chocolates at 10.00,");
		parametros.append("1 imported bottle of perfume at 47.50");
		
		uri=uri+"?items="+parametros.toString();
		
		ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
		
		System.out.println(result.toString());
		
		
		
	}
		
	@Test
	public void example3() {
			
		 String uri = "http://localhost:8080/ticket/get";
		
		RestTemplate restTemplate = new RestTemplate();
	
		
		StringBuilder input=new StringBuilder();
		input.append("1 imported bottle of perfume at 27.99,1 bottle of perfume at 18.99");
		input.append("1 packet of headache pills at 9.75");
		input.append("1 box of imported chocolates at 11.25");
		
		uri=uri+"?items="+input.toString();
		
		String result = restTemplate.getForObject(uri, String.class);
		
		System.out.println(result.toString());
		
		
		
	}	
	

}
