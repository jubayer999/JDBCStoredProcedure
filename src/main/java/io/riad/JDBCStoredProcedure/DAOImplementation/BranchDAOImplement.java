package io.riad.JDBCStoredProcedure.DAOImplementation;

import java.sql.SQLException;

import io.riad.JDBCStoredProcedure.DBUtil.DBOperation;

public class BranchDAOImplement implements io.riad.JDBCStoredProcedure.DAO.BranchDAO {

	public boolean showAllBranchDetails() {
		
		boolean result=false;
		try {
			result = DBOperation.showBranchInformation();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return result;
	}

	public boolean showBranchNameAssetwithMinMaxInput(int min,int max) {
		
		boolean result=false;
		try {
			result = DBOperation.findAllBranchWithAsset(min, max);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return result;
	}

	public boolean showBranchNameAssetInThousand() {
		
		boolean result=false;
		try {
			result = DBOperation.displayBranchNameAndAsset();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return result;
	}

}
