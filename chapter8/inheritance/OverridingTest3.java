package inheritance;

public class OverridingTest3 {
	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerLee = new Customer();				// Customer �ν��Ͻ� ����
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̴���");
		System.out.println(customerLee.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� " + customerLee.calcPrice(price) + "���Դϴ�.");
		
		VIPCustomer customerKim = new VIPCustomer();		// VIPCustomer �ν��Ͻ� ����
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("���ȣ");
		System.out.println(customerKim.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� " + customerKim.calcPrice(price) + "���Դϴ�.");
		
		Customer vc = new VIPCustomer(10030, "������", 2452);	// VIPCustomer �ν��Ͻ��� Customer ������ ��ȯ
		System.out.println(vc.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� " + vc.calcPrice(price) + "���Դϴ�.");
		
	}
}
