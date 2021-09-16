package com.barclays.factory;

import java.util.ResourceBundle;

import com.barclays.contracts.ICustomerDAO;
import com.barclays.contracts.IEmployeeDAO;
import com.dao.contracts.IProductDAO;

public abstract class DaoFactory {
	static class Holder{
		private static DaoFactory instance = null;
		
		static {
			ResourceBundle rb = ResourceBundle.getBundle("application");
			String factoryImplClass = rb.getString("dao.factory");
			try {
				instance = (DaoFactory) Class.forName("com.barclays.factory." + factoryImplClass).getDeclaredConstructor().newInstance();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static DaoFactory getInstance() {
		return Holder.instance;
	}
	
	public abstract IEmployeeDAO getEmployeeDao();
	public abstract ICustomerDAO getCustomerDao();
	public abstract IProductDAO getProductDao();
	
}
