package witharraylist;
import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "�̴���");
		Customer customerKim = new Customer(10020, "���ȣ");
		Customer customerNam = new GoldCustomer(10030, "������");
		Customer customerChoi = new GoldCustomer(10040, "������");
		Customer customerHan = new VIPCustomer(10050, "�ѻ���", 321);
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerNam);
		customerList.add(customerChoi);
		customerList.add(customerHan);
		
		System.out.println("====== �� ���� ��� ======");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== �������� ���ʽ� ����Ʈ ��� ======");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+ "����" + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName()+ "���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "�� �Դϴ�.");
		
			
		}
	}
}
