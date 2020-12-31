package cooperation;

public class Taxi {
	String companyName;		// 택시 회사 이름
	int money;				// 택시 수입
	
	public Taxi(String companyName) {
		this.companyName = companyName;
	}
	
	public void take(int money) {
		this.money += money;		// 택시 수입 증가
	}
	
	public void showInfo() {
		System.out.println(companyName + " 택시 수입은 " + money + "입니다.");
	}
}
