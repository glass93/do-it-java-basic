package classpart;

public class OrderTest {
	public static void main(String[] args) {
		Order order1 = new Order();
		order1.orderID = 201803120001L;
		order1.customerID = "abc123";
		order1.orderDate = "2018�� 3�� 12��";
		order1.customerName = "ȫ���";
		order1.productID = "PD0345-12";
		order1.shippingAddress = "����� �������� ���ﵵ�� 20����";
		
		System.out.println("�ֹ� ��ȣ: " + order1.orderID);
		System.out.println("�ֹ��� ���̵�: " + order1.customerID);
		System.out.println("�ֹ� ��¥: " + order1.orderDate);
		System.out.println("�ֹ��� �̸�: " + order1.customerName);
		System.out.println("�ֹ� ��ǰ ��ȣ: " + order1.productID);
		System.out.println("��� �ּ�: " + order1.shippingAddress);
	}

}
