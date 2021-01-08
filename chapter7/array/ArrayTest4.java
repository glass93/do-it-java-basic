package array;

public class ArrayTest4 {
	public static void main(String[] args) {
		String[] studentName = new String[10];
		int size = 0;
		
		studentName[0] = "김경호"; size++;
		studentName[1] = "남현준"; size++;
		studentName[2] = "이대진"; size++;
		studentName[3] = "최진원"; size++;
		
		for(int i = 0; i < size; i++) {
			System.out.println(studentName[i]);
		}
		
	}

}
