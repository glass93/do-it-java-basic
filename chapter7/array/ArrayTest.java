package array;

public class ArrayTest {
	public static void main(String[] args) {
		int[] num = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		int[] studentIDs = new int[] {101, 102, 103};
		
		for(int j = 0; j < studentIDs.length; j++) {
			System.out.println(studentIDs[j]);
		}
		
		String[] studentName = {"이대진", "최진원", "남현준"};
		
		for(int k = 0; k < studentName.length; k++) {
			System.out.println(studentName[k]);
		}
		
		int[] num2;
		num2 = new int[] {5, 4, 3, 2, 1};
		
		for(int l = 0; l < num2.length; l++) {
			System.out.println(num2[l]);
		}
		
		System.out.println(num2[3]);
		
		int[] num3 = new int[6];
		
		num3[0] = 32;
		num3[1] = 5;
		num3[3] = 12;
		
		for(int i = 0; i < num3.length; i++) {
			System.out.println(num3[i]);
		}
		
		int[] arr = new int[] {3, 6, 9, 12};
		System.out.println(arr[0] + 2);
		System.out.println(arr[1] + arr[2]);
		// System.out.println(arr[4] - 3); //컴파일 오류 발생, 
		
	}

}
