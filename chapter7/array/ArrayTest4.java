package array;

public class ArrayTest4 {
	public static void main(String[] args) {
		String[] studentName = new String[10];
		int size = 0;
		
		studentName[0] = "���ȣ"; size++;
		studentName[1] = "������"; size++;
		studentName[2] = "�̴���"; size++;
		studentName[3] = "������"; size++;
		
		for(int i = 0; i < size; i++) {
			System.out.println(studentName[i]);
		}
		
	}

}
