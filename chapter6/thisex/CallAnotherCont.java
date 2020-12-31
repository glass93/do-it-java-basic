package thisex;

class Man {
	String name;
	int age;
	
	Man() {
		this("이름 없음", 1);	// Man(String, int) 생성자 호출
	}
	
	Man(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Man returnItSelf() {
		return this;		// this 반환
	}
}

public class CallAnotherCont {
	public static void main(String[] args) {
		Man noName = new Man();
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Man p = noName.returnItSelf();		// this 값을 클래스 변수에 대입
		System.out.println(p);				// noName.returnItSelf()의 반환 값 출력
		System.out.println(noName);			// 참조 변수 출력
	}
}