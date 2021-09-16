package com.barclays.factory;

import com.barclays.contracts.ICustomerDAO;
import com.barclays.contracts.IEmployeeDAO;
import com.barclays.customer.dao.CustomerDaoJpaImpl;
import com.barclays.employee.dao.EmployeeDaoJpaImpl;
import com.dao.contracts.IProductDAO;

public class JPADaoFactory extends DaoFactory{

	@Override
	public IEmployeeDAO getEmployeeDao() {
		// TODO Auto-generated method stub
		return new EmployeeDaoJpaImpl();
	}

	@Override
	public ICustomerDAO getCustomerDao() {
		// TODO Auto-generated method stub
		return new CustomerDaoJpaImpl();
	}

	@Override
	public IProductDAO getProductDao() {
		// TODO Auto-generated method stub
		return null;
	}
}
