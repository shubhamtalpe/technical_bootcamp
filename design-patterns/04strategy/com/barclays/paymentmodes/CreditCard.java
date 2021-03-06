package com.barclays.paymentmodes;

import com.barclays.contracts.PaymentStrategy;

public class CreditCard implements PaymentStrategy{
	private String name;
	private String creditCardNumber;
	private int cvv;
	private String expDate;
	private static double charges = 2;
	
	public CreditCard() {
		this.name = "Shubham";
		this.creditCardNumber = "1234-2345-3456-4567";
		this.cvv = 123;
		this.expDate = "09/24";
	}

	public CreditCard(String name, String creditCardNumber, int cvv, String expDate) {
		super();
		this.name = name;
		this.creditCardNumber = creditCardNumber;
		this.cvv = cvv;
		this.expDate = expDate;
	}
	
	public static double getCharges() {
		return charges;
	}

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Amount : " + amount + " paying with : " + this.creditCardNumber);
	}
	
}
