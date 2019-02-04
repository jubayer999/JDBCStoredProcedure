package io.riad.JDBCStoredProcedure.DAO;

public interface DepositorDAO {
	
	public boolean showDepositorNameAccountNumberBalanceFromDepositorAccount();
	public boolean showDepositorNameAccountNumberBalanceFromDepositorAccountWithInputBalance(int balance);

}
