package witharraylist;
import java.util.ArrayList;

public class CustomerTest {
	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customerLee = new Customer(10010, "이대진");
		Customer customerKim = new Customer(10020, "김경호");
		Customer customerNam = new GoldCustomer(10030, "남현준");
		Customer customerChoi = new GoldCustomer(10040, "최진원");
		Customer customerHan = new VIPCustomer(10050, "한상정", 321);
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerNam);
		customerList.add(customerChoi);
		customerList.add(customerHan);
		
		System.out.println("====== 고객 정보 출력 ======");
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		System.out.println("====== 할인율과 보너스 포인트 계산 ======");
		int price = 10000;
		for(Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+ "님이" + cost + "원 지불하셨습니다.");
			System.out.println(customer.getCustomerName()+ "님의 현재 보너스 포인트는 " + customer.bonusPoint + "점 입니다.");
		
			
		}
	}
}
