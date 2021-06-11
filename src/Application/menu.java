package Application;

import java.io.IOException;
import java.util.Scanner;

public class menu {
	
	
	
	  public static void limpar() {
		  int n;
	        for (n=0; n<=500;n++){
	            System.out.print(" ");
	           
	        }
	        
		    
		}
	  
	  
	  
	  public static void wellcome()
	    {
	        System.out.printf("*************************************\n");
	        System.out.printf("* Olá !! seja bem vindo ao Serasa   *\n");
	        System.out.printf("*************************************\n");
	        System.out.printf("*  selecione a opção desejada       *\n");
	        System.out.printf("*  Use o numero correspondente      *\n");
	        System.out.printf("*1 -Para cadastrar                  *\n");
	        System.out.printf("*2 -Para verificar status financeira*\n");
	        System.out.printf("*2 -Solicitar emprestimo            *\n");
	        System.out.printf("*************************************\n");

	    }
	 /**********************************************************************************************/ 
	  public static void register() {
		  
		  
	  Scanner sc = new Scanner(System.in);

		Client client = new Client();

		String FullName;
		String CPF;
		String RG;
		String birthDate;
		double salary;

		System.out.print("Nome do cliente  : ");
		FullName = sc.next();
		sc.nextLine();
		client.setFullName(FullName);
		System.out.print("");

		System.out.print("CPF do cliente : ");
		CPF = sc.next();
		client.setCPF(CPF);
		System.out.print("");

		System.out.print("RG do cliente : ");
		RG = sc.next();
		client.setRG(RG);
		System.out.print("");

		System.out.print("Data de Nascimento do cliente : ");
		birthDate = sc.next();
		client.setBirthDate(birthDate);
		System.out.print("");

		System.out.println("Prescisamos dos tres ultimos vencimentos  : ");

		for (int i = 1; i <= 3; i++) {

			System.out.print("folha de pagamento Nº" + i + " : ");
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
			System.out.print("");
		}
		sc.close();
		
		System.out.println(client.toString());
	}
	
	/************************************************************************************************************/
	
	

}
