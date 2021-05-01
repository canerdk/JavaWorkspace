package javaTask1;

public class Student extends User {
	private String studentNo;
	private String studentLevel;
	
	public Student() {
		
	}
	
	public Student(int id, String name, String surname, String username, String password, String studentNo,
			String studentLevel, String userType) {
		super(id, name, surname, username, password, userType);
		this.studentNo = studentNo;
		this.studentLevel = studentLevel;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentLevel() {
		return studentLevel;
	}

	public void setStudentLevel(String studentLevel) {
		this.studentLevel = studentLevel;
	}
}
