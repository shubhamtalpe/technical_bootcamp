package com.barclays;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EagerSingletonImpl02 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		EagerSingleton instance1 = EagerSingleton.getInstance();
		
		EagerSingleton instance2 = null;
		EagerSingleton instance3 = null;
		
		Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();
		
		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			instance2 = (EagerSingleton) constructor.newInstance();
			instance3 = (EagerSingleton) constructor.newInstance();
		}

		
		System.out.println("instanceOne - "+ instance1.hashCode());
		System.out.println("instanceTwo - "+instance2.hashCode());
		System.out.println("instanceThree - "+instance3.hashCode());
	}
}
