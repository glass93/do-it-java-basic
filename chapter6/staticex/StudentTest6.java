package staticex;

public class StudentTest6 {
	public static void main(String[] args) {
	Student3 studentChoi = new Student3();
	studentChoi.setStudentName("최진원");
	System.out.println(Student3.getSerialNumber());
	System.out.println(studentChoi.studentName + "학번:" + studentChoi.studentID);
	System.out.println(studentChoi.studentName + "카드 번호:" + studentChoi.cardNumber);
	
	Student3 studentKim = new Student3();
	studentKim.setStudentName("김경호");
	System.out.println(Student3.getSerialNumber());
	System.out.println(studentKim.studentName + "학번:" + studentKim.studentID);
	System.out.println(studentKim.studentName + "카드 번호:" + studentKim.cardNumber);
	
	
	}
}
