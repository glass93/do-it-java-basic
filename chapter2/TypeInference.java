package chapter2;

public class TypeInference {
	public static void main(String[] args) {
		var i = 10;			// int i = 10���� �����ϵ�
		var j = 10.0;		// double j = 10.0���� �����ϵ�
		var str = "hello";	// String str = "hello"�� �����ϵ�
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		i = 35;					// �ٸ� �������� ���� ����
		System.out.println(i);
		
		str = "test";			// �ٸ� ���ڿ��� ���� ����
		// str = 3;				   str ������ String������ ���� ���Ǿ��� ������ ���� ���� ���� �� ����
		System.out.println(str);
	}

}
