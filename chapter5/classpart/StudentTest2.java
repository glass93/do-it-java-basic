package classpart;

public class StudentTest2 {
	public static void main(String[] args) {
		Student studentHan = new Student();
		studentHan.studentName = "�ѿ���";
		System.out.println(studentHan.getStudentName());
		Student studentNam = new Student();
		studentNam.studentName = "������";
		System.out.println(studentNam.getStudentName());
	}

}
