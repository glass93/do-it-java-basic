package thisex;

class Man {
	String name;
	int age;
	
	Man() {
		this("�̸� ����", 1);	// Man(String, int) ������ ȣ��
	}
	
	Man(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Man returnItSelf() {
		return this;		// this ��ȯ
	}
}

public class CallAnotherCont {
	public static void main(String[] args) {
		Man noName = new Man();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Man p = noName.returnItSelf();		// this ���� Ŭ���� ������ ����
		System.out.println(p);				// noName.returnItSelf()�� ��ȯ �� ���
		System.out.println(noName);			// ���� ���� ���
	}
}