package inheritance;

public class VIPCustomer extends Customer {
	private int agentID;	// VIP �� ���� ���̵�
	double saleRatio;		// ������
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() ������ ȣ��");
	}
	
	public int getAgentID() {
		return agentID;
	}

}
