package com.example.transaction.model;

public class ImportedItem extends Price {

	public ImportedItem(double noTaxesPrices, double taxes, double totalPrice) {
		super(noTaxesPrices, taxes, totalPrice);
		// TODO Auto-generated constructor stub
	}

	public ImportedItem() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateTotalPriceAfterTaxes() {

		setTaxes(getNoTaxesPrices()*5/100);
		
		setTotalPrice(getNoTaxesPrices()+getTaxes());
		
		return ;
	}

}
