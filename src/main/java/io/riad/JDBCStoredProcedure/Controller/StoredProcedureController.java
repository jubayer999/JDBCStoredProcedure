package io.riad.JDBCStoredProcedure.Controller;

import io.riad.JDBCStoredProcedure.DAO.CustomerDAO;
import io.riad.JDBCStoredProcedure.DAO.LoanDAO;
import io.riad.JDBCStoredProcedure.DAOImplementation.AccountDAOImplement;
import io.riad.JDBCStoredProcedure.DAOImplementation.BorrowerDAOImplement;
import io.riad.JDBCStoredProcedure.DAOImplementation.BranchDAOImplement;
import io.riad.JDBCStoredProcedure.DAOImplementation.CustomerDAOImplement;
import io.riad.JDBCStoredProcedure.DAOImplementation.DepositorDAOImplement;
import io.riad.JDBCStoredProcedure.DAOImplementation.EmployeeDAOImplement;
import io.riad.JDBCStoredProcedure.DAOImplementation.LoanDAOImplement;
import io.riad.JDBCStoredProcedure.Model.Customer;

public  class StoredProcedureController {

	
	CustomerDAOImplement customerDAO=new CustomerDAOImplement();
	AccountDAOImplement accountDAO=new AccountDAOImplement();
	BorrowerDAOImplement borrowerDAO=new BorrowerDAOImplement();
	BranchDAOImplement branchDAO=new BranchDAOImplement();
	DepositorDAOImplement depositorDAO=new DepositorDAOImplement();
	EmployeeDAOImplement employeeDAO=new EmployeeDAOImplement();
	LoanDAOImplement loanDao=new LoanDAOImplement();
	
	
	
	public  boolean showAllCustomerName() {
		
		boolean result=customerDAO.showAllCustomerName();
		return result;
	}
	
	public boolean showAccountNumberWithSalaryInput() {
		
		boolean result=accountDAO.showAccountNumberWithSalaryInput(700);
		return result;
		
	}
	
	
	public boolean showAccountNumberBalanceFromBringtonwithBalanceInput() {
		
		boolean result=accountDAO.showAccountNumberBalanceFromBringtonwithBalanceInput(800);
		return result;
		
	}
	
	
	public boolean showAllBranchDetails() {
		
		
		boolean result=branchDAO.showAllBranchDetails();
		return result;
		
		
	}
	
	public boolean showBranchNameAssetwithMinMaxInput() {
		

		boolean result=branchDAO.showBranchNameAssetwithMinMaxInput(100000,400000);
		return result;
		
		
	}
	
	public boolean showBranchNameAssetInThousand() {
		
		
		boolean result=branchDAO.showBranchNameAssetInThousand();
		return result;
	}
	
	
	public boolean showDepositorNameAccountNumberBalanceFromDepositorAccount() {
		
		
		
		boolean result=depositorDAO.showDepositorNameAccountNumberBalanceFromDepositorAccount();
		return result;
	}
	
	public boolean showDepositorNameAccountNumberBalanceFromDepositorAccountWithInputBalance() {
		
		boolean result=depositorDAO.showDepositorNameAccountNumberBalanceFromDepositorAccountWithInputBalance(400);
		return result;
		
		
	}
	
	public boolean showAllBranchNameWhoHaveLoan() {
		
		
		boolean result=loanDao.showAllBranchNameWhoHaveLoan();
		return result;
		
	}
	
	
	
}
