package cooperation;

public class Taxi {
	String companyName;		// �ý� ȸ�� �̸�
	int money;				// �ý� ����
	
	public Taxi(String companyName) {
		this.companyName = companyName;
	}
	
	public void take(int money) {
		this.money += money;		// �ý� ���� ����
	}
	
	public void showInfo() {
		System.out.println(companyName + " �ý� ������ " + money + "�Դϴ�.");
	}
}
