package com.barclays;

import java.io.Serializable;

public class EagerSingleton implements Serializable{
	private static final EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor of EagerSingleton");
	}
	
	public static EagerSingleton getInstance() {
		return instance;
	}
	
	protected Object readResolve() {
		return getInstance();
	}
}
