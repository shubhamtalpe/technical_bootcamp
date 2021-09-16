package com.dao.impl;

import com.dao.contracts.IProductDAO;

public class JDBCProductDAO implements IProductDAO{

	@Override
	public void save() {
		// TODO Auto-generated method stub
		System.out.println("JDBC save");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("JDBC delete");
	}

}
