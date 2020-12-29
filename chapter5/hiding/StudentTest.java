package hiding;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student();
		//studentLee.studentName = "이창호";
		studentLee.setStudentName("이창호");
		
		System.out.println(studentLee.getStudentName());
	}

}
