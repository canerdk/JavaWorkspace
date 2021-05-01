package javaTask1;

public class Main {

	public static void main(String[] args) {
		StudentManager studentManager = new StudentManager();
		Student student = new Student();
		
		student.setUserType("Öğrenci");		
		student.setName("Caner");
		
		studentManager.add(student);
		studentManager.login(student);
	}

}
