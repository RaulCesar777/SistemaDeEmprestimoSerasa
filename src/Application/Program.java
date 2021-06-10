package Application;

import Entities.Client;

public class Program {

	public static void main(String[] args) {
		
		
		Client client = new Client();
		
		client.setFullName("João");
		client.setSalary1(5000.00);
		client.setSalary2(7000.00);
		client.setSalary3(10000.00);
		
		
		System.out.println(client.getFullName());
		System.out.println(client.getAverageWage());
		System.out.println(client.getFinancialHealth());
	}

}
