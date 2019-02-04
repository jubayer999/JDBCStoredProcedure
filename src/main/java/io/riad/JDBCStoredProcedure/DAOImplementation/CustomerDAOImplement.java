package io.riad.JDBCStoredProcedure.DAOImplementation;

import java.sql.SQLException;

import io.riad.JDBCStoredProcedure.DBUtil.DBOperation;

public class CustomerDAOImplement implements io.riad.JDBCStoredProcedure.DAO.CustomerDAO {

	public  boolean showAllCustomerName() {

		
		boolean result=false;
		try {
			result = DBOperation.showAllCustomerName();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return result;
	}

}
