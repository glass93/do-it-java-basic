package inheritance;

public class CustomerTest2 {
	public static void main(String[] args) {
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerID(10002);
		customerKim.setCustomerName("���ȣ");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
