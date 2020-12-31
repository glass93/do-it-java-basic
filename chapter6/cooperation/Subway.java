package cooperation;

public class Subway {
	String lineNumber;			// ����ö �뼱
	int passengerCount;			// �°� ��
	int money;					// ���Ծ�
	
	public Subway(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	
	public void take(int money) {
		this.money += money;	// ���� ����
		passengerCount++;		// �°� �� ����
	}
	
	public void showInfo() {
		System.out.println(lineNumber + "�� �°��� " + passengerCount +"���̰�, ������ " + money + "�Դϴ�.");
	}
}