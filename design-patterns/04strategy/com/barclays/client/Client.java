package com.barclays.client;

import com.barclays.contracts.IShoppingCart;
import com.barclays.entity.Item;
import com.barclays.shoppingcart.ShoppingCart;

public class Client {
	public static void main(String[] args) {
		IShoppingCart cart = new ShoppingCart();
		cart.addItem(new Item("Mobile", 1000, 1));
		cart.addItem(new Item("Keyboard", 34, 1));
		
		cart.checkOut();
	}
}
