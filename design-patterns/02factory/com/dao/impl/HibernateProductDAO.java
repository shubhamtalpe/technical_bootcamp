package com.dao.impl;

import com.dao.contracts.IProductDAO;

public class HibernateProductDAO implements IProductDAO{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("Hibernate save");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Hibernate delete");
	}

}
