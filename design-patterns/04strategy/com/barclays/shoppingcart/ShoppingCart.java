package com.barclays.shoppingcart;

import java.util.ArrayList;
import java.util.List;

import com.barclays.contracts.IShoppingCart;
import com.barclays.contracts.PaymentStrategy;
import com.barclays.entity.Item;
import com.barclays.paymentmodes.CreditCard;
import com.barclays.paymentmodes.Upi;
import com.barclays.shopping.payments.BestPayment;

public class ShoppingCart implements IShoppingCart{

	private List<Item> items;
	
	public ShoppingCart() {
		this.items = new ArrayList<Item>();
	}
	
	@Override
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		this.items.add(item);
	}

	@Override
	public void removeItem(Item item) {
		// TODO Auto-generated method stub
		this.items.remove(item);
	}

	@Override
	public int calculateTotal(PaymentStrategy paymentStrategy) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(Item item : items) {
			sum += item.getPrice() * item.getCount();
		}
		
		if(paymentStrategy instanceof CreditCard) {
			double charges = (CreditCard.getCharges() * sum)/100;
			System.out.println("Credit card payment charges : " + charges);
			sum += charges;
		}
		else if(paymentStrategy instanceof Upi) {
			double charges = (Upi.getCharges() * sum)/100;
			System.out.println("UPI payment charges : " + charges);
			sum += charges;
		}
		return sum;
	}

	@Override
	public void checkOut() {
		// TODO Auto-generated method stub
		PaymentStrategy ps = new BestPayment().bestPay(); 
		ps.pay(calculateTotal(ps));
	}

}
