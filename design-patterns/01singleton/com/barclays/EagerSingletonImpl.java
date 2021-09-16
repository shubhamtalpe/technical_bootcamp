package com.barclays;

public class EagerSingletonImpl {
	public static void main(String[] args) {
		EagerSingleton es1 = EagerSingleton.getInstance();
		System.out.println(es1.hashCode());
		

		EagerSingleton es2 = EagerSingleton.getInstance();
		System.out.println(es2.hashCode());
	}
}
