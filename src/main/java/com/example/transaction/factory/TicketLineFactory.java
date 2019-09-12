package com.example.transaction.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.transaction.model.BasicTaxImportedItem;
import com.example.transaction.model.BasicTaxItem;
import com.example.transaction.model.ExemptedItems;
import com.example.transaction.model.FreeTaxItem;
import com.example.transaction.model.ImportedItem;
import com.example.transaction.model.Price;
import com.example.transaction.parser.Parser;
@Component
public  class TicketLineFactory {
	
	ExemptedItems nopayingItems=new ExemptedItems();
	@Autowired
	Parser parser;

	public Price getItemAfterTaxes(String itemDescription) {

		Price item = null;
		parser.setLine(itemDescription);
		
		


		if (nopayingItems.contains(itemDescription)) {

			item = new FreeTaxItem();

		}
		if (nopayingItems.contains(itemDescription)) {

			item = new ImportedItem();

		}
		if (!nopayingItems.contains(itemDescription)) {

			item = new BasicTaxImportedItem();
		}

		item = new BasicTaxItem();
		
		item.setNoTaxesPrices(parser.getPrice());
		
		item.calculateTotalPriceAfterTaxes();
		return item;

	}

}
