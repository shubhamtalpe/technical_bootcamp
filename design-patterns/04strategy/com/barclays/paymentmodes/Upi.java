package com.barclays.paymentmodes;

import com.barclays.contracts.PaymentStrategy;

public class Upi implements PaymentStrategy{

	private String mobileNumber;
	private int otp;
	private static double charges = 3.4;
	
	public Upi() {
		this.mobileNumber = "9876543210";
		this.otp = 123;
	}
	
	public Upi(String mobileNumber, int otp) {
		super();
		this.mobileNumber = mobileNumber;
		this.otp = otp;
	}
	
	public static double getCharges() {
		return charges;
	}

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Amount : " + amount + " paying with : " + this.mobileNumber);
	}
	

}
