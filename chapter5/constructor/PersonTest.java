package constructor;

public class PersonTest {
	public static void main(String[] args) {
		Person personKim = new Person();
		personKim.name = "김경호";
		personKim.height = 180.0F;
		personKim.weight = 80.5F;
		
		Person personLee = new Person("이대진", 176.3F, 68F);
	}
}
