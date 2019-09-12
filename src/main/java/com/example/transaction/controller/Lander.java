package com.example.transaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.transaction.model.Ticket;
import com.example.transaction.service.TicketAcumulator;

@RestController
@RequestMapping("/ticket")
public class Lander {
	
	@Autowired
	TicketAcumulator total;
	
	@GetMapping(path = "/get")
	public Ticket getTicket(@RequestParam List<String> items) {
	
		return total.getTicket(items);
	}
	

}
