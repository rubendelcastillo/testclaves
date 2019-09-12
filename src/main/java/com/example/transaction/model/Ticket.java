package com.example.transaction.model;

import java.util.ArrayList;

public class Ticket {
	
	Double billAmount=0D;
	
	Double taxes=0D;
	
	public Ticket(Double billAmount, Double taxes, ArrayList<Price> ticketLines) {
		super();
		this.billAmount = billAmount;
		this.taxes = taxes;
		this.ticketLines = ticketLines;
	}

	public Ticket() {
		// TODO Auto-generated constructor stub
	}

	ArrayList<Price> ticketLines=new ArrayList<Price>();

	public Double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}

	public Double getTaxes() {
		return taxes;
	}

	public void setTaxes(Double taxes) {
		this.taxes = taxes;
	}

	public ArrayList<Price> getTicketLines() {
		return ticketLines;
	}

	public void setTicketLines(ArrayList<Price> ticketLines) {
		this.ticketLines = ticketLines;
	}
	
	public void addLine(Price item) {
		
		getTicketLines().add(item);
		
	}
	

}
