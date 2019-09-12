package com.example.transaction.model;

public class BasicTaxItem extends Price {

	public BasicTaxItem(double noTaxesPrices, double taxes, double totalPrice) {
		super(noTaxesPrices, taxes, totalPrice);
		// TODO Auto-generated constructor stub
	}

	public BasicTaxItem() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateTotalPriceAfterTaxes() {
		setTaxes(getNoTaxesPrices()*10/100);
		setTotalPrice(getNoTaxesPrices()+getTaxes());
				
	}

}
