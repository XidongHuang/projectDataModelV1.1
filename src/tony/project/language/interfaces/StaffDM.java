package tony.project.language.interfaces;

import tony.project.language.domain.Staff;

public interface StaffDM {

	public void saveStaffByMapper(Staff user);
	
	public Staff loadAStaffByMapper(Integer hashKey);
	
//	public void updateAStaffByMapper(String staffName, String accountName, String password, String privateEmail);
	
	public void deleteAStaffByMapper(Integer hashKey);
	
}
