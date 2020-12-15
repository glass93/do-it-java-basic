package operator;

public class OperationEx4 {
	public static void main(String[] args) {
		
		int num1 = 10;
		System.out.println(num1 += 1);
		
		System.out.println(num1 %= 10);
		
		num1 -= 1;
		System.out.println(num1);
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		
		System.out.println(ch);
	}

}
