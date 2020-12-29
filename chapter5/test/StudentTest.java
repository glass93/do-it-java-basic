package test;

import hiding.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.address = "서울 양천구";
		//studentLee.studentName = "이창호";
		studentLee.setStudentName("이창호");
		
		System.out.println(studentLee.getStudentName());
	}

}