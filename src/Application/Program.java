package Application;

import java.util.Scanner;

import Entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		Client client = new Client();
		
		client.setFullName("João");
		client.setCPF(" 212313131321 ");;
		client.setRG("rg");
		client.setBirthDate("01/02/1989");
		client.setSalary1(5000.00);
		client.setSalary2(7000.00);
		client.setSalary3(10000.00);
		
		
		System.out.println(client.toString());
		
		
		
		
		
		
		
		sc.close();
	}

}
