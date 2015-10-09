package tony.project.language.unitTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import tony.project.language.domain.Instructor;
import tony.project.language.domain.Staff;
import tony.project.language.interfaces.InstructorDM;
import tony.project.language.interfaces.StaffDM;

public class TestStaffNInstructor {

	StaffDM staffDM = new Staff();
	InstructorDM instructorDM;

	@Test
	public void testStaffSave() {
		Staff user = new Staff(001, "HannaLin", "Hanna", "algomauESL", "hanna.lin@algomau.ca", 0);
		// staffDM.saveStaffByMapper(user);
		// user = new Staff(002, "Ashley", "ashley", "algomauLevel4",
		// "ashley@algomau.ca", 1);
		// staffDM.saveStaffByMapper(user);
		user = new Staff(003, "TonyHuang", "XiongHuang", "12345678", "xhuang@algomau.ca", 1);
		staffDM.saveStaffByMapper(user);

	}

	@Test
	public void testStaffLoad() {

		Staff user = staffDM.loadAStaffByMapper(003);
		System.out.println(user);

	}

	@Test
	public void testStaffDelete() {

		staffDM.deleteAStaffByMapper(003);
	}

	@Test
	public void testInstructorSave(){
		Staff staff = staffDM.loadAStaffByMapper(002);
		
		Integer instructorID = staff.getStaffID();
		String staffName = staff.getStaffName();
		String accountName = staff.getAccountName();
		String password = staff.getPassword();
		String privateEmail = staff.getPrivateEmail();
		Integer authority = staff.getAuthority();
		
		
		List<Integer> levelID = new ArrayList<>();
		levelID.add(3);
		levelID.add(4);
		
		List<String> courses = new ArrayList<>();
		courses.add("16L3Ga");
		courses.add("16L4Wr");
		
		Boolean upload = false;
		
		Instructor instrucotr = new Instructor(instructorID, staffName, accountName, password, 
				privateEmail, authority, 
				levelID, courses, upload);
		System.out.println(instrucotr);
		instructorDM = instrucotr;
		
//		instructorDM.saveInsructorByMapper(instrucotr);
		Instructor load = instrucotr.loadInstructorByMapper(003);
		System.out.println(load);
		
	}

	@Test
	public void testInstructorLoad(){
		
		Instructor instructor = new Instructor(002, null,null, null, null, null);
		System.out.println(instructor);
		instructor = instructor.loadInstructorByMapper(003);
		System.out.println(instructor);
		
	}
	
}
