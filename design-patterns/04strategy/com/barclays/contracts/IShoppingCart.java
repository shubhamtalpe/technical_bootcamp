package com.barclays.contracts;

import com.barclays.entity.Item;

public interface IShoppingCart {
	void addItem(Item item);
	void removeItem(Item item);
	int calculateTotal(PaymentStrategy paymentStrategy);
	void checkOut();
}
