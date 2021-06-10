package Application;

import java.util.Scanner;

import Entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		Client client = new Client();
		
		String FullName;
		String CPF;
		String RG;
		String birthDate;
		double salary;
		
		
		System.out.println("Nome do cliente");
		FullName= sc.nextLine();		
		client.setFullName(FullName);
		
		System.out.println("CPF do cliente");
		CPF=sc.nextLine();
		client.setCPF(CPF);
		
		System.out.println("RG do cliente");
		RG=sc.nextLine();
		client.setRG(RG);
		
		System.out.println("Data de Nascimento do cliente");
		birthDate=sc.nextLine();
		client.setBirthDate(birthDate);
		
		System.out.println("Prescisamos dos tres ultimos vencimentos");
		
		for(int i=1; i<=3; i++) {
			
			System.out.println("folha de pagamento Nº \n"+ i);
			salary = sc.nextDouble();
			switch (i) {
			  case 1:
				  client.setSalary1(salary);
			    break;
			  case 2:
				  client.setSalary2(salary);
			    break;
			  case 3:
				  client.setSalary3(salary);
			    break;
			  default:
			    System.out.println("sem opção");
			}
			
			
		}
		
		
		
		
		
		
		System.out.println(client.toString());
		
		
		
		
		
		
		
		sc.close();
	}

}
