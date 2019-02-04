package io.riad.JDBCStoredProcedure.Controller;

import static org.junit.Assert.*;

import org.junit.Test;

public class StoredProcedureControllerTest {

	
	StoredProcedureController storedProcedureController=new StoredProcedureController();
	@Test
	public void testShowAllCustomerName() {
		assertTrue(storedProcedureController.showAllCustomerName());
	}

	@Test
	public void testShowAccountNumberWithSalaryInput() {
		assertTrue(storedProcedureController.showAccountNumberWithSalaryInput());
	}

	@Test
	public void testShowAccountNumberBalanceFromBringtonwithBalanceInput() {
		assertTrue(storedProcedureController.showAccountNumberBalanceFromBringtonwithBalanceInput());
	}

	@Test
	public void testShowAllBranchDetails() {
		assertTrue(storedProcedureController.showAllBranchDetails());
	}

	@Test
	public void testShowBranchNameAssetwithMinMaxInput() {
		assertTrue(storedProcedureController.showBranchNameAssetwithMinMaxInput());
	}

	@Test
	public void testShowBranchNameAssetInThousand() {
		assertTrue(storedProcedureController.showBranchNameAssetInThousand());
	}

	@Test
	public void testShowDepositorNameAccountNumberBalanceFromDepositorAccount() {
		assertTrue(storedProcedureController.showDepositorNameAccountNumberBalanceFromDepositorAccount());
	}

	@Test
	public void testShowDepositorNameAccountNumberBalanceFromDepositorAccountWithInputBalance() {
		assertTrue(storedProcedureController.showDepositorNameAccountNumberBalanceFromDepositorAccountWithInputBalance());
	}

	@Test
	public void testShowAllBranchNameWhoHaveLoan() {
		assertTrue(storedProcedureController.showAllBranchNameWhoHaveLoan());
	}

}
