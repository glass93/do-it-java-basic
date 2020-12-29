package classpart;

public class StudentTest2 {
	public static void main(String[] args) {
		Student studentHan = new Student();
		studentHan.studentName = "한여름";
		System.out.println(studentHan.getStudentName());
		Student studentNam = new Student();
		studentNam.studentName = "남보라";
		System.out.println(studentNam.getStudentName());
	}

}
