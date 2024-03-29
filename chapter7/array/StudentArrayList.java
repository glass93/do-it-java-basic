package array;
import java.util.ArrayList;

public class StudentArrayList {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1001, "James"));
		students.add(new Student(1002, "Tomas"));
		students.add(new Student(1003, "Edward"));
		
		for(int i = 0; i < students.size(); i++) {
			Student student = students.get(i);
			student.showStudentInfo();
		}
		System.out.println();
		
		System.out.println("=== 향상된 for문 사용 ===");
		for(Student student : students) {
			student.showStudentInfo();
		}
	}

}
