package javaTask1;

public class Main {

	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		Student student = new Student();
		
		student.setUserType("��renci");		
		student.setName("Caner");
		
		studentManager.add(student);
		studentManager.login(student);
	}

}
