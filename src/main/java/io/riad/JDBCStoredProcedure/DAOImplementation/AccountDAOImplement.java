package io.riad.JDBCStoredProcedure.DAOImplementation;

import java.sql.SQLException;

import io.riad.JDBCStoredProcedure.DBUtil.DBOperation;

public class AccountDAOImplement implements io.riad.JDBCStoredProcedure.DAO.AccountDAO {

	public boolean showAccountNumberWithSalaryInput(int salary) {
		
		boolean result=false;
		try {
			result = DBOperation.findAccountNumberAccordingToSalaryInput(salary);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return result;
	}

	public boolean showAccountNumberBalanceFromBringtonwithBalanceInput(int salary) {
		
		boolean result=false;
		try {
			result = DBOperation.findAccountNumberAndBalance(salary);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return result;
	}

}
