package classpart;

public class OrderTest {
	public static void main(String[] args) {
		Order order1 = new Order();
		order1.orderID = 201803120001L;
		order1.customerID = "abc123";
		order1.orderDate = "2018년 3월 12일";
		order1.customerName = "홍길순";
		order1.productID = "PD0345-12";
		order1.shippingAddress = "서울시 영등포구 여듸도동 20번지";
		
		System.out.println("주문 번호: " + order1.orderID);
		System.out.println("주문자 아이디: " + order1.customerID);
		System.out.println("주문 날짜: " + order1.orderDate);
		System.out.println("주문자 이름: " + order1.customerName);
		System.out.println("주문 상품 번호: " + order1.productID);
		System.out.println("배송 주소: " + order1.shippingAddress);
	}

}
