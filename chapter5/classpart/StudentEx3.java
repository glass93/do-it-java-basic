package classpart;

public class StudentEx3 {
	public static void main(String[] args) {
		StudentEx1 student1 = new StudentEx1();
		student1.studentName = "최진원";
		System.out.println(student1.studentName);
		
		StudentEx1 student2 = new StudentEx1();
		student2.studentName = "김경호";
		System.out.println(student2.getStudentName());
	}

}
