package com.infy.category;


public class CurrencyConversion {
	
	private String from;

	private String to;
	
	private double conversion;
	
	CurrencyConversion(){
		
	}
	
	public CurrencyConversion(String from, String to, double conversion) {
		this.from = from;
		this.to = to;
		this.conversion = conversion;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public double getConversion() {
		return conversion;
	}

	public void setConversion(double conversion) {
		this.conversion = conversion;
	}

}
