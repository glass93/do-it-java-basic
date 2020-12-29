package classpart;

public class ManTest {
	public static void main(String[] args) {
		Man man1 = new Man();
		man1.age = 40;
		man1.name = "James";
		man1.isMarried = true;
		man1.numberOfChildren = 3;
		
		System.out.println("나이: " + man1.age);
		System.out.println("이름: " + man1.name);
		System.out.println("결혼 여부: " + man1.isMarried);
		System.out.println("자녀 수: " + man1.numberOfChildren);
	}

}
