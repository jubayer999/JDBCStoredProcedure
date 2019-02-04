package io.riad.JDBCStoredProcedure.DAO;

public interface BranchDAO {
	
	public boolean showAllBranchDetails();
	
	public boolean showBranchNameAssetwithMinMaxInput(int min,int max);
	public boolean showBranchNameAssetInThousand();

}
