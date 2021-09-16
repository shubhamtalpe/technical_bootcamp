package com.dao.impl;

import java.net.UnknownHostException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Set;

import com.dao.contracts.IProductDAO;
import com.mongodb.DB;
import com.mongodb.MongoClient;

public class MongoProductDAO implements IProductDAO{
	
	public MongoProductDAO() {
		MongoClient mongoClient;
		try {
			ResourceBundle rb = ResourceBundle.getBundle("application");

			mongoClient = new MongoClient(rb.getString("host"), Integer.parseInt(rb.getString("port.num")));
		
			List<String> dbs = mongoClient.getDatabaseNames();
			System.out.println(dbs);
			
			DB db = mongoClient.getDB(rb.getString("database.name"));
			System.out.println(db);
			
			Set<String> collections = db.getCollectionNames();
			System.out.println(collections);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Mongo save");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Mongo delete");
	}

}
