package io.riad.JDBCStoredProcedure.DAOImplementation;

import java.sql.SQLException;

import io.riad.JDBCStoredProcedure.DBUtil.DBOperation;

public class DepositorDAOImplement implements io.riad.JDBCStoredProcedure.DAO.DepositorDAO {

	public boolean showDepositorNameAccountNumberBalanceFromDepositorAccount() {
		
		
		boolean result=false;
		try {
			result = DBOperation.showNameAccountNumberAndBalanceOfAllCustomers();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return result;
	}

	public boolean showDepositorNameAccountNumberBalanceFromDepositorAccountWithInputBalance(int balance) {
		
		boolean result=false;
		try {
			result = DBOperation.showNameAccountNumberAndBalanceOfAllCustomersWithBalanceOf(balance);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return result;
	}
 
}
