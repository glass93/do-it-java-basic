package hiding;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.studentName = "��âȣ";
		studentLee.setStudentName("��âȣ");
		
		System.out.println(studentLee.getStudentName());
	}

}
