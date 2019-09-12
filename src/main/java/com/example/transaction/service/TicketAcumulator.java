package com.example.transaction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.transaction.factory.TicketLineFactory;
import com.example.transaction.model.Price;
import com.example.transaction.model.Ticket;


@Service
public class TicketAcumulator {

	
	@Autowired
	TicketLineFactory factoryTicket;
	
	public Ticket getTicket(List<String> items) {
		
		Ticket ticket=new Ticket();
			
		for (String ticketItem:items) {
			
			Price calculatedPrice=factoryTicket.getItemAfterTaxes(ticketItem);
		
			ticket.getTicketLines().add(calculatedPrice);
			ticket.setBillAmount(ticket.getBillAmount()+calculatedPrice.getTotalPrice());
			ticket.setTaxes(ticket.getTaxes()+calculatedPrice.getTaxes());
			
		}
		
		return ticket;
		
		
	}
	
}
