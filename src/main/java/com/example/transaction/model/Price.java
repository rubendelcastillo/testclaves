package com.example.transaction.model;

public abstract class Price {
	
	private Double noTaxesPrices;
	
	private Double taxes;
	
	private Double totalPrice;
	
	

	public Price(double noTaxesPrices, double taxes, double totalPrice) {
		super();
		this.noTaxesPrices = noTaxesPrices;
		this.taxes = taxes;
		this.totalPrice = totalPrice;
	}

	public Price() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public double getNoTaxesPrices() {
		return noTaxesPrices;
	}

	public void setNoTaxesPrices(double noTaxesPrices) {
		this.noTaxesPrices = noTaxesPrices;
	}

	public double getTaxes() {
		return taxes;
	}

	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public abstract void calculateTotalPriceAfterTaxes();

}
