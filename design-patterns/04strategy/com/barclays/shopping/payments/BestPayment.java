package com.barclays.shopping.payments;

import com.barclays.contracts.PaymentStrategy;

import com.barclays.paymentmodes.CreditCard;
import com.barclays.paymentmodes.Upi;


public class BestPayment {
	public PaymentStrategy bestPay(String ... args) {
		return CreditCard.getCharges() < Upi.getCharges() ? new CreditCard() : new Upi();		
	}
}
