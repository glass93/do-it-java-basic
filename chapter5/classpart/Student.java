package classpart;

public class Student {
	int studentID;			// �й�
	String studentName;		// �л� �̸�
	int grade;				// �г�
	String address;			// ��� ��
	
	public String getStudentName() {
		return studentName;
	}
	
	public static void main(String[] args) {
		Student studentAhn = new Student();	// Student Ŭ���� ����
		studentAhn.studentName = "�ȿ���";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
	
}
