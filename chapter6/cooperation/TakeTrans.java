package cooperation;

public class TakeTrans {
	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);						// �뼱 ��ȣ�� 100���� ���� ����
		studentJames.takeBus(bus100);					// james�� 100�� ������ Ž
		studentJames.showInfo();						// james ���� ���
		bus100.showInfo();								// ���� ���� ���
		
		Subway subwayGreen = new Subway("2ȣ��");			// �뼱 ��ȣ�� 2ȣ���� ����ö ����
		studentTomas.takeSubway(subwayGreen);			// tomas�� 2ȣ���� Ž
		studentTomas.showInfo();						// tomas ���� ���
		subwayGreen.showInfo();							// ����ö ���� ���
		
		Student studentEdward = new Student("Edward", 20000);
		Taxi taxiCake = new Taxi("����ũ");				// ȸ�� �̸��� ����ũ�� �ý� ����
		studentEdward.takeTaxi(taxiCake);				// edward�� ����ũ ȸ�� �ýø� Ž
		studentEdward.showInfo();						// edward ���� ���
		taxiCake.showInfo();							// �ý� ���� ���
	}
}
