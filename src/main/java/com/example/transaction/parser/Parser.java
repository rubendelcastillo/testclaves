package com.example.transaction.parser;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
@Component
public class Parser {
	
	String line=null;
	
	Long cuantity=null;
	
	public Long getCuantity() {
		return cuantity;
	}

	public void setCuantity(Long cuantity) {
		this.cuantity = cuantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	String description=null;
	
	Double price=null;
	
	public void setLine(String line) {
		
		this.line=line;
		
		Scanner read=new Scanner(line);
		read.useDelimiter(" ");
		read.useLocale(Locale.ENGLISH);
		cuantity=read.nextLong();
		
		StringBuilder descriptionBuilder=new StringBuilder();	

		for (String auxToken="";!StringUtils.substringMatch(auxToken, 0, "at");auxToken=read.next()) {
		
			
			
			descriptionBuilder.append(auxToken);
			
			
		}
		description=descriptionBuilder.toString();
		
		price=read.nextDouble();
		
		read.close();
	}

}
