package javaTask1;

public class Instructor extends User{
	private String instructorNo;
	private String instructorTitle;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String name, String surname, String username, String password, String instructorNo,
			String instructorTitle, String userType) {
		super(id, name, surname, username, password, userType);
		this.instructorNo = instructorNo;
		this.instructorTitle = instructorTitle;
	}
	
	public String getInstructorNo() {
		return instructorNo;
	}

	public void setInstructorNo(String instructorNo) {
		this.instructorNo = instructorNo;
	}

	public String getInstructorTitle() {
		return instructorTitle;
	}

	public void setInstructorTitle(String instructorTitle) {
		this.instructorTitle = instructorTitle;
	}
}
