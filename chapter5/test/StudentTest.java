package test;

import hiding.Student;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.address = "���� ��õ��";
		//studentLee.studentName = "��âȣ";
		studentLee.setStudentName("��âȣ");
		
		System.out.println(studentLee.getStudentName());
	}

}