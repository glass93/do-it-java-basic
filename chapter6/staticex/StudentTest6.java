package staticex;

public class StudentTest6 {
	public static void main(String[] args) {
	Student3 studentChoi = new Student3();
	studentChoi.setStudentName("������");
	System.out.println(Student3.getSerialNumber());
	System.out.println(studentChoi.studentName + "�й�:" + studentChoi.studentID);
	System.out.println(studentChoi.studentName + "ī�� ��ȣ:" + studentChoi.cardNumber);
	
	Student3 studentKim = new Student3();
	studentKim.setStudentName("���ȣ");
	System.out.println(Student3.getSerialNumber());
	System.out.println(studentKim.studentName + "�й�:" + studentKim.studentID);
	System.out.println(studentKim.studentName + "ī�� ��ȣ:" + studentKim.cardNumber);
	
	
	}
}
