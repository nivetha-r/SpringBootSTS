package com.nisha.demo;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class BankAccountServiceApplicationTests {

	  @LocalServerPort
	    int randomServerPort;
	@Test
	public void validtestcases() throws URISyntaxException {
RestTemplate restTemplate = new RestTemplate();
      
      final String baseUrl = "http://localhost:"+randomServerPort+"/account/1";//localhost is used 
      URI uri = new URI(baseUrl);
      HttpHeaders headers = new HttpHeaders();
      try {
          ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);
         //Verify request succeed
          Assert.assertEquals(200, result.getStatusCodeValue());
      }catch(HttpClientErrorException ex) 
  {
          //Verify bad request and missing header
          Assert.assertEquals(400, ex.getRawStatusCode());//should throw 404 error
          Assert.assertEquals(true, ex.getResponseBodyAsString().contains("Missing request header"));//validating with neg 
      }
  }
	}
