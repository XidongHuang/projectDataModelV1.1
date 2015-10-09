package tony.project.language.interfaces;

import tony.project.language.domain.Instructor;

public interface InstructorDM {

	public void saveInsructorByMapper(Instructor instructor);
	
	public Instructor loadInstructorByMapper(Integer staffID);
	
	public void delteInstructor(Integer staffID);
	
}
