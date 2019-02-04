package io.riad.JDBCStoredProcedure.DAOImplementation;

import java.sql.SQLException;

import io.riad.JDBCStoredProcedure.DAO.LoanDAO;
import io.riad.JDBCStoredProcedure.DBUtil.DBOperation;

public class LoanDAOImplement implements LoanDAO {

	public boolean showAllBranchNameWhoHaveLoan() {
		
		boolean result=false;
		try {
			result = DBOperation.showAllBranchNameFromLoan();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return result;
	}

}
