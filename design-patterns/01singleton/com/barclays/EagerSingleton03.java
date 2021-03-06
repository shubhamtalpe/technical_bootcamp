package com.barclays;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EagerSingleton03 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("sample.ser"));
		
		EagerSingleton instance = EagerSingleton.getInstance();
		
		oos.writeObject(instance);
		
		oos.close();
		
		System.out.println("Hash Code = " + instance.hashCode());
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sample.ser"));
		
		EagerSingleton instance2 = (EagerSingleton) ois.readObject();
		System.out.println("Hash Code = " + instance2.hashCode());
		
		ois.close();
	}
}
