package com.example.transaction.model;

public class BasicTaxImportedItem extends Price {

	

	public BasicTaxImportedItem(double noTaxesPrices, double taxes, double totalPrice) {
		super(noTaxesPrices, taxes, totalPrice);
		// TODO Auto-generated constructor stub
	}

	public BasicTaxImportedItem() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateTotalPriceAfterTaxes() {

		setTaxes(getNoTaxesPrices()*15/100);
		setTotalPrice(getNoTaxesPrices()+getTaxes());
		
		
		
	}

}
