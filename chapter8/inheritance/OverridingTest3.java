package inheritance;

public class OverridingTest3 {
	public static void main(String[] args) {
		int price = 10000;
		
		Customer customerLee = new Customer();				// Customer 인스턴스 생성
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("이대진");
		System.out.println(customerLee.getCustomerName() + "님이 지불해야 하는 금액은 " + customerLee.calcPrice(price) + "원입니다.");
		
		VIPCustomer customerKim = new VIPCustomer();		// VIPCustomer 인스턴스 생성
		customerKim.setCustomerID(10020);
		customerKim.setCustomerName("김경호");
		System.out.println(customerKim.getCustomerName() + "님이 지불해야 하는 금액은 " + customerKim.calcPrice(price) + "원입니다.");
		
		Customer vc = new VIPCustomer(10030, "최진원", 2452);	// VIPCustomer 인스턴스를 Customer 형으로 변환
		System.out.println(vc.getCustomerName() + "님이 지불해야 하는 금액은 " + vc.calcPrice(price) + "원입니다.");
		
	}
}
