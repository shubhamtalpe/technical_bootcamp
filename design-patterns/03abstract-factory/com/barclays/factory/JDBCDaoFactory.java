package com.barclays.factory;

import com.barclays.contracts.ICustomerDAO;
import com.barclays.contracts.IEmployeeDAO;
import com.barclays.customer.dao.CustomerDaoJdbcImpl;
import com.barclays.employee.dao.EmployeeDaoJdbcImpl;
import com.dao.contracts.IProductDAO;

public class JDBCDaoFactory extends DaoFactory{

	@Override
	public IEmployeeDAO getEmployeeDao() {
		// TODO Auto-generated method stub
		return new EmployeeDaoJdbcImpl();
	}

	@Override
	public ICustomerDAO getCustomerDao() {
		// TODO Auto-generated method stub
		return new CustomerDaoJdbcImpl();
	}

	@Override
	public IProductDAO getProductDao() {
		// TODO Auto-generated method stub
		return null;
	}

}
