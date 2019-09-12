package com.example.transaction.model;

public class FreeTaxItem extends Price {

	public FreeTaxItem(double noTaxesPrices, double taxes, double totalPrice) {
		super(noTaxesPrices, taxes, totalPrice);
		// TODO Auto-generated constructor stub
	}

	public FreeTaxItem() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateTotalPriceAfterTaxes() {

		setTaxes(0);
		setTotalPrice(getNoTaxesPrices());
		
	}

}
