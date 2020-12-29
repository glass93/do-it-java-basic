package classpart;

public class StudentEx1 {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		StudentEx1 studentRyu = new StudentEx1();
		studentRyu.studentName = "·ùÇı°æ";
		
		System.out.println(studentRyu.studentName);
		System.out.println(studentRyu.getStudentName());
	}
}