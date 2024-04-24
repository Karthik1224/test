package com.example.demo.Services;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Controllers.ClientController;
import com.example.demo.Modals.Response;

import ch.qos.logback.classic.Logger;

@Service
public class ClientService {

	private static final Logger log = (Logger) LoggerFactory.getLogger(ClientService.class);
	
	@Autowired
	private RestTemplate restTemplate;

	public ResponseEntity<?> fetchTransactions() {

		try {
			Response response = restTemplate.getForObject(
					"http://localhost:8080/transaction/fetchTransactionList?isdownloaded=false", Response.class);
			
			      

			return new ResponseEntity(response, HttpStatus.OK);

		} catch (Exception e) {

			log.error(": {} ", e.getMessage());
			return new ResponseEntity("Unable to process the request", HttpStatus.OK);
		}
	}

}
