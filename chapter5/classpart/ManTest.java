package classpart;

public class ManTest {
	public static void main(String[] args) {
		Man man1 = new Man();
		man1.age = 40;
		man1.name = "James";
		man1.isMarried = true;
		man1.numberOfChildren = 3;
		
		System.out.println("����: " + man1.age);
		System.out.println("�̸�: " + man1.name);
		System.out.println("��ȥ ����: " + man1.isMarried);
		System.out.println("�ڳ� ��: " + man1.numberOfChildren);
	}

}
