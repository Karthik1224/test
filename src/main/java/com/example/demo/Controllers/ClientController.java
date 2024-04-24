package com.example.demo.Controllers;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Modals.Response;
import com.example.demo.Services.ClientService;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/client")
public class ClientController {

	private static final Logger log = (Logger) LoggerFactory.getLogger(ClientController.class);

	@Autowired
	private ClientService clientService;

	@GetMapping("/fetchTransactions")
	public ResponseEntity<?> fetchTransactions() {
		return clientService.fetchTransactions();
	}

}
